
import java.util.Scanner;

public class BCS134_W8_P1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        

        Child child1= new Child();

        System.out.println("Enter the value of num : ");
        int num=sc.nextInt();

        child1.solution(num);


        sc.close();
    }
}

class Base{
    int num;

    public void display(){
        System.out.println("Base Calling num " + this.num);
    }
}

class Child extends Base{
    public void solution(int n){
        this.num=n;
        display();
    }
}
