import java.util.Scanner;
/**
 * Learn Class Variable and Constants
 * 5-27-2021
 * Ryan Wagner
 */
public class CaesarTester
{
    public static void main(String[] args){
        Encryption e = new Encryption(/*getEncryptionValue()*/3);
        System.out.println("Alphabet");
        for(int i = 0; i < e.alphabet.length; i ++){
            System.out.print(e.alphabet[i] + " ");
        }
        e.cipher();
        System.out.println("\n\nEncrypted Alphabet");
        for(int i = 0; i < e.EncryptedAlpha.length; i++){
            System.out.print(e.EncryptedAlpha[i] + " ");
        }
        System.out.println("\n\nEnter e or d to either encrypt or decrypt a message\nThen enter your message\n");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        boolean eOrD = true;
        while(!ans.equals("quit")){
            if(ans.equals("e")){
                ans = sc.nextLine();
                eOrD = true;
            }
            if(ans.equals("d")){
                ans = sc.nextLine();
                eOrD = false;
            }
            if(eOrD){
                System.out.println(e.cipherMessage(ans));
                ans = sc.nextLine();
            }
            if(!eOrD){
                System.out.println(e.decryptMessage(ans));
                ans = sc.nextLine();
            }
        }
        
        
    }
    
    public int getEncryptionValue(int value){
        return value;
    }
}
