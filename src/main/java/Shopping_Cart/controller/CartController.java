package Shopping_Cart.controller;

import Shopping_Cart.model.Cart;
import Shopping_Cart.service.CartService;
import com.sun.org.apache.xpath.internal.operations.Variable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping ("/carts")
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.createCart(cart);
    }

    @GetMapping("/carts/{id}")
    public Cart getCart(@PathVariable int id) {
        return cartService.getCart(id);
    }

    @PutMapping("/carts/{id}")
    public Cart updateCart(@PathVariable int id, @RequestBody Cart cart) {
        return cartService.updateCart(id, cart);
    }

    @DeleteMapping("/carts/{id}")
    public void deleteCart(@PathVariable int id) {
        cartService.deleteCart(id);
    }
}
