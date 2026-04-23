package com.example.service;

import com.example.model.Feedback;
import com.example.repo.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public String addFeedback(Feedback feedback){
        feedbackRepository.save(feedback);
        return "Feedback added";
    }
}
