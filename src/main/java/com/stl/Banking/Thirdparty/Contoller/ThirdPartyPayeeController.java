package com.stl.Banking.Thirdparty.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.stl.Banking.Thirdparty.Entity.ThirdPartyPayee;
import com.stl.Banking.Thirdparty.Service.ThirdPartyPayeeService;

@RestController
@RequestMapping("/payee")
@CrossOrigin("*")
public class ThirdPartyPayeeController {
	 @Autowired
  private  ThirdPartyPayeeService thirdPartyPayeeService;

//  @Autowired
//  public ThirdPartyPayeeController(ThirdPartyPayeeService thirdPartyPayeeService) {
//    this.thirdPartyPayeeService = thirdPartyPayeeService;
//  }
//  
  @GetMapping
  public List<ThirdPartyPayee> getAllPayee() {
    return thirdPartyPayeeService.getAllPayee();
  }

  @PostMapping()
  public ThirdPartyPayee createPayee( @RequestBody ThirdPartyPayee thirdPartyPayee) {
	  System.out.println(thirdPartyPayee);
    return thirdPartyPayeeService.createPayee(thirdPartyPayee);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ThirdPartyPayee> updatePayee(@PathVariable Long id, @RequestBody ThirdPartyPayee thirdPartyPayee) {
    return thirdPartyPayeeService.updatePayee(id, thirdPartyPayee);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ThirdPartyPayee> getPayee(@PathVariable Long id) {
    return thirdPartyPayeeService.getPayee(id);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deletePayee(@PathVariable Long id) {
    thirdPartyPayeeService.deleteThirdPartyPayee(id);
    return ResponseEntity.ok().build();
  }
  
  
  @GetMapping("/users/{userId}/payee")
  public ResponseEntity<List<ThirdPartyPayee>> getPayeeByUserId(@PathVariable Long userId) {
      List<ThirdPartyPayee> thirdpayee = thirdPartyPayeeService.getPayeeByUserId(userId);
      return new ResponseEntity<>(thirdpayee, HttpStatus.OK);
  }
  

}

