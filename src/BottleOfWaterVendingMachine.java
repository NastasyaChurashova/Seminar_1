import java.util.List;
//#3 задание
public class BottleOfWaterVendingMachine implements VendingMachine {

    private final List<Product> productList;

    private int money;

    public BottleOfWaterVendingMachine(List<Product> productList) {
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

    public BottleOfWater getProduct(String name, int volume){
        for (Product product : productList){
            //проверка: продукт соответствует классу, является бутылкой воды
            if (product instanceof BottleOfWater){
                //осн.условие сопоставления имени и объема
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }
}
