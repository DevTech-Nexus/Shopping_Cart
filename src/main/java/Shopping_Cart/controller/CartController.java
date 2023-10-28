package Shopping_Cart.controller;

import Shopping_Cart.model.Cart;
import Shopping_Cart.model.CartItem;
import Shopping_Cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/")
    public Set<CartItem> getCart() {
        return cartService.getCartItems();
    }

    @PostMapping("/")
    public void addToCart(@RequestBody CartItem item) {
        cartService.addToCart(item);
    }

    @PutMapping("/")
    public void decreaseFromCart(@RequestBody CartItem item) {
        cartService.decreaseFromCart(item);
    }

    @GetMapping("/total")
    public double getTotal() {
        return cartService.getTotal();
    }

    @GetMapping("/currency")
    public String getCurrency() {
        return cartService.getCurrency();
    }
}
