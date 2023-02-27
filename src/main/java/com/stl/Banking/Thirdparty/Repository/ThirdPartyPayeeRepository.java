package com.stl.Banking.Thirdparty.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stl.Banking.Thirdparty.Entity.ThirdPartyPayee;
import com.stl.Banking.Thirdparty.Entity.User;

@Repository
public interface ThirdPartyPayeeRepository extends JpaRepository<ThirdPartyPayee, Long> {
	List<ThirdPartyPayee> findByUser(Optional<User> user);
}
