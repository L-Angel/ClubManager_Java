package com.clubmanager.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Club entity. @author MyEclipse Persistence Tools
 */

public class Club implements java.io.Serializable {

	// Fields

	private Integer clubid;
	private Part part;
	private String name;
	private String charger;
	private String chargeteacher;
	private Timestamp regtime;
	private Integer status;
	private Set members = new HashSet(0);

	// Constructors

	/** default constructor */
	public Club() {
	}

	/** minimal constructor */
	public Club(Integer clubid) {
		this.clubid = clubid;
	}

	/** full constructor */
	public Club(Integer clubid, Part part, String name, String charger,
			String chargeteacher, Timestamp regtime, Integer status, Set members) {
		this.clubid = clubid;
		this.part = part;
		this.name = name;
		this.charger = charger;
		this.chargeteacher = chargeteacher;
		this.regtime = regtime;
		this.status = status;
		this.members = members;
	}

	// Property accessors

	public Integer getClubid() {
		return this.clubid;
	}

	public void setClubid(Integer clubid) {
		this.clubid = clubid;
	}

	public Part getPart() {
		return this.part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharger() {
		return this.charger;
	}

	public void setCharger(String charger) {
		this.charger = charger;
	}

	public String getChargeteacher() {
		return this.chargeteacher;
	}

	public void setChargeteacher(String chargeteacher) {
		this.chargeteacher = chargeteacher;
	}

	public Timestamp getRegtime() {
		return this.regtime;
	}

	public void setRegtime(Timestamp regtime) {
		this.regtime = regtime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set getMembers() {
		return this.members;
	}

	public void setMembers(Set members) {
		this.members = members;
	}

}