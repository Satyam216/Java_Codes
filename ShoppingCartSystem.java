import java.util.ArrayList;
import java.util.List;

// Custom Exception for Item Not Found
class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

// Shopping Cart Class
class ShoppingCart {
    private List<String> cart;

    // Constructor
    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String item) {
        cart.add(item);
        System.out.println(item + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String item) throws ItemNotFoundException {
        if (!cart.contains(item)) {
            throw new ItemNotFoundException("Error: " + item + " not found in the cart.");
        }
        cart.remove(item);
        System.out.println(item + " removed from the cart.");
    }

    // Method to display cart items
    public void displayCart() {
        System.out.println("Shopping Cart: " + cart);
    }
}

// Main Class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        try {
            cart.addItem("Laptop");
            cart.addItem("Phone");
            cart.displayCart();
            
            cart.removeItem("Tablet"); // This will throw an exception
            
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            System.out.println("Finalizing shopping cart operations.");
        }
    }
}
