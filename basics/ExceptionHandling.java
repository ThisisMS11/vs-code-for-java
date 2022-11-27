package basics;

public class ExceptionHandling {
    public static void main(String[] args) {

        //! Using trycatch we can avoid the stop in execution of our code in case of an exception being found.

        int[] marks = { 1, 7, 8, 5 };
        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("our exception is :" + e);
        }

        System.out.print("Mohit saini wants absolute freedom and not any kind of bondage.");
    }

}
