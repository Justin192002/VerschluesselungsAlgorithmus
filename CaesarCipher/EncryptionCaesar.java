package CaesarCipher;

public class EncryptionCaesar {
    
    private  String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int key;

    public EncryptionCaesar(int key) {
         this.key = key; 
    }

    public String encryptionWort(String wort){

        char []wortArr = wort.toCharArray();
        char []alphabetArr = alphabet.toCharArray();

        for (int i = 0; i < wortArr.length; i++) {
            for (int j = 0; j < alphabetArr.length; j++) {
                if(wortArr[i] == alphabetArr[j]){
                    if(j+key < alphabetArr.length){
                        wortArr[i] = alphabetArr[j+key];
                    }else{
                        int overflowIndex = (j+key) - alphabetArr.length;
                        wortArr[i] = alphabetArr[overflowIndex];
                    }
                }
            }
        }

        return wortArr.toString();
    }

    
}
