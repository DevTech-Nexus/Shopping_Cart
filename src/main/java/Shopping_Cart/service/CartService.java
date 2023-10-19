package Shopping_Cart.service;

import Shopping_Cart.model.Cart;
import Shopping_Cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart getCart(int id) {
        return cartRepository.findById(id).orElse(null);
    }

    public Cart updateCart(int id, Cart cart) {
        Cart existingCart = getCart(id);
        if (existingCart == null) {
          return  null;
        }

        existingCart.setItems(cart.getItems());
        return cartRepository.save(existingCart);
    }

    public void deleteCart(int id) {
        cartRepository.deleteById(id);
    }


}
