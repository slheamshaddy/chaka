package com.test.chaka.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.chaka.model.Stock;
@Repository
@Transactional
public interface StockTableRepository extends JpaRepository<Stock,Integer>{

	@Modifying
	@Query(value="select merchant_id,user_id,date from stock s where merchant_id = :merchantId OR user_id= :userId ORDER BY date DESC", nativeQuery=true)
	List findAllByDateOrderDateDesc(@Param("merchantId") String merchantId, @Param("userId") String userId);

}
