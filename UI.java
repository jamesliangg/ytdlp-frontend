import javax.swing.*;  
import java.awt.event.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class UI extends JFrame implements ActionListener{
    JLabel l1;
    JTextField tf1;
    JCheckBox cb1;
    UI(){
        JFrame f = new JFrame("Download Options");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        f.setSize(500,300);
        f.setLayout(null);
        f.setVisible(true);
        l1 = new JLabel("Enter URL of Video or Playlist");
        l1.setBounds(25,0,475,30);
        l1.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        f.add(l1);
        tf1 = new JTextField();
        tf1.setBounds(25,30,400,30);
        f.add(tf1);
        JButton b1 = new JButton("Get download Sting");
        b1.setBounds(25,225,150,30);
        b1.addActionListener(this);
        f.add(b1);
        cb1 = new JCheckBox("Ignore Errors", true);
        cb1.setBounds(25,60,200,50);
        f.add(cb1);
    }
    public void actionPerformed(ActionEvent e){
        boolean ignoreErrors = true;
        String s1 = tf1.getText();
        System.out.println(s1);
        if(cb1.isSelected()){
            ignoreErrors = true;
        }
        System.out.println(ignoreErrors);
    }
}
