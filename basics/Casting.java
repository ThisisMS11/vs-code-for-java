package basics;

public class Casting {
    public static void main(String[] args) {
        // __implicit casting__ where a datatype occupying less memory is stored in
        // another variable having more memory comparitively (by java itself)

        int a = 45;
        double casted_a = a;

        // explicit casting in java
        double b = 12.45;
        // double occupies 8 bytes and int 4 bytes thus it is not possible to store , so
        // we use explicit casting..
        int answer = (int) b;
        System.out.println(answer+45);
        System.out.print(answer*0);

        //final keyword to express static variables in java
        final int const_name=45;
        // const_name+=45; --> not allowed
    }
}