//java package(Manisha)
package com.maren.myproject.model;
//class profile(Manisha)
    
public class Profile
 {
	//private access specifier so that it can be only accessed inside the same class(Manisha)
	private String userid;

	private String name;

	private String email;

	private long mobile;
      	
	
	//deafault contsructor(Manisha)
public Profile() {

	}
//copy constructor(Manisha)
	public Profile(String userid, String name, String email, long mobile) {
//super keyword is the reference variable that is used to refer parent class objects(s)
		super();
//this keyword works as a refernce for the current object(Manisha)
	this.userid = userid;

	this.name = name;
	
	this.email = email;

		this.mobile = mobile;
	
}
	//returns the value of variable userid(Manisha)
	public String getUserid()
 {
		return userid;

	}
	//sets the value of userid(Manisha)
	public void setUserid(String userid) {

		this.userid = userid;
	
	}
	//returns the value of variable name(Manisha)
	public String getName() {
	
	return name;
	
	}
   //sets the value of name(Manisha)
	public void setName(String name) {

		this.name = name;
	
}
    //returns the value of variable email(Manisha)
	public String getEmail() {

	return email;

	}
    //sets the value of email(Manisha)
	public void setEmail(String email) {

		this.email = email;
	}
	//return the value of variable mobile(Manisha)
	public long getMobile() {
		return mobile;
	}
	//sets the value of variable mobile(Manisha)
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}

