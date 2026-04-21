
import CaesarCipher.EncryptionCaesar;


public class Main {
    

    public static void main(String[] args) {
        
        EncryptionCaesar encrypt = new EncryptionCaesar(4);

        System.out.println(encrypt.encryptionWort("Justin"));

    }
}
