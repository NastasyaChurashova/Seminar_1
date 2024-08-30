//Создать наследника класса Продукта - ГорячийНапиток с доп.полем int температура

public class HotDrink extends Product {

    private int temperature;

    private int volume;

    public HotDrink(String name, int price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + getName() +
                ", temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}
