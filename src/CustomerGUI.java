import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.regex.Pattern;

public class CustomerGUI implements ActionListener,Login {

    JFrame loginFrame;
    JFrame signUpFrame;
    JPanel loginPanel,leftPanel,rightPanel;
    JTextField userTextField,nameTextField,emailTextField,dobTextField,passwordText,contactTextField,loginTextField;
    JPasswordField passwordTextField;
    JButton loginButton,toSignUpButton,signUpButton,toLoginButton;
    JLabel userLabel,passwordLabel,loginImageLabel,signUpBGLabel,nameLabel,emailLabel,dobLabel,detaiLabel,contactLabel;
    Font myFont = new Font("Cambria",Font.PLAIN,15);
    public CustomerGUI() {
        openLoginFrame();

    }
    private void openLoginFrame(){
        loginFrame = new JFrame("login");
        loginFrame.setSize(400,700);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setLayout(null);

        //user text field and label
        userLabel = new JLabel("Email");
        userLabel.setBounds(50,270,80,25);
        userLabel.setFont(myFont);
        userTextField = new JTextField(15);
        userTextField.setBounds(140,270,165,25);
        userTextField.setFont(myFont);

        //password text field and label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,300,80,25);
        passwordLabel.setFont(myFont);
        passwordTextField = new JPasswordField(15);
        passwordTextField.setBounds(140,300,165,25);
        passwordTextField.setFont(myFont);
        //buttons
        loginButton=new JButton("Login");
        loginButton.setBounds(145,350,100,25);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(new Color(10, 168, 106));
        loginButton.setFont(myFont);
        loginButton.addActionListener(this);

        toSignUpButton=new JButton("Don't have an account?");
        toSignUpButton.setBounds(80,390,250,25);
        toSignUpButton.setForeground(Color.white);
        toSignUpButton.setBackground(new Color(150, 146, 146));
        toSignUpButton.setFont(myFont);
        toSignUpButton.addActionListener(this);

        //image label
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\green.png");
        loginImageLabel = new JLabel(icon);
        loginImageLabel.setBounds(95, 20, 220, 220);
        //panels
        loginPanel = new JPanel();
        loginPanel.setBounds(0,0,450,500);
        loginPanel.add(userLabel);
        loginPanel.add(userTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordTextField);
        loginPanel.add(loginButton);
        loginPanel.add(toSignUpButton);
        loginPanel.setBackground(Color.white);
        loginPanel.setLayout(null);

        //frames
        loginFrame.add(loginImageLabel);
        loginFrame.add(loginPanel);
        loginFrame.setSize(450,500);
        loginFrame.setVisible(true);
    }


