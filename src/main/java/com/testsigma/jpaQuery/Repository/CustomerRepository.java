package com.testsigma.jpaQuery.Repository;

import com.testsigma.jpaQuery.dto.OrderResponse;
import com.testsigma.jpaQuery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.testsigma.jpaQuery.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
