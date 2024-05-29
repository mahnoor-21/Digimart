import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ClothesGUI implements ActionListener {
    Cart c = new Cart();
    CartGUI cartGui = new CartGUI();

    private Clothes c1, c2, c3, c5, c6, c7, c9, c10, c11;
    JFrame frame1, frame2, frame3, frame4, frameMshirt1, frameMshirt2, frameMtrouser1, frameWshirt1, frameWshirt2, frameWtrouser1,
            frameKMshirt, frameKMtrouser, frameKFshirt;
    JLabel label2, label3, label4;
    private ItemCategory item, item2, item3, item5, item6, item7, item9, item10, item11;
    JButton[] butt = new JButton[3];
    JButton[] buttMen = new JButton[3];
    JButton[] buttKids = new JButton[3];
    JButton[] buttWomen = new JButton[3];
    JButton men, women, kids, review, review2, review4, review5,
            review6, review7, review9, review10, review11;
    JButton shopnow1, shopnow2, shopnow3;
    JButton menTrouser1, MenShirt1, MenShirt2;
    JButton kidsTrouser1, kidsShirt1, kidsShirt2;
    JButton womenTrouser1, womenTrouser2, womenShirt1, womenShirt2;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7,
            panel8, panel9, panel10, panel11, panel12, panel13, panel14,
            panel15, panel16, panel17, panel21,
            panel22, panel23, panel24, panel25, panel26, panel27, panel28, panel29,
            panel33, panel34, panel35, panel36, panel37,
            panel38, panel39, panel40, panel41;
    JButton cart, cart2, cart3, cart4, cart5, cart6, cart7, cart8, cart9, cart10, cart11, cart12;
    Font myFont = new Font("Cambria", Font.PLAIN, 30);

    ClothesGUI() {
        frame1 = new JFrame("Clothify");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(1000, 750);
        frame1.setLayout(null);


        panel2 = new JPanel();
        panel2.setBackground(new Color(238, 164, 127));
        panel2.setBounds(0, 0, 1000, 750);
        panel2.setFocusable(false);

        men = new JButton();
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\man1.jpg");
        men.setIcon(icon);

        women = new JButton();
        ImageIcon icon1 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\Girl.jpg");
        women.setIcon(icon1);

        kids = new JButton();
        ImageIcon icon2 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\child.jpg");
        kids.setIcon(icon2);

        shopnow1 = new JButton();
        ImageIcon icon3 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\save.jpg");
        shopnow1.setIcon(icon3);

        shopnow2 = new JButton();
        ImageIcon icon4 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\save.jpg");
        shopnow2.setIcon(icon4);

        shopnow3 = new JButton();
        ImageIcon icon5 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\save.jpg");
        shopnow3.setIcon(icon5);


        butt[0] = shopnow1;
        butt[1] = shopnow2;
        butt[2] = shopnow3;

        for (int i = 0; i < 3; i++) {
            butt[i].addActionListener(this);
            butt[i].setFocusable(false);
        }
        shopnow1.setBounds(60, 630, 115, 70);
        shopnow2.setBounds(450, 630, 115, 70);
        shopnow3.setBounds(800, 630, 115, 70);
        men.setBounds(5, 75, 326, 540);
        kids.setBounds(341, 75, 330, 495);
        women.setBounds(686, 75, 294, 540);

        frame1.add(shopnow1);
        frame1.add(shopnow2);
        frame1.add(shopnow3);
        frame1.add(men);
        frame1.add(women);
        frame1.add(kids);
        frame1.add(panel2);

        frame1.setVisible(true);

        // "Men Page":
        frame2 = new JFrame("Men Clothes");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setSize(1000, 700);
        frame2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBackground(new Color(169, 204, 184));
        panel3.setBounds(0, 0, 1000, 80);
        panel3.setFocusable(false);
        label2 = new JLabel();
        label2.setText("Discover timeless elegance in men's fashion");
        label2.setFont(myFont);
        label2.setBounds(30, 30, 1000, 25);
        frame2.add(label2);

        panel4 = new JPanel();
        panel4.setBackground(new Color(224, 245, 230));
        panel4.setBounds(0, 80, 1000, 700);
        panel4.setFocusable(false);


        menTrouser1 = new JButton();
        ImageIcon icon6 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\p1.jpg");
        menTrouser1.setIcon(icon6);

        MenShirt1 = new JButton();
        ImageIcon icon8 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\shirt1.jpg");
        MenShirt1.setIcon(icon8);

        MenShirt2 = new JButton();
        ImageIcon icon9 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\shirt2.jpg");
        MenShirt2.setIcon(icon9);


        buttMen[0] = menTrouser1;
        buttMen[1] = MenShirt1;
        buttMen[2] = MenShirt2;

        for (int i = 0; i < 3; i++) {
            buttMen[i].addActionListener(this);
            buttMen[i].setFocusable(false);
        }

        MenShirt1.setBounds(1, 115, 330, 496);
        MenShirt2.setBounds(333, 115, 330, 496);
        menTrouser1.setBounds(665, 115, 330, 496);


        frame2.add(MenShirt1);
        frame2.add(MenShirt2);
        frame2.add(menTrouser1);
        frame2.add(panel3);
        frame2.add(panel4);

        //Kids Clothes:
        frame3 = new JFrame("Kids Clothes");
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setSize(1000, 700);
        frame3.setLayout(null);

        panel5 = new JPanel();
        panel5.setBackground(new Color(169, 204, 184));
        panel5.setBounds(0, 0, 1000, 80);
        panel5.setFocusable(false);
        label3 = new JLabel();
        label3.setText("Discover timeless elegance in Kids's fashion");
        label3.setFont(myFont);
        label3.setBounds(30, 30, 1000, 25);
        frame3.add(label3);
        frame3.add(panel5);

        panel6 = new JPanel();
        panel6.setBackground(new Color(224, 245, 230));
        panel6.setBounds(0, 80, 1000, 700);
        panel6.setFocusable(false);
        frame3.add(panel6);


        kidsShirt1 = new JButton();
        ImageIcon icon10 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cgirl1.jpg");
        kidsShirt1.setIcon(icon10);

        kidsTrouser1 = new JButton();
        ImageIcon icon11 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\ct2.jpg");
        kidsTrouser1.setIcon(icon11);

        kidsShirt2 = new JButton();
        ImageIcon icon12 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cgirl2.jpg");
        kidsShirt2.setIcon(icon12);
        buttKids[0] = kidsShirt1;
        buttKids[1] = kidsTrouser1;
        buttKids[2] = kidsShirt2;

        for (int i = 0; i < 3; i++) {
            buttKids[i].addActionListener(this);
            buttKids[i].setFocusable(false);
        }

        kidsShirt1.setBounds(1, 115, 330, 495);
        kidsTrouser1.setBounds(333, 115, 330, 495);
        kidsShirt2.setBounds(665, 115, 330, 495);

        frame3.add(kidsShirt1);
        frame3.add(kidsTrouser1);
        frame3.add(kidsShirt2);

        //Women Clothes:
        frame4 = new JFrame("Women Clothes");
        frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame4.setSize(1000, 700);
        frame4.setLayout(null);

        panel7 = new JPanel();
        panel7.setBackground(new Color(169, 204, 184));
        panel7.setBounds(0, 0, 1000, 80);
        panel7.setFocusable(false);
        label4 = new JLabel();
        label4.setText("Discover timeless elegance in Women's fashion");
        label4.setFont(myFont);
        label4.setBounds(30, 30, 1000, 25);
        frame4.add(label4);
        frame4.add(panel7);

        panel8 = new JPanel();
        panel8.setBackground(new Color(224, 245, 230));
        panel8.setBounds(0, 80, 1000, 700);
        panel8.setFocusable(false);
        frame4.add(panel8);

        womenTrouser1 = new JButton();
        ImageIcon icon14 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\t1.jpg");
        womenTrouser1.setIcon(icon14);

        womenShirt1 = new JButton();
        ImageIcon icon16 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\girl1.jpg");
        womenShirt1.setIcon(icon16);

        womenShirt2 = new JButton();
        ImageIcon icon17 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\girl2.jpg");
        womenShirt2.setIcon(icon17);


        buttWomen[0] = womenTrouser1;
        buttWomen[1] = womenShirt1;
        buttWomen[2] = womenShirt2;

        for (int i = 0; i < 3; i++) {
            buttWomen[i].addActionListener(this);
            buttWomen[i].setFocusable(false);
        }

        womenShirt1.setBounds(1, 115, 330, 495);
        womenShirt2.setBounds(333, 115, 330, 495);
        womenTrouser1.setBounds(665, 115, 330, 495);


        frame4.add(womenShirt1);
        frame4.add(womenShirt2);
        frame4.add(womenTrouser1);

        //Men's Shirt

        frameMshirt1 = new JFrame("Men's Shirt");
        frameMshirt1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameMshirt1.setSize(800, 800);
        frameMshirt1.getContentPane().setBackground(Color.white);
        frameMshirt1.setLayout(null);


        ImageIcon image1 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\shirt1.jpg");
        JLabel imagelabel1 = new JLabel();
        imagelabel1.setIcon(image1);
        panel9 = new JPanel();
        panel9.setBackground(new Color(250, 250, 250, 0));
        panel9.setBounds(30, 100, 330, 495);
        panel9.setFocusable(false);
        panel9.add(imagelabel1);
        frameMshirt1.add(panel9);

        panel10 = new JPanel();
        panel10.setBackground(new Color(250, 250, 250, 0));
        panel10.setBounds(400, 98, 300, 400);
        panel10.setFocusable(false);
        panel10.setLayout(new GridLayout(18, 1));


        c1 = new Clothes("Male", "Adult");
        item = c1.getItemByName(c1.menShirts, "MenShirts1");
        c1.getItemDetails("MenShirts", item);

        panel10.add(new JLabel("Item Name: " + item.getItemName()));
        panel10.add(new JLabel("ID: " + item.getItemId()));
        panel10.add(new JLabel("Size: " + item.getSize()));
        panel10.add(new JLabel("Fabric: " + item.getFabric()));
        panel10.add(new JLabel("Color: " + item.getColor()));
        panel10.add(new JLabel("Price: " + item.getPrice()));
        panel10.add(new JLabel("Length: " + item.getLength()));
        panel10.add(new JLabel("Availability: " + item.getItemStatus()));
        panel10.add(new JLabel("Item Category: " + item.getItemType()));
        panel10.add(new JLabel("Age Group: Adult"));
        panel10.add(new JLabel("Gender: Men"));
        panel10.add(new JLabel("---------------------------"));
        panel10.add(new JLabel("Care Instructions:"));
        panel10.add(new JLabel("---------------------------"));
        panel10.add(new JLabel("Wash light and bright colors separately."));
        panel10.add(new JLabel("Do not bleach."));
        panel10.add(new JLabel("Do not twist/wring."));
        panel10.add(new JLabel("Do not dry in direct sunlight."));
        frameMshirt1.add(panel10);
        panel11 = new JPanel();
        panel11.setBackground(new Color(250, 250, 250, 0));
        panel11.setBounds(400, 510, 300, 100);
        panel11.setFocusable(false);
        panel11.setLayout(new GridLayout(4, 6));
        panel11.add(new JLabel("Size"));
        panel11.add(new JLabel("    XS"));
        panel11.add(new JLabel("    S"));
        panel11.add(new JLabel("    M"));
        panel11.add(new JLabel("    L"));
        panel11.add(new JLabel("    XL"));
        panel11.add(new JLabel("CHEST"));
        panel11.add(new JLabel("    32"));
        panel11.add(new JLabel("    34"));
        panel11.add(new JLabel("    36"));
        panel11.add(new JLabel("    48"));
        panel11.add(new JLabel("    42"));
        panel11.add(new JLabel("HIP"));
        panel11.add(new JLabel("    34"));
        panel11.add(new JLabel("    36"));
        panel11.add(new JLabel("    38"));
        panel11.add(new JLabel("    40"));
        panel11.add(new JLabel("    44"));
        panel11.add(new JLabel("SHOULDER"));
        panel11.add(new JLabel("    13.5"));
        panel11.add(new JLabel("    14"));
        panel11.add(new JLabel("    14.5"));
        panel11.add(new JLabel("    15"));
        panel11.add(new JLabel("    16"));
        frameMshirt1.add(panel11);

        cart = new JButton();
        cart.setBounds(495, 640, 120, 35);
        ImageIcon icon98 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart.setIcon(icon98);
        frameMshirt1.add(cart);

        JButton viewcart = new JButton("View Cart");
        viewcart.setBounds(295, 640, 120, 35);

        frameMshirt1.add(viewcart);
        viewcart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameMshirt1.dispose();
                frame1.dispose();
                frame2.dispose();
            }
        });


        //Men's Shirt
        frameMshirt2 = new JFrame("Men's Shirt");
        frameMshirt2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameMshirt2.setSize(800, 800);
        frameMshirt2.getContentPane().setBackground(Color.white);
        frameMshirt2.setLayout(null);


        ImageIcon image2 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\shirt2.jpg");
        JLabel imagelabel2 = new JLabel();
        imagelabel2.setIcon(image2);
        panel12 = new JPanel();
        panel12.setBackground(new Color(250, 250, 250, 0));
        panel12.setBounds(30, 100, 330, 495);
        panel12.setFocusable(false);
        panel12.add(imagelabel2);
        frameMshirt2.add(panel12);

        panel13 = new JPanel();
        panel13.setBackground(new Color(250, 250, 250, 0));
        panel13.setBounds(400, 98, 300, 400);
        panel13.setFocusable(false);
        panel13.setLayout(new GridLayout(18, 1));


        c2 = new Clothes("Male", "Adult");
        item2 = c2.getItemByName(c1.menShirts, "MenShirts2");
        c2.getItemDetails("MenShirts", item2);

        panel13.add(new JLabel("Item Name: " + item2.getItemName()));
        panel13.add(new JLabel("ID: " + item2.getItemId()));
        panel13.add(new JLabel("Size: " + item2.getSize()));
        panel13.add(new JLabel("Fabric: " + item2.getFabric()));
        panel13.add(new JLabel("Color: " + item2.getColor()));
        panel13.add(new JLabel("Price: " + item2.getPrice()));
        panel13.add(new JLabel("Length: " + item2.getLength()));
        panel13.add(new JLabel("Availability: " + item2.getItemStatus()));
        panel13.add(new JLabel("Item Category: " + item2.getItemType()));
        panel13.add(new JLabel("Age Group: Adult"));
        panel13.add(new JLabel("Gender: Men"));
        panel13.add(new JLabel("---------------------------"));
        panel13.add(new JLabel("Care Instructions:"));
        panel13.add(new JLabel("---------------------------"));
        panel13.add(new JLabel("Wash light and bright colors separately."));
        panel13.add(new JLabel("Do not bleach."));
        panel13.add(new JLabel("Do not twist/wring."));
        panel13.add(new JLabel("Do not dry in direct sunlight."));
        frameMshirt2.add(panel13);

        panel14 = new JPanel();
        panel14.setBackground(new Color(250, 250, 250, 0));
        panel14.setBounds(400, 510, 300, 100);
        panel14.setFocusable(false);
        panel14.setLayout(new GridLayout(4, 6));
        panel14.add(new JLabel("Size"));
        panel14.add(new JLabel("    XS"));
        panel14.add(new JLabel("    S"));
        panel14.add(new JLabel("    M"));
        panel14.add(new JLabel("    L"));
        panel14.add(new JLabel("    XL"));
        panel14.add(new JLabel("CHEST"));
        panel14.add(new JLabel("    32"));
        panel14.add(new JLabel("    34"));
        panel14.add(new JLabel("    36"));
        panel14.add(new JLabel("    48"));
        panel14.add(new JLabel("    42"));
        panel14.add(new JLabel("HIP"));
        panel14.add(new JLabel("    34"));
        panel14.add(new JLabel("    36"));
        panel14.add(new JLabel("    38"));
        panel14.add(new JLabel("    40"));
        panel14.add(new JLabel("    44"));
        panel14.add(new JLabel("SHOULDER"));
        panel14.add(new JLabel("    13.5"));
        panel14.add(new JLabel("    14"));
        panel14.add(new JLabel("    14.5"));
        panel14.add(new JLabel("    15"));
        panel14.add(new JLabel("    16"));
        frameMshirt2.add(panel14);
        cart2 = new JButton();
        cart2.setBounds(495, 640, 120, 35);
        ImageIcon icon99 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart2.setIcon(icon99);
        frameMshirt2.add(cart2);
        JButton viewcart2 = new JButton("View Cart");
        viewcart2.setBounds(295, 640, 120, 35);

        frameMshirt2.add(viewcart2);
        viewcart2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameMshirt2.dispose();
                frame1.dispose();
                frame2.dispose();
            }
        });
        //Men Trouser
        frameMtrouser1 = new JFrame("Men's Trouser");
        frameMtrouser1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameMtrouser1.setSize(800, 800);
        frameMtrouser1.getContentPane().setBackground(Color.white);
        frameMtrouser1.setLayout(null);


        ImageIcon image3 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\p1.jpg");
        JLabel imagelabel3 = new JLabel();
        imagelabel3.setIcon(image3);
        panel15 = new JPanel();
        panel15.setBackground(new Color(250, 250, 250, 0));
        panel15.setBounds(30, 100, 330, 495);
        panel15.setFocusable(false);
        panel15.add(imagelabel3);
        frameMtrouser1.add(panel15);

        panel16 = new JPanel();
        panel16.setBackground(new Color(250, 250, 250, 0));
        panel16.setBounds(400, 98, 300, 400);
        panel16.setFocusable(false);
        panel16.setLayout(new GridLayout(18, 1));


        c3 = new Clothes("Male", "Adult");
        item3 = c3.getItemByName(c3.menPants, "MenPants1");
        c3.getItemDetails("MenPants", item3);

        panel16.add(new JLabel("Item Name: " + item3.getItemName()));
        panel16.add(new JLabel("ID: " + item3.getItemId()));
        panel16.add(new JLabel("Size: " + item3.getSize()));
        panel16.add(new JLabel("Fabric: " + item3.getFabric()));
        panel16.add(new JLabel("Color: " + item3.getColor()));
        panel16.add(new JLabel("Price: " + item3.getPrice()));
        panel16.add(new JLabel("Length: " + item3.getLength()));
        panel16.add(new JLabel("Availability: " + item3.getItemStatus()));
        panel16.add(new JLabel("Item Category: " + item3.getItemType()));
        panel16.add(new JLabel("Age Group: Adult"));
        panel16.add(new JLabel("Gender: Men"));
        panel16.add(new JLabel("---------------------------"));
        panel16.add(new JLabel("Care Instructions:"));
        panel16.add(new JLabel("---------------------------"));
        panel16.add(new JLabel("Wash light and bright colors separately."));
        panel16.add(new JLabel("Do not bleach."));
        panel16.add(new JLabel("Do not twist/wring."));
        panel16.add(new JLabel("Do not dry in direct sunlight."));
        frameMtrouser1.add(panel16);

        panel17 = new JPanel();
        panel17.setBackground(new Color(250, 250, 250, 0));
        panel17.setBounds(400, 510, 300, 100);
        panel17.setFocusable(false);
        panel17.setLayout(new GridLayout(4, 6));
        panel17.add(new JLabel("Size"));
        panel17.add(new JLabel("    XS"));
        panel17.add(new JLabel("    S"));
        panel17.add(new JLabel("    M"));
        panel17.add(new JLabel("    L"));
        panel17.add(new JLabel("    XL"));
        panel17.add(new JLabel("Length"));
        panel17.add(new JLabel("    32"));
        panel17.add(new JLabel("    34"));
        panel17.add(new JLabel("    36"));
        panel17.add(new JLabel("    42"));
        panel17.add(new JLabel("    48"));
        panel17.add(new JLabel("HIP"));
        panel17.add(new JLabel("    34"));
        panel17.add(new JLabel("    36"));
        panel17.add(new JLabel("    38"));
        panel17.add(new JLabel("    40"));
        panel17.add(new JLabel("    44"));
        panel17.add(new JLabel("Waist"));
        panel17.add(new JLabel("    13.5"));
        panel17.add(new JLabel("    14"));
        panel17.add(new JLabel("    14.5"));
        panel17.add(new JLabel("    15"));
        panel17.add(new JLabel("    16"));
        frameMtrouser1.add(panel17);
        cart3 = new JButton();
        cart3.setBounds(495, 640, 120, 35);
        ImageIcon icon97 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart3.setIcon(icon97);
        frameMtrouser1.add(cart3);
        JButton viewcart3 = new JButton("View Cart");
        viewcart3.setBounds(295, 640, 120, 35);

        frameMtrouser1.add(viewcart3);
        viewcart3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameMtrouser1.dispose();
                frame1.dispose();
                frame2.dispose();
            }
        });
        //women shirts

        frameWshirt1 = new JFrame("Women's Shirt");
        frameWshirt1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameWshirt1.setSize(800, 800);
        frameWshirt1.getContentPane().setBackground(Color.white);
        frameWshirt1.setLayout(null);


        ImageIcon image5 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\girl1.jpg");
        JLabel imagelabel5 = new JLabel();
        imagelabel5.setIcon(image5);
        panel21 = new JPanel();
        panel21.setBackground(new Color(250, 250, 250, 0));
        panel21.setBounds(30, 100, 330, 495);
        panel21.setFocusable(false);
        panel21.add(imagelabel5);
        frameWshirt1.add(panel21);

        panel22 = new JPanel();
        panel22.setBackground(new Color(250, 250, 250, 0));
        panel22.setBounds(400, 98, 300, 400);
        panel22.setFocusable(false);
        panel22.setLayout(new GridLayout(18, 1));


        c5 = new Clothes("Female", "Adult");
        item5 = c5.getItemByName(c5.womenDresses, "WomenDresses1");
        c5.getItemDetails("WomenDresses", item5);

        panel22.add(new JLabel("Item Name: " + item5.getItemName()));
        panel22.add(new JLabel("ID: " + item5.getItemId()));
        panel22.add(new JLabel("Size: " + item5.getSize()));
        panel22.add(new JLabel("Fabric: " + item5.getFabric()));
        panel22.add(new JLabel("Color: " + item5.getColor()));
        panel22.add(new JLabel("Price: " + item5.getPrice()));
        panel22.add(new JLabel("Length: " + item5.getLength()));
        panel22.add(new JLabel("Availability: " + item5.getItemStatus()));
        panel22.add(new JLabel("Item Category: " + item5.getItemType()));
        panel22.add(new JLabel("Age Group: Adult"));
        panel22.add(new JLabel("Gender: Female"));
        panel22.add(new JLabel("---------------------------"));
        panel22.add(new JLabel("Care Instructions:"));
        panel22.add(new JLabel("---------------------------"));
        panel22.add(new JLabel("Wash light and bright colors separately."));
        panel22.add(new JLabel("Do not bleach."));
        panel22.add(new JLabel("Do not twist/wring."));
        panel22.add(new JLabel("Do not dry in direct sunlight."));
        frameWshirt1.add(panel22);

        panel23 = new JPanel();
        panel23.setBackground(new Color(250, 250, 250, 0));
        panel23.setBounds(400, 510, 300, 100);
        panel23.setFocusable(false);
        panel23.setLayout(new GridLayout(4, 6));
        panel23.add(new JLabel("Size"));
        panel23.add(new JLabel("    XS"));
        panel23.add(new JLabel("    S"));
        panel23.add(new JLabel("    M"));
        panel23.add(new JLabel("    L"));
        panel23.add(new JLabel("    XL"));
        panel23.add(new JLabel("Length"));
        panel23.add(new JLabel("    32"));
        panel23.add(new JLabel("    34"));
        panel23.add(new JLabel("    36"));
        panel23.add(new JLabel("    42"));
        panel23.add(new JLabel("    48"));
        panel23.add(new JLabel("HIP"));
        panel23.add(new JLabel("    34"));
        panel23.add(new JLabel("    36"));
        panel23.add(new JLabel("    38"));
        panel23.add(new JLabel("    40"));
        panel23.add(new JLabel("    44"));
        panel23.add(new JLabel("Shoulder"));
        panel23.add(new JLabel("    13.5"));
        panel23.add(new JLabel("    14"));
        panel23.add(new JLabel("    14.5"));
        panel23.add(new JLabel("    15"));
        panel23.add(new JLabel("    16"));
        frameWshirt1.add(panel23);

        cart5 = new JButton();
        cart5.setBounds(495, 640, 120, 35);
        ImageIcon icon95 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart5.setIcon(icon95);
        frameWshirt1.add(cart5);
        JButton viewcart4 = new JButton("View Cart");
        viewcart4.setBounds(295, 640, 120, 35);

        frameWshirt1.add(viewcart4);
        viewcart4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameWshirt1.dispose();
                frame4.dispose();
                frame1.dispose();
            }
        });
        frameWshirt2 = new JFrame("Women's Shirt");
        frameWshirt2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameWshirt2.setSize(800, 800);
        frameWshirt2.getContentPane().setBackground(Color.white);
        frameWshirt2.setLayout(null);


        ImageIcon image6 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\girl2.jpg");
        JLabel imagelabel6 = new JLabel();
        imagelabel6.setIcon(image6);
        panel24 = new JPanel();
        panel24.setBackground(new Color(250, 250, 250, 0));
        panel24.setBounds(30, 100, 330, 495);
        panel24.setFocusable(false);
        panel24.add(imagelabel6);
        frameWshirt2.add(panel24);

        panel25 = new JPanel();
        panel25.setBackground(new Color(250, 250, 250, 0));
        panel25.setBounds(400, 98, 300, 400);
        panel25.setFocusable(false);
        panel25.setLayout(new GridLayout(18, 1));


        c6 = new Clothes("Female", "Adult");
        item6 = c6.getItemByName(c6.womenDresses, "WomenDresses2");
        c6.getItemDetails("WomenDresses", item6);

        panel25.add(new JLabel("Item Name: " + item5.getItemName()));
        panel25.add(new JLabel("ID: " + item5.getItemId()));
        panel25.add(new JLabel("Size: " + item5.getSize()));
        panel25.add(new JLabel("Fabric: " + item5.getFabric()));
        panel25.add(new JLabel("Color: " + item5.getColor()));
        panel25.add(new JLabel("Price: " + item5.getPrice()));
        panel25.add(new JLabel("Length: " + item5.getLength()));
        panel25.add(new JLabel("Availability: " + item5.getItemStatus()));
        panel25.add(new JLabel("Item Category: " + item5.getItemType()));
        panel25.add(new JLabel("Age Group: Adult"));
        panel25.add(new JLabel("Gender: Female"));
        panel25.add(new JLabel("---------------------------"));
        panel25.add(new JLabel("Care Instructions:"));
        panel25.add(new JLabel("---------------------------"));
        panel25.add(new JLabel("Wash light and bright colors separately."));
        panel25.add(new JLabel("Do not bleach."));
        panel25.add(new JLabel("Do not twist/wring."));
        panel25.add(new JLabel("Do not dry in direct sunlight."));
        frameWshirt2.add(panel25);

        panel26 = new JPanel();
        panel26.setBackground(new Color(250, 250, 250, 0));
        panel26.setBounds(400, 510, 300, 100);
        panel26.setFocusable(false);
        panel26.setLayout(new GridLayout(4, 6));
        panel26.add(new JLabel("Size"));
        panel26.add(new JLabel("    XS"));
        panel26.add(new JLabel("    S"));
        panel26.add(new JLabel("    M"));
        panel26.add(new JLabel("    L"));
        panel26.add(new JLabel("    XL"));
        panel26.add(new JLabel("Length"));
        panel26.add(new JLabel("    32"));
        panel26.add(new JLabel("    34"));
        panel26.add(new JLabel("    36"));
        panel26.add(new JLabel("    42"));
        panel26.add(new JLabel("    48"));
        panel26.add(new JLabel("HIP"));
        panel26.add(new JLabel("    34"));
        panel26.add(new JLabel("    36"));
        panel26.add(new JLabel("    38"));
        panel26.add(new JLabel("    40"));
        panel26.add(new JLabel("    44"));
        panel26.add(new JLabel("Shoulder"));
        panel26.add(new JLabel("    13.5"));
        panel26.add(new JLabel("    14"));
        panel26.add(new JLabel("    14.5"));
        panel26.add(new JLabel("    15"));
        panel26.add(new JLabel("    16"));
        frameWshirt2.add(panel26);

        cart6 = new JButton();
        cart6.setBounds(495, 640, 120, 35);
        ImageIcon icon94 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart6.setIcon(icon94);
        frameWshirt2.add(cart6);
        JButton viewcart5 = new JButton("View Cart");
        viewcart5.setBounds(295, 640, 120, 35);

        frameWshirt2.add(viewcart5);
        viewcart5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameWshirt2.dispose();
                frame1.dispose();
                frame4.dispose();
            }
        });
        //Women trouser
        frameWtrouser1 = new JFrame("Women's Trouser");
        frameWtrouser1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameWtrouser1.setSize(800, 800);
        frameWtrouser1.getContentPane().setBackground(Color.white);
        frameWtrouser1.setLayout(null);


        ImageIcon image7 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\t1.jpg");
        JLabel imagelabel7 = new JLabel();
        imagelabel7.setIcon(image7);
        panel27 = new JPanel();
        panel27.setBackground(new Color(250, 250, 250, 0));
        panel27.setBounds(30, 100, 330, 495);
        panel27.setFocusable(false);
        panel27.add(imagelabel7);
        frameWtrouser1.add(panel27);

        panel28 = new JPanel();
        panel28.setBackground(new Color(250, 250, 250, 0));
        panel28.setBounds(400, 98, 300, 400);
        panel28.setFocusable(false);
        panel28.setLayout(new GridLayout(18, 1));


        c7 = new Clothes("Female", "Adult");
        item7 = c7.getItemByName(c7.womenTops, "WomenTops1");
        c7.getItemDetails("WomenTops", item7);

        panel28.add(new JLabel("Item Name: " + item7.getItemName()));
        panel28.add(new JLabel("ID: " + item7.getItemId()));
        panel28.add(new JLabel("Size: " + item7.getSize()));
        panel28.add(new JLabel("Fabric: " + item7.getFabric()));
        panel28.add(new JLabel("Color: " + item7.getColor()));
        panel28.add(new JLabel("Price: " + item7.getPrice()));
        panel28.add(new JLabel("Length: " + item7.getLength()));
        panel28.add(new JLabel("Availability: " + item7.getItemStatus()));
        panel28.add(new JLabel("Item Category: " + item7.getItemType()));
        panel28.add(new JLabel("Age Group: Adult"));
        panel28.add(new JLabel("Gender: Female"));
        panel28.add(new JLabel("---------------------------"));
        panel28.add(new JLabel("Care Instructions:"));
        panel28.add(new JLabel("---------------------------"));
        panel28.add(new JLabel("Wash light and bright colors separately."));
        panel28.add(new JLabel("Do not bleach."));
        panel28.add(new JLabel("Do not twist/wring."));
        panel28.add(new JLabel("Do not dry in direct sunlight."));
        frameWtrouser1.add(panel28);

        panel29 = new JPanel();
        panel29.setBackground(new Color(250, 250, 250, 0));
        panel29.setBounds(400, 510, 300, 100);
        panel29.setFocusable(false);
        panel29.setLayout(new GridLayout(4, 6));
        panel29.add(new JLabel("Size"));
        panel29.add(new JLabel("    XS"));
        panel29.add(new JLabel("    S"));
        panel29.add(new JLabel("    M"));
        panel29.add(new JLabel("    L"));
        panel29.add(new JLabel("    XL"));
        panel29.add(new JLabel("Length"));
        panel29.add(new JLabel("    32"));
        panel29.add(new JLabel("    34"));
        panel29.add(new JLabel("    36"));
        panel29.add(new JLabel("    42"));
        panel29.add(new JLabel("    48"));
        panel29.add(new JLabel("HIP"));
        panel29.add(new JLabel("    34"));
        panel29.add(new JLabel("    36"));
        panel29.add(new JLabel("    38"));
        panel29.add(new JLabel("    40"));
        panel29.add(new JLabel("    44"));
        panel29.add(new JLabel("Waist"));
        panel29.add(new JLabel("    13.5"));
        panel29.add(new JLabel("    14"));
        panel29.add(new JLabel("    14.5"));
        panel29.add(new JLabel("    15"));
        panel29.add(new JLabel("    16"));
        frameWtrouser1.add(panel29);

        cart7 = new JButton();
        cart7.setBounds(495, 640, 120, 35);
        ImageIcon icon93 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart7.setIcon(icon93);
        frameWtrouser1.add(cart7);
        JButton viewcart7 = new JButton("View Cart");
        viewcart7.setBounds(295, 640, 120, 35);

        frameWtrouser1.add(viewcart7);
        viewcart7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameWtrouser1.dispose();

                frame1.dispose();
                frame4.dispose();
            }
        });
        //kids  male shirts
        frameKMshirt = new JFrame("Kids's Shirt");
        frameKMshirt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameKMshirt.setSize(800, 800);
        frameKMshirt.getContentPane().setBackground(Color.white);
        frameKMshirt.setLayout(null);


        ImageIcon image9 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cgirl1.jpg");
        JLabel imagelabel9 = new JLabel();
        imagelabel9.setIcon(image9);
        panel33 = new JPanel();
        panel33.setBackground(new Color(250, 250, 250, 0));
        panel33.setBounds(30, 100, 330, 495);
        panel33.setFocusable(false);
        panel33.add(imagelabel9);
        frameKMshirt.add(panel33);

        panel34 = new JPanel();
        panel34.setBackground(new Color(250, 250, 250, 0));
        panel34.setBounds(400, 98, 300, 400);
        panel34.setFocusable(false);
        panel34.setLayout(new GridLayout(18, 1));


        c9 = new Clothes("Male", "Kids");
        item9 = c9.getItemByName(c9.boysClothes, "BoysClothes1");
        c9.getItemDetails("BoysClothes", item9);

        panel34.add(new JLabel("Item Name: " + item9.getItemName()));
        panel34.add(new JLabel("ID: " + item9.getItemId()));
        panel34.add(new JLabel("Size: " + item9.getSize()));
        panel34.add(new JLabel("Fabric: " + item9.getFabric()));
        panel34.add(new JLabel("Color: " + item9.getColor()));
        panel34.add(new JLabel("Price: " + item9.getPrice()));
        panel34.add(new JLabel("Length: " + item9.getLength()));
        panel34.add(new JLabel("Availability: " + item9.getItemStatus()));
        panel34.add(new JLabel("Item Category: " + item9.getItemType()));
        panel34.add(new JLabel("Age Group: Kids"));
        panel34.add(new JLabel("Gender: Male"));
        panel34.add(new JLabel("---------------------------"));
        panel34.add(new JLabel("Care Instructions:"));
        panel34.add(new JLabel("---------------------------"));
        panel34.add(new JLabel("Wash light and bright colors separately."));
        panel34.add(new JLabel("Do not bleach."));
        panel34.add(new JLabel("Do not twist/wring."));
        panel34.add(new JLabel("Do not dry in direct sunlight."));
        frameKMshirt.add(panel34);

        panel35 = new JPanel();
        panel35.setBackground(new Color(250, 250, 250, 0));
        panel35.setBounds(400, 510, 300, 100);
        panel35.setFocusable(false);
        panel35.setLayout(new GridLayout(4, 6));
        panel35.add(new JLabel("Size"));
        panel35.add(new JLabel("    XS"));
        panel35.add(new JLabel("    S"));
        panel35.add(new JLabel("    M"));
        panel35.add(new JLabel("    L"));
        panel35.add(new JLabel("    XL"));
        panel35.add(new JLabel("Length"));
        panel35.add(new JLabel("    32"));
        panel35.add(new JLabel("    34"));
        panel35.add(new JLabel("    36"));
        panel35.add(new JLabel("    42"));
        panel35.add(new JLabel("    48"));
        panel35.add(new JLabel("HIP"));
        panel35.add(new JLabel("    34"));
        panel35.add(new JLabel("    36"));
        panel35.add(new JLabel("    38"));
        panel35.add(new JLabel("    40"));
        panel35.add(new JLabel("    44"));
        panel35.add(new JLabel("Shoulder"));
        panel35.add(new JLabel("    13.5"));
        panel35.add(new JLabel("    14"));
        panel35.add(new JLabel("    14.5"));
        panel35.add(new JLabel("    15"));
        panel35.add(new JLabel("    16"));
        frameKMshirt.add(panel35);

        cart9 = new JButton();
        cart9.setBounds(495, 640, 120, 35);
        ImageIcon icon91 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart9.setIcon(icon91);
        frameKMshirt.add(cart9);
        JButton viewcart8 = new JButton("View Cart");
        viewcart5.setBounds(295, 640, 120, 35);

        frameKMshirt.add(viewcart8);
        viewcart8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameKMshirt.dispose();
                frame1.dispose();
                frame3.dispose();
            }
        });
        frameKMtrouser = new JFrame("Kids's trouser");
        frameKMtrouser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameKMtrouser.setSize(800, 800);
        frameKMtrouser.getContentPane().setBackground(Color.white);
        frameKMtrouser.setLayout(null);


        ImageIcon image10 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\ct2.jpg");
        JLabel imagelabel10 = new JLabel();
        imagelabel10.setIcon(image10);
        panel36 = new JPanel();
        panel36.setBackground(new Color(250, 250, 250, 0));
        panel36.setBounds(30, 100, 330, 495);
        panel36.setFocusable(false);
        panel36.add(imagelabel10);
        frameKMtrouser.add(panel36);

        panel37 = new JPanel();
        panel37.setBackground(new Color(250, 250, 250, 0));
        panel37.setBounds(400, 98, 300, 400);
        panel37.setFocusable(false);
        panel37.setLayout(new GridLayout(18, 1));


        c10 = new Clothes("Male", "Kids");
        item10 = c10.getItemByName(c10.boysClothes, "BoysClothes2");
        c10.getItemDetails("BoysClothes", item10);

        panel37.add(new JLabel("Item Name: " + item10.getItemName()));
        panel37.add(new JLabel("ID: " + item10.getItemId()));
        panel37.add(new JLabel("Size: " + item10.getSize()));
        panel37.add(new JLabel("Fabric: " + item10.getFabric()));
        panel37.add(new JLabel("Color: " + item10.getColor()));
        panel37.add(new JLabel("Price: " + item10.getPrice()));
        panel37.add(new JLabel("Length: " + item10.getLength()));
        panel37.add(new JLabel("Availability: " + item10.getItemStatus()));
        panel37.add(new JLabel("Item Category: " + item10.getItemType()));
        panel37.add(new JLabel("Age Group: Kids"));
        panel37.add(new JLabel("Gender: Male"));
        panel37.add(new JLabel("---------------------------"));
        panel37.add(new JLabel("Care Instructions:"));
        panel37.add(new JLabel("---------------------------"));
        panel37.add(new JLabel("Wash light and bright colors separately."));
        panel37.add(new JLabel("Do not bleach."));
        panel37.add(new JLabel("Do not twist/wring."));
        panel37.add(new JLabel("Do not dry in direct sunlight."));
        frameKMtrouser.add(panel37);

        panel38 = new JPanel();
        panel38.setBackground(new Color(250, 250, 250, 0));
        panel38.setBounds(400, 510, 300, 100);
        panel38.setFocusable(false);
        panel38.setLayout(new GridLayout(4, 6));
        panel38.add(new JLabel("Size"));
        panel38.add(new JLabel("    XS"));
        panel38.add(new JLabel("    S"));
        panel38.add(new JLabel("    M"));
        panel38.add(new JLabel("    L"));
        panel38.add(new JLabel("    XL"));
        panel38.add(new JLabel("Length"));
        panel38.add(new JLabel("    32"));
        panel38.add(new JLabel("    34"));
        panel38.add(new JLabel("    36"));
        panel38.add(new JLabel("    42"));
        panel38.add(new JLabel("    48"));
        panel38.add(new JLabel("HIP"));
        panel38.add(new JLabel("    34"));
        panel38.add(new JLabel("    36"));
        panel38.add(new JLabel("    38"));
        panel38.add(new JLabel("    40"));
        panel38.add(new JLabel("    44"));
        panel38.add(new JLabel("Waist"));
        panel38.add(new JLabel("    13.5"));
        panel38.add(new JLabel("    14"));
        panel38.add(new JLabel("    14.5"));
        panel38.add(new JLabel("    15"));
        panel38.add(new JLabel("    16"));
        frameKMtrouser.add(panel38);

        cart10 = new JButton();
        cart10.setBounds(495, 640, 120, 35);
        ImageIcon icon90 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart10.setIcon(icon90);
        frameKMtrouser.add(cart10);

        JButton viewcart9 = new JButton("View Cart");
        viewcart9.setBounds(295, 640, 120, 35);

        frameKMtrouser.add(viewcart9);
        viewcart9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameKMtrouser.dispose();
                frame1.dispose();
                frame3.dispose();
            }
        });
        frameKFshirt = new JFrame("Kids's Shirt");
        frameKFshirt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameKFshirt.setSize(800, 800);
        frameKFshirt.getContentPane().setBackground(Color.white);
        frameKFshirt.setLayout(null);


        ImageIcon image11 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cgirl2.jpg");
        JLabel imagelabel11 = new JLabel();
        imagelabel11.setIcon(image11);
        panel39 = new JPanel();
        panel39.setBackground(new Color(250, 250, 250, 0));
        panel39.setBounds(30, 100, 330, 495);
        panel39.setFocusable(false);
        panel39.add(imagelabel11);
        frameKFshirt.add(panel39);

        panel40 = new JPanel();
        panel40.setBackground(new Color(250, 250, 250, 0));
        panel40.setBounds(400, 98, 300, 400);
        panel40.setFocusable(false);
        panel40.setLayout(new GridLayout(18, 1));


        c11 = new Clothes("Female", "Adult");
        item11 = c11.getItemByName(c11.girlsClothes, "GirlsClothes1");
        c11.getItemDetails("GirlsClothes1", item11);

        panel40.add(new JLabel("Item Name: " + item11.getItemName()));
        panel40.add(new JLabel("ID: " + item11.getItemId()));
        panel40.add(new JLabel("Size: " + item11.getSize()));
        panel40.add(new JLabel("Fabric: " + item11.getFabric()));
        panel40.add(new JLabel("Color: " + item11.getColor()));
        panel40.add(new JLabel("Price: " + item11.getPrice()));
        panel40.add(new JLabel("Length: " + item11.getLength()));
        panel40.add(new JLabel("Availability: " + item11.getItemStatus()));
        panel40.add(new JLabel("Item Category: " + item11.getItemType()));
        panel40.add(new JLabel("Age Group: Kids"));
        panel40.add(new JLabel("Gender: Female"));
        panel40.add(new JLabel("---------------------------"));
        panel40.add(new JLabel("Care Instructions:"));
        panel40.add(new JLabel("---------------------------"));
        panel40.add(new JLabel("Wash light and bright colors separately."));
        panel40.add(new JLabel("Do not bleach."));
        panel40.add(new JLabel("Do not twist/wring."));
        panel40.add(new JLabel("Do not dry in direct sunlight."));
        frameKFshirt.add(panel40);

        panel41 = new JPanel();
        panel41.setBackground(new Color(250, 250, 250, 0));
        panel41.setBounds(400, 510, 300, 100);
        panel41.setFocusable(false);
        panel41.setLayout(new GridLayout(4, 6));
        panel41.add(new JLabel("Size"));
        panel41.add(new JLabel("    XS"));
        panel41.add(new JLabel("    S"));
        panel41.add(new JLabel("    M"));
        panel41.add(new JLabel("    L"));
        panel41.add(new JLabel("    XL"));
        panel41.add(new JLabel("Length"));
        panel41.add(new JLabel("    32"));
        panel41.add(new JLabel("    34"));
        panel41.add(new JLabel("    36"));
        panel41.add(new JLabel("    42"));
        panel41.add(new JLabel("    48"));
        panel41.add(new JLabel("HIP"));
        panel41.add(new JLabel("    34"));
        panel41.add(new JLabel("    36"));
        panel41.add(new JLabel("    38"));
        panel41.add(new JLabel("    40"));
        panel41.add(new JLabel("    44"));
        panel41.add(new JLabel("Shoulder"));
        panel41.add(new JLabel("    13.5"));
        panel41.add(new JLabel("    14"));
        panel41.add(new JLabel("    14.5"));
        panel41.add(new JLabel("    15"));
        panel41.add(new JLabel("    16"));
        frameKFshirt.add(panel41);

        cart11 = new JButton();
        cart11.setBounds(495, 640, 120, 35);
        ImageIcon icon89 = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\Clothify\\src\\cart.jpg");
        cart11.setIcon(icon89);
        frameKFshirt.add(cart11);
        JButton viewcart11 = new JButton("View Cart");
        viewcart11.setBounds(295, 640, 120, 35);

        frameKFshirt.add(viewcart11);
        viewcart11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clothes clothes = new Clothes("Male", "Adult");
                ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
                cartGui.cartGUI.addItem(item1, 2);
                ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1);
                cartGui.cartGUI.addItem(item2, 2);
                frameKFshirt.dispose();
                frame1.dispose();
                frame3.dispose();
            }
        });

        review = new JButton("Review");
        review.setBounds(600, 100, 100, 20);
        review.setFocusable(false);
        frameMshirt1.add(review);
        review.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        review7 = new JButton("Review");
        review7.setBounds(600, 100, 100, 20);
        review7.setFocusable(false);
        review7.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        frameMshirt2.add(review7);
        review2 = new JButton("Review");
        review2.setBounds(600, 100, 100, 20);
        review2.setFocusable(false);
        frameMtrouser1.add(review2);
        review2.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        review4 = new JButton("Review");
        review4.setBounds(600, 100, 100, 20);
        review4.setFocusable(false);
        frameWshirt1.add(review4);
        review4.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        review5 = new JButton("Review");
        review5.setBounds(600, 100, 100, 20);
        review5.setFocusable(false);
        frameWshirt2.add(review5);
        review5.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        review6 = new JButton("Review");
        review6.setBounds(600, 100, 100, 20);
        review6.setFocusable(false);
        frameWtrouser1.add(review6);
        review6.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        review9 = new JButton("Review");
        review9.setBounds(600, 100, 100, 20);
        review9.setFocusable(false);
        frameKMshirt.add(review9);
        review9.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        review10 = new JButton("Review");
        review10.setBounds(600, 100, 100, 20);
        review10.setFocusable(false);
        frameKMtrouser.add(review10);
        review10.addActionListener(new ReviewButton(new JFrame("Customer's review")));
        review11 = new JButton("Review");
        review11.setBounds(600, 100, 100, 20);
        review11.setFocusable(false);
        frameKFshirt.add(review11);
        review11.addActionListener(new ReviewButton(new JFrame("Customer's review")));

