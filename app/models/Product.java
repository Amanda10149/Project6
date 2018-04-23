package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

public class Product extends Model {
    
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String Description;

    @Constraints.Required
    private int stock;

    @Constraints.Required
    private double price;

    public Product() {
        
    }

    public Product (Long id, String name, String Description, int stock, double price) {
        this.id = id;
        this.name = name;
        this.Description = Description;
        this.stock = stock;
        this.price = price;


    }
    public static final Finder<Long, Product> find = new Finder<>(Product.class);

    public static final List<Product> findAll() {
        return Product.find.all();
    }
    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}