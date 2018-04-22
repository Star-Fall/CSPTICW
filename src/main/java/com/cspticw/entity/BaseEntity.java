package com.cspticw.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BaseEntity
 * @author: StarFall
 * @date: 2018年4月7日 下午9:00:53
 * @Description:实体基类
 */
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -4843489514456899323L;

	public Long id;

	private Date createTime;

	private Date modifyTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public void preInsert() {
		this.createTime = new Date();
		this.modifyTime = this.createTime;
	}

	public void preUpdate() {
		this.modifyTime = new Date();
	}
}
