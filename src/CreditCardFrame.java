import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CreditCardFrame extends JFrame {
    CreditCarPayment carPayment = new CreditCarPayment();
    CreditCardFrame(){

        // Image icon and adding in label
        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\creditCardI.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        // Adding imageLabel in leftPanel
        JPanel leftPanel= new JPanel();
        leftPanel.setBounds(0,0,300,390);
        leftPanel.add(imageLabel);

        // Defining labels
        JPanel rightPanel =  new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBackground(new Color(153, 199, 174));
        rightPanel.setBounds(300,0,550,372);


        JLabel cardNo ,amount, CVCNo,expiryDay,expiryMonth,expiryYear;
        JTextField amountField,cardField,CVCField, expiryDayField,expiryMonField,expiryYeField;

        // Making a label for house
        cardNo = new JLabel();
        cardNo.setBounds(30, 50, 300, 20);
        cardNo.setText("Card number:");
        cardNo.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        cardField = new JTextField();
        cardField.setPreferredSize(new Dimension(350,30));
        cardField.setFont(new Font("Cambria",Font.PLAIN,14));
        cardField.setForeground(new Color(0x111113));
        cardField.setBounds(130, 40, 350, 30);
        cardField.setBackground(Color.white);

        cardField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateCardNo(cardField);
            }
        });

        rightPanel.add(cardField);
        rightPanel.add(cardNo);

        // Making a label
        CVCNo = new JLabel();
        CVCNo.setBounds(80, 80, 300, 20);
        CVCNo.setText("CVC:");
        CVCNo.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        CVCField = new JTextField();
        CVCField.setPreferredSize(new Dimension(350,30));
        CVCField.setFont(new Font("Cambria",Font.PLAIN,14));
        CVCField.setForeground(new Color(0x111113));
        CVCField.setBounds(130, 80, 350, 30);
        CVCField.setBackground(Color.white);

        CVCField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateCVC(CVCField);
            }
        });

        // Adding label and textField to panel
        rightPanel.add(CVCField);
        rightPanel.add(CVCNo);

        // Making a label
        expiryDay = new JLabel();
        expiryDay.setBounds(30, 120, 300, 20);
        expiryDay.setText("Expiry day:");
        expiryDay.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        expiryDayField = new JTextField();
        expiryDayField.setPreferredSize(new Dimension(350,30));
        expiryDayField.setFont(new Font("Cambria",Font.PLAIN,14));
        expiryDayField.setForeground(new Color(0x111113));
        expiryDayField.setBounds(130, 120, 350, 30);
        expiryDayField.setBackground(Color.white);

        // Adding label and textField to panel
        rightPanel.add(expiryDayField);
        rightPanel.add(expiryDay);

        // Making a label
        expiryMonth = new JLabel();
        expiryMonth.setBounds(30, 160, 300, 20);
        expiryMonth.setText("Expiry Month:");
        expiryMonth.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        expiryMonField = new JTextField();
        expiryMonField.setPreferredSize(new Dimension(350,30));
        expiryMonField.setFont(new Font("Cambria",Font.PLAIN,14));
        expiryMonField.setForeground(new Color(0x111113));
        expiryMonField.setBounds(130, 160, 350, 30);
        expiryMonField.setBackground(Color.white);

        // Adding label and textField to panel
        rightPanel.add(expiryMonField);
        rightPanel.add(expiryMonth);

        // Making a label
        expiryYear = new JLabel();
        expiryYear.setBounds(30, 200, 300, 20);
        expiryYear.setText("Expiry Year:");
        expiryYear.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        expiryYeField = new JTextField();
        expiryYeField.setPreferredSize(new Dimension(350,30));
        expiryYeField.setFont(new Font("Cambria",Font.PLAIN,14));
        expiryYeField.setForeground(new Color(0x111113));
        expiryYeField.setBounds(130, 200, 350, 30);
        expiryYeField.setBackground(Color.white);

        expiryYeField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateDate(expiryDayField,expiryMonField,expiryYeField);
            }
        });

        // Adding label and textField to panel
        rightPanel.add(expiryYeField);
        rightPanel.add(expiryYear);

        // Making a label for street
        amount = new JLabel();
        amount.setBounds(50, 240, 250, 20);
        amount.setText("Amount:");
        amount.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        amountField = new JTextField();
        amountField.setPreferredSize(new Dimension(350,30));
        amountField.setFont(new Font("Cambria",Font.PLAIN,14));
        amountField.setForeground(new Color(0x111113));
        amountField.setBounds(130, 240, 350,30);
        amountField.setBackground(Color.white);
        rightPanel.add(amount);
        rightPanel.add(amountField);

        amountField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAmount(amountField);
            }
        });


        // Defining button
        JButton confirmbutton = new JButton();
        confirmbutton.setPreferredSize(new Dimension(180,40));
        confirmbutton.setBounds(120, 290, 180, 40);
        confirmbutton.setText("Confirm");
        confirmbutton.setFont(new  Font("Cambria",Font.PLAIN,15));
        confirmbutton.setForeground(Color.WHITE);
        confirmbutton.setFocusable(false);
        confirmbutton.setBackground(new Color(5, 5, 5));


        confirmbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmbutton.setForeground(new Color(186, 215, 200));
                confirmbutton.setFont(new Font("TimesRoman",Font.BOLD,15));
                JOptionPane.showMessageDialog(null,"Payment Successful");
                dispose();
            }
        });

        rightPanel.add(confirmbutton);

        JButton proceedShop = new JButton();
        proceedShop.setPreferredSize(new Dimension(180,40));
        proceedShop.setBounds(300, 290, 180, 40);
        proceedShop.setText("Continue Shopping");
        proceedShop.setFont(new  Font("Cambria",Font.PLAIN,15));
        proceedShop.setForeground(Color.WHITE);
        proceedShop.setFocusable(false);
        proceedShop.setBackground(new Color(5, 5, 5));


        proceedShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proceedShop.setForeground(new Color(186, 215, 200));
                proceedShop.setFont(new Font("Cambria",Font.BOLD,15));
                ClothesGUI clothesGUI = new ClothesGUI();
            }
        });
        rightPanel.add(proceedShop);

        // Frame
        this.setTitle("Credit Card Payment");
        this.setSize(870, 411);
        this.setVisible(true);
        this.setLayout(null);
        this.add(leftPanel);
        this.add(rightPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // To change the background of gui window

        this.getContentPane().setBackground(new Color(153, 199, 174));
        // To display the frame in center
        this.setLocationRelativeTo(null);
    }


    private void validateAmount(JTextField amountField) {

        String money = amountField.getText();
        int amount = Integer.parseInt(money);
        carPayment.setAmount(amount);
        if(carPayment.validateAmount()){
            amountField.setBackground(new Color(142, 224, 176, 255));

        }
        else{
            showErrorMessage("Invalid Amount.\nPlease Enter again: ");
            amountField.setText("");
            // Set focus back to the text field
            amountField.requestFocusInWindow();
        }
    }
    private void validateCardNo(JTextField cardField) {

        String cardNo = cardField.getText();
        carPayment.setCardNo(cardNo);

        if(carPayment.isValidCardNo()){
            cardField.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid Card Number." +
                    "\nPlease Enter Again ");
            cardField.setText("");
            // Set focus back to the text field
            cardField.requestFocusInWindow();
        }
    }
    private void validateCVC(JTextField CVCField) {

        String cardNo = CVCField.getText();
        carPayment.setCVCNo(cardNo);
        if(carPayment.isValidCVC()){
            CVCField.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid CVC.\nPlease Enter again: ");
            CVCField.setText("");
            // Set focus back to the text field
            CVCField.requestFocusInWindow();
        }
    }

    private void validateDate(JTextField expiryD,JTextField expiryM,JTextField expiryY) {

        String Eyear= expiryY.getText();
        String Emonth= expiryM.getText();
        String Eday= expiryD.getText();
        int year = Integer.parseInt(Eyear);
        int month = Integer.parseInt(Emonth);
        int day = Integer.parseInt(Eday);
        carPayment.setExpiryDay(day);
        carPayment.setExpiryMonth(month);
        carPayment.setExpiryYear(year);
        if(carPayment.validDate()){
            expiryD.setBackground(new Color(142, 224, 176, 255));
            expiryM.setBackground(new Color(142, 224, 176, 255));
            expiryY.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid Date.\nPlease Enter again: ");
            expiryD.setText("");
            expiryY.setText("");
            expiryM.setText("");
            // Set focus back to the text field
            expiryD.requestFocusInWindow();
            expiryM.requestFocusInWindow();
            expiryY.requestFocusInWindow();
        }
    }
    private void showErrorMessage(String s) {
        JOptionPane.showMessageDialog(this, s, "Error", JOptionPane.ERROR_MESSAGE);
    }
}