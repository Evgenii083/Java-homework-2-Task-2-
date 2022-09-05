public class Main {

    public static void main(String[] args) {
        int baseScore = 100;
        int payment = 1100;

        boolean x = payment >= 1000;

        int bonus;
        if (x) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(bonus + baseScore + payment);

    }
}
