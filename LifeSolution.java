import java.util.Scanner;

public class LifeSolution {
    public static void main(String[] args) {
        LifeSolution ls = new LifeSolution();
        ls.initialize();
    }

    private void initialize() {
        askSorryTillForgiven();
        clarifyThings();
    }

    private void askSorryTillForgiven() {
        Scanner sn = null;
        try {
            sn = new Scanner(System.in);

            System.out.println("Do you want to forgive 'Aman' right way for his mistakes? (Yes :) / No - -)?");
            String answer = sn.nextLine();

            if (check(answer)) {
                System.out.println("Are you sure?(Yes :) / No - -)");
                answer = sn.nextLine();
                if (check(answer)) {
                    System.out.println("You are very sweet. Thank you :)");
                    return;
                }
                else {
                    System.out.println("Dont change your mind. But you are right, Aman does not deserve to be easily forgiven");
                }
            }

            System.out.println("Aman was not very good yesterday in talking to you and hurted you. He is very bad, but he likes you really and he is sorry");
            Thread.sleep(1000);
            System.out.println("He was stupid and foolish yesterday and was overthinking :(  Only thing that matters is chemistry between you and him, rest all others things are not important at all. ");
            Thread.sleep(1000);
            System.out.println("You make him happy whenever he talks to you and he doesnot want that conversation to ever end.");
            Thread.sleep(1000);
            System.out.println("Do you want to forgive him now?");
            boolean forgiven = false;
            boolean leftCheekHit = false;
            do {
                answer = sn.nextLine();
                if (check(answer)) {
                    forgiven = true;
                }
                else {
                    String cheek = leftCheekHit ? "left" : "right";
                    leftCheekHit = !leftCheekHit;
                    System.out.println("Gives tight slap on his " + cheek + " cheek");
                    Thread.sleep(1000);
                    System.out.println("He is saying sorry. Do you want to forgive him now?");
                    answer = sn.nextLine();
                    if (check(answer)) {
                        forgiven = true;
                    }
                    else {
                        System.out.println("He is really sorry, please have mercy :( ");
                        Thread.sleep(1000);
                        System.out.println("Do you want to forgive him now?");
                    }
                }
            } while (forgiven == false);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (sn != null) {
                sn.close();
            }
        }
    }

    private void clarifyThings() {
        System.out.println("Thank you for forgiving Aman. He is very happy now :D");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Now he is saying, he wont ever leave you and you would have to bear him his entire life");
        System.out.println("Get ready for action");
    }

    private boolean check(String answer) {
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        }

        return false;
    }
}
