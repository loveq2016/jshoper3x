package com.jshop.entity;

// Generated 2014-9-20 0:42:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ArticleCategoryT generated by hbm2java
 */
@Entity
@Table(name = "article_category_t", catalog = "jshoper3")
public class ArticleCategoryT implements java.io.Serializable {

	private String articleCategoryTid;
	private String grade;
	private String metaKeywords;
	private String metaDes;
	private String name;
	private String status;
	private Date createtime;
	private String creatorid;
	private String path;
	private int sort;
	private String parentId;
	private String sign;
	private String parentName;
	private String position;
	private Date updatetime;
	private int versiont;
	private String mobilesync;
	private String htmlpath;
	private String logo;
	private String shopid;

	public ArticleCategoryT() {
	}

	public ArticleCategoryT(String articleCategoryTid, String grade,
			String name, String status, Date createtime, String path, int sort,
			String sign, String position, Date updatetime, int versiont,
			String mobilesync) {
		this.articleCategoryTid = articleCategoryTid;
		this.grade = grade;
		this.name = name;
		this.status = status;
		this.createtime = createtime;
		this.path = path;
		this.sort = sort;
		this.sign = sign;
		this.position = position;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.mobilesync = mobilesync;
	}

	public ArticleCategoryT(String articleCategoryTid, String grade,
			String metaKeywords, String metaDes, String name, String status,
			Date createtime, String creatorid, String path, int sort,
			String parentId, String sign, String parentName, String position,
			Date updatetime, int versiont, String mobilesync, String htmlpath,
			String logo, String shopid) {
		this.articleCategoryTid = articleCategoryTid;
		this.grade = grade;
		this.metaKeywords = metaKeywords;
		this.metaDes = metaDes;
		this.name = name;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.path = path;
		this.sort = sort;
		this.parentId = parentId;
		this.sign = sign;
		this.parentName = parentName;
		this.position = position;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.mobilesync = mobilesync;
		this.htmlpath = htmlpath;
		this.logo = logo;
		this.shopid = shopid;
	}

	@Id
	@Column(name = "ARTICLE_CATEGORY_TID", unique = true, nullable = false, length = 20)
	public String getArticleCategoryTid() {
		return this.articleCategoryTid;
	}

	public void setArticleCategoryTid(String articleCategoryTid) {
		this.articleCategoryTid = articleCategoryTid;
	}

	@Column(name = "GRADE", nullable = false, length = 1)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "META_KEYWORDS")
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "META_DES")
	public String getMetaDes() {
		return this.metaDes;
	}

	public void setMetaDes(String metaDes) {
		this.metaDes = metaDes;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STATUS", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "PATH", nullable = false, length = 2000)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "SORT", nullable = false)
	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Column(name = "PARENT_ID", length = 20)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "SIGN", nullable = false, length = 45)
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name = "PARENT_NAME", length = 45)
	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Column(name = "POSITION", nullable = false, length = 1)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "MOBILESYNC", nullable = false, length = 1)
	public String getMobilesync() {
		return this.mobilesync;
	}

	public void setMobilesync(String mobilesync) {
		this.mobilesync = mobilesync;
	}

	@Column(name = "HTMLPATH")
	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	@Column(name = "LOGO")
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "SHOPID", length = 20)
	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

}
