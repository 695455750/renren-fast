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
 * @date 2019-01-30 16:06:09
 */
@TableName("hho_joker_user")
public class HhoJokerUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Long id;
	/**
	 * joker id 
	 */
	private String jokerId;
	/**
	 * 赞
	 */
	private Integer love;
	/**
	 * 踩
	 */
	private Integer hate;
	/**
	 * 评论
	 */
	private String commit;
	/**
	 * 读取时间
	 */
	private Date recordTime;
	/**
	 * 删除标识 1：删除
	 */
	private Integer delFlag;
	/**
	 * 用户本地标识
	 */
	private String cid;
	/**
	 * 转发
	 */
	private int repost;

	public int getRepost() {
		return repost;
	}

	public void setRepost(int repost) {
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
	 * 设置：joker id 
	 */
	public void setJokerId(String jokerId) {
		this.jokerId = jokerId;
	}
	/**
	 * 获取：joker id 
	 */
	public String getJokerId() {
		return jokerId;
	}
	/**
	 * 设置：赞
	 */
	public void setLove(Integer love) {
		this.love = love;
	}
	/**
	 * 获取：赞
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
	/**
	 * 设置：评论
	 */
	public void setCommit(String commit) {
		this.commit = commit;
	}
	/**
	 * 获取：评论
	 */
	public String getCommit() {
		return commit;
	}
	/**
	 * 设置：读取时间
	 */
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	/**
	 * 获取：读取时间
	 */
	public Date getRecordTime() {
		return recordTime;
	}
	/**
	 * 设置：删除标识 1：删除
	 */
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：删除标识 1：删除
	 */
	public Integer getDelFlag() {
		return delFlag;
	}
	/**
	 * 设置：用户本地标识
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}
	/**
	 * 获取：用户本地标识
	 */
	public String getCid() {
		return cid;
	}
}
