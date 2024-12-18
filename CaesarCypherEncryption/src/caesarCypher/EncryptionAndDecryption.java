package caesarCypher;

public class EncryptionAndDecryption {


    public int[] getValueOfCharacter(String plainText) {
        int[] result = new int[plainText.length()];
        for(int index = 0; index < plainText.length(); index++) {
            char character = plainText.charAt(index);
            validateCharacter(character);
            character = Character.toLowerCase(character);
            int number = character - 'a';
            result[index] = number;
        }
        return result;
    }



    public int[] getEncryptedModulusValueForEachCharacter(String plainText) {
        int[] characterValues = getValueOfCharacter(plainText);
        int[] modulusValue = new int[characterValues.length];
        int key = 3;
        for(int index = 0; index < modulusValue.length; index++) {
            validateEncryptedModulusValue(characterValues, index, key, modulusValue);
        }
        return modulusValue;
    }




    public char[] getEncryptedResult(String plainText) {
        int[] modulusValues = getEncryptedModulusValueForEachCharacter(plainText);
        char[] encryptedValues = new char[modulusValues.length];
        for(int index = 0; index < modulusValues.length; index++) {
            encryptedValues[index] = (char) (modulusValues[index] + 'a');
        }
        return encryptedValues;
    }


    public int[] getDecryptedModulusValueForEachCharacter(String plainText) {
        int[] characterValues = getValueOfCharacter(plainText);
        int[] decryptedModulusValues = new int[characterValues.length];
        int key = 3;
        for(int index = 0; index < decryptedModulusValues.length; index++) {
            validateDecryptionModulusValue(characterValues, index, key, decryptedModulusValues);
        }
        return decryptedModulusValues;
    }


    public char[] getDecryptedResult(String plainText) {
        int[] decryptedModulusValues = getDecryptedModulusValueForEachCharacter(plainText);
        char[] decryptedValues = new char[decryptedModulusValues.length];

        for(int index = 0; index < decryptedValues.length; index++) {
            decryptedValues[index] = (char) (decryptedModulusValues[index] + 'a');
        }
        return decryptedValues;
    }

    private static void validateCharacter(char character) {
        if(!Character.isLetter(character)) {
            throw new IllegalArgumentException("Invalid character");
        }
    }

    private static void validateEncryptedModulusValue(int[] characterValues, int index, int key, int[] modulusValue) {
        int value = characterValues[index] + key;
        if((value)  < 26)
            modulusValue[index] = value;

        modulusValue[index] = (value) % 26;
    }

    private static void validateDecryptionModulusValue(int[] characterValues, int index, int key, int[] decryptedModulusValues) {
        int decryptionValue = characterValues[index] - key;

        if(decryptionValue  < 26 && characterValues[index] >= key){
            decryptedModulusValues[index] = decryptionValue;
        }
        else {
            decryptedModulusValues[index] = decryptionValue % 26;
        }
        if(decryptionValue < 0){
            decryptedModulusValues[index] = 26 + decryptionValue;
        }
    }

}
