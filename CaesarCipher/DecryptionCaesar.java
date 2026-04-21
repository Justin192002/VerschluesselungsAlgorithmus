package CaesarCipher;
import java.util.Arrays;

public class DecryptionCaesar {

    private final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final int key;

    public DecryptionCaesar(int key) {
         this.key = key; 
    }

    public String decryptionWort(String wort){

        char []wortArr = wort.toCharArray();
        char []alphabetArr = alphabet.toCharArray();

        for (int i = 0; i < wortArr.length; i++) {
            for (int j = 0; j < alphabetArr.length; j++) {
                if(wortArr[i] == alphabetArr[j]){
                    if(j-key >= 0){
                        wortArr[i] = alphabetArr[j-key];
                        break;
                    }else{
                        int overflowIndex = alphabetArr.length-1 - key;
                        wortArr[i] = alphabetArr[overflowIndex];
                        break;
                    }
                }
            }
        }

        wort = Arrays.toString(wortArr);

        return wort;
    }
}
