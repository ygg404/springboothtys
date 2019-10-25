package io.renren.modules.set.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;


/**
 * 部门列表
 * 
 * @author ygg
 * @date 2019-10-23 17:08:31
 */
@TableName("work_group")
public class WorkGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 作业组名称
	 */
	private String name;
	/**
	 * 排序号
	 */
	private Integer orderNum;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 队长名称
	 */
	private String headMan;
	/**
	 * 副队长名称
	 */
	private String deputyLeader;
	/**
	 * 队长id
	 */
	private Integer headId;
	/**
	 * 副队长id
	 */
	private Integer deputyId;
	/**
	 * 部门父id
	 */
	private Integer pId;
	/**
	 * 部门父类名称
	 */
	@TableField(exist = false)
	private String parentName;

	/**
	* 获取：ID
	*/
	public Integer getid (){return this.id;};
	/**
	 * 设置：ID
	 */
	public void setid (Integer id){this.id = id;};
	/**
	* 获取：作业组名称
	*/
	public String getname (){return this.name;};
	/**
	 * 设置：作业组名称
	 */
	public void setname (String name){this.name = name;};
	/**
	* 获取：排序号
	*/
	public Integer getorderNum (){return this.orderNum;};
	/**
	 * 设置：排序号
	 */
	public void setorderNum (Integer orderNum){this.orderNum = orderNum;};
	/**
	* 获取：创建时间
	*/
	public Date getcreateTime (){return this.createTime;};
	/**
	 * 设置：创建时间
	 */
	public void setcreateTime (Date createTime){this.createTime = createTime;};
	/**
	* 获取：队长名称
	*/
	public String getheadMan (){return this.headMan;};
	/**
	 * 设置：队长名称
	 */
	public void setheadMan (String headMan){this.headMan = headMan;};
	/**
	* 获取：副队长名称
	*/
	public String getdeputyLeader (){return this.deputyLeader;};
	/**
	 * 设置：副队长名称
	 */
	public void setdeputyLeader (String deputyLeader){this.deputyLeader = deputyLeader;};
	/**
	* 获取：队长id
	*/
	public Integer getheadId (){return this.headId;};
	/**
	 * 设置：队长id
	 */
	public void setheadId (Integer headId){this.headId = headId;};
	/**
	* 获取：副队长id
	*/
	public Integer getdeputyId (){return this.deputyId;};
	/**
	 * 设置：副队长id
	 */
	public void setdeputyId (Integer deputyId){this.deputyId = deputyId;};
	/**
	* 获取：部门父id
	*/
	public Integer getpId (){return this.pId;};
	/**
	 * 设置：部门父id
	 */
	public void setpId (Integer pId){this.pId = pId;};
	/**
	 * 获取：部门父名称
	 */
	public String getParentName (){return this.parentName;};
	/**
	 * 设置：部门父名称
	 */
	public void setParentName (String parentName){this.parentName = parentName;};
}
