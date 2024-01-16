package Lec6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gamelec6 {
    JFrame f;
    JButton btnNext;
    JLabel lbScore;
    JTextField tfScore;
    JButton lTile;
    JButton rTile;
    JButton btnNew;
    Icon blue300, orange300, meow300, emoji300;
    boolean isLeftOpen = false;
    boolean isRightOpen = false;
    boolean hasPlayed = false;
    int turnvalue;
    
    Gamelec6(){
        f = new JFrame();
        // f.setPreferredSize(new Dimension(100, 100));
        f.setSize(430,400);
        // f.setLayout(null);
        detailComponents();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void detailComponents(){
        btnNext = new JButton("next guess");
        lbScore = new JLabel("Score");
        tfScore = new JTextField("0");
        lTile = new JButton("blue");
        rTile = new JButton("orange");
        btnNew = new JButton("new game");
        btnNext.setPreferredSize(new Dimension(150, 50));
        lbScore.setPreferredSize(new Dimension(50, 50));
        tfScore.setPreferredSize(new Dimension(100, 50));
        lTile.setPreferredSize(new Dimension(200, 200));
        rTile.setPreferredSize(new Dimension(200, 200));
        btnNew.setPreferredSize(new Dimension(200, 50));

        f.setLayout(new FlowLayout());
        f.add(btnNext);
        f.add(lbScore);
        f.add(tfScore);
        f.add(lTile);
        f.add(rTile);
        f.add(btnNew); 
        secondPhase();
        thirdPhase();
    }
    void secondPhase(){
        try {
            blue300 = new ImageIcon("Lec6\\img\\ดาวน์โหลด.png");
            orange300 = new ImageIcon("Lec6\\img\\180-1809318_picture-300-x-300-pixel.png");
            meow300 = new ImageIcon("Lec6\\img\\chipi.jpg");
            emoji300 = new ImageIcon("Lec6\\img\\wrong300.png");
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
            
        }
        lTile.setIcon(blue300);
        rTile.setIcon(orange300);
    }
    void thirdPhase(){
        MyActionListener listener = new MyActionListener();
        lTile.addActionListener(listener);
        rTile.addActionListener(listener);
        btnNext.addActionListener(listener);
        genAns();
        btnNew.addActionListener(listener);
    }
    private void genAns(){
        turnvalue = Math.random() > 0.49 ? 1 : 0;
    }
    private class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            if (source == lTile && !hasPlayed){
                if(turnvalue == 0){
                    lTile.setIcon(meow300);
                    int score = Integer.parseInt(tfScore.getText()) + 4000000;
                    tfScore.setText("" + score);
                }
                else{
                    lTile.setIcon(emoji300);
                }
                hasPlayed = true;
            }
            else if (source == rTile && !hasPlayed){
                if (turnvalue == 1){
                    rTile.setIcon(meow300);
                    int score = Integer.parseInt(tfScore.getText()) + 1;
                    tfScore.setText("" + score);
                }
                else{
                    rTile.setIcon(emoji300);
                }
                hasPlayed = true;
            }
            else if (source == btnNext){
                lTile.setIcon(blue300);
                rTile.setIcon(orange300);
                hasPlayed = false;
                genAns();
            }
            else if (source == btnNew){
                lTile.setIcon(blue300);
                rTile.setIcon(orange300);
                hasPlayed = false;
                tfScore.setText("0");
            }
            // if (source == lTile){
            //     if (isLeftOpen){
            //         lTile.setIcon(blue300);
            //         isLeftOpen = !isLeftOpen;
            //     }
            //     else{
            //         lTile.setIcon(meow300);
            //         isLeftOpen = !isLeftOpen;
            //     }
            // }
            // else if (source == rTile){
            //     if (isRightOpen){
            //         rTile.setIcon(orange300);
            //         isRightOpen = !isRightOpen;
            //     }
            //     else{
            //         rTile.setIcon(emoji300);
            //         isRightOpen = !isRightOpen;
            //     }
            // }
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    }
    public static void main(String[] args) {
        Gamelec6 game = new Gamelec6();
    }
}
