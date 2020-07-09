package it.univpm.oop.project.model;

import java.util.ArrayList;
import java.util.List;

public class Post {
	private String id;
	private List<Comment> data = new ArrayList<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Comment> getData() {
		return data;
	}
	public void setData(List<Comment> data) {
		this.data = data;
	}
	

	
}
