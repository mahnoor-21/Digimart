import java.util.ArrayList;
public class Clothes{
    private String gender;
    private String ageGroup;
    public ArrayList<ItemCategory> menShirts;
    public ArrayList<ItemCategory> menPants;
    public ArrayList<ItemCategory> womenDresses;
    public ArrayList<ItemCategory> womenTops;
    public ArrayList<ItemCategory> boysClothes;
    public ArrayList<ItemCategory> girlsClothes;

    public Clothes(String gender, String ageGroup ) {
        this.gender = gender;
        this.ageGroup = ageGroup;
        this.menShirts = initializeItems("MenShirts", 2);
        this.menPants = initializeItems("MenPants", 2);
        this.womenDresses = initializeItems("WomenDresses", 2);
        this.womenTops = initializeItems("WomenTops", 2);
        this.boysClothes = initializeItems("BoysClothes", 2);
        this.girlsClothes = initializeItems("GirlsClothes", 2);
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAgeGroup() {
        return ageGroup;
    }
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
    private ArrayList<ItemCategory> initializeItems(String category, int count) {
        ArrayList<ItemCategory> items = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            if(i==1){
                ItemCategory item1 = new ItemCategory();
                item1.setItemName(category+i);
                item1.setItemId("ID" + i);
                item1.setColor("Blue");
                item1.setItemStatus("Available");
                item1.setFabric("Cotton");
                item1.setSize("L");
                item1.setItemType("Unstitched");
                item1.setPrice(15000);
                item1.setLength(15);
                item1.setWidth(16);
                items.add(item1);
            }
            else{
                ItemCategory item2 = new ItemCategory();
                item2.setItemName(category+i);
                item2.setItemId("ID" + i);
                item2.setColor("Black");
                item2.setItemStatus("Available");
                item2.setFabric("Silk");
                item2.setSize("M");
                item2.setItemType("Stitched");
                item2.setPrice(20000);
                item2.setLength(20);
                item2.setWidth(21);

                items.add(item2);
            }
        }
        return items;
    }
    public ArrayList<ItemCategory> viewAvailableItems() {
        ArrayList<ItemCategory> availableItems = new ArrayList<>();
        availableItems.addAll(menShirts);
        availableItems.addAll(menPants);
        availableItems.addAll(womenDresses);
        availableItems.addAll(womenTops);
        availableItems.addAll(boysClothes);
        availableItems.addAll(girlsClothes);
        return availableItems;
    }
    public ArrayList<ItemCategory> viewCategoryItems(String category) {
        ArrayList<ItemCategory> categoryItems = new ArrayList<>();
        switch (category.toLowerCase()) {
            case "menshirts":
                categoryItems.addAll(menShirts);
                break;
            case "menpants":
                categoryItems.addAll(menPants);
                break;
            case "womendresses":
                categoryItems.addAll(womenDresses);
                break;
            case "womentops":
                categoryItems.addAll(womenTops);
                break;
            case "boysclothes":
                categoryItems.addAll(boysClothes);
                break;
            case "girlsclothes":
                categoryItems.addAll(girlsClothes);
                break;
            default:
                System.out.println("Invalid category");
        }
        return categoryItems;
    }
    public int getStockQuantity(String category, String item) {
        ArrayList<ItemCategory> categoryItems = viewCategoryItems(category);
        return categoryItems.size();
    }

    public boolean checkAvailability(String category, String itemName) {
        ArrayList<ItemCategory> categoryItems = viewCategoryItems(category);
        for (ItemCategory item : categoryItems) {
            if (item.getItemName().equalsIgnoreCase(itemName.trim())) {
                return true;  // Item found, it's available
            }
        }
        return false;  // Item not found, it's not available
    }

    public void getItemDetails(String category, ItemCategory item) {
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Item ID: " + item.getItemId());
        System.out.println("Size: " + item.getSize());
        System.out.println("Fabric: " + item.getFabric());
        System.out.println("Color: " + item.getColor());
        System.out.println("Price: " + item.getPrice());
        System.out.println("Length: " + item.getLength());
        System.out.println("Width: " + item.getWidth());
        System.out.println("Weight: " + item.getWeight());
        System.out.println("Availability: " + item.getItemStatus());
        System.out.println("Item Category: " + item.getItemType());
        if(category.equals("MenShirts")){
            System.out.println("Gender: Men");
            System.out.println("Age Group: Adult");
        }
        else if (category.equals("MenPants")){
            System.out.println("Gender: Men");
            System.out.println("Age Group: Adult");
        }
        else if (category.equals("WomenDresses")) {
            System.out.println("Gender: Women");
            System.out.println("Age Group: Adult");
        }
        else if (category.equals("WomenTops")) {
            System.out.println("Gender: Women");
            System.out.println("Age Group: Adult");
        } else if (category.equals("BoysClothes")) {
            System.out.println("Gender: Boys");
            System.out.println("Age Group: Kids");
        }
        else if (category.equals("GirlsClothes")) {
            System.out.println("Gender: Girls");
            System.out.println("Age Group: Kids");
        }
        System.out.println("Category: " + category);
    }
    public ItemCategory getItemByName(ArrayList<ItemCategory> items, String itemName) {
        for (ItemCategory item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName.trim())) {
                return item;
            }
        }
        return null;
    }
}