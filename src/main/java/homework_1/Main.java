package homework_1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product banana=new Product("Банан",45.4f,5.0f);
        Product apple= new Product("Яблоко",30.1f,4.3f);
        Product tomato=new Product("Помидор", 23.0f,5.0f);
        Product pickle=new Product("Огурец",15.0f,4.8f);
        Product cow=new Product("Говядина", 108.0f,5.0f);
        Product sheep=new Product("Баранина", 250.8f,5.0f);
        Category fruits=new Category("Фрукты",new Product[]{banana,apple});
        Category vegetables=new Category("Овощи",new Product[]{tomato,pickle});
        Category meats=new Category("Мясо", new Product[]{cow,sheep});
        List<Product> allProducts=new LinkedList<>();
        allProducts.add(banana);
        allProducts.add(apple);
        allProducts.add(tomato);
        allProducts.add(pickle);
        allProducts.add(cow);
        allProducts.add(sheep);
        System.out.println("Список всех продуктов магазина: ");
        allProducts.forEach(x->System.out.print(x+" "));
        Basket basket1=new Basket(new Product[]{banana,tomato,pickle});
        allProducts.remove(banana);
        allProducts.remove(tomato);
        allProducts.remove(pickle);
        Basket basket2=new Basket(new Product[]{cow,sheep});
        User user1=new User("Alex","123",basket1);
        User user2=new User("Nastya","321",basket2);
        allProducts.remove(cow);
        allProducts.remove(sheep);
        System.out.println("\nЧто осталось в магазине: ");
        allProducts.forEach(x->System.out.println(x+" "));
    }
}
