package com.clubmanager.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Part entity. @author MyEclipse Persistence Tools
 */

public class Part implements java.io.Serializable {

	// Fields

	private Integer partid;
	private String partname;
	private Set clubs = new HashSet(0);
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Part() {
	}

	/** minimal constructor */
	public Part(Integer partid) {
		this.partid = partid;
	}

	/** full constructor */
	public Part(Integer partid, String partname, Set clubs, Set users) {
		this.partid = partid;
		this.partname = partname;
		this.clubs = clubs;
		this.users = users;
	}

	// Property accessors

	public Integer getPartid() {
		return this.partid;
	}

	public void setPartid(Integer partid) {
		this.partid = partid;
	}

	public String getPartname() {
		return this.partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	public Set getClubs() {
		return this.clubs;
	}

	public void setClubs(Set clubs) {
		this.clubs = clubs;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}