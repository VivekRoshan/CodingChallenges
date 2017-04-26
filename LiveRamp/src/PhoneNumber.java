import java.util.Scanner;

public class PhoneNumber {
	private static String printPhone(String phoneNum) {
		StringBuilder sb = new StringBuilder(15); 
		StringBuilder temp = new StringBuilder(phoneNum.toString()); 
		while (temp.length() < 10) 
		temp.insert(0, "0"); 
		char[] chars = temp.toString().toCharArray(); 
		sb.append("("); 
		for (int i = 0; i < chars.length; i++) 
		{ 
		if (i == 3) 
		sb.append(")"); 
		sb.append(chars[i]); 
		} 
		return sb.toString(); 
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 10 digit number without any hyphens or spaces");
		String phoneNumber = scan.next();
		scan.close();
		boolean flag = true; 
		if(phoneNumber.length() != 10){
			flag = false;
		}
		for (int i = 0; i < phoneNumber.length(); i++) {
			if(!Character.isDigit(phoneNumber.charAt(i)))
			{
				flag = false;
			}
		}
		if(flag==false)
			System.out.println("There is some error, Enter a 10 digit number without any hyphens or spaces");
		else
			System.out.println(printPhone(phoneNumber));
	}

}
