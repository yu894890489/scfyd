package com.ut.scf.reqbean.bpm;

import com.ut.scf.reqbean.BaseReqBean;
/**
 * 放款申请-出账流程
 * @author zhangyx
 *
 */
public class LendingApplicationAddReqBean extends BaseReqBean {
	
	/**
	 * 流程实例id
	 */
	private Long procInsId;
	
	/**
	 * 工作项id
	 */
	private Long workItemId;
	
	/**
	 * 项目名称
	 */
	private String proName;
	
	/**
	 * 放款批次号
	 */
	private String lendBathNo;
	
	/**
	 * 关联保理合同号
	 */
	private String contractNo;
	
	/**
	 * 放款金额
	 */
	private String lendAmt;
	
	/**
	 * 放款时间
	 */
	private String lendDate;
	
	/**
	 * 放款人
	 */
	private String lendPerson;
	
	/**
	 * 放款企业
	 */
	private String lendCorp;
	
	/**
	 * 放款状态
	 */
	private String lendState;

	public Long getWorkItemId() {
		return workItemId;
	}

	public void setWorkItemId(Long workItemId) {
		this.workItemId = workItemId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getLendBathNo() {
		return lendBathNo;
	}

	public void setLendBathNo(String lendBathNo) {
		this.lendBathNo = lendBathNo;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getLendAmt() {
		return lendAmt;
	}

	public void setLendAmt(String lendAmt) {
		this.lendAmt = lendAmt;
	}

	public String getLendDate() {
		return lendDate;
	}

	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}

	public String getLendPerson() {
		return lendPerson;
	}

	public void setLendPerson(String lendPerson) {
		this.lendPerson = lendPerson;
	}

	public String getLendCorp() {
		return lendCorp;
	}

	public void setLendCorp(String lendCorp) {
		this.lendCorp = lendCorp;
	}

	public String getLendState() {
		return lendState;
	}

	public void setLendState(String lendState) {
		this.lendState = lendState;
	}

	public Long getProcInsId() {
		return procInsId;
	}

	public void setProcInsId(Long procInsId) {
		this.procInsId = procInsId;
	}

}
