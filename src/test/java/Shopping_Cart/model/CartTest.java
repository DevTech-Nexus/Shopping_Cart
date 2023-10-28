package Shopping_Cart.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart = new Cart(1, "USD");
    @Test
    void addToCart() {
        CartItem item = new CartItem(1, "phone", 100, "USD", 1, "imgUrl");
        CartItem item2 = new CartItem(2, "apple", 100, "USD", 1, "imgUrl");
        cart.addToCart(item);
        cart.addToCart(item);
        cart.addToCart(item);
        cart.addToCart(item);

        cart.addToCart(item2);
        cart.addToCart(item2);
        cart.reduceFromCart(item2);

        System.out.println(cart.getCartItems());
    }

    @Test
    void reduceFromCart() {
    }

    @Test
    void removeFromCart() {
    }

    @Test
    void getCartItems() {
        System.out.println(cart.getCartItems());
    }
}