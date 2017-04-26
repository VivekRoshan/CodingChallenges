
public class puuji {

	public static void main(String[] args) {
		int count = 0;
		String str = "I love programming.";
		char[] words = str.toCharArray();
	    for( int i = 0; i < words.length; i++ )
	        if( (str.charAt(i)+"").matches("(\\.)*") )
	            count++;
	    
	    System.out.println(count);

	}

}
