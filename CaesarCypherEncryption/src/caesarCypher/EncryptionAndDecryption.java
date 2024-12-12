package caesarCypher;

public class EncryptionAndDecryption {


    public static int getValueOf5Modulus26(int number) {
        int result = 0;
        if(number < 26)
            return number;
        result = number % 26;
        return result;
    }

    public int[] getValueOfCharacter(String plainText) {
        int[] result = new int[plainText.length()];
        for(int index = 0; index < plainText.length(); index++) {
            char character = plainText.charAt(index);
            if(Character.isLetter(character)) {
                character = Character.toLowerCase(character);
                int number = character - 'a';
                result[index] = number;
            }
        }
        return result;
    }

    public int[] getModulusValueForEachCharacter(String plainText) {
        int[] characterValue = getValueOfCharacter(plainText);
        int[] modulusValue = new int[characterValue.length];
        int number = 3;
        for(int index = 0; index < modulusValue.length; index++) {
            if((characterValue[index] + number)  < 26)
                modulusValue[index] = characterValue[index] + number;

            modulusValue[index] = (characterValue[index] + number) % 26;
        }
        return modulusValue;
    }


    public char[] getEncryptedResult(String plainText) {
        int[] modulusValue = getModulusValueForEachCharacter(plainText);
        char[] encryptedValues = new char[modulusValue.length];
        for(int index = 0; index < modulusValue.length; index++) {
            encryptedValues[index] = (char) (modulusValue[index] + 'a');
        }
        return encryptedValues;
        
    }
}
