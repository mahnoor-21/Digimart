import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EasyPaisaPayment extends Payment{
    protected String  receiverMobileNo;
    protected int amount;
    EasyPaisaPayment(){

    }
    public EasyPaisaPayment(String receiverMobileNo, int amount) {
        this.receiverMobileNo = receiverMobileNo;
        this.amount = amount;
    }

    public void setReceiverMobileNo(String receiverMobileNo) {
        this.receiverMobileNo = receiverMobileNo;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    boolean isValidPhoneNumber(){
        boolean isValid = true;
        if(receiverMobileNo.length() == 11){
            for(int i = 0;i<receiverMobileNo.length();i++){
                if(Character.isDigit(receiverMobileNo.charAt(i))){
                    isValid = true;
                }
                else{
                    isValid = false;
                }
            }
        }
        else{
            isValid = false;
        }
        return isValid;
    }

    boolean validateAmount(){
        if(amount>=80 && amount == getTotal()){
            return true;
        }
        else{
            return false;
        }
    }
}