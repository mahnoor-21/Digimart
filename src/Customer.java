import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Customer implements Serializable {
    private String loginId;
    private String email;
    private String password;
    private String dateOfBirth;
    private String firstName;
    private String lastName;
    private String phoneNo;
    public Customer() {
        loginId="";
        email="";
        password="";
        dateOfBirth="";
        firstName="";
        lastName="";
        phoneNo="";

    }
    public Customer(String loginId, String email, String password, String dateOfBirth, String firstName, String lastName, String phoneNo) {
        this.loginId = loginId;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;

    }
    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    //verification methods
    public boolean verifyEmail() {
        String pattern = "^[\\w.-]+@[\\w.-]+\\.[\\w]+$";
        return Pattern.matches(pattern, email);

    }
    public boolean verifyPassword() {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(pattern, password);

    }
    public boolean verifyPhone() {
        String pattern = "^\\d{4}-\\d{7}$";
        return Pattern.matches(pattern, phoneNo);
    }

    public boolean verifyDateOfBirth() {
        // Define the date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Set lenient to false to enforce strict date parsing

        try {
            // Attempt to parse the date
            dateFormat.parse(dateOfBirth);
            return true; // If parsing succeeds, the date is valid
        } catch (ParseException e) {
            return false; // If parsing fails, the date is not valid
        }
    }

    public void addToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customers.txt",true));

            oos.writeObject(this);
            oos.close();


        } catch (EOFException e) {
            System.out.println("End of file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void logout() {
        System.out.println("Logging out");
    }
    @Override
    public String toString() {
        return "Customer{" +
                "loginId='" + loginId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

}