//        review11.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                CartGUI cart =new CartGUI();
//                Clothes clothes = new Clothes("Male", "Adult"); ItemCategory item1 = clothes.viewCategoryItems("womendresses").get(0);
//                cart.cartGUI.addItem(item1, 2); ItemCategory item2 = clothes.viewCategoryItems("menshirts").get(1); cart.cartGUI.addItem(item2,2);
//
//            }
//        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == shopnow1) {
            frame2.setVisible(true);
            frame1.dispose();
        }
        if (e.getSource() == shopnow2) {
            frame3.setVisible(true);
            frame2.dispose();
        }
        if (e.getSource() == shopnow3) {
            frame4.setVisible(true);
        }
        if (e.getSource() == MenShirt1) {
            frameMshirt1.setVisible(true);
        }
        if (e.getSource() == MenShirt2) {
            frameMshirt2.setVisible(true);
        }
        if (e.getSource() == menTrouser1) {
            frameMtrouser1.setVisible(true);
        }
        if (e.getSource() == womenShirt1) {
            frameWshirt1.setVisible(true);
        }
        if (e.getSource() == womenShirt2) {
            frameWshirt2.setVisible(true);
        }
        if (e.getSource() == womenTrouser1) {
            frameWtrouser1.setVisible(true);
        }
        if (e.getSource() == kidsShirt1) {
            frameKMshirt.setVisible(true);
        }
        if (e.getSource() == kidsTrouser1) {
            frameKMtrouser.setVisible(true);
        }
        if (e.getSource() == kidsShirt2) {
            frameKFshirt.setVisible(true);
        }
        if (e.getSource() == cart) {
            c.addItem(item, 1);
        }
        if (e.getSource() == cart2) {
            c.addItem(item2, 1);
        }
        if (e.getSource() == cart3) {
            c.addItem(item3, 1);
        }
        if (e.getSource() == cart5) {
            c.addItem(item5, 1);
        }
        if (e.getSource() == cart6) {
            c.addItem(item6, 1);
        }
        if (e.getSource() == cart7) {
            c.addItem(item7, 1);
        }
        if (e.getSource() == cart9) {
            c.addItem(item9, 1);
        }
        if (e.getSource() == cart10) {
            c.addItem(item10, 1);
        }
        if (e.getSource() == cart11) {
            c.addItem(item11, 1);
        }
    }
}