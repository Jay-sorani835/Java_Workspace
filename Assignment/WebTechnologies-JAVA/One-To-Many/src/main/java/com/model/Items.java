package com.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Items {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    int id;
    
    @Column(name = "itemId")
    String itemId;
    @Column(name ="itemTotal")
    int itemTotal;
    @Column(name = "quantity")
    int quantity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="cartId")
    Cart cart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public int getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
