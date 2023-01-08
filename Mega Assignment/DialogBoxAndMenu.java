import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class DialogBoxAndMenu extends JFrame {
    JFrame jFrame;
    JMenu menu, submenu;
    JMenuItem item1, item2, item3, item4, item5;
    public DialogBoxAndMenu(){
        jFrame = new JFrame("Lendi Braches.");
        JMenuBar jmenubar = new JMenuBar();
        menu = new JMenu("Branches");
        submenu = new JMenu("CSE");
        item1 = new JMenuItem("ECE");
        item2 = new JMenuItem("EEE");
        item3 = new JMenuItem("MECH");
        item4 = new JMenuItem("CSE-A");
        item5 = new JMenuItem("CSE-B");
        menu.add(item1); 
        menu.add(item2);
        menu.add(item3);
        submenu.add(item4);
        submenu.add(item5);
        menu.add(submenu);
        jmenubar.add(menu);


        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1 = new JFrame("Message");
                JLabel label = new JLabel();
                JButton ece = new JButton("OK");
                ece.setSize(50,50);
                label.setText("Hello ECE");
                jFrame1.add(label, BorderLayout.NORTH);
                jFrame1.add(ece, BorderLayout.SOUTH);
                jFrame1.setSize(400,200);
                jFrame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                jFrame1.setVisible(true);
                
            }
        });

        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1 = new JFrame("Message");
                JLabel label = new JLabel();
                JButton ece = new JButton("OK");
                ece.setSize(50,50);
                label.setText("Hello EEE");
                jFrame1.add(label, BorderLayout.NORTH);
                jFrame1.add(ece, BorderLayout.SOUTH);
                jFrame1.setSize(400,200);
                jFrame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                jFrame1.setVisible(true);
                
            }
        });

        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1 = new JFrame("Message");
                JLabel label = new JLabel();
                JButton ece = new JButton("OK");
                ece.setSize(50,50);
                label.setText("Hello MECH");
                jFrame1.add(label, BorderLayout.NORTH);
                jFrame1.add(ece, BorderLayout.SOUTH);
                jFrame1.setSize(400,200);
                jFrame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                jFrame1.setVisible(true);
                
            }
        });

        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1 = new JFrame("Message");
                JLabel label = new JLabel();
                JButton ece = new JButton("OK");
                ece.setSize(50,50);
                label.setText("Hello CSE-A");
                jFrame1.add(label, BorderLayout.NORTH);
                jFrame1.add(ece, BorderLayout.SOUTH);
                jFrame1.setSize(400,200);
                jFrame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                jFrame1.setVisible(true);
                
            }
        });

        item5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1 = new JFrame("Message");
                JLabel label = new JLabel();
                JButton ece = new JButton("OK");
                ece.setSize(50,50);
                label.setText("Hello CSE-B");
                jFrame1.add(label, BorderLayout.NORTH);
                jFrame1.add(ece, BorderLayout.SOUTH);
                jFrame1.setSize(400,200);
                jFrame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                jFrame1.setVisible(true);
                
            }
        });

        jFrame.setJMenuBar(jmenubar);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
    public static void main(String[] args) {
        DialogBoxAndMenu dialogBoxAndMenu = new DialogBoxAndMenu();   
    }
}


