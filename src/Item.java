import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Item {
    protected String itemName;
    protected  String itemId;
    protected  String size;  // S,M,L,XL
    protected  double length;
    protected double width;
    protected  double weight;
    protected  String fabric;
    protected String color;
    protected double price;
    protected String itemStatus; // available or not
    protected String itemType; // stitched or un-stitched
    private String[][] reviews;
    private static int maxReviews;   // Keep track of total reviews on the product
    private static int currentReviews;  // Keep track of current reviews on the product
    // Constructors

    Item(){
        maxReviews = 10;
        this.reviews = new String[maxReviews][3]; // Assuming each review has 3 attributes: nickName, rating, reviewText
        currentReviews = 4;
    }

    public Item(String itemName, String itemId, String size, double length, double width, double weight,
                String fabric, String color, double price, String itemStatus,
                String itemType, String shippingStatus) {
        this(); // Constructor chaining
        this.itemName = itemName;
        this.itemId = itemId;
        this.size = size;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.fabric = fabric;
        this.color = color;
        this.price = price;
        this.itemStatus = itemStatus;
        this.itemType = itemType;
    }
    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Methods
    private void  deliveryTime(){
        // Getting the current date
        LocalDate currentDate = LocalDate.now();
        LocalDate deliveryDate = currentDate.plusDays(7);

        // Using DateTime Formatter to print date in our own formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String myDate = currentDate.format(formatter);
        String formattedDate = deliveryDate.format(formatter);
        System.out.println( myDate+" to "+formattedDate);
    }

    public abstract void sizeChart();
    public boolean validateRating(int rating){

        if(rating >=1 && rating <=5){
            return true;
        }
        return  false;

    }

    public void viewReviews(){
        reviews = new String[maxReviews][3];
        reviews[0] = new String[]{"Ali Asad", "4", "Great product!"};
        reviews[1] = new String[]{"Asma Zulfiqar", "5", "Excellent quality!"};
        reviews[2] = new String[]{"Ahmed Ali", "3", "Good but could be better"};
        reviews[3] = new String[]{"Mustafa khan", "5", "Absolutely love it!"};
        for(int i = 0;i<currentReviews;i++){
            System.out.println("NickName: " + reviews[i][0]);
            System.out.println("Rating: " + reviews[i][1]);
            System.out.println("Review: " + reviews[i][2]);
            System.out.println("-------------------------------");
        }
    }
    public void addReviews(){
        String nickName;
        int rating;
        String reviewText;
        if (currentReviews < maxReviews) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your nickName: ");
            nickName = input.nextLine();

            System.out.print("Give your ratings on item quality(1-5) : ");
            rating = input.nextInt();
            input.nextLine();
            if(validateRating(rating)){
                System.out.println("Your rating has been considered.");
            }
            else{
                System.out.print("Dear Customer, you can only add ratings from (1-5)."+
                        "\nPlease Enter again: ");
                rating = input.nextInt();
                input.nextLine();
            }

            System.out.println("Give your reviews on item : ");
            reviewText = input.nextLine();

            reviews[currentReviews][0] = nickName;
            reviews[currentReviews][1] = String.valueOf(rating);  // Converting integer rating into
            // String
            reviews[currentReviews][2] = reviewText;
            currentReviews++;

            System.out.println("Thank you for your review!");
        } else {
            System.out.println("Sorry, the maximum number of reviews has been reached.");
        }
    }
}
class ItemCategory extends Item{
    public void sizeChart(){
        System.out.println("            XS     S      M     L     XL");
        System.out.println(" CHEST    : 32     34     36    48    42");
        System.out.println(" HIP      : 34     36     38    40    44");
        System.out.println(" SHOULDER : 13.5   14    14.5   15    16");
    }
}
