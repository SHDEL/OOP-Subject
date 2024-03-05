package pack10_CSmovie;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MovieCounter {
    ArrayList<CSMovie> mList = new ArrayList<>();
    Set<String> uniqueTitle = new HashSet<>();
    public MovieCounter(){
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
        try(Scanner input = new Scanner(Paths.get("pack10_CSmovie\\movies.csv"))){
            input.nextLine(); // skip header row
        }
        catch (IOException e){
            System.out.println("from IO error");
        }
    }
    private static String paresDouble(String str){
        
        if (str.isEmpty()){
            return ".0";
        }
        return str;
    }
}
