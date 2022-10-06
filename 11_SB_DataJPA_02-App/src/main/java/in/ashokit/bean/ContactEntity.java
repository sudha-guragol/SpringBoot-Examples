package in.ashokit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="contact_master")
public class ContactEntity {

@Id
	@Column(name="contact_id")
private Integer contactId;
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="contact_number")
	private Integer contactNember;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Integer getContactNember() {
		return contactNember;
	}

	public void setContactNember(Integer contactNember) {
		this.contactNember = contactNember;
	}

	@Override
	public String toString() {
		return "ContactEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactNember="
				+ contactNember + "]";
	}
	
	
}
