package assignments.assignment9;

import java.util.Scanner;

public class BCS134_W9_P4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the color : ");
        
        String color=sc.nextLine();

        System.out.print("Enter the choice  : ");
        int n =  sc.nextInt();
        
        System.out.println();
        

        if(n==1){
            Pototo p1 = new  Pototo();
            p1.setcolor(color);
            p1.tostring();
        }
        else if(n==2){
            Eggplant e1 = new Eggplant();
            e1.setcolor(color);
            e1.tostring();
        }
        else if(n==3){
            Tomato t1= new Tomato();
            t1.setcolor(color);
            t1.tostring();
        }
        sc.close();
    }
}


abstract class Vegetable {
    public abstract void setcolor(String color);
}

class Pototo extends Vegetable{
    String color;
    public void setcolor(String color){
        this.color=color;
    }
    public void tostring(){
        System.out.println("Potato " + this.color);
    }
}
class Eggplant extends Vegetable{
    String color;
    public void setcolor(String color){
        this.color=color;
    }
    public void tostring(){
        System.out.println("Eggplant " + this.color);
    }
}
class Tomato extends Vegetable{
    String color;
    public void setcolor(String color){
        this.color=color;
    }
    public void tostring(){
        System.out.println("Tomato " + this.color);
    }
}
