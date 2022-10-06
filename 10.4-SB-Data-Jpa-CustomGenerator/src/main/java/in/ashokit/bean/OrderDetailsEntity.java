package in.ashokit.bean;



import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name = "ORDR-DTLS")
//@Data
public class OrderDetailsEntity {
	@Id
	@Column(name = "ORDERID")
	@GenericGenerator(
			name="order_id_gen",
	        strategy="in.ashokit.generator.OrderIdgenerator")
	@GeneratedValue(generator="order_id_gen")
	private String orderId;

	@Column(name = "ORDER_BY")
	private String orderBy;
	
	@Column(name = "ORDER_PLACED_DATE")
	private Date orderPlacedDate;

	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}

	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}

	@Override
	public String toString() {
		return "OrderDetailsEntity [orderId=" + orderId + ", orderBy=" + orderBy + ", orderPlacedDate="
				+ orderPlacedDate + "]";
	}

	

	


}
