package DefiningClasses;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GSMCallHistoryTest {
    public static void main(String[] args) {
        // Create an instance of the GSM class.
        List<Call> call = new ArrayList<Call>();

        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();

        Call call1 = new Call(date1, "0123456789", 5);
        Call call2 = new Call(date2, "0987654321", 8);
        Call call3 = new Call(date3, "0123698745", 7);

        // Add few calls.
        call.add(call1);
        call.add(call2);
        call.add(call3);

        // Display the information about the calls.
        for (Call c : call) {
            System.out.println(c);
        }

        // Assuming that the price per minute is 0.37 calculate and print the total price of the calls in the history.
        GSM gsm = new GSM();
        gsm.callHistory.add(call1);
        gsm.callHistory.add(call2);
        gsm.callHistory.add(call3);

        double rs = gsm.totalPriceCall();
        System.out.printf("The total price of the calls: %.2f \n", rs);

        // Remove the longest call from the history and calculate the total price again.
        int max = 0;
        for (Call c2 : call) {
            int duration = c2.getDuration();
            if (duration > max) {
                max = duration;
            }
        }

        for (Call c3 : call) {
            if (c3.getDuration() == max) {
                gsm.deleteCall(c3);
            }
        }
        double rs2 = gsm.totalPriceCall();
        System.out.printf("The total price again: %.2f \n", rs2);

        // Finally clear the call history and print it.
        gsm.clearCall();
        if (gsm.callHistory.size() == 0){
            System.out.println("Call history is clear");
//            System.out.println(gsm.callHistory);
        }
    }
}