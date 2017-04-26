import java.util.Scanner;

public class Solution {
	public static int[] copyArray(int[] a)
	{
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
	public static int findMax(int[] a)
	{
		int max =a[0];

		for (int i = 1; i < a.length; i++) {
		    if (a[i] > max) {
		      max = a[i];
		    }
		}
		int index = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == max)
			{
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int[] b = new int[a.length];
		int[] t = new int[a.length];
		t = copyArray(a);
		int x=-Integer.MAX_VALUE,y=-Integer.MAX_VALUE,z= -Integer.MAX_VALUE ,p=-Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++){ 
			if(t[findMax(t)]*10>24)
			{
				t[findMax(t)] = -1; 
			}
			else if((t[findMax(t)]*10<24) && t[findMax(t)]>=0 ){
				x = findMax(t);
			}
		}
		b = copyArray(a);
		if(x>= 0)
		{
			b[x] = -1;
			for (int i = 0; i < a.length; i++) {
				if(a[x]*10 + b[findMax(b)] >=24 )
				{
					b[findMax(b)] = -1;
				}
				else if((a[x]*10 + b[findMax(b)] < 24) && b[findMax(b)]>=0 ){
					y = findMax(b);
				}
			}
			
			
			
			
			int[] s = new int[a.length];
			s = copyArray(a);
			if(y >= 0 )
			{
				s[x] = -1; s[y]=-1;
				for (int i = 0; i < a.length; i++){ 
					if(s[findMax(s)]*10>=60)
					{
						s[findMax(s)] = -1; 
					}
					else if(s[findMax(s)]*10<60 && s[findMax(s)]>=0){
						z = findMax(s);
					}
				}
				b = copyArray(a);
				b[x] = -1; b[y] = -1 ;
				
				
				if(z >= 0)
				{
					b[z] = -1;
					for (int i = 0; i < a.length; i++) {
						if(a[z]*10 + b[findMax(b)] > 60 )
						{
							b[findMax(b)] = -1;
						}
						else if((a[z]*10 + b[findMax(b)] < 60) && b[findMax(b)]>=0 ){
							p = findMax(b);
						}
					}
					System.out.println(a[x]+""+a[y]+":"+a[z]+""+a[p]);
					
				} 
				else{
					System.out.println("Not Possible zz");
				}
				
	
			}
			else
			{
				System.out.println("Not Possible yy");
			}

			
		}
		else
		{
			System.out.println("Not Possible xx");
		}

		
	}

}