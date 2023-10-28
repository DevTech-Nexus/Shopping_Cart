package Shopping_Cart.model;


import lombok.Data;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Set;


/**
 * Cart model.
 * Holds cart items.
 * One cart created per session.
 * Cart is NOT persisted in the database.
 */
@Data
public class Cart {

    private int id;

    //using a Set. Sets do not allow duplicate entries. This will come in handy when we add items to the cart.
    private Set<CartItem> cartItems;
    private User user;
    private double totalPrice;
    private String currency;
    private String status;

}
