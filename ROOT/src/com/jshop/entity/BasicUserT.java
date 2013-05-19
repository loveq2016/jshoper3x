package com.jshop.entity;

// Generated 2013-5-19 18:50:11 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BasicUserT generated by hbm2java
 */
@Entity
@Table(name = "basic_user_t", catalog = "jshoper3")
public class BasicUserT implements java.io.Serializable {

	private String id;
	private String username;
	private String password;
	private String userstate;
	private Date registertime;
	private String email;
	private String groupid;
	private String department;
	private String teamid;
	private String rank;
	private String uid;
	private Date createtime;
	private String ip;
	private String istemp;
	private Date updatetime;

	public BasicUserT() {
	}

	public BasicUserT(String id, String username, String password,
			String userstate, Date registertime, String email, String rank,
			String uid, Date createtime, String ip, String istemp,
			Date updatetime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.userstate = userstate;
		this.registertime = registertime;
		this.email = email;
		this.rank = rank;
		this.uid = uid;
		this.createtime = createtime;
		this.ip = ip;
		this.istemp = istemp;
		this.updatetime = updatetime;
	}

	public BasicUserT(String id, String username, String password,
			String userstate, Date registertime, String email, String groupid,
			String department, String teamid, String rank, String uid,
			Date createtime, String ip, String istemp, Date updatetime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.userstate = userstate;
		this.registertime = registertime;
		this.email = email;
		this.groupid = groupid;
		this.department = department;
		this.teamid = teamid;
		this.rank = rank;
		this.uid = uid;
		this.createtime = createtime;
		this.ip = ip;
		this.istemp = istemp;
		this.updatetime = updatetime;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "USERNAME", nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", nullable = false, length = 128)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USERSTATE", nullable = false, length = 1)
	public String getUserstate() {
		return this.userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REGISTERTIME", nullable = false, length = 0)
	public Date getRegistertime() {
		return this.registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	@Column(name = "EMAIL", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "GROUPID", length = 20)
	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	@Column(name = "DEPARTMENT", length = 20)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "TEAMID", length = 20)
	public String getTeamid() {
		return this.teamid;
	}

	public void setTeamid(String teamid) {
		this.teamid = teamid;
	}

	@Column(name = "RANK", nullable = false, length = 20)
	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Column(name = "UID", nullable = false, length = 32)
	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "IP", nullable = false, length = 45)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "ISTEMP", nullable = false, length = 1)
	public String getIstemp() {
		return this.istemp;
	}

	public void setIstemp(String istemp) {
		this.istemp = istemp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
