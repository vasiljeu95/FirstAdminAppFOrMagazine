package com.github.vasiljeu95.firstAdminAppForMagazine.service;

import com.github.vasiljeu95.firstAdminAppForMagazine.model.FeedbackMessage;
import com.github.vasiljeu95.firstAdminAppForMagazine.repository.FeedbackRepository;

import java.util.List;

public class FeedbackService {
    public static List<FeedbackMessage> checkFeedbackService() {
        return FeedbackRepository.resultFeedbackRepository();
    }
}
