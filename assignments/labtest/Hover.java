import java.util.Scanner;

public class Hover {

    public boolean Checker(String password) {
        // 65 to 90 A to Z
        int uppercase = 0;
        int lowercase = 0;
        int specialCharacter = 0;
        int digits=0;

        for (int i = 0; i < password.length(); i++) {
            char hold=password.charAt(i);
            if(hold>='A' && hold<='Z'){
                ++uppercase;
            }
            else if(hold>='a' && hold<='z'){
                ++lowercase;
            }
            else if(hold>='0' && hold<='9'){
                ++digits;
            }
            else if(hold=='#' || hold=='@' || hold=='*'|| hold=='$'){
                ++specialCharacter;
            }
        }

        if(uppercase>=4 && lowercase >= 5 && specialCharacter >= 5 && digits >=5){
            return true;
        }
        
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();
        int uppercase=0;
        for (int i = 0; i < name.length(); i++) {
            char hold=name.charAt(i);
            if(hold>='0' && hold<='9'){
                ++uppercase;
            }
        }
        System.out.println(uppercase);
        sc.close();
    }
}
