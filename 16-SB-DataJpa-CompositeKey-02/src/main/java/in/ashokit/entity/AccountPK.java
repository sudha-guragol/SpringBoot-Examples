package in.ashokit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class AccountPK implements Serializable {

	private Integer accountId;
	private String accountName;
	private String holderName;
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
		return "AccountPK [accountId=" + accountId + ", accountName=" + accountName + ", holderName=" + holderName
				+ "]";
	}

}
