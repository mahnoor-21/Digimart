import java.io.*;
import java.util.*;
public class Return {
    private String returnID;
    private Date returnDate;
    private List<ItemCategory> returnedItems;
    private String reason;
    private String status;
    private double refundAmount;
    private String originalSaleID;

    public Return(String originalSaleID) {
        this.returnID = generateReturnID();
        this.returnDate = new Date();
        this.returnedItems = new ArrayList<>();
        this.reason = "";
        this.status = "Pending";
        this.refundAmount = 0.0;
        this.originalSaleID = originalSaleID;
    }

    public String getReturnID() {
        return returnID;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public List<ItemCategory> getReturnedItems() {
        return returnedItems;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public String getOriginalSaleID() {
        return originalSaleID;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public void addReturnedItem(ItemCategory item) {
        this.returnedItems.add(item);
    }
    public void processReturn() {
        status = "Processed";
        System.out.println("Return processed successfully");
    }

    public void generateReturnReceiptToFile() {
        try (FileWriter writer = new FileWriter("return_receipt.txt")) {
            writer.write("Return Receipt for Return ID: " + returnID + "\n");
            writer.write("Date: 22/55/22" + "\n");
            writer.write("Original Sale ID: " + originalSaleID + "\n");
            writer.write("Reason for Return: " + reason + "\n");
            writer.write("Status: " + status + "\n");
            writer.write("Refund Amount: " + refundAmount + "\n");

            writer.write("Items being returned:\n");
            for (ItemCategory item : returnedItems) {
                writer.write("- " + item.getItemName() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String generateReturnID() {
        // Generating a unique identifier using UUID
        String uniqueID = UUID.randomUUID().toString();

        // Adding a prefix to indicate it's a return ID
        return "RETURN-" + uniqueID;
    }
}
