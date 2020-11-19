package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int idUser;
    private final String nameUser;
    private final char sex;
    private final LocalDate bornDate;
    private final int quantityOfPosts;

    public ForumUser(final int idUser, final String nameUser, final char sex, final LocalDate bornDate, final int quantityOfPosts) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.sex = sex;
        this.bornDate = bornDate;
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser= " +
                "nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", bornDate=" + bornDate +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
}
