import java.util.Scanner;

public class istriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sides[][] = new int[n][3];
		for(int i=0; i<n; i++){
			sides[i][0] = sc.nextInt();
			sides[i][1] = sc.nextInt();
			sides[i][2] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			boolean valid = true;
			if(sides[i][0]+sides[i][1]<=sides[i][2])valid = false;
			if(sides[i][0]+sides[i][2]<=sides[i][1])valid = false;
			if(sides[i][1]+sides[i][2]<=sides[i][0])valid = false;
			if(valid){
				if(sides[i][0]==sides[i][1] && sides[i][1]==sides[i][2]){
					System.out.println("Equilateral");
				}else if(sides[i][0]==sides[i][1] || sides[i][1]==sides[i][2] || sides[i][2] == sides[i][0]){
					System.out.println("Isosceles");
				}else{
					System.out.println("None of these");
				}
			}
			else{
				System.out.println("None of these");
			}
		}
	}
}
