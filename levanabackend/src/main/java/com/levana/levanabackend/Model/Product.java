
package com.levana.levanabackend.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;


@Entity
//@Table(name="customer")
@Table
public class Product {
	
	    
	


		@Column(nullable=false)
		@NotBlank(message="Product_Name is mandatory")
		private String product_Name;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int product_id;
  	
		
		
		@Column(nullable=false,columnDefinition="text")
		@NotBlank(message="productDesc is mandatory")
		private String productDesc;
		
		
		@Column(nullable=false)
		@NotBlank(message="Quantity is mandatory")
		private String quantity;
		
		public int getProduct_id() {
			return product_id;
		}

		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}

		public String getProductDesc() {
			return productDesc;
		}

		public void setProductDesc(String productDesc) {
			this.productDesc = productDesc;
		}

		public String getQuantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public void setProduct_Name(String product_Name) {
			this.product_Name = product_Name;
		}

		@Column(nullable=false)
		@NotBlank(message="Price is mandatory")
		private String price;
		
		@ManyToOne
		@OnDelete(action=OnDeleteAction.CASCADE)
		private Category category;
		
		public String getProduct_Name() {
			return product_Name;
		}

		@Transient
		MultipartFile pimage;

		public MultipartFile getPimage() {
			return pimage;
		}

		public void setPimage(MultipartFile pimage) {
			this.pimage = pimage;
		}

		
		
	

}


