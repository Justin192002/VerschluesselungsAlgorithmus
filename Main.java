import VigenereCipher.DecryptionVigenere;
import VigenereCipher.EncryptionVigenere;

public class Main {
    

    public static void main(String[] args) {
        
        /*EncryptionCaesar encrypt = new EncryptionCaesar(4);
        DecryptionCaesar decrypt = new DecryptionCaesar(4);
        System.out.println(encrypt.encryptionWort("Justin"));
        System.out.println(decrypt.decryptionWort("Nywxmr"));*/


        EncryptionVigenere encryptVigenere = new EncryptionVigenere("key");
        System.out.println(encryptVigenere.encryptionWort("THISATEST"));
        //System.out.println("DLGCEROWR"); // Lösung mit key
        DecryptionVigenere decryptVigenere = new DecryptionVigenere("key");
        System.out.println(decryptVigenere.decryptionWort("DLGCEROWR"));
    }
}
