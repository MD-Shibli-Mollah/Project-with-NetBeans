
package inheritencemy_18;

/**
 *
 * @author mdtas
 */
public class InheritenceMy_18 {

    public static void main(String[] args) {
        Book book = new Book();
        Item item = new Item();
        System.out.println(item.price + ", " + book.getPrice() + "  Here the 1st");
        System.out.println(book.pricem + ", " + book.getPrice() + "  Here is the 2nd");     
    }
}
