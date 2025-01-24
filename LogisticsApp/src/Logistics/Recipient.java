package Logistics;

public class Recipient {
    String name;
    String address;
    String phoneNumber;

    public Recipient(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String firstName) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void validatePhoneNumber(String phoneNumber){
        if(phoneNumber.length() != 11){
            throw new IllegalArgumentException("Phone number must be 11 digits");
        }
    }
}
