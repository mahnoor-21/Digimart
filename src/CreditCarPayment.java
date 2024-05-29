import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CreditCarPayment extends Payment{
    private String cardNo;
    protected int amount;
    private String CVCNo;
    public int expiryDay;
    public int expiryMonth;
    public int expiryYear;
    CreditCarPayment(){
        super();
    }
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    public void setCVCNo(String CVCNo) {
        this.CVCNo = CVCNo;
    }

    public void setExpiryDay(int expiryDay) {
        this.expiryDay = expiryDay;
    }


    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    boolean isValidCardNo(){
        if ((this.cardNo.length() == 16)) {
             return  true;
        }
        else{
            return false;
        }
    }

    boolean isValidCVC(){
        if ((this.CVCNo.length() == 3)) {
             return  true;
        }
        else{
            return false;
        }
    }
    boolean validateAmount(){
        if(amount == getTotal()){
            System.out.println(getTotal());
            return false;
        }
        else{
            return true;
        }
    }
    boolean validDate() {
        boolean isValid = true;
        LocalDate current = LocalDate.now();
        LocalDate expiry = LocalDate.of(this.expiryYear,this.expiryMonth,this.expiryDay);
        if (expiry.isAfter(current) || current.isEqual(expiry)) {
          isValid = true
            ;
        } else {
            isValid = false;
        }
        return isValid;
    }

}




