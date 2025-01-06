package Logistics;

public class Customer {
    private String name;
    private String address;
    private String phone;
    private String id;
    private String password;

    public Customer(String name, String address, String phone, String id, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.id = id;
        this.password = password;

    }

    public String getId() {
        return id;
    }

    public String getPhone(){
        return phone;
    }

    public void validatePhone(String phone){
        if(phone.length() != 11){
            throw new IllegalArgumentException("Phone number must be 11 digits");
        }
    }
}
