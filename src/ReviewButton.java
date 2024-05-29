import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ReviewButton implements ActionListener {
    private JFrame reviewFrame;

    public ReviewButton(JFrame reviewFrame) {
        this.reviewFrame = reviewFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        reviewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reviewFrame.setSize(300, 250);
        reviewFrame.getContentPane().setBackground(Color.white);
        reviewFrame.setLayout(null);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(250, 250, 250, 0));
        panel.setBounds(0, 0, 200, 200);
        panel.setFocusable(false);
        panel.setLayout(new GridLayout(4, 1));

        panel.add(new JLabel("Great product!"));
        panel.add(new JLabel("Excellent quality!"));
        panel.add(new JLabel("Absolutely love it!"));
        panel.add(new JLabel("Good but could be better."));

        reviewFrame.add(panel);
        reviewFrame.setVisible(true);
    }
}