    private void openSignupFrame(){
        signUpFrame = new JFrame("Sign Up");
        signUpFrame.setSize(700,550);
        signUpFrame.setLocationRelativeTo(null);

        //labels
        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\bg.png");
        signUpBGLabel = new JLabel(image);
        leftPanel= new JPanel();
        leftPanel.setBounds(0,12,275,476);
        leftPanel.add(signUpBGLabel);
        leftPanel.setBackground(new Color(209, 215, 229));

        rightPanel= new JPanel();
        rightPanel.setBounds(300,0,400,476);
        rightPanel.setBackground(new Color(209, 215, 229));

        detaiLabel = new JLabel("Please enter the following details ");
        detaiLabel.setBounds(300,25,260,25);
        detaiLabel.setFont(myFont);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(300,70,80,25);
        nameLabel.setFont(myFont);
        nameTextField = new JTextField(15);
        nameTextField.setBounds(400,70,170,25);
        nameTextField.setFont(myFont);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(300,110,80,25);
        emailLabel.setFont(myFont);
        emailTextField = new JTextField(15);
        emailTextField.setBounds(400,110,170,25);
        emailTextField.setFont(myFont);

        userLabel = new JLabel("Username");
        userLabel.setBounds(300,150,80,25);
        userLabel.setFont(myFont);
        userTextField = new JTextField(15);
        userTextField.setBounds(400,150,170,25);
        userTextField.setFont(myFont);

        //password
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(300,190,80,25);
        passwordLabel.setFont(myFont);
        passwordText = new JTextField(15);
        passwordText.setBounds(400,190,170,25);
        passwordText.setFont(myFont);

        dobLabel = new JLabel("DOB");
        dobLabel.setBounds(300,230,80,25);
        dobLabel.setFont(myFont);
        dobTextField = new JTextField(15);
        dobTextField.setBounds(400,230,170,25);
        dobTextField.setFont(myFont);

        contactLabel = new JLabel("Contact No.");
        contactLabel.setBounds(300,270,80,25);
        contactLabel.setFont(myFont);
        contactTextField = new JTextField(15);
        contactTextField.setBounds(400,270,170,25);
        contactTextField.setFont(myFont);

        signUpButton=new JButton("Signup");
        signUpButton.setBounds(400,360,100,25);
        signUpButton.setForeground(Color.white);
        signUpButton.setBackground(new Color(10, 168, 106));
        signUpButton.setFont(myFont);
        signUpButton.addActionListener(this);

        toLoginButton=new JButton("Already have an account?");
        toLoginButton.setBounds(330,410,250,25);
        toLoginButton.setForeground(Color.white);
        toLoginButton.setBackground(new Color(133, 132, 130));
        toLoginButton.setFont(myFont);
        toLoginButton.addActionListener(this);

        rightPanel.add(detaiLabel);
        rightPanel.add(nameLabel);
        rightPanel.add(nameTextField);
        rightPanel.add(emailLabel);
        rightPanel.add(emailTextField);
        rightPanel.add(userLabel);
        rightPanel.add(userTextField);
        rightPanel.add(passwordLabel);
        rightPanel.add(passwordText);
        rightPanel.add(dobLabel);
        rightPanel.add(dobTextField);
        rightPanel.add(contactLabel);
        rightPanel.add(contactTextField);
        rightPanel.add(signUpButton);
        rightPanel.add(toLoginButton);
        rightPanel.setLayout(null);


        signUpFrame.add(leftPanel);
        signUpFrame.add(rightPanel);
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            String loginId = userTextField.getText();
            String email = emailTextField.getText();
            String password = passwordText.getText();
            String dob = dobTextField.getText();
            String name = nameTextField.getText();
            String contact = contactTextField.getText();
            if (verifyEmail(email) && verifyPassword(password) && verifyPhone(contact)) {
                Customer c = new Customer(loginId, email, password, dob, name, "", contact);
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customers.txt", true));
                    oos.writeObject(c);
                    oos.close();
                    JOptionPane.showMessageDialog(null, "User registered successfully!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred while saving user information.");
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Info");
            }
            signUpFrame.dispose(); // Close this frame


        }
        if (e.getSource() == toSignUpButton) {
            openSignupFrame();
            loginFrame.dispose();
        }
        if (e.getSource() == toLoginButton) {
            openLoginFrame();
            signUpFrame.dispose();
        }
        if (e.getSource() == loginButton) {
            String username=userTextField.getText();
            String password = new String(passwordTextField.getPassword());
            if (login(username,password)){
                JOptionPane.showMessageDialog(loginFrame, "Login successful!");
                ClothesGUI clothesGUI = new ClothesGUI();
                loginFrame.dispose();
                //show hadia ki frame
            } else {
                JOptionPane.showMessageDialog(loginFrame, "Invalid login credentials. Please check and try again.");
            }

        }


    }
    @Override
    public boolean login(String username, String password) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customers.txt"));
            while (true) {
                try {
                    Customer c = (Customer) ois.readObject();
                    if (c.getEmail().equals(username) && c.getPassword().equals(password)) {
                        ois.close();
                        return true;
                    }
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
    private boolean verifyEmail(String email) {
        String pattern = "^[\\w.-]+@[\\w.-]+\\.[\\w]+$";
        return Pattern.matches(pattern, email);

    }
    private boolean verifyPassword(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(pattern, password);

    }
    private boolean verifyPhone(String phoneNo) {
        String pattern = "^\\d{4}-\\d{7}$";
        return Pattern.matches(pattern, phoneNo);
    }

}
