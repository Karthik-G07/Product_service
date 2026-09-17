package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
