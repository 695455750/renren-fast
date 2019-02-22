package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-24 14:39:32
 */
@TableName("hho_joker")
public class HhoJokerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String text;
	/**
	 * 类型
	 */
	private String type;
	/**
	 * 创建者
	 */
	private String userId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 资源链接
	 */
	private String sourceUrl;
	/**
	 * 热度评分
	 */
	private Double heat;
	/**
	 * 顶
	 */
	private Integer love;
	/**
	 * 踩
	 */
	private Integer hate;
	/**
	 * 转发
	 */
	private Integer repost;

	public Integer getRepost() {
		return repost;
	}

	public void setRepost(Integer repost) {
		this.repost = repost;
	}

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：内容
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * 获取：内容
	 */
	public String getText() {
		return text;
	}
	/**
	 * 设置：类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：创建者
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：创建者
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：资源链接
	 */
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	/**
	 * 获取：资源链接
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}
	/**
	 * 设置：热度评分
	 */
	public void setHeat(Double heat) {
		this.heat = heat;
	}
	/**
	 * 获取：热度评分
	 */
	public Double getHeat() {
		return heat;
	}
	/**
	 * 设置：顶
	 */
	public void setLove(Integer love) {
		this.love = love;
	}
	/**
	 * 获取：顶
	 */
	public Integer getLove() {
		return love;
	}
	/**
	 * 设置：踩
	 */
	public void setHate(Integer hate) {
		this.hate = hate;
	}
	/**
	 * 获取：踩
	 */
	public Integer getHate() {
		return hate;
	}
}
