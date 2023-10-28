package Shopping_Cart.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;
    @Test
    void addToCart() {
        cart.addToCart(new CartItem(1, "phone", 100, "USD", 1, "imgUrl"));
    }

    @Test
    void reduceFromCart() {
    }

    @Test
    void removeFromCart() {
    }

    @Test
    void getCartItems() {
    }
}