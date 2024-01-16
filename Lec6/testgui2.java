package Lec6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class testgui2 implements ActionListener{
     JFrame f;
    JButton btn;
    JTextField tf;
    
    testgui2(){
        f = new JFrame("App Title");
        tf = new JTextField("Enter your text");
        btn = new JButton("Button");
        tf.setBounds(50,5,200,20);
        btn.setBounds(50,50,100,30);

        // -------Anomy-----------
        // MyActionListener listener = new MyActionListener();
        // ActionListener listener = new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         tf.setText("from anomy class");
        //     }
        // };
        // btn.addActionListener(listener);

        // -----------lambda----------
        btn.addActionListener(ev -> tf.setText("from lambda"));
        

        f.add(tf);
        f.add(btn);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        testgui2 app = new testgui2();
    }
    static void demooptionpane(){
        // String name = JOptionPane.showMessageDialog(null, null, null, 0);

    }
    // private class MyActionListener implements ActionListener {
    //     @Override
    //     public void actionPerformed(ActionEvent e){
    //         tf.setText("Fuck me!!!");
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
