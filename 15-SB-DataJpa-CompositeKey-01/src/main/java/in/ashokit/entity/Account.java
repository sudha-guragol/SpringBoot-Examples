package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Bank_Account")
@IdClass(AccountPK.class)
public class Account {
	
	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="MIN_BAl")
	private Double minBal;
	
	
	@Id
	private Integer accountId;
	
	@Id
	private String accountName;
	@Id
	private String holderName;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Double getMinBal() {
		return minBal;
	}
	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accountId=" + accountId
				+ ", accountName=" + accountName + ", holderName=" + holderName + "]";
	}

	

	
	
}
