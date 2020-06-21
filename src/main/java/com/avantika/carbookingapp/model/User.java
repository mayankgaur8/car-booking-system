package com.avantika.carbookingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
@Id
@GeneratedValue
private int id;
@Column(name="USER_NAME",length=100,unique=true,nullable=false)
private String user_name;

@Column(name="EMAIL",length=100,unique=true,nullable=false)
private String email;
@Column(name="PHONE",length=100,unique=true,nullable=false)
private String phone;

@Column(name="PICKUPLOCATION",length=100,unique=true,nullable=false)
private String pickupLocation;

@Column(name="DESTINATION",length=100,unique=true,nullable=false)
private String destination;

@Column(name="PICKUPDATE",length=100,unique=true,nullable=false)
private String pickupDate;
@Column(name="HOURS",length=100,unique=true,nullable=false)
private String hours;
@Column(name="MIN",length=100,unique=true,nullable=false)
private String min;
@Column(name="AMPM",length=100,unique=true,nullable=false)
private String ampm;

public User() {}

public User(int id,String user_name,String email,String phone,String pickupLocation,String destination,String pickupDate,String hours,String min,String ampm)
{
    this.id=id;
    this.user_name=user_name;
    this.email=email;
    this.phone=phone;
    this.pickupLocation=pickupLocation;
    this.destination=destination;
    this.pickupDate=pickupDate;
    this.hours=hours;
    this.min=min;
    this.ampm=ampm;
    
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUserName() {
	return user_name;
}

public void setName(String user_name) {
	this.user_name = user_name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getPickupLocation() {
	return pickupLocation;
}

public void setPickupLocation(String pickupLocation) {
	this.pickupLocation = pickupLocation;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getPickupDate() {
	return pickupDate;
}

public void setPickupDate(String pickupDate) {
	this.pickupDate = pickupDate;
}

public String getHour() {
	return hours;
}

public void setHour(String hours) {
	this.hours = hours;
}

public String getMin() {
	return min;
}

public void setMin(String min) {
	this.min = min;
}

public String getAmpm() {
	return ampm;
}

public void setAmpm(String ampm) {
	this.ampm = ampm;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + user_name + ", email=" + email + ", phone=" + phone + ", pickupLocation="
			+ pickupLocation + ", destination=" + destination + ", pickupDate=" + pickupDate + ", hours=" + hours
			+ ", min=" + min + ", ampm=" + ampm + "]";
}



}
