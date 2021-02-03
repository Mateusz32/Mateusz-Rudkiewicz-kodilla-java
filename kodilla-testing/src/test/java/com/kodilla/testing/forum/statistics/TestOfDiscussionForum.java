package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.DiscussionForum;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestOfDiscussionForum {
    @Mock
    private Statistics statisticsMock;
    private List<String> listOfUser = new ArrayList<>();
    private int quantityOfPosts = 1000;
    private int quantityOfComments = 1000;

    @BeforeEach
    public void beforeEveryTest() {
        for (int i = 0; i < 1000; i++) {
            listOfUser.add("User" + i);
        }
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("TestOfDiscussionForum when quantity of posts = 0")
    @Test
    void testPostsEqualsZero() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();
        Assertions.assertEquals(1000, userQuantity);
        Assertions.assertEquals(0, posts);
        Assertions.assertEquals(1000, comments);
        Assertions.assertEquals(0, averagePostsPerUser);
        Assertions.assertEquals(1, averageComementsPerUser);
        Assertions.assertEquals(0, avergePostsPerComments);
    }

    @DisplayName("TestOfDiscussionForum when quantity of posts = 1000")
    @Test
    void testPostsEqualsThousand() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();

        Assertions.assertEquals(1000, userQuantity);
        Assertions.assertEquals(1000, posts);
        Assertions.assertEquals(1000, comments);
        Assertions.assertEquals(1, averagePostsPerUser);
        Assertions.assertEquals(1, averageComementsPerUser);
        Assertions.assertEquals(1, avergePostsPerComments);
    }

    @DisplayName("TestOfDiscussionForum when quantity of comments = 0")
    @Test
    void testCommentsEqualsZero() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();

        Assertions.assertEquals(1000, userQuantity);
        Assertions.assertEquals(1000, posts);
        Assertions.assertEquals(0, comments);
        Assertions.assertEquals(1, averagePostsPerUser);
        Assertions.assertEquals(0, averageComementsPerUser);
        Assertions.assertEquals(0, avergePostsPerComments);
    }

    @DisplayName("TestOfDiscussionForum when quantity of comments are less then quantity of posts")
    @Test
    void testCommentsLessThanPosts() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(32);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();

        Assertions.assertEquals(1000, userQuantity);
        Assertions.assertEquals(1000, posts);
        Assertions.assertEquals(32, comments);
        Assertions.assertEquals(1, averagePostsPerUser);
        Assertions.assertEquals(0.032, averageComementsPerUser);
        Assertions.assertEquals(31.25, avergePostsPerComments);
    }

    @DisplayName("TestOfDiscussionForum when quantity of comments are more then quantity of posts")
    @Test
    void testCommentsMoreThanPosts() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(27);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();

        Assertions.assertEquals(1000, userQuantity);
        Assertions.assertEquals(27, posts);
        Assertions.assertEquals(1000, comments);
        Assertions.assertEquals(0.027, averagePostsPerUser);
        Assertions.assertEquals(1, averageComementsPerUser);
        Assertions.assertEquals(0.027, avergePostsPerComments);
    }

    @DisplayName("TestOfDiscussionForum when quantity of users = 0")
    @Test
    void testQuantityOfUsersEqualsZero() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        listOfUser.clear();
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(27);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();
        Assertions.assertEquals(0, userQuantity);
        Assertions.assertEquals(27, posts);
        Assertions.assertEquals(1000, comments);
        Assertions.assertEquals(0, averagePostsPerUser);
        Assertions.assertEquals(0, averageComementsPerUser);
        Assertions.assertEquals(0.027, avergePostsPerComments);
    }

    @DisplayName("TestOfDiscussionForum when quantity of users = 1000")
    @Test
    void testQuantityOfUsersEqualsThousand() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        listOfUser.size();
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(27);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();

        Assertions.assertEquals(1000, userQuantity);
        Assertions.assertEquals(27, posts);
        Assertions.assertEquals(1000, comments);
        Assertions.assertEquals(0.027, averagePostsPerUser);
        Assertions.assertEquals(1, averageComementsPerUser);
        Assertions.assertEquals(0.027, avergePostsPerComments);
    }

    @DisplayName("TestOfDiscussionForum when quantity of users = 1000, quantity of posts = 1000 & quantity of comments = 1000,")
    @Test
    void testUsersPostsCommentsAreEquals() {

        //Given
        DiscussionForum discussionForum = new DiscussionForum(statisticsMock);
        listOfUser.size();
        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(quantityOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(quantityOfComments);

        //When
        List<Double> statistic = discussionForum.calculateAdvStatistics(statisticsMock);
        double userQuantity = statistic.get(0);
        double posts = statistic.get(1);
        double comments = statistic.get(2);
        double averagePostsPerUser = statistic.get(3);
        double averageComementsPerUser = statistic.get(4);
        double avergePostsPerComments = statistic.get(5);

        //Then
        discussionForum.showStatistics();
        Assertions.assertEquals(1000, userQuantity);
        Assertions.assertEquals(1000, posts);
        Assertions.assertEquals(1000, comments);
        Assertions.assertEquals(1, averagePostsPerUser);
        Assertions.assertEquals(1, averageComementsPerUser);
        Assertions.assertEquals(1, avergePostsPerComments);
    }
}

