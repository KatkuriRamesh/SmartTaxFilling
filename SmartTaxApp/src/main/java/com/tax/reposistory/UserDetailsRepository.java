package com.tax.reposistory;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tax.model.UserDetails;

@Repository
@Transactional
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}
