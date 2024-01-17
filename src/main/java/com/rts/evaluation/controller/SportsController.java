package com.rts.evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rts.evaluation.model.Sports;
import com.rts.evaluation.reopsitory.SportsDAO;
import com.rts.evaluation.service.SportsService;

@RestController
//@RequestMapping("SportsRest/api")
//public class SportsController {
//	
//	@Autowired
//	SportsDAO dao;
//	
//  public void performInsert(Sports bean)
//  {
//		dao.insert(bean);
//		System.out.println("Inserted");
//		List<Sports>list = dao.view();
//		System.out.println(list);
//		
//  }


	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/sportRest/Aapi")
public class SportsController {
	@Autowired
	SportsService service;
	
	@PostMapping("/Sports")
	public boolean performInsert(@RequestBody Sports bean) {
		return service.addCustomer(bean);
	}
	
	
}
