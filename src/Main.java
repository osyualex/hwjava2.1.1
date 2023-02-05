public class Main {
    public static void main(String[] args) {

        int ticketPrice = 2490;
        int mile = 20;

        int bonus = ticketPrice / mile;

        if (ticketPrice < 20) {
            bonus = 0;
        }
        System.out.println(" Начисленные мили: " + bonus);
    }


}