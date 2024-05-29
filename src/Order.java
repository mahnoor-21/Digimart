import java.io.Serializable;
import java.time.LocalDate;
public class Order implements Serializable {
    private static int nextOrderId = 1;
    private int orderId;
    private LocalDate datePlaced;
    private String orderDetail;
    public Order(){
        orderId=0;
        datePlaced=null;
        orderDetail=null;

    }

    public Order( Cart cart) {
        this.orderId = nextOrderId++;
        this.datePlaced = LocalDate.now();
        this.orderDetail = cart.cartDescription;
    }

    public static int getNextOrderId() {
        return nextOrderId;
    }

    public static void setNextOrderId(int nextOrderId) {
        Order.nextOrderId = nextOrderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDatePlaced() {
        return datePlaced;
    }

    public void setDatePlaced(LocalDate datePlaced) {
        this.datePlaced = datePlaced;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }
}
