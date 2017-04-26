import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		double sum1=0.0,sum2=0.0;		
		while(true)
		{
			System.out.print("Enter a number: ");
			int i = scan.nextInt();
			if(i <= 0){
				System.out.println("Goodbye");
				break;
			}
			else{
				if(i % 2 != 0){
					sum1 += i;
					
				}
				
			}
			sum2++;
		}
		System.out.println("Sum of odd numbers entered: "+sum1);
		System.out.println("The Average is: "+sum1/sum2);
		
	}

}
