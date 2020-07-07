package com.feedback.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.demo.dao.FeedbackDao;
import com.feedback.demo.model.Feedback;
import com.feedback.demo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackDao dao;
	
	@Override
	public Feedback writeFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}

	@Override
	public List<Feedback> getFeedbackByProduct(String product) {
		
		return dao.findByProduct(product);
	}
	
	}


