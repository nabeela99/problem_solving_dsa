package GeekTrust;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DoReMiSubscription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("START_SUBSCRIPTION");
        String date = sc.nextLine();
        try {
            Date format = new SimpleDateFormat("dd-mm-yyyy").parse(date);
            System.out.println(format);
        } catch (Exception e) {
            System.err.println("Invalid date value:: " + date);
        }
        System.out.println("ADD_SUBSCRIPTION");
        List<List<String>> l1 = new ArrayList<>();
        List<String> SUBSCRIPTION_CATEGORY = new ArrayList<>();
        List<String> PLAN_NAME = new ArrayList<>();
        SUBSCRIPTION_CATEGORY.add("Music");
        SUBSCRIPTION_CATEGORY.add("Video");
        SUBSCRIPTION_CATEGORY.add("Podcast");
        PLAN_NAME.add("FREE");
        PLAN_NAME.add("PERSONAL");
        PLAN_NAME.add("PREMIUM");
        l1.add(SUBSCRIPTION_CATEGORY);
        l1.add(PLAN_NAME);

        System.out.println("ADD_TOPUP");
        String TOP_UP_NAME = sc.nextLine();
        int NO_OF_MONTHS = sc.nextInt();
        System.out.println("PRINT_RENEWAL_DETAILS");
        DoReMiSubscription obj = new DoReMiSubscription();

        obj.renewal();
    }
    public void renewal(){

    }

}
