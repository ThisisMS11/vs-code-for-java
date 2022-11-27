package assignments.assignment4;
import java.util.Scanner;
public class BCS134_W3P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of  amount :- ");
        int amount = sc.nextInt();
        int count=0;
        if(amount>=2000){
            count+=amount/2000;
            amount=amount % 2000;
        }
        if(amount >=500){
            count+=amount/500;
            amount=amount % 500;
        }
        if(amount >= 200){
            count+=amount/200;
            amount=amount % 200;
        }
        if(amount>=100){
            count+=amount/100;
            amount=amount % 100;
        }
        if(amount>=50){
            count+=amount/50;
            amount=amount % 50;
        }
        if(amount>=20){
            count+=amount/20;
            amount=amount % 20;
        }
        if(amount>=10){
            count+=amount/10;
            amount=amount % 10;
        }
        if(amount >= 5){
            count+=amount/5;
            amount=amount % 5;
        }
        if(amount >= 2){
            count+=amount/2;
            amount=amount % 2;
        }
        if(amount >= 1){
            count+=amount/1;
            amount=amount % 1;
        }

        System.out.println("minimum no of notes required are :- "+ count);
        sc.close();
    }
}
