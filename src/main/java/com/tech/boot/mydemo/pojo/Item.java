package com.tech.boot.mydemo.pojo;

public class Item {
private int id;
private String name;
private String describe;

/*public Item() {
//	
	// TODO Auto-generated constructor stub
}*/

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescribe() {
	return describe;
}
public void setDescribe(String describe) {
	this.describe = describe;
}
@Override
public String toString() {
	return "Item [id=" + id + ", name=" + name + ", describe=" + describe + "]";
}
public Item(int id, String name, String describe) {
	super();
	this.id = id;
	this.name = name;
	this.describe = describe;
}

}
