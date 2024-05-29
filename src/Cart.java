
import java.util.*;
import java.time.LocalDate;

public class Cart {
    protected static int nextCartId = 1;
    protected int cartId;
    protected int totalItems;
    protected double subtotal;
    protected static List<ItemCategory> cart=new ArrayList<>();
    protected String cartDescription;
    protected Payment pay;
    protected LocalDate date;
    private CartGUI cartGUI;

    public Cart() {
        cartId=nextCartId++;
        totalItems=0;
        subtotal=0.0;
        cartDescription = "Shopping Cart #" + cartId;
        date=LocalDate.now();
        pay=new Payment();
    }
    public void setCartGUI(CartGUI cartGUI) {
        this.cartGUI = cartGUI;
    }
    public Cart(Payment pay) {
        this.pay=pay;
    }

    public void addItem(ItemCategory item, int quantity) {
        if (cart.contains(item)) {

            updateQuantity(item, quantity);
        } else {
            // Add item to the cart
            cart.add(item);
            updateQuantity(item, quantity);

        }
        cartGUI.updateCartDisplay();
    }
    //    public void addClothesToCart(Clothes clothes, String category, int quantity) {
//        ArrayList<Item> categoryItems = clothes.viewCategoryItems(category);
//        for (Item item : categoryItems) {
//            addItem(item, quantity);
//        }
//    }
    public void removeItem(ItemCategory item,int quantity) {
        if (cart.contains(item)) {
            totalItems -=1;
            subtotal -= item.getPrice() * quantity;
            cart.remove(item);
        }
    }
    public void clearCart(){
        cart.clear();
        totalItems = 0;
        subtotal = 0.0;
        System.out.println("Cart Cleared");
    }
    public void updateQuantity(Item item, int quantity) {
        totalItems += quantity;
        subtotal += item.getPrice() * quantity;

    }
    public void checkOut() {
        System.out.println("Proceeding to payment: ");
        pay.setTotal(subtotal);
        System.out.println("Checkout completed for " + cartDescription);
        clearCart();
    }
}
