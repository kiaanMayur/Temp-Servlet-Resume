package com.cg.servelet.resume;

public class Resume {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String highestQual;
	private String dob;
	private String hobbies;
	private String address;
	private String[] skills;
	private String email;
	private String webiste;
	public String contact;
	private String summary;
	
	
	public Resume() {
		
	}
	
	public Resume(String firstName, String lastName, String gender, String highestQual, String dob, String hobbies,
			String address, String[] skills, String email, String webiste, String contact, String summary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.highestQual = highestQual;
		this.dob = dob;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.email = email;
		this.webiste = webiste;
		this.contact = contact;
		this.summary = summary;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getHighestQual() {
		return highestQual;
	}
	public String getDob() {
		return dob;
	}
	public String getHobbies() {
		return hobbies;
	}
	public String getAddress() {
		return address;
	}
	public String[] getSkills() {
		return skills;
	}
	public String getEmail() {
		return email;
	}
	public String getWebiste() {
		return webiste;
	}
	public String getSummary() {
		return summary;
	}
	
	
	
}
