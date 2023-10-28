package Shopping_Cart.controller;

import Shopping_Cart.model.Cart;
import Shopping_Cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired

    private CartService cartService;

}
