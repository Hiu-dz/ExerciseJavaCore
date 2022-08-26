package DefiningClasses;

import java.util.ArrayList;
import java.util.List;

public class GSMTest {
    public static void main(String[] args) {
        // Create an array of few instances of the GSM class.
        List<GSM> arrGSM = new ArrayList<GSM>();

        Battery battery1 = new Battery("LiOn", 56, 9, Battery.BatteryType.LiIon);
        Battery battery2 = new Battery("NiCd", 56, 9, Battery.BatteryType.NiCd);
        Battery battery3 = new Battery("NiMH", 56, 9, Battery.BatteryType.NiMH);

        Display display1 = new Display(6, 3);
        Display display2 = new Display(5, 5);
        Display display3 = new Display(7, 4);

        GSM gsm1 = new GSM("Iphone 13 Pro Max", "Apple", 33.0, "Steve Job", battery1, display1);
        GSM gsm2 = new GSM("Samsung Galaxy S22 Ultra", "Samsung", 28.0, " Lee Kun-hee", battery2, display2);
        GSM gsm3 = new GSM("Oppo FindX 3 Pro", "Oppo", 25.0, "Đoàn Vĩnh Bình", battery3, display3);

        arrGSM.add(gsm1);
        arrGSM.add(gsm2);
        arrGSM.add(gsm3);

        // Display the information about the GSMs in the array.
        for (GSM g: arrGSM ) {
            System.out.println(g);
        }
    }
}
