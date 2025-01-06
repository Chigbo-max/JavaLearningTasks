package Logistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Admin {

    List<Driver> drivers = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

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

    public Customer createCustomer(String firstName, String lastName, String address, String phone, String password) {
        String name = firstName + " " + lastName;
        String id = "CC" + generateCustomerId();
        Customer newCustomer = new Customer(name, address, phone, id, password);
        customers.add(newCustomer);
        return newCustomer;
    }

    private long generateCustomerId(){
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

    public String findCustomerId(String id) {
        for(Customer customer : customers) {
            if(customer.getId().equals(id)) {
                return customer.getId();
            }
        }
        throw new IllegalArgumentException("Id does not match");
    }
}
