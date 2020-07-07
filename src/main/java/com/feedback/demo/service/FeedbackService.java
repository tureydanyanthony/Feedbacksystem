package com.feedback.demo.service;

import java.util.List;

import com.feedback.demo.model.Feedback;



public interface FeedbackService {
	
	public Feedback writeFeedback(Feedback feedback);
	public List<Feedback> getFeedbackByProduct(String product);
	
}
