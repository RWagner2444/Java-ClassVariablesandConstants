
/**
 * Learn Class Variable and Constants
 * 5-27-2021
 * Ryan Wagner
 */
public class Encryption
{
    // instance variables - replace the example below with your own
    public static int value;
    public static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static String[] EncryptedAlpha;
    /**
     * Enter a number 0 through 25 for value
     */
    public Encryption(int value)
    {
        this.value = value;
    }
    
    public static void cipher(){
        String[] cipherAlphabet = new String[alphabet.length];
        int num = 25 - value;
        for(int i = 0; i < alphabet.length; i++){
            if(i + value <= 25){
                cipherAlphabet[i] = alphabet[i+value];
            }
            else{
                cipherAlphabet[i] = alphabet[i - num - 1]; 
            }
        }
        EncryptedAlpha = cipherAlphabet;
    }
    
    public static String cipherMessage(String message){
        String encrypt = "";
        for(int i = 0; i < message.length(); i++){
            String c = message.substring(i, i+1);
            int index = 0;
            if(c.equals(" ")){
                encrypt += " ";
            }
            else{
                for(int j = 0; j < alphabet.length; j++){
                    if(c.equals(alphabet[j])){
                        index = j;
                    }
                }
                encrypt += EncryptedAlpha[index];
            }
        }
        return encrypt;
    }
    
    public static String decryptMessage(String message){
        String decrypt = "";
        for(int i = 0; i < message.length(); i++){
            String c = message.substring(i, i+1);
            int index = 0;
            if(c.equals(" ")){
                decrypt += " ";
            }
            else{
                for(int j = 0; j < alphabet.length; j++){
                    if(c.equals(EncryptedAlpha[j])){
                        index = j;
                    }
                }
                decrypt += alphabet[index];
            }
        }
        return decrypt;
    }
}
