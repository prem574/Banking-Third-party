package com.stl.Banking.Thirdparty.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.stl.Banking.Thirdparty.Entity.ThirdPartyPayee;

public interface ThirdPartyPayeeServiceInterface {
	 
    List<ThirdPartyPayee> getAllThirdPartyPayees();

    ThirdPartyPayee createPayee(ThirdPartyPayee thirdPartyPayee);
    
    ResponseEntity<ThirdPartyPayee> updatePayee(Long id, ThirdPartyPayee thirdPartyPayee);

    ResponseEntity<ThirdPartyPayee> getPayee(Long id);
    
    void deleteThirdPartyPayee(long id);
    List<ThirdPartyPayee> getAccountsByUserId(Long userId);
}
