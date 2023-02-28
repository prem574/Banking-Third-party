// package com.stl.Banking.Thirdparty;

// import static org.assertj.core.api.Assertions.assertThat;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;


// import com.stl.Banking.Thirdparty.Entity.ThirdPartyPayee;
// import com.stl.Banking.Thirdparty.Entity.User;
// import com.stl.Banking.Thirdparty.Repository.ThirdPartyPayeeRepository;

// @SpringBootTest
// class ThirdPartyMicroserviceApplicationTests {

	
// 	@Autowired
// 	ThirdPartyPayeeRepository payee;
	
// 	@Test
// 	public void testCreate() {
// 		User user = new User(1l,"a","d","y","f","e","p","d");
// 		ThirdPartyPayee p = new ThirdPartyPayee();
// 		p.setBranch("bengaluru");
// 		p.setCifNo("23456");
// 		p.setId(2l);
// 		p.setUser(user);
// 		p.setIfsc("123445");
// 		p.setPayeeAccountNumber("12345");
// 		p.setPayeeName("vinay");
// 		payee.save(p);
// 		assertNotNull(payee.findById(2l).get());
// 	}
	
// 	@Test
// 	public void testRead() {
// 		List<ThirdPartyPayee> list = payee.findAll();
// 		assertThat(list).size().isGreaterThan(0);
// 	}
	
// 	@Test
// 	public void testSingleUser() {
// 		ThirdPartyPayee p = payee.findById(2l).get();
// 		assertEquals("bengaluru",p.getBranch());
// 	}
	
// 	@Test
// 	public void testUpdate() {
// 		ThirdPartyPayee p =  payee.findById(2l).get();
// 		p.setPayeeName("kiran");
// 		payee.save(p);
// 		assertNotEquals("vinay",payee.findById(2l).get().getPayeeName());
// 	}
	
// 	@Test
// 	public void testDelete() {
// 		payee.deleteById(2l);
// 		assertThat(payee.existsById(2l)).isFalse();
// 	}


// }
