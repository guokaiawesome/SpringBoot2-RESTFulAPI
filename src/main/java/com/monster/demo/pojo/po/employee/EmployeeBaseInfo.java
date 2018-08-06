package com.monster.demo.pojo.po.employee;

import java.time.LocalDateTime;

public class EmployeeBaseInfo {
    private Long id;

    private String realName;

    private String nickName;

    private Byte state;

    /**
     * 是否冻结，对应数据库的is_frozen字段
     */
    private Byte whetherFrozen;

    /**
     * 是否删除，对应数据库的is_deleted字段
     */
    private Byte whetherDeleted;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Byte getWhetherFrozen() {
		return whetherFrozen;
	}

	public void setWhetherFrozen(Byte whetherFrozen) {
		this.whetherFrozen = whetherFrozen;
	}

	public Byte getWhetherDeleted() {
		return whetherDeleted;
	}

	public void setWhetherDeleted(Byte whetherDeleted) {
		this.whetherDeleted = whetherDeleted;
	}

	public LocalDateTime getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(LocalDateTime gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public LocalDateTime getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(LocalDateTime gmtModified) {
		this.gmtModified = gmtModified;
	}


    
    
}