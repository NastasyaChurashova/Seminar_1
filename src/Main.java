//1. Реализация класса Товар, содержащего данные о товаре, и
// Торговый автомат, содержащий в себе методы initProducts (List <Product>),
// сохраняющий в себе список исходных продуктов и getProduct(String name)

//2. Инкапсуляция: реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомато на основе кода в предыд.задании

//3. Наследование: сделайте Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды), сделайте интерфейсом Торговый автомат и
// реализуйте класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

//4. Полиморфизм: переопределить метод toString для Товара, запустить программу, после этого переопределить для наследника этот метод,
//после запуска обратить внимание на изменение поведения.
// Создать перегруженный метод выдачи товара Торговымавтоматом дополнив доп-м входным параметром (пример: getProduct(String name)
// выдающий товар по имени, создать метод возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("Чай", 100, 80, 250));
        products.add(new HotDrink("Кофе", 150, 90, 300));
        products.add(new HotDrink("Компот", 50, 70, 300));

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(products);

        Product tea = vendingMachine.getProduct("Чай");
        if (tea != null) {
            System.out.println("Получен продукт: " + tea);
        } else {
            System.out.println("Чай не найден");
        }

        Product coffee = vendingMachine.getProduct("Кофе");
        if (coffee != null) {
            System.out.println("Получен продукт: " + coffee);
        } else {
            System.out.println("Кофе не найден");
        }

        // Вывод состояния автомата
        System.out.println("Состояние автомата: " + vendingMachine);
    }
}