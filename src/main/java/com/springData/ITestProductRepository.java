package com.springData;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ITestProductRepository  extends JpaRepository<TestProductEntity, String> {
	
	ArrayList<TestProductEntity> findByQua(int q);
}
