package JavaQuiz;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String name = sc.nextLine();
	duplicate(name);
	
	}
	static void duplicate(String name) {
		int counter = 0;
		char[] c = name.toCharArray();
		System.out.println("Duplicate character are: ");
		
		for(int i=0;i<c.length;i++,counter=0) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					counter++;
					c[j]='0';
					
					
				}
			}
			if(counter>=1&&c[i]!='0') {
				System.out.println(c[i]);
			}
			
		}
		
		
	}

}
