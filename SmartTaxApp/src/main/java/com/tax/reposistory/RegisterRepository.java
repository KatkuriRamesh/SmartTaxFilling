package com.tax.reposistory;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tax.model.Register;

@Repository
@Transactional
public interface RegisterRepository extends JpaRepository<Register, Long> {

}
