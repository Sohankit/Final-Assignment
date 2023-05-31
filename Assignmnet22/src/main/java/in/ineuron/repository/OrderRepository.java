package in.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.OrderData;

public interface OrderRepository extends JpaRepository<OrderData, Integer> {

}
