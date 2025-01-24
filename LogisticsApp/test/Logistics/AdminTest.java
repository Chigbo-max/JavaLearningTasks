package Logistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {


    @Test
    public void checkCustomerIdMatches(){
        Admin admin = new Admin();
        Package newPackage = admin.registerPackage("wale", "1 akinwale str, boye state","08022222222", "bisi");
        String expected = newPackage.getTrackingNumber();
        assertEquals(expected, admin.findTrackingNumber(expected));
    }

    @Test
    public void checkDriverIdMatches(){
        Admin admin = new Admin();
        Driver newDriver = admin.createDriver("ade", "wale", "1 adebayo str, bankole state", "11111", "09011111111", "1234");
        String expected = newDriver.getId();
        assertEquals(expected, admin.findDriverId(expected));
    }

//    @Test
//    public void throwExceptionIfDriverIdDoesNotMatch(){
//        Admin admin = new Admin();
//        Driver newDriver = admin.createDriver("ade", "wale", "1 adebayo str, bankole state", "11111", "09011111111", "1234");
//        String id = "23456";
//        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,() -> admin.findDriverId(id));
//        assertEquals(illegalArgumentException.getMessage(), "Driver id does not match");
//
//    }
//
//    @Test
//    public void throwExceptionIfCustomerIdDoesNotMatch(){
//        Admin admin = new Admin();
//        Package newCustomer = admin.createCustomer("ade", "wale", "1 adebayo str, bankole state", "09011111111", "1234");
//        String id = "23456";
//        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,() -> admin.findCustomerId(id));
//        assertEquals(illegalArgumentException.getMessage(), "Id does not match");
//
//    }

}