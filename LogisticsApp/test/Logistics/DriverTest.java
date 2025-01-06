package Logistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    public void throwExceptionIfPhoneNumberIsNotUpTo11() {
        Driver newDriver = new Driver("ade", "2. williams street, kunle state", "09012345", "111111111", "DD23456789", "1234");
        assertThrows(IllegalArgumentException.class, () -> {newDriver.validatePhone(newDriver.getPhone());});
    }

}