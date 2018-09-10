import java.util.Scanner;

public class Reflections {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter book Name: ");
        String name = s.nextLine();
        Book book = BookMap.getBook(name);
        if (book == null) {
            System.out.println("No class Available for the provided name");
        } else {
            System.out.println("author of the book " + name + " is " + book.author());
            System.out.println("price of the book " + name + " is " + book.price());
        }
    }
}
