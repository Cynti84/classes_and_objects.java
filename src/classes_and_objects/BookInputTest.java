package classes_and_objects;
import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the title of the book");
		book.title = sc.nextLine();
		System.out.println("Please enter the author name");
		book.author = sc.nextLine();
		System.out.println("Please enter the number of pages");
		book.numberOfPages = scan.nextInt();
		
		System.out.println("The book title is: " +book.title);
		System.out.println("The book author is: " +book.author);
		System.out.println("The book has " +book.numberOfPages+ " pages");
	}

}
