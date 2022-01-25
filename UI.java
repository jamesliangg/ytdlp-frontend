import javax.swing.*;  
import java.awt.event.*;
import java.awt.Font;
import java.awt.BorderLayout;

/*
https://www.javatpoint.com/java-jbutton
https://www.javatpoint.com/java-jlabel
https://www.javatpoint.com/java-jtextfield
https://www.javatpoint.com/java-jcheckbox
https://www.javatpoint.com/java-jradiobutton
*/

public class UI extends JFrame implements ActionListener{
    JLabel l1;
    JTextField tf1;
    JCheckBox cb1;
    JRadioButton r1,r2;
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
        cb1.setBounds(25,60,125,50);
        f.add(cb1);
        r1 = new JRadioButton("Extract Video", true);
        r2 = new JRadioButton("Extract Audio");
        r1.setBounds(25,100,125,30);
        r2.setBounds(25,120,125,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f.add(r1);f.add(r2);
    }
    public void actionPerformed(ActionEvent e){
        boolean ignoreErrors = true;
        boolean extractVideo = false;
        boolean extractAudio = false;
        String s1 = tf1.getText();
        if(cb1.isSelected()){
            ignoreErrors = true;
        }
        if(r1.isSelected()){
            extractVideo = true;
        }
        if(r2.isSelected()){
            extractAudio = true;
        }
        System.out.println(s1);
        System.out.println(ignoreErrors);
        System.out.println(extractVideo);
        System.out.println(extractAudio);
    }
}
