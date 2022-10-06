package in.ashokit.bean.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.bean.OrderDetailsEntity;

public interface OrderDetailsRepository  extends JpaRepository<OrderDetailsEntity, Serializable>{

}
