import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PaymentFrame extends JFrame {
    int optionSelected = 0;
    PaymentFrame(){

        Payment payment = new Payment();
        JLabel paymentMethod;

        JPanel one ,two,three;

        paymentMethod = new JLabel();
        paymentMethod.setBounds(350, 40, 300, 20);
        paymentMethod.setText("Select a payment Method");
        paymentMethod.setForeground(Color.BLACK);
        paymentMethod.setFont(new Font("Cambria", Font.BOLD, 20));

        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\easypaisa.jpg");

        one = new JPanel();
        one.setBounds(200,120,500,100);
        one.setBackground(Color.white);
        one.setBorder(BorderFactory.createLineBorder(new Color(37, 35, 28),5));


        JRadioButton easy = new JRadioButton();
        easy.setFocusable(false);
        easy.setBounds(0,20,10,100);
        easy.setFont(new Font("Cambria",Font.BOLD,30));
        easy.setBackground(Color.white);

        JLabel easyPaisa = new JLabel();
        easyPaisa.setPreferredSize(new Dimension(179,80));
        easyPaisa.setBounds(10, 20, 179, 80);
        easyPaisa.setIcon(image);

        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                optionSelected = 1;
            }
        });
        one.add(easy);
        one.add(easyPaisa);

        two = new JPanel();
        two.setBounds(200,240,500,100);
        two.setBackground(Color.white);
        two.setBorder(BorderFactory.createLineBorder(new Color(37, 35, 28),5));

        JRadioButton credit = new JRadioButton();
        credit.setFocusable(false);
        credit.setBounds(0,20,120,100);
        credit.setBackground(Color.white);

        ImageIcon image1 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\2.png");
        JLabel creditCard = new JLabel();
        creditCard.setPreferredSize(new Dimension(185,80));
        creditCard.setBounds(200, 20, 185, 80);
        creditCard.setIcon(image1);
        credit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                optionSelected = 2;
            }
        });

        two.add(credit);
        two.add(creditCard);

        three = new JPanel();
        three.setBounds(200,370,500,100);
        three.setBackground(Color.white);
        three.setBorder(BorderFactory.createLineBorder(new Color(37, 35, 28),5));

        JRadioButton COD = new JRadioButton();
        COD.setFocusable(false);
        COD.setBounds(0,20,120,100);
        COD.setBackground(Color.white);

        ImageIcon image2 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cod2.png");
        JLabel CODpayment = new JLabel();
        CODpayment.setPreferredSize(new Dimension(185,80));
        CODpayment.setBounds(200, 20, 185, 80);
        CODpayment.setIcon(image2);

        COD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                optionSelected = 3;
            }
        });
        three.add(COD);
        three.add(CODpayment);

        // Defining button
        JButton proceedButton = new JButton();
        proceedButton.setPreferredSize(new Dimension(180,60));
        proceedButton.setBounds(350, 530, 180, 60);
        proceedButton.setText("Proceed");
        proceedButton.setFont(new  Font("Cambria",Font.PLAIN,15));
        proceedButton.setForeground(Color.WHITE);
        proceedButton.setFocusable(false);
        proceedButton.setBackground(new Color(5, 5, 5));

        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proceedButton.setForeground(Color.BLACK);
                proceedButton.setBackground(Color.white);
                if(optionSelected == 1){
                    dispose();
                    EasyPaisaFrame f = new EasyPaisaFrame();
                    CreditCardFrame F = null;
                }
                else if(optionSelected == 2){
                    dispose();
                    CreditCardFrame f = new CreditCardFrame();
                    EasyPaisaFrame F = null;
                }
            }
        });
        // Frame
        this.setTitle("Payment");
        this.setSize(900, 681);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(paymentMethod);
        this.add(one);
        this.add(two);
        this.add(three);
        this.add(proceedButton);
        // To change the background of gui window
        this.getContentPane().setBackground(new Color(218, 246, 237));
        // To display the frame in center
        this.setLocationRelativeTo(null);

    }

}