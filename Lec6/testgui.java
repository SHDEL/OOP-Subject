package Lec6;

import java.awt.event.*;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class testgui implements ActionListener{
    JFrame f;
    JButton btn;
    JTextField tf;
    
    testgui(){
        f = new JFrame("App Title");
        tf = new JTextField("Enter your text");
        btn = new JButton("Button");
        tf.setBounds(50,5,200,20);
        btn.setBounds(50,50,100,30);

        MyActionListener listener = new MyActionListener();
        btn.addActionListener(listener);

        f.add(tf);
        f.add(btn);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        testgui app = new testgui();
    }
    static void demooptionpane(){
        // String name = JOptionPane.showMessageDialog(null, null, null, 0);

    }
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            tf.setText("Fuck");

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
