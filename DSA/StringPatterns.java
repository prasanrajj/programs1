package programs.programs.DSA;

public class StringPatterns {
		public static void main(String[] args) {
			String s = "ABCD";
//
//			for (int i = 0; i < s.length(); i++) {        // start
//			    for (int j = i; j < s.length(); j++) {   // end
//			        System.out.println(s.substring(i, j + 1));
//			    }
//			    System.out.println();
//			}
//

			for(int i =0; i<s.length(); i++) {
				for(int j = i; j < s.length(); j++) {
					for(int k = i; k<=j;k++) {
						System.out.print(s.charAt(k));
					}
					System.out.println();
				}
				System.out.println();
			}
		}
}
