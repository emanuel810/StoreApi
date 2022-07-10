package com.example.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cart_Shopping")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cart_id;
	
	@NotNull(message = "fill in this field")
	private Long client_id;
	
	@NotNull(message = "fill in this field")
	private Long product_id;

	public Long getCart_id() {
		return cart_id;
	}

	public Long getClient_id() {
		return client_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	
	
}
