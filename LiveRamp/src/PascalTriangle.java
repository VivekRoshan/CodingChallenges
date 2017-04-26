

import java.util.InputMismatchException;
import java.util.Scanner;

public class PascalTriangle {

   public  static void print(int n)
   {
       for (int i = 0; i < n; i++) 
       {
           for(int k=n;k>i;k--)
           {
               System.out.print(" ");
           }
           for (int j = 0; j <= i; j++) 
           {
               System.out.print(pascal(i, j) + " ");
               
           }
           System.out.println();
       }
   }
   

   public static int pascal(int i, int j) {
       if (j == 0)
       {
           return 1;
       } 
       else if (j == i)
       {
           return 1;
       } 
       else
       {
           return pascal(i-1, j-1) + pascal(i-1, j);
       }

   }

   public static void main(String[] args)
   {
       try
       {    
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter number of rows: ");
           int row = scanner.nextInt();
           if(row<=0)
               System.out.println("For the given value triangle cannot be formed.");
           print(row);
       }
       catch(InputMismatchException ex)
       {
           System.out.println("Entered value is not Integer ");
       }
   }
}
