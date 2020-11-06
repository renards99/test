
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(final String[] args) throws Exception {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Book code: ");
        final String code = in.readLine();
        System.out.print("Enter Book title: ");
        final String title = in.readLine();
        System.out.print("Enter Book price: ");
        double price = Double.valueOf(in.readLine());
        System.out.print("Enter Book quantity: ");
        int quantity = Integer.valueOf(in.readLine());
        System.out.printf("1. TC = 1 - test getTitle()\n2. TC = 2 - test setPrice()\n3. TC = 3 - test setQuantity()\n4. TC = 4 - test toString()\n", new Object[0]);
        System.out.print("Enter TC: ");
        final int tc = Integer.parseInt(in.readLine());
        final Book b = new Book(code, title, price, quantity);
        if (tc == 2) {
            System.out.print("Enter new price: ");
            price = Double.valueOf(in.readLine());
            b.setPrice(price);
        }
        if (tc == 3) {
            System.out.print("Enter new quantity: ");
            quantity = Integer.valueOf(in.readLine());
            b.setQuantity(quantity);
        }
        System.out.println("OUTPUT:");
        switch (tc) {
            case 1: {
                System.out.println(b.getTitle());
                break;
            }
            case 2: {
                System.out.println(b.getPrice());
                break;
            }
            case 3: {
                System.out.println(b.getQuantity());
                break;
            }
            case 4: {
                System.out.println(b);
                break;
            }
        }
    }
}
