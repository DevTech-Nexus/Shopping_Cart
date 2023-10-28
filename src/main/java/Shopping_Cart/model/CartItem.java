package Shopping_Cart.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class CartItem {

    private int id;

    private String productName;

    private String description;

    private String category;

    private String brand;

    private double price;

    private String currency;

    private float weight;

    private String dimensions;

    private int stockQuantity;

    private String imgUrl;

}
