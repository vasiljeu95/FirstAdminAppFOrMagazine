package com.github.vasiljeu95.firstAdminAppForMagazine.servlet;

import com.github.vasiljeu95.firstAdminAppForMagazine.model.FeedbackMessage;
import com.github.vasiljeu95.firstAdminAppForMagazine.service.FeedbackService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "feedback", value = "/feedback")
public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<FeedbackMessage> feedback = FeedbackService.checkFeedbackService();

        req.setAttribute("feedback", feedback);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
