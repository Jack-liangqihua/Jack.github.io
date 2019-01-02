package com.aomei.bo;

import java.util.ArrayList;

public class Workflow {
	  
	 
	  
	
	
	
 

	public String getSYS() {
		return SYS;
	}
	public void setSYS(String sYS) {
		SYS = sYS;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getCreatorId() {
		return CreatorId;
	}
	public void setCreatorId(String creatorId) {
		CreatorId = creatorId;
	}
	public String getCreatorName() {
		return CreatorName;
	}
	public void setCreatorName(String creatorName) {
		CreatorName = creatorName;
	}
	public String getNodeId() {
		return NodeId;
	}
	public void setNodeId(String nodeId) {
		NodeId = nodeId;
	}
	public String getRequestLevel() {
		return RequestLevel;
	}
	public void setRequestLevel(String requestLevel) {
		RequestLevel = requestLevel;
	}
	public String getRequestName() {
		return RequestName;
	}
	public void setRequestName(String requestName) {
		RequestName = requestName;
	}
 
	 
	
	public String getXcjh() {
		return xcjh;
	}
	public void setXcjh(String xcjh) {
		this.xcjh = xcjh;
	}
	public String getHynr() {
		return hynr;
	}
	public void setHynr(String hynr) {
		this.hynr = hynr;
	}
	 
	public ArrayList<ItemFree> getItemFree() {
		return itemFree;
	}
	public void setItemFree(ArrayList<ItemFree> itemFree) {
		this.itemFree = itemFree;
	}
	 
	public ArrayList<ItemTraval> getItemTraval() {
		return itemTraval;
	}
	public void setItemTraval(ArrayList<ItemTraval> itemTraval) {
		this.itemTraval = itemTraval;
	}
	public int getEMPID() {
		return EMPID;
	}
	public void setEMPID(int eMPID) {
		EMPID = eMPID;
	} 
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public String getCRMID() {
		return CRMID;
	}
	public void setCRMID(String cRMID) {
		CRMID = cRMID;
	}
	public int getCRMUPDATAFLAG() {
		return CRMUPDATAFLAG;
	}
	public void setCRMUPDATAFLAG(int cRMUPDATAFLAG) {
		CRMUPDATAFLAG = cRMUPDATAFLAG;
	}









	
	
	public String SYS;			//系统
	public String CRMID;		//CRM文档号
	public String CreateTime;	//创建日期
	public String CreatorId;	//创建人工号
	public int	  EMPID;		//创建人OA登陆号
	public String Mobile;		//创建人手机号码
	public int	  department;	//部门编号
	public String CreatorName;	//创建人名称
	public String NodeId;		//流程节点编号
	public String RequestLevel;	//流程级别
	public String RequestName; 	//流程标题
	public String xcjh;			//行程计划
	public String hynr;			//会议内容
	public int 	  CRMUPDATAFLAG;//CRM发送OA状态













	public ArrayList<ItemFree> itemFree = new ArrayList<ItemFree>();
	public ArrayList<ItemTraval> itemTraval = new ArrayList<ItemTraval>();
	
	  
}
