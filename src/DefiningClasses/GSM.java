package DefiningClasses;

import java.util.ArrayList;
import java.util.List;

public class GSM {
//    Create attributes
    private String model;
    private String manufacturer;
    private Double price;
    private String owner;
    private Battery battery;
    private Display display;
    public List<Call> callHistory = new ArrayList<Call>();

    public GSM(){
    }

    public GSM(String model, String manufacturer, Double price, String owner, Battery battery, Display display){
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.battery = battery;
        this.display = display;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }
    public Battery getBattery() { return battery; }
    public void setBattery() { this.battery = battery; }
    public Display getDisplay() { return display; }
    public void setDisplay(Display display) { this.display = display; }

    @Override
    public String toString() {
        return "GSM{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", battery=" + battery +
                ", display=" + display +
                '}';
    }

    public void addCall(Call call){
        callHistory.add(call);
    }
    public void deleteCall(Call call){
        callHistory.remove(call);
    }
    public void clearCall(){
        callHistory.clear();
    }
    public double totalPriceCall(){
        double price = 0;
        double pricePerMinute = 0.37;
        for (Call c: callHistory) {
            price += c.getDuration();
        }
        return price = (price / 60) * pricePerMinute;
    }
}
