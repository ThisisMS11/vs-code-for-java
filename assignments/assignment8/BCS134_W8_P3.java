import java.util.Scanner;

public class BCS134_W8_P3 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n1 :");
        int n1 =  sc.nextInt();

        System.out.print("Enter the value of n2 : ");
        int n2 =  sc.nextInt();
        
        DerivedClass child= new DerivedClass();

        child.set(n1, n2);

        System.out.println("Multiplication : " + child.getMultiply());
        


        sc.close();
    }
}

class Base {
    private int n1;
    private int n2;

    public void setter(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
}

class DerivedClass extends Base {

    private int x;
    private int y;

    public void set(int a,int b){
        this.x=a;
        this.y=b;
        setter(a,b);
    }

    int getMultiply() {
        return x * y;
    }
}
