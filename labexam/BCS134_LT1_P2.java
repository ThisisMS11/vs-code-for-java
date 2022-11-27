package labexam;
import java.net.SocketTimeoutException;
import java.util.Scanner;
public class BCS134_LT1_P2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =  sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        else if(n==1){
            System.out.println(5);
        }
        else if(n==2){
            System.out.println(15);
        }
        else if(n==3){
            System.out.println(30);
        }
        else if(n>=4){
            System.out.println(60);
        }
        sc.close();
    }
}
