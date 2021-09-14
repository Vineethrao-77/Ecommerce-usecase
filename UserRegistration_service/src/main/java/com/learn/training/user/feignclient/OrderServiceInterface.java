package com.learn.training.user.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learn.training.user.DTO.OrderHistoryDTO;
import com.learn.training.user.DTO.OrderProductDTO;
import com.learn.training.user.DTO.SearchDTO;
import com.learn.training.user.DTO.SearchRequest;
import com.learn.training.user.controller.Exceptions.InSufficientBalanceException;
import com.learn.training.user.controller.Exceptions.ResourceNotFoundException;

@FeignClient(name = "http://ORDER-SERVICE:1002/api/orderservice")
public interface OrderServiceInterface {

	@PostMapping("/products/searchproducts")
	public ResponseEntity<List<SearchDTO>> getCategoryProductDetails(@RequestBody SearchRequest request);

	@PostMapping("/")
	public ResponseEntity<String> productOrder(@RequestBody OrderProductDTO orderProDto)
			throws InSufficientBalanceException, ResourceNotFoundException;

	@GetMapping("/orderHistory/{userName}/{userId}")
	public ResponseEntity<List<OrderHistoryDTO>> orderHistory(@PathVariable("userName") String userName,
			@PathVariable("userId") String userId);
}
