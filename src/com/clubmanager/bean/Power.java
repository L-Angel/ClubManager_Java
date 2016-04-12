package com.clubmanager.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Power entity. @author MyEclipse Persistence Tools
 */

public class Power implements java.io.Serializable {

	// Fields

	private Integer powerid;
	private String powername;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Power() {
	}

	/** minimal constructor */
	public Power(Integer powerid) {
		this.powerid = powerid;
	}

	/** full constructor */
	public Power(Integer powerid, String powername, Set users) {
		this.powerid = powerid;
		this.powername = powername;
		this.users = users;
	}

	// Property accessors

	public Integer getPowerid() {
		return this.powerid;
	}

	public void setPowerid(Integer powerid) {
		this.powerid = powerid;
	}

	public String getPowername() {
		return this.powername;
	}

	public void setPowername(String powername) {
		this.powername = powername;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}