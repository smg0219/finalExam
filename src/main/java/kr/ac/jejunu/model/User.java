package kr.ac.jejunu.model;

public class User {
	
	private Integer id;
	private String name;
	private String password;
	private String email;
	
	/*
	 * authority
	 * 
	 * Personal (일반 회원)
	 * Company (판매자 회원)
	 */
	private String authority;
	/*
	 * gender
	 * 
	 * male (남성)
	 * female (여성)
	 */
	private String gender;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
