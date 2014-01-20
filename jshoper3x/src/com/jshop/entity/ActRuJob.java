package com.jshop.entity;

// Generated 2014-1-20 20:32:27 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActRuJob generated by hbm2java
 */
@Entity
@Table(name = "act_ru_job", catalog = "jshoper3")
public class ActRuJob implements java.io.Serializable {

	private String id;
	private ActGeBytearray actGeBytearray;
	private Integer rev;
	private String type;
	private Date lockExpTime;
	private String lockOwner;
	private Boolean exclusive;
	private String executionId;
	private String processInstanceId;
	private String procDefId;
	private Integer retries;
	private String exceptionMsg;
	private Date duedate;
	private String repeat;
	private String handlerType;
	private String handlerCfg;

	public ActRuJob() {
	}

	public ActRuJob(String id, String type) {
		this.id = id;
		this.type = type;
	}

	public ActRuJob(String id, ActGeBytearray actGeBytearray, Integer rev,
			String type, Date lockExpTime, String lockOwner, Boolean exclusive,
			String executionId, String processInstanceId, String procDefId,
			Integer retries, String exceptionMsg, Date duedate, String repeat,
			String handlerType, String handlerCfg) {
		this.id = id;
		this.actGeBytearray = actGeBytearray;
		this.rev = rev;
		this.type = type;
		this.lockExpTime = lockExpTime;
		this.lockOwner = lockOwner;
		this.exclusive = exclusive;
		this.executionId = executionId;
		this.processInstanceId = processInstanceId;
		this.procDefId = procDefId;
		this.retries = retries;
		this.exceptionMsg = exceptionMsg;
		this.duedate = duedate;
		this.repeat = repeat;
		this.handlerType = handlerType;
		this.handlerCfg = handlerCfg;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXCEPTION_STACK_ID_")
	public ActGeBytearray getActGeBytearray() {
		return this.actGeBytearray;
	}

	public void setActGeBytearray(ActGeBytearray actGeBytearray) {
		this.actGeBytearray = actGeBytearray;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "TYPE_", nullable = false)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOCK_EXP_TIME_", length = 0)
	public Date getLockExpTime() {
		return this.lockExpTime;
	}

	public void setLockExpTime(Date lockExpTime) {
		this.lockExpTime = lockExpTime;
	}

	@Column(name = "LOCK_OWNER_")
	public String getLockOwner() {
		return this.lockOwner;
	}

	public void setLockOwner(String lockOwner) {
		this.lockOwner = lockOwner;
	}

	@Column(name = "EXCLUSIVE_")
	public Boolean getExclusive() {
		return this.exclusive;
	}

	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
	}

	@Column(name = "EXECUTION_ID_", length = 64)
	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	@Column(name = "PROCESS_INSTANCE_ID_", length = 64)
	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	@Column(name = "PROC_DEF_ID_", length = 64)
	public String getProcDefId() {
		return this.procDefId;
	}

	public void setProcDefId(String procDefId) {
		this.procDefId = procDefId;
	}

	@Column(name = "RETRIES_")
	public Integer getRetries() {
		return this.retries;
	}

	public void setRetries(Integer retries) {
		this.retries = retries;
	}

	@Column(name = "EXCEPTION_MSG_", length = 4000)
	public String getExceptionMsg() {
		return this.exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DUEDATE_", length = 0)
	public Date getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	@Column(name = "REPEAT_")
	public String getRepeat() {
		return this.repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	@Column(name = "HANDLER_TYPE_")
	public String getHandlerType() {
		return this.handlerType;
	}

	public void setHandlerType(String handlerType) {
		this.handlerType = handlerType;
	}

	@Column(name = "HANDLER_CFG_", length = 4000)
	public String getHandlerCfg() {
		return this.handlerCfg;
	}

	public void setHandlerCfg(String handlerCfg) {
		this.handlerCfg = handlerCfg;
	}

}
