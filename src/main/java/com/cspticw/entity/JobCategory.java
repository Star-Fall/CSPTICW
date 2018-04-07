package com.cspticw.entity;

/**
 * @ClassName: JobCategory
 * @author: StarFall
 * @date: 2018年4月7日 下午10:43:37
 * @Description:行业分类实体
 */
public class JobCategory extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 1870862968159838900L;

	private String categoryName;

	private Long parentId;

	private Integer isAvailable;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName == null ? null : categoryName.trim();
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Integer isAvailable) {
		this.isAvailable = isAvailable;
	}
}