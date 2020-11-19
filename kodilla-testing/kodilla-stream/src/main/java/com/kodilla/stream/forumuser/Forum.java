package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  final class Forum {

    private final List<ForumUser> list = new ArrayList<>();

    public Forum() {
        list.add(new ForumUser(1, "Mateusz", 'M', LocalDate.of(1994, 3, 2), 5));
        list.add(new ForumUser(2, "Adrian", 'M', LocalDate.of(2000, 10, 15), 3));
        list.add(new ForumUser(3, "Natalia", 'F', LocalDate.of(2002, 8, 30), 1));
        list.add(new ForumUser(4, "Marta", 'F', LocalDate.of(1998, 5, 26), 2));
        list.add(new ForumUser(5, "Jan", 'M', LocalDate.of(1999, 12, 12), 0));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(list);
    }

}
