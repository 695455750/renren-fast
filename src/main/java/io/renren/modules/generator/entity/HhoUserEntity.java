package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-24 14:39:32
 */
@TableName("hho_user")
public class HhoUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId
	private Long id;
	/**
	 * 微信openID
	 */
	private String openId;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 头像
	 */
	private String img;
	/**
	 * 微信号
	 */
	private String wechatNum;
	/**
	 * 用户昵称
	 */
	private String wechatName;
	/**
	 * 创建人
	 */
	private String creator;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 修改人
	 */
	private String modifier;
	/**
	 * 修改时间
	 */
	private Date modifyDate;

	/**
	 * 设置：主键ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：微信openID
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 获取：微信openID
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：头像
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * 获取：头像
	 */
	public String getImg() {
		return img;
	}
	/**
	 * 设置：微信号
	 */
	public void setWechatNum(String wechatNum) {
		this.wechatNum = wechatNum;
	}
	/**
	 * 获取：微信号
	 */
	public String getWechatNum() {
		return wechatNum;
	}
	/**
	 * 设置：用户昵称
	 */
	public void setWechatName(String wechatName) {
		this.wechatName = wechatName;
	}
	/**
	 * 获取：用户昵称
	 */
	public String getWechatName() {
		return wechatName;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：修改人
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	/**
	 * 获取：修改人
	 */
	public String getModifier() {
		return modifier;
	}
	/**
	 * 设置：修改时间
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getModifyDate() {
		return modifyDate;
	}
}
