import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ShippingFrame extends JFrame implements Serializable {
    ShippingFrame(){

        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\ship.jpg");
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(100,50,300,680);
        imageLabel.setIcon(image);

        // Adding imageLabel in leftPanel
        JPanel leftPanel= new JPanel();
        leftPanel.setBounds(0,0,300,680);
        leftPanel.add(imageLabel);
        leftPanel.setBackground(Color.white);

        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(300,0,550,680);
        rightPanel.setLayout(null);
        rightPanel.setBackground(new Color(197, 222, 208));


        // Defining
        JLabel house ,street,code,city, instruction,province;
        JTextField cityField,streetField,codeField,houseField, instructionField;


        JLabel shipping = new JLabel("Shipping Address : ");
        shipping.setFont(new Font("Cambria",Font.BOLD,20));
        shipping.setBounds(350,50,300,25);
        rightPanel.add(shipping);

        // Making a label for house
        house = new JLabel();
        house.setBounds(400,100,90,20);
        house.setText("House No:");
        house.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        houseField = new JTextField();
        houseField.setPreferredSize(new Dimension(160,60));
        houseField.setFont(new Font("Cambria",Font.PLAIN,14));
        houseField.setForeground(new Color(0x111113));
        houseField.setBounds(510,100,240,28);
        houseField.setBackground(Color.white);
        houseField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateHouseNo(houseField);
            }
        });

        // Adding label and textField to panel
        rightPanel.add(house);
        rightPanel.add(houseField);

        // Making a label for street
        street = new JLabel();
        street.setBounds(400,150,70,20);
        street.setText("Street No:");
        street.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        streetField = new JTextField();
        streetField.setPreferredSize(new Dimension(140,60));
        streetField.setFont(new Font("Cambria",Font.PLAIN,14));
        streetField.setForeground(new Color(0x111113));
        streetField.setBounds(510,150,240,28);
        streetField.setBackground(Color.white);
        streetField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateStreetNo(streetField);
            }
        });

        // Adding label and textField to panel
        rightPanel.add(street);
        rightPanel.add(streetField);

        // Making a label for zip code
        code = new JLabel();
        code.setText("Zip Code:");
        code.setBounds(400,200,70,20);
        code.setFont(new Font("Cambria", Font.BOLD, 14));
        // Adding a textFiled
        codeField = new JTextField();
        codeField.setPreferredSize(new Dimension(350,60));
        codeField.setFont(new Font("Cambria",Font.PLAIN,14));
        codeField.setForeground(new Color(0x111113));
        codeField.setBounds(510,200,240,28);
        code.setBackground(Color.white);
        codeField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateZIP(codeField);
            }
        });
        // Adding label and textField to panel
        rightPanel.add(code);
        rightPanel.add(codeField);

        // Making a label for city
        city = new JLabel();
        city.setText("City:");
        city.setBounds(400,250,70,20);
        city.setFont(new Font("Cambria", Font.BOLD, 14));

        // Adding a textFiled
        cityField = new JTextField();
        cityField.setPreferredSize(new Dimension(350,60));
        cityField.setFont(new Font("Cambria",Font.PLAIN,14));
        cityField.setForeground(new Color(0x111113));
        cityField.setBounds(510,250,240,28);
        cityField.setBackground(Color.WHITE);

        cityField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateCity(cityField);
            }
        });
        // Adding label and textField to panel
        rightPanel.add(city);
        rightPanel.add(cityField);


        // Making a label for city
        province = new JLabel();
        province.setText("Province:");
        province.setBounds(400,300,70,20);
        province.setFont(new Font("Cambria", Font.BOLD, 14));
        rightPanel.add(province);

        String[] provincesList = {"Punjab", "Sindh", "Baluchistan", "Khyber Pakhtunkhwa"};
        JComboBox<String> provincesBox = new JComboBox<>(provincesList);
        provincesBox.setBounds(510, 300, 240, 28);
        provincesBox.setBackground(Color.white);

        provincesBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateCombo(provincesBox);
            }
        });
        rightPanel.add(provincesBox);

        // Making a label for city
        instruction = new JLabel();
        instruction.setText("Address Instructions:");
        instruction.setBounds(400,350,170,20);
        instruction.setFont(new Font("Cambria", Font.BOLD, 14));
        // Adding a textFiled
        instructionField = new JTextField();
        instructionField.setPreferredSize(new Dimension(340,50));
        instructionField.setFont(new Font("Cambria",Font.PLAIN,14));
        instructionField.setForeground(new Color(0x111113));
        instructionField.setBounds(400,390,350,50);
        instructionField.setBackground(Color.WHITE);

        instructionField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setAddressInstruction(instructionField.getText());
                instructionField.setBackground(new Color(142, 224, 176, 255));
            }
        });
        // Adding label and textField to panel
        rightPanel.add(instructionField);
        rightPanel.add(instruction);

        JButton button = new JButton();
        button.setBounds(460,470,230,50);
        button.setText("Proceed to Payment");
        button.setFont(new  Font("TimesRoman",Font.PLAIN,15));
        button.setForeground(Color.WHITE);
        button.setFocusable(false);
        button.setBackground(new Color(5, 5, 5));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setForeground(Color.BLACK);
                button.setBackground(Color.white);
                writeToAddressFile();
                dispose();
                PaymentFrame f = new PaymentFrame();
                // Maybe need to proceed to shipping after this
            }
        });
        rightPanel.add(button);

        // Frame
        this.setTitle("Shipping");
        this.setSize(900, 680);
        this.setVisible(true);
        this.add(leftPanel);
        this.add(rightPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // To change the background of gui window
        this.getContentPane().setBackground(new Color(153, 199, 174));
        // To display the frame in center
        this.setLocationRelativeTo(null);
    }
    Shipping a = new Shipping();
    private void validateZIP(JTextField codeField) {

        String code = codeField.getText();
        a.setZipCode(code);
        if(a.isValidZipCode()){
            codeField.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid Zip code. Please Enter again: ");
            codeField.setText("");
            // Set focus back to the text field
            codeField.requestFocusInWindow();
        }
    }
    private void validateHouseNo(JTextField houseField) {

        String code = houseField.getText();
        int house = Integer.parseInt(code);
        a.setHouseNo(house);
        if(a.isValidHouseNo()){
            houseField.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid House Number. Please Enter again: ");
            houseField.setText("");
            // Set focus back to the text field
            houseField.requestFocusInWindow();
        }
    }

    private void validateStreetNo(JTextField streetField) {

        String streetNo = streetField.getText();
        int street = Integer.parseInt(streetNo);
        a.setStreetNo(street);
        if(a.isValidStreetNo()){
            streetField.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid Street number.Please Enter again(Digits only): ");
            streetField.setText("");
            // Set focus back to the text field
            streetField.requestFocusInWindow();
        }
    }

    private void validateCity(JTextField cityField) {

        String city = cityField.getText();
        a.setCity(city);
        if(a.isValidCity()){
            cityField.setBackground(new Color(142, 224, 176, 255));
        }
        else{
            showErrorMessage("Invalid City.Please Enter again(Letters only): ");
            cityField.setText("");
            // Set focus back to the text field
            cityField.requestFocusInWindow();
        }
    }
    private void validateCombo(JComboBox province) {

        String provinces = (String) province.getSelectedItem();
        a.setCity(provinces);
    }

    private void showErrorMessage(String s) {
        JOptionPane.showMessageDialog(this, s, "Error", JOptionPane.ERROR_MESSAGE);
    }


    public void writeToAddressFile(){
        try{
            ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("address.txt"));
            oss.writeObject(a);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public void readFromAddressFile(){
        try{
            ObjectInputStream oss = new ObjectInputStream(new FileInputStream("address.txt"));
            Shipping  s= (Shipping)  oss.readObject();
            System.out.println(s.city);
            System.out.println(s.houseNo);
            System.out.println(s.addressInstruction);
        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
