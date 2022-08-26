package DefiningClasses;

import java.util.Date;

public class Call {
    private Date dateCall;
    private String dialedPhone;
    private int duration;

    public Call(Date dateCall, String dialedPhone, int duration){
        this.dateCall = dateCall;
        this.dialedPhone = dialedPhone;
        this.duration = duration;
    }

    public Date getDateCall() {
        return dateCall;
    }
    public void setDateCall(Date dateCall) {
        this.dateCall = dateCall;
    }
    public String getDialedPhone() {
        return dialedPhone;
    }
    public void setDialedPhone(String dialedPhone) {
        this.dialedPhone = dialedPhone;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Call{" +
                "dateCall=" + dateCall +
                ", dialedPhone='" + dialedPhone + '\'' +
                ", duration=" + duration +
                '}';
    }
}
