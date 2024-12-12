package caesarCypher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionAndDecryptionTest {

    @Test
    public void testThat5modulus26Returns5(){
        int number = 5;
        int result = EncryptionAndDecryption.getValueOf5Modulus26(number);
        int expectedResult = 5;
        assertEquals(result,expectedResult);
    }

    @Test
    public void testThatTheNumericValueForCharacterIsReturned(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        int[] result = encryptionAndDecryption.getValueOfCharacter(plainText);
        int[] expectedResult = {2,0,11,8,5,14,17,13,8,0};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testThatTheModulus26ValueForCharacterIsReturned(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        int[] result = encryptionAndDecryption.getModulusValueForEachCharacter(plainText);
        int[] expectedResult = {5,3,14,11,8,17,20,16,11,3};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testThatModulusValueReturnsTheEncryptedValue(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        char[] result = encryptionAndDecryption.getEncryptedResult(plainText);
        char[] expectedResult = {'f','d','o','l','i','r','u','q','l','d'};
        assertArrayEquals(expectedResult, result);
    }
}
