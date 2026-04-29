package OneTimePad;

public class EncryptionOTP {
    

    public static  String[] wortInHexa(String wort){
        char[] buchstaben = wort.toCharArray();
        String[] hexaBuchstaben = new String[buchstaben.length];

        for (int i = 0; i < buchstaben.length; i++) {
            hexaBuchstaben[i] = Integer.toHexString(buchstaben[i]);
        }

        return  hexaBuchstaben;
    }

    public static void main(String[] args) {
        String testWort = "HALLO";
        char [] wort = testWort.toCharArray();
        String [] hexaZahlen = wortInHexa(testWort);

        for (int i = 0; i < hexaZahlen.length; i++) {
            System.out.println("Buchstabe: "+wort[i]+" Hexa:"+hexaZahlen[i]);
        }
    }

    
}
