package com.gitHubProjectTesting1.model;
/*
 * Model class GitHubMember
 * */
public class GitHubMember {
	private Long id;
	private String mailId;
	private String name;
	private String securityQuestion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private long phoneNumber;
}
