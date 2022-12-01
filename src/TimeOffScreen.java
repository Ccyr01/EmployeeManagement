//package Manager;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class TimeOffScreen implements ActionListener{
	Employee employee = null;
    JFrame frame = new JFrame();
    JLabel timeOffLabel = new JLabel("Request Time Off");
    JLabel dateLabel = new JLabel("Enter a date range: ");
    JLabel rangeLabel = new JLabel("-");
    JTextField date1Text = new JTextField();
    JTextField date2Text = new JTextField();
    JButton enterButton = new JButton("Submit ");
    JLabel successLabel = new JLabel("");
    JLabel returnLabel = new JLabel("Return to previous page");
    JButton returnButton = new JButton("Return");
    private final JPanel panel = new JPanel();

    public TimeOffScreen(Employee employee){
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //sets date label
        dateLabel.setBounds(285, 95, 212, 60);
        dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

        //sets first date textbox
        date1Text.setBounds(30, 167, 300, 40);

        //sets range label
        rangeLabel.setBounds(385, 167, 300, 40);
        rangeLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));

        //sets second date textbox
        date2Text.setBounds(460, 167, 300, 40);

        //sets success label
        successLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        successLabel.setBounds(190, 400, 400, 60);
        enterButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

        //sets enter button
        enterButton.setBounds(315, 234, 175, 48);
        enterButton.setFocusable(false);
        enterButton.addActionListener(this);
        returnButton.setFont(new Font("Tahoma", Font.PLAIN, 15));

        //sets return button
        returnButton.setBounds(315, 584, 175, 40);
        returnButton.addActionListener(this);
        frame.getContentPane().add(dateLabel);
        frame.getContentPane().add(successLabel);
        frame.getContentPane().add(rangeLabel);

        frame.getContentPane().add(enterButton);
        frame.getContentPane().add(returnButton);

        frame.getContentPane().add(date1Text);
        frame.getContentPane().add(date2Text);
        frame.getContentPane().setBackground(SystemColor.activeCaption);

    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.getContentPane().setLayout(null);
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(35, 11, 705, 60);
        
        frame.getContentPane().add(panel);
        panel.add(timeOffLabel);
        timeOffLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==enterButton){
            successLabel.setText("Your request has been sent to your manager");
        } else if(e.getSource()==returnButton) {
            frame.dispose();
            EmpScreen screen = new EmpScreen(employee);
        }

    }
}