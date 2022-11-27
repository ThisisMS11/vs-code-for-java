package basics;

public class switchbasic {
    public static void main(String[] args) {
        int a = 4;
        switch (a) {
            case 1:
                System.out.println("the value is 1");
                break;
            case 2:
                System.out.println("the value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 4:
                System.out.println("The value is 4 ");
                break;
            default:
                System.out.println("The value is undefined");
                break;
        }
    }
}
