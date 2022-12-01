//package Manager;

//import logs.ResetMenu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.sun.java.swing.plaf.windows.resources.windows;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import java.awt.Button;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField UsernameInput;
    private JPasswordField passwordInput;

    /**
     * Launch the application.
     */
    //call application by main
    public static void startProgram() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public Login() {
        setForeground(new Color(0, 51, 255));
        setBackground(SystemColor.desktop);
     //   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 905, 713);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel Username = new JLabel("UserID:");
        Username.setForeground(new Color(0, 0, 0));
        Username.setFont(new Font("Courier New", Font.PLAIN, 25));
        Username.setBounds(26, 120, 105, 63);
        contentPane.add(Username);

        JLabel password = new JLabel("Password:");
        password.setForeground(new Color(0, 0, 0));
        password.setFont(new Font("Courier New", Font.PLAIN, 25));
        password.setBounds(26, 194, 140, 63);
        contentPane.add(password);

        UsernameInput = new JTextField();
        UsernameInput.setFont(new Font("Courier New", Font.PLAIN, 19));
        UsernameInput.setBounds(176, 138, 265, 31);
        contentPane.add(UsernameInput);
        UsernameInput.setColumns(10);

        passwordInput = new JPasswordField();
        passwordInput.setFont(new Font("Courier New", Font.PLAIN, 17));
        passwordInput.setBounds(176, 212, 265, 31);
        contentPane.add(passwordInput);

        Button login = new Button("Login");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                PasswordAndReset pass = new PasswordAndReset();
                if (e.getSource() == login) {
                    String userId = UsernameInput.getText();
                    String userPassword = String.valueOf(passwordInput.getPassword());
                    // go check on hash for password
                    int employee= pass.filePass(userPassword,userId);
                    int manager= pass.filePass(userPassword,userId);
                    if(manager==4){
                        ManagerWindow managerWindow = new ManagerWindow();
                        managerWindow.main(null);

                    }
                    if(employee==2){
                    	Employee em = Roster.viewEmployeesName(userId);
                    	System.out.println(em.getFirstName());
                        EmpScreen empScreen = new EmpScreen(em);
                    }
                    if (pass.manager.containsKey(userId)) {
                        if (pass.manager.get(userId).equals(userPassword)) {
                        	
                            ManagerWindow managerWindow = new ManagerWindow();
                            managerWindow.main(null);
                            
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Invalid Credentials", "Login Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {

                        if (pass.info.containsKey(userId)) {
                            if (pass.info.get(userId).equals(userPassword)) {
                            	Employee em = Roster.viewEmployeesName(userId);
                            	System.out.println(em.getFirstName());
                                EmpScreen empScreen = new EmpScreen(em);

                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid Credentials", "Login Error", JOptionPane.ERROR_MESSAGE);

                            }
                        }
                    }
                }
            }

        });
        login.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 19));
        login.setBounds(251, 284, 140, 31);
        contentPane.add(login);

        Button Clear = new Button("Clear");
        Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== Clear) {
                    UsernameInput.setText("");
                    passwordInput.setText("");
                }
            }
        });
        Clear.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 19));
        Clear.setBounds(251, 343, 140, 31);
        contentPane.add(Clear);

        Button login_1 = new Button("Reset Password");
        login_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PasswordAndReset pass = new PasswordAndReset();
                String userId= UsernameInput.getText();
                String userPassword = String.valueOf(passwordInput.getPassword());
                ResetMenu rest = new ResetMenu();
                rest.Rest();
            }
        });
        login_1.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 19));
        login_1.setBounds(232, 408, 190, 31);
        contentPane.add(login_1);




        //this would add an image wait for later
        // for other users change path of file
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("download(1).png"));
        lblNewLabel.setBounds(176, 120, 282, 203);
        contentPane.add(lblNewLabel);



        JLabel lblNewLabel_1 = new JLabel("Welcome!");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Courier New", Font.PLAIN, 50));
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(502, 120, 282, 157);
        contentPane.add(lblNewLabel_1);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.inactiveCaption);
        panel.setBounds(37, 11, 813, 81);
        contentPane.add(panel);
        
        JLabel lblNewLabel_1_1 = new JLabel("Login");
        lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_1.setFont(new Font("Courier New", Font.BOLD, 55));
        panel.add(lblNewLabel_1_1);




    }// endd constructor


}