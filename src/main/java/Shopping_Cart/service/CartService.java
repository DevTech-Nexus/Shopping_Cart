package Shopping_Cart.service;

import Shopping_Cart.model.Cart;
import Shopping_Cart.model.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

/**
 * Cart service.
 * Maintains instance information using HttpSession
 */
@Service
public class CartService {

    @Autowired
    private HttpSession session;
    private Cart cart;

    public void checkSessionUp() {
        if(session.getAttribute("cart") == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
    }

    public Set<CartItem> getCartItems() {
        checkSessionUp();
        return session.getAttribute("cart") == null ? null : ((Cart) session.getAttribute("cart")).getCartItems();
    }


    public void addToCart(CartItem item) {
        checkSessionUp();
        Cart sessionCart = (Cart) session.getAttribute("cart");
        sessionCart.addToCart(item);
        session.setAttribute("cart", sessionCart);
    }

    public void decreaseFromCart(CartItem item) {
        checkSessionUp();
        Cart sessionCart = (Cart) session.getAttribute("cart");
        sessionCart.reduceFromCart(item);
        session.setAttribute("cart", sessionCart);
    }

    public double getTotal() {
        checkSessionUp();
        return session.getAttribute("cart") == null ? 0 : ((Cart) session.getAttribute("cart")).getTotalPrice();
    }


    public String getCurrency() {
        checkSessionUp();
        return session.getAttribute("cart") == null ? null : ((Cart) session.getAttribute("cart")).getCurrency();
    }

    public String getSession() {
        return session.getId();
    }
}
