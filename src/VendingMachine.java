import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    Product getProduct(String name);

//    //constructor
//    public VendingMachine() {
//        this.productList = initProduct();
//        this.money = 0;
//    }
//
//    // поля
//    private List<Product> productList;
//
//    private Integer money;
//
//    // методы
//
//    public Product getProduct(String name){
//        for (Product product : productList){
//            //если имя продукта совпадает, то вывести его
//            if (product.getName().equals((name))) {
//                money += product.getPrice();
//                return product;
//            }
//        }
//        return null;// если ничего не находим
//    }
//
//    // метод возвращает начальное кол-во продуктов, private - так как только в конструкторе используется
//    private List<Product> initProduct(){
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Молоко", 100));
//        products.add(new Product("Вода", 50));
//        products.add(new Product("Сухарики Кириешки", 30));
//
//        return products;
//    }

}
