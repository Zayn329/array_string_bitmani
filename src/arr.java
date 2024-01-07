import java.util.*;

public class arr {
    public static void main(String args[])
    {
        int rows;
        int col;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows & cols");
        rows=sc.nextInt();
        col=sc.nextInt();

        int [][]arr= new int[rows][col];
        System.out.println("enter value in matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter value to find ");
        int val=sc.nextInt();

        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
                if (val==arr[i][j]){
                    System.out.println("element found at index: " + i + " " + j);

                    break;
                }
            }
        }

    }
}
