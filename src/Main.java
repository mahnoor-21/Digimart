import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("______________________________WELCOME TO DIGI-MART_______________________________");
        
        Scanner input = new Scanner(System.in);

        // Customer Class
        LocalDate dateOfBirth = LocalDate.of(1990, 1, 1);
//        Customer customer = new Customer("khaula123", "khaula@gmail.com", "Asadullah@1999", dateOfBirth, "Khaula", "Nauman", "123 Gulberg Greens", "0300-8934010");
//        customer.signUp();
        System.out.println("Enter loginId and password: ");
        String enteredLoginId = input.next();
        String enteredPassword = input.next();
//        if(customer.login(enteredLoginId, enteredPassword)){

        // Clothes Class
        Clothes clothes = new Clothes("Men", "Adult");

        System.out.println("Available Items: ");
//            Clothes.displayItemDetails(clothes.viewAvailableItems());

        System.out.print("Enter Name of Section \n(e.g: MenShirts, MenPants, WomenDresses, WomenTops, BoysClothes, GirlsClothes): ");
        String category = input.next();

        System.out.println("Items in " + category + ": ");
//            Clothes.displayItemDetails(clothes.viewCategoryItems(category));

        System.out.println("Enter:" +
                "\n1. To Check the available Items." +
                "\n2. To get the details of Item." +
                "\n3. To check Number of items in Stock."
        );
        int n = input.nextInt();

        if (n == 1) {
            System.out.print("Enter item to check availability: ");
            String itemToCheck = input.next();
            if (clothes.checkAvailability(category, itemToCheck)) {
                System.out.println(itemToCheck + " : Available");
            } else {
                System.out.println(itemToCheck + " : Not Available");
            }
        } else if (n == 2) {
            System.out.print("Enter item to get details: ");
            String itemToGetDetails = input.next();
//                Item selectedItem = clothes.getItemByName(clothes.viewCategoryItems(category), itemToGetDetails);

//                if (selectedItem != null) {
//                    // Call getItemDetails with the retrieved Item object
//                    clothes.getItemDetails(category, selectedItem);
//                } else {
//                    System.out.println("Item not found.");
//                }
        } else if (n == 3) {
            System.out.print("Enter item to get number of items in stock: ");
            String itemToCheckStock = input.next();
            System.out.println("Stock quantity of '" + itemToCheckStock + "': " +
                    clothes.getStockQuantity(category, itemToCheckStock));
        } else {
            System.out.println("Invalid option. Please enter 1, 2, or 3.");
        }

        ArrayList<Clothes> clothesList = new ArrayList<>();
        clothesList.add(clothes);

        //Category class object Creation.
        Category category1 = new Category(category, clothesList, "Sample Filters");

        System.out.println("\nFilter Clothes Based upon their Color, Size, and Prices.");
        System.out.println("Filtering Options:");
        System.out.println("1. Filter by Color");
        System.out.println("2. Filter by Size");
        System.out.println("3. Filter by Price");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter Color: ");
                String colorFilter = input.nextLine();
                category1.applyFilter(colorFilter, Double.MAX_VALUE, "");
                break;
            case 2:
                System.out.print("Enter Size: ");
                String sizeFilter = input.nextLine();
                category1.applyFilter("", Double.MAX_VALUE, sizeFilter);
                break;
            case 3:
                System.out.print("Enter Max Price: ");
                double maxPriceFilter = input.nextDouble();
                input.nextLine(); // Consume the newline
                category1.applyFilter("", maxPriceFilter, "");
                break;
            case 4:
                System.out.println("Exiting.");
                break;
            default:
                System.out.println("Invalid choice.");
        }


        // Payment Class
        Payment payment = new Payment();

//            payment.setUser(customer);

        // Calling Shopping method
        System.out.println("_____________Cart_____________");
//        shopping(payment);


        System.out.println("Enter the payment method: \n1. Credit Card Payment " +
                "\n2. EasyPaisa Payment \3.Cash On Delivery ");
        int option = input.nextInt();
        if (option == 1) {
            CreditCarPayment c = new CreditCarPayment();
            // Use a while loop for card validation
            boolean cardValidated = false;
            while (!cardValidated) {

                System.out.println("Proceeding to Payment\n");
                System.out.print("Enter Credit Card Number (16 digits):");
                String cardNo = input.next();
                System.out.print("Enter CVC Number (3 digits):");
                String CVCNo = input.next();
                System.out.print("Enter expiry month: ");
                int expiryMonth = input.nextInt();
                System.out.print("Enter expiry year: ");
                int expiryYear = input.nextInt();
                System.out.print("Enter expiry Day: ");
                int expiryDay = input.nextInt();

                c.setCardNo(cardNo);
                c.setCVCNo(CVCNo);
                c.setExpiryDay(expiryDay);
                c.setExpiryMonth(expiryMonth);
                c.setExpiryYear(expiryYear);

                if (c.isValidCVC()) {
                    System.out.println("Card validation successful!");
                    break;
                }// if ends here
                else {
                    System.out.println("Card validation failed. Please Enter again");
                    cardValidated = false;

                }// else ends here
            }// while loop ends here
        } else if (option == 2) {
            EasyPaisaPayment p = new EasyPaisaPayment();
            boolean validphone = false;
            while (!validphone) {
                System.out.println("Enter the receiver's phone number: ");
                String phone = input.nextLine();

                p.setReceiverMobileNo(phone);
                if (p.isValidPhoneNumber()) {
                    validphone = true;
                    break;
                } else {
                    validphone = false;
                }

            }

            boolean validAmount = false;
            while (!validAmount) {
                System.out.println("Enter the amount : ");
                int amount = input.nextInt();
                p.setAmount(amount);
                if (p.validateAmount()) {
                    validAmount = true;
                    break;
                } else {
                    validAmount = false;

                }
            }
            System.out.println("Payment Successful......");
        } else {
            // cash on delivery....
        }


        System.out.println("Enter \n1. To confirm payment.\n2. To continue Shopping.");

        // Using composition
//
//                int confirmOption = input.nextInt();
//                if (confirmOption == 1) {
//                    payment.setPaymentType("Credit Card");
//                    payment.onlinePayment(confirmOption);
//                }// if ends here
//                else {
//                    // Continue shopping
//                    payment.processPayment(confirmOption);
//                    shopping(payment);
//                    payment.generateReceipt();
//                } // else ends here
    }

}
