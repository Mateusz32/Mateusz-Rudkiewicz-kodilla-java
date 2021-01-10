package com.kodilla.good.patterns.challenges;

public class Mail implements InformationService {
    @Override
    public void sendMessage(User user) {
        System.out.println("Send e-mail to: "+user.getName()+" "+user.getSurname());
    }
}
