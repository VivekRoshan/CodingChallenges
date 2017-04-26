import java.util.Scanner;

public class oddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0,value,count =0;
		double average;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter: ");
		value = scan.nextInt();
		while(value > 0)
		{
			count++;
			if(value%2 != 0)
				sum += value;
				System.out.println("sum so far: "+sum);
				System.out.println("Enter: ");
				value = scan.nextInt();
			
		}	System.out.println();
			if(count > 0)
			{
				average = (double)sum/count;
				System.out.println("Good bye");
				System.out.println("sum:"+sum);
				System.out.println("average:" +average);
			}
		}

	}

