package com.globits.da.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globits.da.domain.Customer;
import com.globits.da.dto.CustomerDto;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
	@Query("select new com.globits.da.dto.CustomerDto(sw) from Customer sw")
	Page<CustomerDto> getListPage(Pageable pageable);
	@Query("select new com.globits.da.dto.CustomerDto(sw) from Customer sw")
	List<CustomerDto> getAllCustomers();
}
