package com.pteixeira.composicao.order.entities;

import java.math.BigDecimal;

public class OrderItem {

    private Integer quantity;
    private BigDecimal price;
    private Product product;

    public OrderItem() {

    }

    public OrderItem(Integer quantity, BigDecimal price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal subTotal() {
        return this.price.multiply(BigDecimal.valueOf(this.quantity));
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $" + getProduct().getPrice()
                + ", Quantity: " + this.quantity
                + ", Subtotal: $" + subTotal();
    }
}
