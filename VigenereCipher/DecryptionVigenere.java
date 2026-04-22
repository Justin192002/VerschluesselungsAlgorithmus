package VigenereCipher;

public class DecryptionVigenere {
    
    private final char[] keyArr;
    private final char []alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public DecryptionVigenere(String key) {
        keyArr = key.toCharArray();
    }

    public String decryptionWort(){
        return"";
    }


    public int checkPosition(char buchstabe){

        for (int i = 0; i < alphabet.length; i++) {
            
            if(alphabet[i] == Character.toLowerCase(buchstabe)){
                return i;
            }
        }
        
        return -1;
    }
}
