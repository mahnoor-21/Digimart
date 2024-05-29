import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class OrderGUI {
    private JFrame orderFrame;
    private JPanel orderPanel;
    private JTextArea orderTextArea;
    private JScrollPane scrollPane;

    private ArrayList<Order> orders;
    public OrderGUI() {
        openOrderFrame();
        loadOrdersFromFile(); // Load existing orders when the GUI is initialized
        updateOrderTextArea();
    }
    private void openOrderFrame() {
        orderFrame = new JFrame("Order History");
        orderFrame.setSize(600, 400);
        orderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        orderFrame.setLayout(null);

        // Order Table
        orderTextArea = new JTextArea();
        scrollPane = new JScrollPane(orderTextArea);
        scrollPane.setBounds(20, 20, 550, 300);

        // Panel
        orderPanel = new JPanel();
        orderPanel.setBounds(0, 0, 600, 400);
        orderPanel.add(scrollPane);
        orderPanel.setLayout(null);
        orderFrame.setLocationRelativeTo(null);
        orderFrame.add(orderPanel);
        orderFrame.setVisible(true);

        // Initialize orders
        orders = new ArrayList<>();
    }
    private void updateOrderTextArea() {
        String displayText = "";

        for (Order order : orders) {
            displayText += "Order ID: " + order.getOrderId() + "\n";
            displayText += "Date Placed: " +order.getDatePlaced() + "\n";
            displayText += "Order Details: " +order.getOrderDetail()+ "\n";

            // Assuming your Cart class has a toString() method
            displayText += order.getOrderDetail() + "\n";

            displayText += "------------------------------------------------\n";
        }

        orderTextArea.setText(displayText);
    }
    private void loadOrdersFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("orders.txt"))) {
            orders = (ArrayList<Order>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }

    private void saveOrdersToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("orders.txt"))) {
            oos.writeObject(orders);
        } catch (IOException e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }
    public void addOrder(Order order) {
        orders.add(order);
        saveOrdersToFile();
        updateOrderTextArea();
    }
    public static void main(String[] args) {
        new OrderGUI();
    }

}
