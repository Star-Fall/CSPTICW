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

	public Date createDate;

	public Date modifyDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
