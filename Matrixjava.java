package Mycap;
import java.util.*;
public class Matrix {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[][] a = {{1,3,4},{2,4,3},{3,4,5}};
        int[][] b = {{1,3,4},{2,4,3},{1,2,4}};
        int[][] c = new int[3][3];
        int[][] mul = new int[3][3];
        System.out.println("Sum of the matrices:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Product of the matrices:");
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                mul[i][j] = 0;
                for(int k =0; k < 3; k++)
                {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
