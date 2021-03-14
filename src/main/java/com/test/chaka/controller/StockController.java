package com.test.chaka.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.chaka.model.Stock;
import com.test.chaka.repository.StockTableRepository;

@RestController
@RequestMapping("/stock")
public class StockController {
@Autowired
private StockTableRepository table;

    @PostMapping("/save")
	public String saveStock(@RequestBody Stock stocks) {
    	
		stocks.setUserId(UUID.randomUUID().toString());
		System.out.println(stocks);
		
         table.save(stocks);
         
         return "Success";
	}
    @GetMapping("/get-by/{merchantId}/{userId}")
    public List findByDate(@PathVariable String merchantId,@PathVariable String userId) {
    	return table.findAllByDateOrderDateDesc(merchantId, userId);
    }
}
