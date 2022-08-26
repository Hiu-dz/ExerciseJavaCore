package HRManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Worker extends Human {
    private double WeekSalary;
    private double WorkHoursPerDay;

    public Worker() {
        super();
    }

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.WeekSalary = weekSalary;
        this.WorkHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return WeekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        WeekSalary = weekSalary;
    }

    public double getWorkHoursPerDay() {
        return WorkHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        WorkHoursPerDay = workHoursPerDay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", WeekSalary=" + WeekSalary +
                ", WorkHoursPerDay=" + WorkHoursPerDay +
                '}';
    }

    public double MoneyPerHour(double weekSalary, double workHoursPerDay) {
        double DaySalary = weekSalary / 6; // Work for 6 day in week
        double HourSalary = DaySalary / workHoursPerDay; // Work for 8 hour a day
        return HourSalary;
    }

    public List<Worker> ShowWorker() {
        List<Worker> workerList = new ArrayList<Worker>();
        workerList.add(new Worker("Võ", "Hiếu", 2000000, 8));
        workerList.add(new Worker("Nguyễn", "Ngân", 4000000, 8));
        workerList.add(new Worker("Trần", "Quân", 3000000, 7));
        workerList.add(new Worker("Nguyễn", "Linh", 1500000, 6));
        workerList.add(new Worker("Lê", "Sơn", 2300000, 8));
        workerList.add(new Worker("Lê", "Thái", 2600000, 6));
        workerList.add(new Worker("Nguyễn", "Hải", 2100000, 6));
        workerList.add(new Worker("Trần", "Chân", 3100000, 8));
        workerList.add(new Worker("Võ", "Huy", 1200000, 7));
        workerList.add(new Worker("Cao", "Tiến", 900000, 7));

        Collections.sort(workerList, (p1, p2) -> (int) (p2.MoneyPerHour(p2.WeekSalary, p2.WorkHoursPerDay) - p1.MoneyPerHour(p1.WeekSalary, p1.WorkHoursPerDay)));

//        for (Worker w : workerList) {
//            System.out.println(w.toString());
////            double rs = MoneyPerHour(w.WeekSalary, w.WorkHoursPerDay);
////            System.out.printf("%s: %.2f \n", w.lastName, rs);
//        }
        return workerList;
    }
}
