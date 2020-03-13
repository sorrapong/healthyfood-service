package com.test.service.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "foods")

public class Food {
	
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	 	private Long id;
	    private String name;
	    private byte[] image;
	    private String links;

	    public Food() {
	    	
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public byte[] getImage() {
			return image;
		}

		public void setImage(byte[] image) {
			this.image = image;
		}

		public String getLinks() {
			return links;
		}

		public void setLinks(String links) {
			this.links = links;
		}
		
}
