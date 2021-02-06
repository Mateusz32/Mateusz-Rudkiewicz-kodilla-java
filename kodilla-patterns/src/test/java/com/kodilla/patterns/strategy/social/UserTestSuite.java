package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        Millenials mati = new Millenials("Mati");
        YGeneration domino = new YGeneration("Domino");
        ZGeneration tomi = new ZGeneration("Tomi");

        //When
        String millenialsGetSocialMedia = mati.sharePost();
        System.out.println("Mati use social media: " + millenialsGetSocialMedia);
        String yGenerationGetSocialMedia = domino.sharePost();
        System.out.println("Domino use social media: " + yGenerationGetSocialMedia);
        String zGenerationGetSocialMedia = tomi.sharePost();
        System.out.println("Tomi use social media: " + zGenerationGetSocialMedia);

        //Then
        assertEquals("Facebook", millenialsGetSocialMedia);
        assertEquals("Snapchat", yGenerationGetSocialMedia);
        assertEquals("Twitter", zGenerationGetSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        Millenials mati = new Millenials("Mati");

        //When
        String millenialsGetSocialMedia = mati.sharePost();
        System.out.println("Mati use social media: " + millenialsGetSocialMedia);
        mati.setSocialMediaStrategy(new TwitterPublisher());
        millenialsGetSocialMedia = mati.sharePost();
        System.out.println("Mati should use social media now: " + millenialsGetSocialMedia);

        //Then
        assertEquals("Twitter", millenialsGetSocialMedia);
    }
}
