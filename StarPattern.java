package programs;

public class StarPattern {
	public static void main(String[] args) {
		for(int i = 5; i > 0 ;i--) {
			int t = i;
			for(int j =5; t!=0 ; j--) {
				t--;
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
