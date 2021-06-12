
public class Main {

    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(8, 6, 2021);

        SimpleDate newDate = date.afterNumberOfDays(7);
        System.out.println(date);       // 8.6.2021
        System.out.println(newDate);    // 15.6.2021

        int week = 1;
        while (week <= 10) {
            System.out.println("Monday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week++;
        }
    }
}
