package Shopping_Cart.model;


import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Iterator;
import java.util.Set;


/**
 * Cart model.
 * Holds cart items.
 * One cart created per session.
 * Cart is NOT persisted in the database.
 */
@Data
public class Cart {

    //using a Set. Sets do not allow duplicate entries. This will come in handy when we add items to the cart.
    private Set<CartItem> cartItems = new java.util.HashSet<>();
    private int user;
    private double totalPrice = 0;
    private String currency;

    public Cart(int user, String currency) {
        this.user = user;
        this.currency = currency;
    }

    public void addToCart(CartItem cartItem) {
        if (cartItems.contains(cartItem)) {
            try {
                CartItem item = cartItems.stream().filter(i -> i.getId() == cartItem.getId()).findFirst().get();
                cartItems.remove(item);
                item.setQuantity(item.getQuantity() + 1);
                cartItems.add(item);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            cartItems.add(cartItem);
        }
        totalPrice = totalPrice + cartItem.getPrice();

    }

    public void reduceFromCart(CartItem cartItem) {
        if (cartItems.contains(cartItem)) {
            try {
                CartItem item = cartItems.stream().filter(i -> i.getId() == cartItem.getId()).findFirst().get();
                cartItems.remove(item);
                item.setQuantity(item.getQuantity() - 1);
                cartItems.add(item);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            cartItems.add(cartItem);
        }
        totalPrice = totalPrice - cartItem.getPrice();
    }



}
