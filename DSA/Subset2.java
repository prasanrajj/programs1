package programs.programs.DSA;

public class Subset2 {
	public static void main(String[] args) {
		String s = "abcd";
		
		for(int i =0; i< s.length();i++) {
			for(int j = i; j < s.length(); j++) {
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
