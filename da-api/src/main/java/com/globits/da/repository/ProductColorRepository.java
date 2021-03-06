package com.globits.da.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globits.da.domain.ProductColor;
import com.globits.da.domain.ProductWarehouse;
@Repository
public interface ProductColorRepository extends JpaRepository<ProductColor, UUID>{

}
