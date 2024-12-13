package caesarCypher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EncryptionAndDecryptionTest {

    @Test
    public void testThat5modulus26Returns5(){
        int number = 5;
        int actual = EncryptionAndDecryption.getValueOf5Modulus26(number);
        int expected = 5;
        assertEquals(actual,expected);
        
    }

    @Test
    public void testThatTheNumericValueForCharacterIsReturned(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        int[] actual = encryptionAndDecryption.getValueOfCharacter(plainText);
        int[] expected = {2,0,11,8,5,14,17,13,8,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatExceptionIsThrowForNonLetter(){
        String plainText = "CALIFOR32A";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, ()->encryptionAndDecryption.getValueOfCharacter(plainText));
        assertEquals(illegalArgumentException.getMessage(),"Invalid character");
    }

    @Test
    public void testThatTheEncryptedModulus26ValueForCharacterIsReturned(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        int[] actual = encryptionAndDecryption.getEncryptedModulusValueForEachCharacter(plainText);
        int[] expected = {5,3,14,11,8,17,20,16,11,3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatModulusValueReturnsTheEncryptedValue(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        char[] actual = encryptionAndDecryption.getEncryptedResult(plainText);
        char[] expected = {'f','d','o','l','i','r','u','q','l','d'};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatTheDecryptedModulus26ValueForCharacterIsReturned(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        int[] actual = encryptionAndDecryption.getDecryptedModulusValueForEachCharacter(plainText);
        int[] expected = {25,23,8,5,2,11,14,10,5,23};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatModulusValueReturnsTheDecryptedValue(){
        String plainText = "CALIFORNIA";
        EncryptionAndDecryption  encryptionAndDecryption = new EncryptionAndDecryption();
        char[] actual = encryptionAndDecryption.getDecryptedResult(plainText);
        char[] expected = {'z', 'x', 'i', 'f', 'c', 'l', 'o', 'k', 'f','x'};
        assertArrayEquals(expected, actual);
    }
}
