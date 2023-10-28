package Shopping_Cart.model;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * CartItem model.
 * Holds cart item information.
 */
@Data
@AllArgsConstructor
public class CartItem {

    private int id;

    private String productName;

    private double price;

    private String currency;

    private int quantity;

    private String imgUrl;


}
