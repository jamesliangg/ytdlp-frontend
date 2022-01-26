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
https://www.javatpoint.com/java-jlist
*/

public class UI extends JFrame implements ActionListener{
    JLabel l1;
    JTextField tf1;
    JCheckBox cb1,cb2,cb3,cb4;
    JRadioButton r1,r2;
    JList<String> list1, list2;
    UI(){
        JFrame f = new JFrame("Download Options");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        l1 = new JLabel("Enter URL of Video or Playlist");
        l1.setBounds(25,0,375,30);
        l1.setFont(new Font("Serif", Font.CENTER_BASELINE, 16));
        f.add(l1);
        tf1 = new JTextField();
        tf1.setBounds(25,30,350,30);
        f.add(tf1);
        JButton b1 = new JButton("Get download String");
        b1.setBounds(25,225,175,30);
        b1.addActionListener(this);
        f.add(b1);
        cb1 = new JCheckBox("Ignore Errors", true);
        cb1.setBounds(25,60,125,30);
        f.add(cb1);
        r1 = new JRadioButton("Extract Video", true);
        r2 = new JRadioButton("Extract Audio");
        r1.setBounds(25,140,125,30);
        r2.setBounds(25,160,125,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f.add(r1);f.add(r2);
        DefaultListModel<String> ls1 = new DefaultListModel<>();
        ls1.addElement("aac");
        ls1.addElement("flac");
        ls1.addElement("mp3");
        ls1.addElement("m4a");
        ls1.addElement("wav");
        list1 = new JList<>(ls1);
        list1.setBounds(200,70,40,85);
        f.add(list1);
        cb2 = new JCheckBox("Remove Sponsors");
        cb2.setBounds(25,100,150,30);
        f.add(cb2);
        cb3 = new JCheckBox("Add Metadata", true);
        cb3.setBounds(25,80,150,30);
        f.add(cb3);
        cb4 = new JCheckBox("Archive Links");
        cb4.setBounds(25,120,150,30);
        f.add(cb4);
        DefaultListModel<String> ls2 = new DefaultListModel<>();
        ls2.addElement("mp4");
        ls2.addElement("mkv");
        ls2.addElement("webm");
        list2 = new JList<>(ls2);
        list2.setBounds(250,70,40,50);
        f.add(list2);
    }
    public void actionPerformed(ActionEvent e){
        boolean ignoreErrors = false;
        boolean metadata = false;
        boolean sponsors = false;
        boolean archiveLinks = false;
        boolean extractVideo = false;
        boolean extractAudio = false;
        String audioFormat = "";
        String videoFormat = "";
        String s1 = tf1.getText();
        if(cb1.isSelected()){
            ignoreErrors = true;
        }
        if(cb3.isSelected()){
            metadata = true;
        }
        if(cb2.isSelected()){
            sponsors = true;
        }
        if(cb4.isSelected()){
            archiveLinks = true;
        }
        if(r1.isSelected()){
            extractVideo = true;
        }
        if(r2.isSelected()){
            extractAudio = true;
        }
        if(list1.getSelectedIndex() != -1){
            audioFormat = list1.getSelectedValue();
        }
        if(list2.getSelectedIndex() != -1){
            videoFormat = list1.getSelectedValue();
        }
        System.out.println("url" + s1);
        System.out.println("ignoreErrors" + ignoreErrors);
        System.out.println("metadata" + metadata);
        System.out.println("sponsors" + sponsors);
        System.out.println("archiveLinks" + archiveLinks);
        System.out.println("extractVideo" + extractVideo);
        System.out.println("extractAudio" + extractAudio);
        System.out.println("audioFormat" + audioFormat);
        System.out.println("videoFormat" + videoFormat);
    }
}
