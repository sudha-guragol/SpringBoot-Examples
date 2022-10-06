package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Bank_Account")
public class Account {
	
	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="MIN_BAl")
	private Double minBal;
	
	@EmbeddedId
	private AccountPK accPK;

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

	public AccountPK getAccPK() {
		return accPK;
	}

	public void setAccPK(AccountPK accPK) {
		this.accPK = accPK;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accPK=" + accPK + "]";
	}
	
	

	
	
}
