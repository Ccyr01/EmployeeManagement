////package Manager;
//
//import Manager.FAQ;
//import Manager.answers;
//
//import javax.print.attribute.URISyntax;
//import javax.swing.*;
//import java.awt.*;
//import java.net.*;
//import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//import java.net.URISyntaxException;
//
//public class QuestionPg implements ActionListener {
//    JFrame frame = new JFrame();
//    JButton bckBtn = new JButton("Back");
//    JButton ansbtn = new JButton("Ans");
//    /*
//    JButton btn2 = new JButton("Ans");
//    JButton btn3 = new JButton("Ans");
//    JButton btn4 = new JButton("Ans");
//   */
//    JLabel label = new JLabel("History of Previously Asked Questions");
//    JLabel label2 = new JLabel("Some list of questions");
//
//    QuestionPg() {
//        label.setBounds(0, 0, 500, 50);
//        label.setFont(new Font(null, Font.BOLD, 25));
//        // for the sake of this iteration, label2 is going to future be a
//        // text file.
//        label2.setBounds(0, 0, 500, 135);
//        label2.setFont(new Font(null, Font.ITALIC, 20));
//
//        //
//        bckBtn.setBounds(500,500,200,40);
//        bckBtn.setFocusable(false);
//        bckBtn.addActionListener(this);
//
//        ImageIcon image = new ImageIcon("logo.png"); // create image icon
//        frame.getContentPane().setBackground(SystemColor.activeCaption);
//        frame.setIconImage(image.getImage());
//
//
//        // later method will include a side-bar or a menu
//        // button 1 - 4 for questions
//        ansbtn.setBounds(150,100,100,25);
//        ansbtn.setFocusable(false);
//        ansbtn.addActionListener(this);
////        btn2.setBounds(100,100,150,150);
////        btn3.setBounds(50,50,150,150);
////        btn4.setBounds(0,0,150,150);
//
////        frame.add(btn2);
////        frame.add(btn3);
////        frame.add(btn4);
//
//        frame.getContentPane().add(bckBtn);
//        frame.getContentPane().add(ansbtn);
//        frame.getContentPane().add(label);
//        frame.getContentPane().add(label2);
//
//       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(750,600);
//        frame.getContentPane().setLayout(null);
//        frame.setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == ansbtn) {
//            frame.setVisible(false);
//
//            answers window = new answers();
//        }
//        if(e.getSource() == bckBtn) {
//            frame.setVisible(false);
//            FAQ faq = new FAQ();
//        }
//
//
//    }
//}