package Logistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecipientTest {

    @Test
    public void testThatAnExceptionIsThrown_IfPhoneNumberOfTheReceiverIsNot11(){
        Recipient recipient = new Recipient("ade", "2 biliki street, lagos", "090123240567");
       assertThrows(IllegalArgumentException.class, () -> {recipient.validatePhoneNumber(recipient.getPhoneNumber());});
    }
}
