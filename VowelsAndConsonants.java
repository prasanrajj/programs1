package programs.programs;

import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	
		//loop every character 
//		check is it a vowel++
//		else consonant++
		System.out.println("enter any string to find out the number of vowels and consonents");
		String s = sc.nextLine();
		int vowel = 0;
		int consonant = 0;
		
		for(int i =0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))==1) {
				vowel++;
			}
			else {
				consonant++;
			}
		}
		
		System.out.println("the number of vowels = " + vowel);
		System.out.println("the number of consonants = " + consonant);
	}
	
	static int isVowel(char c) {
		if(c == 'a' || c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U'){
			return 1;
		}
		return 0;
		
	}
	
	
}
