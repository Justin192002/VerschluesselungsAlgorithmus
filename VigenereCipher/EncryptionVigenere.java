package VigenereCipher;

public class EncryptionVigenere {

    private final char[] keyArr;
    private final char []alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private final int [] schluessel;

    public EncryptionVigenere(String key) {
        keyArr = key.toCharArray();
        schluessel = new int[key.toCharArray().length];
        
       
        for (int i = 0; i < keyArr.length; i++) {

            this.schluessel[i] = checkPosition(keyArr[i]);
        }

    }


    public String encryptionWort(String wort){

        char [] umwandlung = wort.toCharArray();
        int increment = 0;

        for (int i = 0; i < umwandlung.length; i++) {
            if (increment <= schluessel.length){
                umwandlung[i] = getNewChar(checkPosition(umwandlung[i]),schluessel[increment]);                

            }else{
                increment = 0;
                umwandlung[i] = getNewChar(checkPosition(umwandlung[i]),schluessel[increment]);
            }
            increment++;
        }



        return umwandlung.toString();
    }

    public char getNewChar(int origin, int verschiebung){
        int newCharPosition = origin + verschiebung;
        while(newCharPosition > alphabet.length-1){
            newCharPosition = newCharPosition - alphabet.length;
        }

        return alphabet[newCharPosition];

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
