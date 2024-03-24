

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import pack10_CSmovie.CSMovie;

public class Lab10_MovieCounter {
    static ArrayList<CSMovie> mList = new ArrayList<>();
    Set<String> uniqueTitle = new HashSet<>();
    public Lab10_MovieCounter(){
        String row;
        int rowCount = 1;
        int incompleteCount = 0;
        String title;
        String rating;
        String genre;
        Integer year;
        String skipped_released;
        Double score;
        Integer votes;
        String director;
        String skipped_writer;
        String star;
        String country;
        Integer budget;
        Long gross;
        String company;
        Integer runtime;
        try(Scanner input = new Scanner(Paths.get("Lab10\\pack10_CSmovie\\movies.csv"))){
            input.nextLine();
            while (input.hasNext()) {
                row = input.nextLine();
                rowCount++;
                String[] tokens = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (tokens.length < 15){
                    incompleteCount++;
                    System.out.println(rowCount + " " + incompleteCount + " is incompleted");
                    continue;
                }
                title = tokens[0];
                rating = tokens[1];
                genre = tokens[2];
                year = Integer.parseInt(tokens[3]);
                score = Double.parseDouble(parseDouble(tokens[5]));
                votes = (int) (Double.parseDouble(parseDouble(tokens[6])));
                director = tokens[7];
                star = tokens[9];
                country = tokens[10];
                budget = (int) (Double.parseDouble(parseDouble(tokens[11])));
                gross = (long) (Double.parseDouble(parseDouble(tokens[12])));
                company = tokens[13];
                runtime = (int) (Double.parseDouble(parseDouble(tokens[14])));
                if (!uniqueTitle.contains(title)){
                    mList.add(new CSMovie(title, rating, genre, year, score, votes, director, star, country, budget, gross, company, runtime));

                }
                uniqueTitle.add(title);
            }
            System.out.println("There are " + incompleteCount +  " rows of incompleted data");
            System.out.println("from " + rowCount + " rows. (" + uniqueTitle.size() + ") unique titles.");
            System.out.println("list size is " + mList.size());
        }
        catch(IOException e){
            System.out.println("from IO error");
            e.printStackTrace();
        }
    }
    private static String parseDouble(String str){
        if (str.isEmpty()){
            return ".0";
        }
        return str;
    }
    public static void main(String[] args) {
        Lab10_MovieCounter m = new Lab10_MovieCounter();
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
        q11();
    }
    private static void q1(){
        System.out.println("-----Q1-----");
        double avg = mList.stream().mapToDouble(CSMovie::getScore).average().getAsDouble(); 
        System.out.println("Average score : " + avg);
    }
    private static void q2(){
        System.out.println("-----Q2-----");
        mList.stream().filter(e -> e.getVotes() > 1900000).forEach(System.out::println);
    }
    private static void q3(){
        System.out.println("-----Q3-----");
        mList.stream().max(Comparator.comparing(CSMovie::getGross)).ifPresent(System.out::println);
        
    }
    private static void q4(){
        System.out.println("-----Q4-----");
        mList.stream().map(CSMovie::getGenre).distinct().forEach(System.out::println);
    }
    private static void q5(){
        System.out.println("-----Q5-----");

        mList.stream().sorted(Comparator.comparing(CSMovie::getRuntime)).limit(5)
        .map(e -> String.format("%-55s --> %s", e.getTitle(), e.getRuntime())).forEach(System.out::println);
    }
    private static void q6(){
        System.out.println("-----Q6-----");
        mList.stream().max(Comparator.comparing(CSMovie::getBudget)).map(e -> String.format("%-55s budget: %d", e.getTitle(), e.getBudget())).ifPresent(System.out::println);
        mList.stream().min(Comparator.comparing(CSMovie::getBudget)).map(e -> String.format("%-55s budget: %d", e.getTitle(), e.getBudget())).ifPresent(System.out::println);
    }
    private static void q7(){
        System.out.println("-----Q7-----");
        List<CSMovie> sorted = mList.stream().sorted(Comparator.comparing(CSMovie::getScore).reversed()).collect(Collectors.toList());
        mList.stream().map(CSMovie::getGenre).distinct().forEach(e -> {sorted.stream().filter(m -> m.getGenre().equals(e)).limit(3)
        .map(mov -> String.format("%-55s Genre: %s   Score: %s", mov.getTitle(), mov.getGenre(), mov.getScore())).forEach(System.out::println);
        });
    }
    private static void q8(){
        System.out.println("-----Q8-----");
        mList.stream().sorted(Comparator.comparing(CSMovie::getScore).reversed().thenComparing(CSMovie::getTitle))
        .filter(e -> e.getGenre().equals("Action")).limit(3)
        .map(e -> String.format("%-55s Genre: %s   Score: %s", e.getTitle(), e.getGenre(), e.getScore()))
        .forEach(System.out::println);
    }
    private static void q9(){
        System.out.println("-----Q9-----");
        mList.stream().map(CSMovie::getGenre).distinct()
        .forEach(e -> {Long sum = mList.stream().filter(a -> a.getGenre().equals(e)).map(CSMovie::getGross)
        .collect(Collectors.summingLong(Long::longValue));
        System.out.println(e + " " + sum);
        });
    }
    private static void q10(){
        System.out.println("-----Q10-----");
        Map<String, Long> company = mList.stream().collect(Collectors.groupingBy(CSMovie::getCompany, Collectors.counting()));
        Map<String, Long> movie = company.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue(Long::compareTo))).limit(10)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        for (Entry entry : movie.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        } 
    }
    private static void q11(){
        System.out.println("-----Q11-----");
        Function<CSMovie, Integer> numWords = entry -> {
            String[] tokens = entry.getTitle().split("a");
            return tokens.length;
        };
        Optional<CSMovie> opt = mList.stream().max(Comparator.comparing(numWords));
        System.out.println(opt.get().getTitle());
    }

}
