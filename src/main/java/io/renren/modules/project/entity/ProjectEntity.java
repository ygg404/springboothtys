package io.renren.modules.project.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 项目列表
 * 
 * @author ygg
 * @date 2019-10-31 11:36:02
 */
@TableName("project")
public class ProjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 项目编号
	 */
	private String projectNo;
	/**
	 * 合同编号
	 */
	private String contractNo;
	/**
	 * 项目名称
	 */
	private String projectName;
	/**
	 * 项目金额
	 */
	private Float projectMoney;
	/**
	 * 委托单位
	 */
	private String projectAuthorize;
	/**
	 * 项目要求
	 */
	private String projectNote;
	/**
	 * 项目负责人
	 */
	private String projectCharge;
	/**
	 * 1：正常2：回收站
	 */
	private String pStage;
	/**
	 * 审定内容
	 */
	private String examineNote;
	/**
	 * 项目类型
	 */
	private String projectType;
	/**
	 * 项目阶段
	 */
	private Integer projectStage;
	/**
	 * 项目生产人
	 */
	private String projectProduce;
	/**
	 * 项目负责人账号
	 */
	private String projectChargeAccount;
	/**
	 * 项目开始时间
	 */
	private Date projectStartDateTime;
	/**
	 * 项目创建时间
	 */
	private Date projectCreateDateTime;
	/**
	 * 创建的用户ID
	 */
	private Integer createuserid;

	/**
	* 获取：
	*/
	public Integer getid (){return this.id;};
	/**
	 * 设置：
	 */
	public void setid (Integer id){this.id = id;};
	/**
	* 获取：项目编号
	*/
	public String getprojectNo (){return this.projectNo;};
	/**
	 * 设置：项目编号
	 */
	public void setprojectNo (String projectNo){this.projectNo = projectNo;};
	/**
	* 获取：合同编号
	*/
	public String getcontractNo (){return this.contractNo;};
	/**
	 * 设置：合同编号
	 */
	public void setcontractNo (String contractNo){this.contractNo = contractNo;};
	/**
	* 获取：项目名称
	*/
	public String getprojectName (){return this.projectName;};
	/**
	 * 设置：项目名称
	 */
	public void setprojectName (String projectName){this.projectName = projectName;};
	/**
	* 获取：项目金额
	*/
	public Float getprojectMoney (){return this.projectMoney;};
	/**
	 * 设置：项目金额
	 */
	public void setprojectMoney (Float projectMoney){this.projectMoney = projectMoney;};
	/**
	* 获取：委托单位
	*/
	public String getprojectAuthorize (){return this.projectAuthorize;};
	/**
	 * 设置：委托单位
	 */
	public void setprojectAuthorize (String projectAuthorize){this.projectAuthorize = projectAuthorize;};
	/**
	* 获取：项目要求
	*/
	public String getprojectNote (){return this.projectNote;};
	/**
	 * 设置：项目要求
	 */
	public void setprojectNote (String projectNote){this.projectNote = projectNote;};
	/**
	* 获取：项目负责人
	*/
	public String getprojectCharge (){return this.projectCharge;};
	/**
	 * 设置：项目负责人
	 */
	public void setprojectCharge (String projectCharge){this.projectCharge = projectCharge;};
	/**
	* 获取：1：正常2：回收站
	*/
	public String getpStage (){return this.pStage;};
	/**
	 * 设置：1：正常2：回收站
	 */
	public void setpStage (String pStage){this.pStage = pStage;};
	/**
	* 获取：审定内容
	*/
	public String getexamineNote (){return this.examineNote;};
	/**
	 * 设置：审定内容
	 */
	public void setexamineNote (String examineNote){this.examineNote = examineNote;};
	/**
	* 获取：项目类型
	*/
	public String getprojectType (){return this.projectType;};
	/**
	 * 设置：项目类型
	 */
	public void setprojectType (String projectType){this.projectType = projectType;};
	/**
	* 获取：项目阶段
	*/
	public Integer getprojectStage (){return this.projectStage;};
	/**
	 * 设置：项目阶段
	 */
	public void setprojectStage (Integer projectStage){this.projectStage = projectStage;};
	/**
	* 获取：项目生产人
	*/
	public String getprojectProduce (){return this.projectProduce;};
	/**
	 * 设置：项目生产人
	 */
	public void setprojectProduce (String projectProduce){this.projectProduce = projectProduce;};
	/**
	* 获取：项目负责人账号
	*/
	public String getprojectChargeAccount (){return this.projectChargeAccount;};
	/**
	 * 设置：项目负责人账号
	 */
	public void setprojectChargeAccount (String projectChargeAccount){this.projectChargeAccount = projectChargeAccount;};
	/**
	* 获取：项目开始时间
	*/
	public Date getprojectStartDateTime (){return this.projectStartDateTime;};
	/**
	 * 设置：项目开始时间
	 */
	public void setprojectStartDateTime (Date projectStartDateTime){this.projectStartDateTime = projectStartDateTime;};
	/**
	* 获取：项目创建时间
	*/
	public Date getprojectCreateDateTime (){return this.projectCreateDateTime;};
	/**
	 * 设置：项目创建时间
	 */
	public void setprojectCreateDateTime (Date projectCreateDateTime){this.projectCreateDateTime = projectCreateDateTime;};
	/**
	* 获取：创建的用户ID
	*/
	public Integer getcreateuserid (){return this.createuserid;};
	/**
	 * 设置：创建的用户ID
	 */
	public void setcreateuserid (Integer createuserid){this.createuserid = createuserid;};
}
