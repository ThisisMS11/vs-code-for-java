package assignment6;

public class BCS134_W5P4 {
    public static void main(String[] args) {
        int [][] arr={{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(arr.length);
        
        int mum=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i+1; j++) {
                mum*=arr[i][j];
            }
        }

        System.out.println("The multiplication of lower traingular matrix : "+ mum );

        
    }
}
