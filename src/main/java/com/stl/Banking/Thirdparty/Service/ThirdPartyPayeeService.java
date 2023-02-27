package com.stl.Banking.Thirdparty.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stl.Banking.Thirdparty.Entity.ThirdPartyPayee;
import com.stl.Banking.Thirdparty.Entity.User;
import com.stl.Banking.Thirdparty.Repository.ThirdPartyPayeeRepository;
import com.stl.Banking.Thirdparty.Repository.UserRepository;
import com.stl.Banking.Thirdparty.exception.ResourceNotFoundException;

@Service
public class ThirdPartyPayeeService {
 
    @Autowired
    private ThirdPartyPayeeRepository thirdPartyPayeeRepository;
    @Autowired
    private UserRepository userRepository;

    public void deleteThirdPartyPayee(long id) {
        thirdPartyPayeeRepository.deleteById(id);
    }

	public ThirdPartyPayee createPayee(ThirdPartyPayee thirdPartyPayee) {
		return thirdPartyPayeeRepository.save(thirdPartyPayee);
	}

	public ResponseEntity<ThirdPartyPayee> updatePayee(Long id, ThirdPartyPayee thirdPartyPayee) {
		ThirdPartyPayee tpt =  thirdPartyPayeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Third party payee not exist with id: "+ id));
		tpt.setPayeeName(thirdPartyPayee.getPayeeName());
		tpt.setPayeeAccountNumber(thirdPartyPayee.getPayeeAccountNumber());
		tpt.setBranch(thirdPartyPayee.getBranch());
		tpt.setIfsc(thirdPartyPayee.getIfsc());
		tpt.setCifNo(thirdPartyPayee.getCifNo());
		 thirdPartyPayeeRepository.save(tpt);
			 return ResponseEntity.ok(tpt);
			
}

	public ResponseEntity<ThirdPartyPayee> getPayee(Long id) {
		ThirdPartyPayee tpt = thirdPartyPayeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Third party payee not exist with id: "+ id));
		return ResponseEntity.ok(tpt);
	}

	public List<ThirdPartyPayee> getAllPayee() {
		return thirdPartyPayeeRepository.findAll();
	}

	public  List<ThirdPartyPayee> getPayeeByUserId(Long userId) {
		Optional<User> user = userRepository.findById(userId);
	      List<ThirdPartyPayee> thirdpayee = thirdPartyPayeeRepository.findByUser(user);
	      return thirdpayee;
	}

	
}
