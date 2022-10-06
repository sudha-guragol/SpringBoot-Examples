package in.ashokit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="contact_master")

@Data
public class ContactEntity {

@Id
	@Column(name="contact_id")
private Integer contactId;
@Column(name="contact_name")
	private String contactName;
	
@Column(name="contact_number")
	private Integer contactNember;
}
