package programs.programs.DSA;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		String s = "progammring";
		
		outer :
		for(int i =0; i < s.length(); i++) {
			for(int j = i+1; j <s.length();j++) {
				char one = s.charAt(i);
				char two = s.charAt(j);
				
				if(one == two) {
					System.out.println(one);
					break outer;
				}
			}
		}
	}

}
