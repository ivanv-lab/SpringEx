package com.dbcrud.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private BigDecimal price;
    @ManyToOne(targetEntity = Order.class,fetch = FetchType.EAGER)
    @JoinColumn(name="order_id")
    private Order order;
    @ManyToOne(targetEntity = Product.class,fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderItem(int number, BigDecimal price, Order order, Product product) {
        this.number = number;
        this.price = price;
        this.order = order;
        this.product = product;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

