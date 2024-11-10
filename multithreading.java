import java.lang.*;
import java.util.Scanner;

public class Main { 
	// turned to be true when user entered
	// something on terminal
	public static boolean stop = false;

	// Parent thread
	public static void main(String args[])
	{ 
		// object of class which do writing task.
		WriteOnFile newFile = new WriteOnFile(
			"Anjali loves GeeksforGeeks.", "File.txt");
		// execute it on different thread...child
		// thread...it will execute run method of
		// WriteOnFile class
		newFile.start();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Something : ");
		// waits for user input
		sc.nextLine();
		// turned on after entering input by user and it
		// tells another thread to stop writing
		Main.stop = true;

		return;
	}
}
