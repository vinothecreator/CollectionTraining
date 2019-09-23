package testcases;

public class StringManipulation {

	public static void main(String[] args) {
	
		String str = "The rains haves started here";
		String str1 = "The Rains have started here";
		
		
		
		/*System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s')); //1st occurence
		
		System.out.println(str.indexOf('s', 9)); //2nd occurence hard cored
		*/
		//System.out.println(str.indexOf('s', str.indexOf('s') +1));
		
		//System.out.println(str.indexOf("s"));
		
		System.out.println(str.indexOf('s', str.indexOf('s') +1));
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1 + str.indexOf('s')+1));

		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello")); // not in the string , it returns always -1
		
		
		//String comp
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		
		//substring
		
		System.out.println(str.substring(0, 12));
		

		//trim
		String s= "           Hello Java        ";
		
		System.out.println(s.trim()); // between spaces wont remove
		
		System.out.println(s.replace(" ", ""));

		String date ="20-05-1990";
		
		System.out.println(date.replace("-", "/"));
		
		
		// split
		String test ="Hello_world_test_selenium";
		String testval[]= test.split("_");
		for(String z:testval){
			System.out.println(z);
		}
		
		
		
		
		
		
	}

}
