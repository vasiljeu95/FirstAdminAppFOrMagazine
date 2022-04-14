package com.github.vasiljeu95.firstAdminAppForMagazine.repository;

import com.github.vasiljeu95.firstAdminAppForMagazine.model.FeedbackMessage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/webShop";
    private static final String USER = "root";
    private static final String PASSWORD = "root1234";
    private static final String GET_FEEDBACK = "SELECT * FROM feedback_message";
    private static Connection connection;

    public static List<FeedbackMessage> resultFeedbackRepository() {
        List<FeedbackMessage> feedback = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("База данных успешно подключена!");

            Statement statement = connection.createStatement();
            feedback = findFeedbacks(statement);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("База данных подключена не успешно!");
        }
        return feedback;
    }

    private static List<FeedbackMessage> findFeedbacks(Statement statement) throws SQLException {
        List<FeedbackMessage> feedbacks = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery(FeedbackRepository.GET_FEEDBACK);

        while (resultSet.next()) {
            String name = resultSet.getString("client_name");
            String email = resultSet.getString("client_email");
            String phone = resultSet.getString("client_phone");

            feedbacks.add(new FeedbackMessage(name, email, phone));
        }

        resultSet.close();
        return feedbacks;
    }
}
