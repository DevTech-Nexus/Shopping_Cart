package Shopping_Cart.service;

import Shopping_Cart.model.Cart;
import Shopping_Cart.model.CartItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Cart service.
 * Maintains instance information using HttpSession
 */
@Service
public class CartService {

    private Cart cart;

    public Cart initializeCart(int user, String currency) {
        cart = new Cart(user, currency);
        return cart;
    }

    public Set<CartItem> getCartItems() {
        return cart.getCartItems();
    }

    public void addToCart(CartItem item) {
        cart.addToCart(item);
    }

    public void decreaseFromCart(CartItem item) {
        cart.reduceFromCart(item);
    }

    public double getTotal() {
        return cart.getTotalPrice();
    }


    public String getCurrency() {
        return cart.getCurrency();
    }
}
