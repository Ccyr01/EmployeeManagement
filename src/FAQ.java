////package Manager;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class FAQ implements ActionListener {
//    JFrame frame = new JFrame();
//    JButton QBtn = new JButton("Frequently Asked Questions");
//    JLabel label = new JLabel("Example of Main view");
//
//
//    public FAQ() {
//
//        QBtn.setBounds(280,461,200,40);
//        QBtn.setFocusable(false);
//        QBtn.addActionListener(this);
//
//        frame.getContentPane().add(QBtn);
//
//        ImageIcon image = new ImageIcon("logo.png");
//        frame.getContentPane().setBackground(SystemColor.activeCaption);
//        frame.setIconImage(image.getImage());
//        label.setHorizontalAlignment(SwingConstants.CENTER);
//
//        label.setBounds(120,26,500,50);
//        label.setFont(new Font(null, Font.BOLD, 25));
//
//
//
//        frame.getContentPane().add(label);
//        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(750,600);
//        frame.getContentPane().setLayout(null);
//        frame.setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == QBtn) {
//            frame.setVisible(false);
//            QuestionPg window = new QuestionPg();
//
//        }
//
//    }
//}