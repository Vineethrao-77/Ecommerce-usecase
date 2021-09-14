package com.learn.training.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.learn.training.user.controller.UserController;
import com.learn.training.user.dao.UserDao;
import com.learn.training.user.model.ApiResponse;
import com.learn.training.user.model.User;
import com.learn.training.user.model.UserDto;
import com.learn.training.user.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class UserControllerTest {

		@Mock
		UserServiceImpl serviceimpl;
		@Mock
		UserDao dao;
		
		@InjectMocks
		UserController controller;
		
		
		
		static UserDto userdto;
		
		static User user;
		
		@BeforeAll
		public void setUp() {
			userdto =new UserDto();
			
userdto.setAddress("Hyderabad");
userdto.setCity("Hyderabad");
userdto.setEmailId("vineethraopakala@gmail.com");
userdto.setFirstName("Vineeth");
userdto.setId(1);
userdto.setLastName("rao");
userdto.setMobileNumber("9959668508");
userdto.setPassword("password");
userdto.setState("telangana");
userdto.setUsername("vineethrao");
		}
			@Test
			@DisplayName("User creation :: Postive Scenario")
			@Order(1)
			public void usercreationtest() {
			when(serviceimpl.save(userdto)).thenReturn(user);
				ApiResponse<User> result = controller.saveUser(userdto);
				assertEquals(HttpStatus.OK,result.getStatus());
			}
			
//			@Test
//			@DisplayName("Get All Customers :: Postive Scenario")
//			@Order(2)
//			public void getallcustomerstest() {
//			when(customerservice.GetAllCustomers(customerdto)).thenReturn(customerdto, HttpStatus.OK);
//			ResponseEntity<?> result =customercontroller.GetAllCutomers();
//			assertEquals(HttpStatus.OK, result.getStatusCode());
//			
//			}
//			
//		
//	}
//		
		

}
