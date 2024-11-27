package com.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.event.internal.ReattachVisitor;

import java.util.Set;

@Entity
@Table(name = "cart")
public class Cart {
	
	
	@OneToMany(cascade = CascadeType.ALL)
	Set<Items> items;

	
	@Id
    @GeneratedValue
    @GenericGenerator(name = "increment" ,strategy = "increment")
    @Column(name = "cartId")
    int cartId;
    
    @Column(name = "total")
    int total;
    @Column(name = "name")
    String name;
    
    
    // Getters and Setters
    public int getCartId(){ 
    	return cartId; 
    }
    public void setCartId(int cartId) { 
    	this.cartId = cartId; 
    }

    public int getTotal() { 
    	return total; 
    }
    public void setTotal(int total) { 
    	this.total = total; 
    }

    public String getName() { 
    	return name; 
    }
    
    public void setName(String name) { 
    	this.name = name;
    }
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
}
