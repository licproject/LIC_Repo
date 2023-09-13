// Spring Boot Entity/Model class

package com.lic.package.model;

import java.util.List;

public class Member {
	
	private Long memberId;
	private String firstName;
	private String lastName;
	private int age;
	private List<String> interests;
	
	public Long getMemberId() {
		return memberId;
	}
	
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<String> getInterests() {
		return interests;
	}
	
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	
}