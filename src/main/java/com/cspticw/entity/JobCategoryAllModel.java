package com.cspticw.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @ClassName: JobCategoryChild
 * @author: StarFall
 * @date: 2018年5月5日 下午10:08:29
 * @Description:行业分类大全
 */
@JsonInclude(Include.NON_NULL)
public class JobCategoryAllModel extends BaseEntity {

	private static final long serialVersionUID = -1744159357616062587L;

	private String categoryNameParent;

	private List<JobCategory> jobCategoryList;

	public String getCategoryNameParent() {
		return categoryNameParent;
	}

	public void setCategoryNameParent(String categoryNameParent) {
		this.categoryNameParent = categoryNameParent;
	}

	public List<JobCategory> getJobCategoryList() {
		return jobCategoryList;
	}

	public void setJobCategoryList(List<JobCategory> jobCategoryList) {
		this.jobCategoryList = jobCategoryList;
	}

}
