package Logistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void throwExceptionIfPhoneNumberIsNotUpTo11() {
        Customer newCustomer = new Customer("ade", "2. williams street, kunle state", "09012345", "CC23456789", "1234");
        assertThrows(IllegalArgumentException.class, () -> {newCustomer.validatePhone(newCustomer.getPhone());});
    }

}