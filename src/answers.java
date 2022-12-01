//package Manager;

import javax.print.attribute.URISyntax;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

public class answers implements ActionListener {
    JFrame frame = new JFrame();
    JButton bckBtn = new JButton("Back to main");
    JButton Qbtn = new JButton("Back to questions");
    JLabel label = new JLabel("Help");
    JLabel label2 = new JLabel("Options for clocking in/out will be in the" +
            "-------- of the page.");

    public answers() {
        label.setBounds(0, 0, 500, 50);
        label.setFont(new Font(null, Font.BOLD, 25));
        // for the sake of this iteration, label2 is going to future be a
        // text file.
        label2.setBounds(0, 0, 500, 135);
        label2.setFont(new Font(null, Font.ITALIC, 20));

        bckBtn.setBounds(500, 500, 200, 40);
        bckBtn.setFocusable(false);
        bckBtn.addActionListener(this);

        Qbtn.setBounds(300, 500, 200, 40);
        Qbtn.setFocusable(false);
        Qbtn.addActionListener(this);

        ImageIcon image = new ImageIcon("logo.png"); // create image icon
        frame.getContentPane().setBackground(SystemColor.activeCaption);
        frame.setIconImage(image.getImage());

        frame.getContentPane().add(bckBtn);
        frame.getContentPane().add(Qbtn);
        frame.getContentPane().add(label);
        frame.getContentPane().add(label2);

      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 600);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Qbtn) {
            frame.setVisible(false);
//            QuestionPg window = new QuestionPg();
        }
        if (e.getSource() == bckBtn) {
            frame.setVisible(false);
//            FAQ faq = new FAQ();

        }
    }
}