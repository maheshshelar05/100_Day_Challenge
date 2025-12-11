import java.util.*;

class MatrixSubstraction
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int rows, cols;

        System.out.println("Enter number of rows:");
        rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int c[][] = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        int i = 0;
        while(i < rows)
        {
            int j = 0;
            while(j < cols)
            {
                a[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        System.out.println("Enter elements of Matrix B:");
        i = 0;
        while(i < rows)
        {
            int j = 0;
            while(j < cols)
            {
                b[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }


        i = 0;
        while(i < rows)
        {
            int j = 0;
            while(j < cols)
            {
                c[i][j] = a[i][j] - b[i][j];
                j++;
            }
            i++;
        }

        System.out.println("Matrix Substraction :");
        i = 0;
        while(i < rows)
        {
            int j = 0;
            while(j < cols)
            {
                System.out.print(c[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
