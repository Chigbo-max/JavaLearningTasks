package Logistics;

public class Driver {
    private String name;
    private String address;
    private String phone;
    private String drivingLicenseNo;
    private String id;
    private String password;

    public Driver(String name, String address, String phone, String drivingLicenseNo, String id, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.drivingLicenseNo = drivingLicenseNo;
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
