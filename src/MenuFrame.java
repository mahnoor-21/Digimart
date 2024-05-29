import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class MenuFrame extends JFrame implements Serializable {
    MenuFrame(){

        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\untitled3\\src\\pic1234.jpg");
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(0,0,400,650);
        imageLabel.setIcon(image);

        // Adding imageLabel in leftPanel
        JPanel leftPanel= new JPanel();
        leftPanel.setBounds(0,0,400,650);
        leftPanel.add(imageLabel);
        leftPanel.setBackground(Color.white);


        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(400,0,750,650);
        rightPanel.setLayout(null);
        rightPanel.setBackground(new Color(191, 161, 203));


        JLabel shipping = new JLabel("Welcome to Clothify ");
        shipping.setFont(new Font("Cambria",Font.BOLD,35));
        shipping.setBounds(150,50,400,40);
        rightPanel.add(shipping);

        JPanel one ,two,three;


        one = new JPanel();
        one.setBounds(130,150,400,100);
        one.setBackground(Color.white);
        one.setLayout(null);
        one.setBorder(BorderFactory.createLineBorder(new Color(79, 39, 58),4));

        JButton login = new JButton();
        login.setBounds(100, 20,230,50);
        login.setText("Login");
        login.setFont(new  Font("Cambria",Font.PLAIN,19));
        login.setForeground(Color.WHITE);
        login.setFocusable(false);
        login.setBackground(new Color(5, 5, 5));
        leftPanel.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new CustomerGUI();
            }
        });


        one.add(login);

        two = new JPanel();
        two.setBounds(130,300,400,100);
        two.setBackground(Color.white);
        two.setLayout(null);
        two.setBorder(BorderFactory.createLineBorder(new Color(79, 39, 58),4));

        JButton shopping = new JButton();
        shopping.setBounds(100,20,230,50);
        shopping.setText("Start Shopping");
        shopping.setFont(new  Font("Cambria",Font.PLAIN,19));
        shopping.setForeground(Color.WHITE);
        shopping.setFocusable(false);
        shopping.setBackground(new Color(5, 5, 5));
        shopping.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClothesGUI g = new ClothesGUI();
            }
        });

        two.add(shopping);

        three = new JPanel();
        three.setBounds(130,450,400,100);
        three.setBackground(Color.white);
        three.setLayout(null);
        three.setBorder(BorderFactory.createLineBorder(new Color(79, 39, 58),4));

        JButton pastOrders = new JButton();
        pastOrders.setBounds(100,20,230,50);
        pastOrders.setText("View Past Orders");
        pastOrders.setFont(new  Font("Cambria",Font.PLAIN,19));
        pastOrders.setForeground(Color.WHITE);
        pastOrders.setFocusable(false);
        pastOrders.setBackground(new Color(5, 5, 5));
        pastOrders.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderGUI g = new OrderGUI();
            }
        });
        three.add(pastOrders);


        rightPanel.add(one);
        rightPanel.add(two);
        rightPanel.add(three);

        // Frame
        this.setTitle("Shipping");
        this.setSize(1150, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.add(leftPanel);
        this.add(rightPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // To change the background of gui window
        this.getContentPane().setBackground(new Color(136, 90, 114));

        // To display the frame in center
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MenuFrame m = new MenuFrame();
    }
}