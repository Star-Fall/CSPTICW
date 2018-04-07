package com.cspticw.entity;

/**
 * @ClassName: CollectRecord
 * @author: StarFall
 * @date: 2018年4月7日 下午10:40:55
 * @Description:收藏记录实体
 */
public class CollectRecord extends BaseEntity {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -8622367186431068145L;

	private Long stuId;

	private Long compId;

	private Integer collectUser;

	private Integer isDelete;

	public Long getStuId() {
		return stuId;
	}

	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}

	public Long getCompId() {
		return compId;
	}

	public void setCompId(Long compId) {
		this.compId = compId;
	}

	public Integer getCollectUser() {
		return collectUser;
	}

	public void setCollectUser(Integer collectUser) {
		this.collectUser = collectUser;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
}