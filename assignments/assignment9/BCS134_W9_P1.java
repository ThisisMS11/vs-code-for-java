package assignments.assignment9;
import java.util.Scanner;


public class BCS134_W9_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title : ");
        String title = sc.nextLine();
        System.out.println("Enter the author name : ");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book : ");
        int price = sc.nextInt();

        Mybook book1= new Mybook(title, author, price);
        book1.display();
        sc.close();
    }
}


abstract class Book {
    String title;
    String author;
    int price;
    abstract void display();
}

class Mybook extends Book {

    Mybook(String title, String Author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
    }
}
