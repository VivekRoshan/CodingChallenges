import java.math.BigInteger;
import java.util.Scanner;

/* Program to print pascal triangle for 10 rows in java */

public class Pascal {

     

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
         
        for(int i =0;i<rows;i++) {

            BigInteger number = new BigInteger("1");

            System.out.format("%"+(rows-i)*2+"s","");

            for(int j=0;j<=i;j++) {

//                 System.out.format("%"+rows+"d",number);
                 System.out.format("%30d",number);
                 //number = number * (i - j) / (j + 1);
                 BigInteger temp = number.multiply(new BigInteger(i+"").subtract(new BigInteger(j+"")));
                 number = temp.divide(new BigInteger(j+"").add(new BigInteger("1")));

            }

            System.out.println();

        }

         

    }

}

