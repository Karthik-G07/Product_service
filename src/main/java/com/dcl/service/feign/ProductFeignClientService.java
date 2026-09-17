package com.dcl.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.dcl.dto.ProductDto;

@FeignClient(name="Product-Service",url="http://localhost:8089")
public interface ProductFeignClientService {

	@GetMapping("/product/get")
	public List<ProductDto> findAllProduct();
	
}
