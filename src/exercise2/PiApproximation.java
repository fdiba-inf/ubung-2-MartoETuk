package exercise2;

public class PiApproximation{

    public static void main(String[] args) {

        double fiki = 1-1.0/3+1.0/5-1.0/7+1.0/11-1.0/13+1.0/17-1.0/19+1.0/23;
        double pi = 4*fiki;

        System.out.println("Pi: " + pi);
    }
}