
import java.util.HashMap;
import java.util.Scanner;

public class firstrepeating {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(s);
		int min=Integer.MAX_VALUE;
		HashMap<Character, Integer> h = new HashMap<Character,Integer>();
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(h.containsKey(s.charAt(i))){
				int ind = (int) h.get(c);
				min=ind;
				break;
				/*if(min > ind){
					min = ind;
				}*/
			}
			else{
				h.put(c, i);
			}
		}
		System.out.println(s.charAt(min));
	}
}