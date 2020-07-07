package com.feedback.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.demo.model.Feedback;
import com.feedback.demo.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService service;
	
	@PostMapping("/feedback")
	public Feedback writeFeedback(@RequestBody Feedback feedback) {
		
		return service.writeFeedback(feedback);
	}
    @GetMapping("/feedback/{product}")
	public List<Feedback> getFeedbackByProduct(@PathVariable("product") String product) {
    	
    	return service.getFeedbackByProduct(product);
    }

}
