package in.ashokit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="procuct_tbl1")
public class product {

	@Id
	@Column(name="product_id")
	private Integer pId;
	
	@Column(name="product_name")
	private String pnamel;
	
	@Column(name="product_price")
	private Double price;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getPnamel() {
		return pnamel;
	}

	public void setPnamel(String pnamel) {
		this.pnamel = pnamel;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [pId=" + pId + ", pnamel=" + pnamel + ", price=" + price + "]";
	}
	
	
	
	
}
