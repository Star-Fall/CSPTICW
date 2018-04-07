package com.cspticw.entity;

/**
 * @ClassName: WebsiteNews
 * @author: StarFall
 * @date: 2018年4月7日 下午10:46:46
 * @Description:网站新闻实体
 */
public class WebsiteNews extends BaseEntity {
	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = -4691972092087280305L;

	private String newsTitle;

	private String newsContent;

	private Integer status;

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle == null ? null : newsTitle.trim();
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent == null ? null : newsContent.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}