package MiniProject;
public class Bank_Account {
    private String bankName = "Pavani's Bank";
    private String ifscCode;
    private int accNumber;
    private String initial;
    private long phoneNumber;
    private String bankType;
    private String firstName;
    private String lastName;
    private String email;
    private double balance = 1000;
    private int pincode;
    private int pinChange;
    // constructor (FIXED)
    public Bank_Account(String bankName, String ifscCode, int accNumber, String initial, long phoneNumber, String bankType, String firstName, String lastName, String email, double balance, int pincode, int pinChange) {
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.initial = initial;
        this.accNumber = accNumber;
        this.phoneNumber = phoneNumber;
        this.bankType = bankType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.balance = balance;
        this.pincode = pincode;
        this.pinChange = pinChange;
    }
    // getters
    public String getbankName() {
        return bankName;
    }
    public String getifscCode() {
        return ifscCode;
    }
    public int getaccNumber() {
        return accNumber;
    }
    public String getinitial() {
        return initial;
    }
    public long getphoneNumber() {
        return phoneNumber;
    }
    public String getbankType() {
        return bankType;
    }
    public String getfirstName() {
        return firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public String getemail() {
        return email;
    }
    public double getbalance() {
        return balance;
    }
    public int getpincode() {
        return pincode;
    }
    public int getpinChange() {
        return pinChange;
    }
    // setters (important for update)
    public void setbalance(double balance) {
        this.balance = balance;
    }

    public void setphoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // display method
    public String Display() {
    	return "BankAccount [bankName=" + bankName +", ifscCode=" + ifscCode +", accNumber=" + accNumber +", initial=" + initial +", phoneNumber=" + phoneNumber +
    		                 ", bankType=" + bankType +", firstName=" + firstName +", lastName=" + lastName +", email=" + email +", balance=" + balance + ", pincode=" + pincode +
    		                 ", pinChange=" + pinChange + " ] ";
    	}
