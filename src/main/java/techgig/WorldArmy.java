package techgig;

import java.time.Duration;
import java.util.Calendar;
import java.util.Scanner;


public class WorldArmy {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String launchTime = sc.nextLine();
            String travelTime = sc.nextLine();

            Duration launchDuration =Duration.ofHours(Integer.parseInt(launchTime.split(" ")[0]))
                    .plusMinutes(Integer.parseInt(launchTime.split(" ")[1]));

            Duration travelDuration =Duration.ofHours(Integer.parseInt(travelTime.split(" ")[0]))
                    .plusMinutes(Integer.parseInt(travelTime.split(" ")[1]));
            Duration hitTime = launchDuration.plus(travelDuration);


            System.out.println(String.format("%02d", hitTime.toHours() % 24) + " "
                    + String.format("%02d", (int) (hitTime.toMinutes() % 60)));

        } catch( Exception e) {
            e.printStackTrace();
        }
    }
}
