import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		String myName = "Stephen"; //my name in a String variable
		Scanner sc = new Scanner(System.in); //Scanners read input from user
		System.out.println("My name is "+myName+". What is yours?");
		String yourName = sc.nextLine(); //read name String here
		System.out.println("Hello, "+yourName+". How old are you?");
		int age = sc.nextInt(); //read an int here (age)
		System.out.println("You are "+age+" years old.");	
	
		// Below this is beyond what we are learning today, but feel free to check it out!
		if(age < 21) {
			System.out.println("You can legally drink in the US.");
		}
		else {
			System.out.println("You can't legally drink in the US.");
		}
		
	}

}
