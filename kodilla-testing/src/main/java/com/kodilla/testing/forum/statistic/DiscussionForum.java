package com.kodilla.testing.forum.statistic;

import java.util.ArrayList;
import java.util.List;

public class DiscussionForum {
    private Statistics statistics;

    public DiscussionForum(Statistics statistics) {
        this.statistics = statistics;
    }

    public List<Double> calculateAdvStatistics(Statistics statistics) {
        double quantityOfUser = statistics.usersNames().size();
        double averagePostsPerUser;
        if (quantityOfUser == 0) {
            averagePostsPerUser = 0;
        } else {
            averagePostsPerUser = (double) statistics.postsCount() / quantityOfUser;
        }
        double averageComementsPerUser;
        if (quantityOfUser == 0) {
            averageComementsPerUser = 0;
        } else {
            averageComementsPerUser = (double) statistics.commentsCount() / quantityOfUser;
        }
        double avergePostsPerComments;
        if (statistics.commentsCount() == 0) {
            avergePostsPerComments = 0;
        } else {
            avergePostsPerComments = (double) statistics.postsCount() / statistics.commentsCount();
        }
        List<Double> listStatistic = new ArrayList<>();
        listStatistic.add(quantityOfUser);
        listStatistic.add((double) statistics.postsCount());
        listStatistic.add((double) statistics.commentsCount());
        listStatistic.add(averagePostsPerUser);
        listStatistic.add(averageComementsPerUser);
        listStatistic.add(avergePostsPerComments);
        return listStatistic;
    }

    public void showStatistics() {
        System.out.println("QuantityOfUser: " + calculateAdvStatistics(statistics).get(0));
        System.out.println("PostsCount: " + calculateAdvStatistics(statistics).get(1));
        System.out.println("CommentsCount: " + calculateAdvStatistics(statistics).get(2));
        System.out.println("AveragePostsPerUser: " + calculateAdvStatistics(statistics).get(3));
        System.out.println("AverageComementsPerUser: " + calculateAdvStatistics(statistics).get(4));
        System.out.println("AvergePostsPerComments: " + calculateAdvStatistics(statistics).get(5));
    }
}
