package com.heartcore.BookStore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	@Column(columnDefinition="varchar(200)")
	private String title;
	private String description;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Books [title=" + title + ", description=" + description + "]";
	}
	
	

}
