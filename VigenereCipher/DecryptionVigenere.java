package VigenereCipher;

public class DecryptionVigenere {
    
    private final char[] keyArr;
    private final char []alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public DecryptionVigenere(String key) {
        keyArr = key.toCharArray();
    }

    public String decryptionWort(String wort){
        int[] keyPosition = new int[keyArr.length];
        char[] umwandlung = wort.toCharArray();
        int []umwandlungPosition = new int[umwandlung.length];
        int []indexVerschiebung = new int[umwandlung.length];

        // Erstmal Wandel ich die Buchstaben in Positionen um, damit ich die Verschiebung durchführen kann.
        //  Danach muss ich die neuen Positionen wieder in Buchstaben umwandeln.
        for (int i = 0; i < keyArr.length; i++){
            keyPosition[i] = checkPosition(keyArr[i]);
        }
        for (int j = 0; j < umwandlung.length; j++) {
            umwandlungPosition[j] = checkPosition(umwandlung[j]);
        }
        indexVerschiebung = getNewPostion(umwandlungPosition, keyPosition);
        umwandlung = getNewChar(indexVerschiebung);

        return new String(umwandlung);
    }

    public int[] getNewPostion(int[] umwandlungPosition, int[] keyPosition){
        int [] newPosition = new int[umwandlungPosition.length];
        int increment = 0;

        for (int i = 0; i < umwandlungPosition.length; i++) {   // Potentieller Bug
            if (increment > keyPosition.length-1){
                newPosition[i] = umwandlungPosition[i] - keyPosition[increment];                

            }else{
                increment = 0;
                newPosition[i] = umwandlungPosition[i] - keyPosition[increment];
            }   
            increment++;
        }

        return newPosition;

    }

    public char[] getNewChar(int[] newPosition){
        char [] newChar = new char[newPosition.length];

        for (int i = 0; i < newPosition.length; i++) {
            while(newPosition[i] < 0){
                newPosition[i] = newPosition[i] + alphabet.length;
            }
            newChar[i] = alphabet[newPosition[i]];
        }

        return newChar;
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
