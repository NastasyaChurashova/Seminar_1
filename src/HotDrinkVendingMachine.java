import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private final List<Product> productList;

    private int money;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name){
        for (Product product : productList){
            //если имя продукта совпадает, то вывести его
            if (product.getName().equals((name))) {
                money += product.getPrice();
                return product;
            }
        }
        return null;// если ничего не находим
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for (Product product : productList){
            //проверка: продукт соответствует классу, является горячим напитком
            if (product instanceof HotDrink){
                //осн.условие сопоставления имени, объема и температуры
                if (product.getName().equals(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
                "productList=" + productList +
                ", money=" + money +
                '}';
    }
}
