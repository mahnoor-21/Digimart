import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CartGUI implements ActionListener {

    private JFrame cartFrame;
    private JPanel cartPanel;
    private JTextArea cartTextArea;
    private JLabel totalLabel, subtotalLabel;
    private JButton proceedToShippingButton, placeOrderButton;

    Cart cartGUI; // For cart details and all
    private Order order;
    public CartGUI() {
        openCartFrame();
    }

    private void openCartFrame() {
        cartFrame = new JFrame("Shopping Cart");
        cartFrame.setSize(400, 400);
        cartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cartFrame.setLayout(null);

        // Cart TextArea
        cartTextArea = new JTextArea();
        cartTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cartTextArea);
        scrollPane.setBounds(20, 20, 350, 200);

        // Labels
        totalLabel = new JLabel("Total: ");
        totalLabel.setBounds(20, 240, 200, 25);
        subtotalLabel = new JLabel("Subtotal: ");
        subtotalLabel.setBounds(20, 270, 200, 25);

        // Buttons
        proceedToShippingButton = new JButton("Shipping");
        proceedToShippingButton.setBounds(20, 300, 180, 25);
        proceedToShippingButton.addActionListener(this);

        placeOrderButton = new JButton("Place Order");
        placeOrderButton.setBounds(220, 300, 150, 25);
        placeOrderButton.addActionListener(this);

        // Panel
        cartPanel = new JPanel();
        cartPanel.setBounds(0, 0, 400, 400);
        cartPanel.add(scrollPane);
        cartPanel.add(totalLabel);
        cartPanel.add(subtotalLabel);
        cartPanel.add(proceedToShippingButton);
        cartPanel.add(placeOrderButton);
        cartPanel.setLayout(null);
        cartFrame.setLocationRelativeTo(null);
        cartFrame.add(cartPanel);
        cartFrame.setVisible(true);

        // Initialize cart
        cartGUI = new Cart();
        cartGUI.setCartGUI(this);
        updateCartDisplay();
    }

    public void updateCartDisplay() {
        // Update the cart display
        DecimalFormat df = new DecimalFormat("#.##"); // Format decimal values
        cartTextArea.setText(cartGUI.cartDescription + "\n");
        for (Item item : cartGUI.cart) {
            cartTextArea.append("Name: " + item.getItemName() + " | Id: " + item.getItemId() +
                    " | Price: " + item.getPrice() + "\n");
        }
        cartTextArea.append("------------------------------------------------\n");
        cartTextArea.append("Subtotal: $" + df.format(cartGUI.subtotal) + "\n");
        cartTextArea.append("Total Items: " + cartGUI.totalItems);

        // Update labels
        totalLabel.setText("Total: $" + df.format(cartGUI.subtotal)); // Assuming total is the same as subtotal for simplicity
        subtotalLabel.setText("Subtotal: $" + df.format(cartGUI.subtotal));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == proceedToShippingButton) {
            Payment p=new Payment(cartGUI);
            p.setTotal(cartGUI.subtotal);
            ShippingFrame ship = new ShippingFrame();
        } else if (e.getSource() == placeOrderButton) {
            Payment p=new Payment();
            p.setTotal(cartGUI.subtotal);
            ShippingFrame ship = new ShippingFrame();
            order = new Order(cartGUI);
            OrderGUI orderGUI=new OrderGUI();
            orderGUI.addOrder(order);
            cartGUI.checkOut();
            updateCartDisplay(); // Clear the cart display after placing the order
            cartFrame.dispose();
        }
    }
}
