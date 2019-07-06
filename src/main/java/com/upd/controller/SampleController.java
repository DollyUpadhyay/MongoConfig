package com.upd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.upd.service.SampleService;

@RestController
public class SampleController {

	/**
	 * autowired 
	 */
	@Autowired
	SampleService sample_service;
	@RequestMapping(value="sample",method=RequestMethod.POST)
	public String sample() {
		/**
		 * to insert
		 */
		return sample_service.insert();
		
	}
	
}
