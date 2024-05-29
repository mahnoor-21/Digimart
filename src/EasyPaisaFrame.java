import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EasyPaisaFrame extends JFrame {
    EasyPaisaFrame(){

        // Image icon and adding in label
        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\easy.png");
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);

        // Adding imageLabel in leftPanel
        JPanel leftPanel= new JPanel();
        leftPanel.setBounds(0,0,300,380);
        leftPanel.add(imageLabel);

        // Defining labels
        JPanel rightPanel =  new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBackground(new Color(153, 199, 174));
        rightPanel.setBounds(300,0,550,380);



        JLabel ReceiverNo ,amount;
        JTextField amountField,receiverNoField;

        // Making a label for house
        ReceiverNo = new JLabel();
        ReceiverNo.setBounds(100, 50, 300, 20);
        ReceiverNo.setText("Enter Receiver's phone Number :");
        ReceiverNo.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        receiverNoField = new JTextField();
        receiverNoField.setPreferredSize(new Dimension(350,30));
        receiverNoField.setFont(new Font("Cambria",Font.PLAIN,14));
        receiverNoField.setForeground(new Color(0x111113));
        receiverNoField.setBounds(100, 80, 350, 30);
        receiverNoField.setBackground(Color.white);

        receiverNoField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validatePhoneNumber(receiverNoField);
            }
        });


        // Adding label and textField to panel
        rightPanel.add(ReceiverNo);
        rightPanel.add(receiverNoField);

        // Making a label for street
        amount = new JLabel();
//        amount.setPreferredSize(new Dimension(500,25));
        amount.setBounds(100, 120, 250, 20);
        amount.setText("Enter amount:");
        amount.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        amountField = new JTextField();
        amountField.setPreferredSize(new Dimension(350,30));
        amountField.setFont(new Font("Cambria",Font.PLAIN,14));
        amountField.setForeground(new Color(0x111113));
        amountField.setBounds(100, 150, 350,30);
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
        confirmbutton.setBounds(160, 190, 180, 40);
        confirmbutton.setText("Confirm");
        confirmbutton.setFont(new  Font("Cambria",Font.PLAIN,15));
        confirmbutton.setForeground(Color.WHITE);
        confirmbutton.setFocusable(false);
        confirmbutton.setBackground(new Color(5, 5, 5));


        confirmbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmbutton.setForeground(new Color(186, 215, 200));
                confirmbutton.setFont(new Font("Cambria",Font.BOLD,15));
                JOptionPane.showMessageDialog(null,"Payment Successful");
                dispose();
            }
        });

        rightPanel.add(confirmbutton);

        JButton proceedShop = new JButton();
        proceedShop.setPreferredSize(new Dimension(180,40));
        proceedShop.setBounds(160, 240, 180, 40);
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
        this.setTitle("EasyPaisa Payment");
        this.setSize(900, 380);
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

    EasyPaisaPayment payment = new EasyPaisaPayment();
    private void validateAmount(JTextField amountField) {

        String money = amountField.getText();
        int amount = Integer.parseInt(money);

        if(payment.validateAmount()){
            amountField.setBackground(new Color(142, 224, 176, 255));
            payment.setAmount(amount);
        }
        else{
            showErrorMessage("Invalid Amount.\nPlease Enter again: ");
            amountField.setText("");
            // Set focus back to the text field
            amountField.requestFocusInWindow();
        }
    }

    private void validatePhoneNumber(JTextField phoneFiled) {

        String phoneNo = phoneFiled.getText();
        payment.setReceiverMobileNo(phoneNo);
        if(payment.isValidPhoneNumber()){
            phoneFiled.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid phone number.\nPlease Enter again(Letters only): ");
            phoneFiled.setText("");
            // Set focus back to the text field
            phoneFiled.requestFocusInWindow();
        }
    }
    private void showErrorMessage(String s) {
        JOptionPane.showMessageDialog(this, s, "Error", JOptionPane.ERROR_MESSAGE);
    }
}