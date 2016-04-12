package com.clubmanager.bean;

/**
 * Member entity. @author MyEclipse Persistence Tools
 */

public class Member implements java.io.Serializable {

	// Fields

	private Integer memberid;
	private Club club;
	private College college;
	private String name;
	private String password;
	private String tel;
	private String email;
	private String id;
	private String qq;
	private String wechat;

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** minimal constructor */
	public Member(Integer memberid) {
		this.memberid = memberid;
	}

	/** full constructor */
	public Member(Integer memberid, Club club, College college, String name,
			String password, String tel, String email, String id, String qq,
			String wechat) {
		this.memberid = memberid;
		this.club = club;
		this.college = college;
		this.name = name;
		this.password = password;
		this.tel = tel;
		this.email = email;
		this.id = id;
		this.qq = qq;
		this.wechat = wechat;
	}

	// Property accessors

	public Integer getMemberid() {
		return this.memberid;
	}

	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}

	public Club getClub() {
		return this.club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

}