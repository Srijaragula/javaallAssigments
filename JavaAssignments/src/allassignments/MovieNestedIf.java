package allassignments;

public class MovieNestedIf {

    public static void main(String[] args) {
        int age = 25, price = 0;
        String day = "weekday";

        if (day.equals("weekend")) {
            System.out.println("Inside if");
            if (age > 0) {
                if (age < 13) {
                    price = 40;
                } else if (age > 65) {
                    price = 30;
                } else {
                    price = 100;
                }
            } else {
                System.out.println("please provide the proper Input value ");
            }
        } else if (day.equals("weekday")) {
            System.out.println("else");
            if (age > 0) {
                if (age < 13) {
                    price = 50;
                } else if (age > 65) {
                    price = 40;
                } else {
                    price = 200;
                }
            } else {
                System.out.println("please provide the proper Input value ");
            }
        }
        System.out.println("price:" + price);
    }
}
