package io.renren.modules.set.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;


/**
 * 快捷短语输入
 * @date 2019-10-22 15:09:03
 */
@TableName("wp_shortcut")
public class WpShortcutEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增id
	 */
	@TableId
	private Long id;
	/**
	 * 短语姓名
	 */
	private String shortcutName;
	/**
	 * 短语类型内容
	 */
	private String shortcutNote;
	/**
	 * 短语类型Id
	 */
	private Integer shortcutTypeId;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置：用户名
	 */
	public void setShortcutName(String shortcutName) {
		this.shortcutName = shortcutName;
	}

	/**
	 * 获取：用户名
	 */
	public String getShortcutName() {
		return shortcutName;
	}

	/**
	 * 设置：短语类型内容
	 */
	public void setShortcutNote(String shortcutNote) {
		this.shortcutNote = shortcutNote;
	}

	/**
	 * 获取：短语类型内容
	 */
	public String getShortcutNote() {
		return shortcutNote;
	}

	/**
	 * 设置：短语类型Id
	 */
	public void setShortcutTypeId(Integer shortcutTypeId) {
		this.shortcutTypeId = shortcutTypeId;
	}

	/**
	 * 获取：短语类型Id
	 */
	public Integer getShortcutTypeId() {
		return shortcutTypeId;
	}
}
