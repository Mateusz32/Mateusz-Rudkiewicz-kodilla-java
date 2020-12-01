package test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 1);
        } catch (
                Exception e) {
            System.out.println("The X or Y vaule is incorrect");
        }
        finally {
            System.out.println("Throw & Throws");
        }
    }
}

