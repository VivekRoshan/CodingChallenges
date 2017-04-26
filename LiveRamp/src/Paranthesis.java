
public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		System.out.println((int)'{');
		System.out.println((int)'}');
		System.out.println((int)'[');
		System.out.println((int)']');
		System.out.println((int)'(');
		System.out.println((int)')');

		String exp = "{aa(ss[dd(ff)hh]jj)kk}";
		String temp = "";
		for (int i = 0; i < exp.length(); i++) {
			if((exp.charAt(i)+"").matches("[\\[{()}\\]]") )
			{
				temp+= exp.charAt(i);
			}
		}
		System.out.println(temp);
		
		
		char[] arr = temp.toCharArray();
		
		Boolean[] flags = new Boolean[temp.length()];
		for (int i = 0; i < flags.length; i++) {
			flags[i] = false;
		}
		
		for (int i = 0; i < flags.length/2; i++) {
			if((int)arr[i] == ((int)arr[temp.length()-1-i])-1 || (int)arr[i] == ((int)arr[temp.length()-1-i])-2 )
			{
				flags[i] = true;
				flags[temp.length()-1-i] = true;
			}
			else
			{
				flags[i] = false;
				flags[temp.length()-1-i] = false;
				
			}
		}
		/*for (int i = 0; i < flags.length; i++) {
			System.out.println(flags[i]);
		}*/
		int counter = 0; 
		for (int i = 0; i < flags.length; i++) {
			if(flags[i] == true)
			{
				counter++;
			}
		}
		if(counter == temp.length())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		
	}

}
