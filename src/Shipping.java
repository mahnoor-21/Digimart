import java.io.Serial;
import java.io.Serializable;

public class Shipping implements Serializable {
    protected String shippingStatus;
    protected  int shippingId;

    public int streetNo;
    protected String zipCode;
    protected String city;
    protected int houseNo;
    protected String province;
    protected String addressInstruction;
    Shipping(){

    }

    public Shipping(int streetNo, String zipCode,
                    String city, int houseNo, String province, String addressInstruction) {
        this.streetNo = streetNo;
        this.zipCode = zipCode;
        this.city = city;
        this.houseNo = houseNo;
        this.province = province;
        this.addressInstruction = addressInstruction;
    }
    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public void setAddressInstruction(String addressInstruction) {
        this.addressInstruction = addressInstruction;
    }

    boolean validateAddress(){
        if(isValidHouseNo() && isValidStreetNo() && isValidZipCode()){
            return true;
        }
        else{
            return false;
        }
    }// Method ends here


    boolean isValidZipCode(){
        boolean validZipCode = true;
        if(zipCode.length() ==  5 && Integer.parseInt(zipCode)<99999 &&  Integer.parseInt(zipCode)>10000){
            for(int i  = 0 ;i<zipCode.length();i++){
                if(Character.isDigit( zipCode.charAt(i))){
                    validZipCode = true;
                }
                else{
                    validZipCode = false;
                }
            }
        }
        else{
            validZipCode = false;
        }
        return validZipCode;
    }// Method ends here

    boolean isValidHouseNo(){
        if(houseNo<=0){
            return false;
        }
        else{
            return true;
        }
    }// Method ends here
    boolean isValidStreetNo(){
        if(streetNo<=0){
            return false;
        }
        else{
            return true;
        }
    }// Method ends here
    boolean isValidCity(){
        boolean validCity = true;
        for(int i = 0;i<city.length();i++){
            if(Character.isLetter(city.charAt(i))){
                validCity =  true;
            }
            else{
                validCity =  false;
            }
        }
        return validCity;
    }// Method ends here
}

