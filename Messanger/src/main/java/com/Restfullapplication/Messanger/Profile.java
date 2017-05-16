package com.Restfullapplication.Messanger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
long id;
String profileName;
String firstName;
String lastName;
public void profile(){
	
}
public void profile(long id, String profileName, String firstName, String lastName){
	this.firstName=firstName;
	this.profileName=profileName;
	this.lastName=lastName;
	this.id=id;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProfileName() {
	return profileName;
}
public void setProfileName(String profileName) {
	this.profileName = profileName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
