package com.dcl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dcl.dto.ProductDto;


public interface OrderSerivce {

	List<ProductDto> findAllProduct();
}
