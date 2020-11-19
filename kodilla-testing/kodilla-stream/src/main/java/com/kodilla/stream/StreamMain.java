package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer,ForumUser> newMap = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBornDate().getYear()<2000)
                .filter(forumUser -> forumUser.getQuantityOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        System.out.println(newMap.size());
        newMap.entrySet().stream()
                .map(entry->entry.getKey()+":"+entry.getValue().toString())
                .forEach(System.out::println);

    }
}


