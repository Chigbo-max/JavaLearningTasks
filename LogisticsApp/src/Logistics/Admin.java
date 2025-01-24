package Logistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Admin {

    List<Driver> drivers = new ArrayList<>();
    List<Package> packages = new ArrayList<>();

    public Package registerPackage(String receiverName, String receiverAddress, String receiverPhoneNumber, String senderName) {
        String trackingId = "CC" + generateTrackingId();
        Recipient receiver = new Recipient(receiverName, receiverAddress, receiverPhoneNumber);
        Package newPackage = new Package(trackingId, receiver, senderName);
        packages.add(newPackage);
        return newPackage;
    }

    private long generateTrackingId(){
        Random rand = new Random();
        long id = Math.abs(rand.nextLong() % 999_999_999);
        return id;
    }


    public Driver createDriver(String firstName, String lastName, String address, String drivingLicenseNo, String phone, String password) {
        String name = firstName + " " + lastName;
        String id = "DD" + generateDriverId();
        Driver newDriver = new Driver(name, address, phone, drivingLicenseNo,id, password);
        drivers.add(newDriver);
        return newDriver;
    }

    private long generateDriverId(){
        Random rand = new Random();
        long id = Math.abs(rand.nextLong() % 999_999_999);
        return id;
    }

    public String findDriverId(String id) {
        for(Driver driver : drivers) {
            if(driver.getId().equals(id)) {
                return driver.getId();
            }
        }
        throw new IllegalArgumentException("Driver id does not match");
    }

    public String findTrackingNumber(String id) {
        for(Package parcel : packages) {
            if(parcel.getTrackingNumber().equals(id)) {
                return parcel.getTrackingNumber();
            }
        }
        throw new IllegalArgumentException("Id does not match");
    }
}
