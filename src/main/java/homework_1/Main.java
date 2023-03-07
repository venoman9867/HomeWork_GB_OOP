package homework_1;

public class Main {
    public static void main(String[] args) {
        Product banana=new Product("Банан",45.4f,5.0f);
        Product apple= new Product("Яблоко",30.1f,4.3f);
        Product tomato=new Product("Помидор", 23.0f,5.0f);
        Product pickle=new Product("Огурец",15.0f,4.8f);
        Product cow=new Product("Говядина", 108.0f,5.0f);
        Product sheep=new Product("Баранина", 250.8f,5.0f);
        Category fruits=new Category();
        fruits.addItem(banana);
        fruits.addItem(apple);
        Category vegetables=new Category();
        vegetables.addItem(tomato);
        vegetables.addItem(pickle);
        Category meat=new Category();
        meat.addItem(cow);
        meat.addItem(sheep);
        System.out.println("Все продукты до покупки: ");
        Shop.showProducts(fruits,vegetables,meat);
        Basket basket1=new Basket();
        basket1.addItem(apple,fruits);
        basket1.addItem(pickle,vegetables);
        User user1=new User("Alex","123",basket1);
        Basket basket2=new Basket();
        basket2.addItem(cow,meat);
        basket2.addItem(sheep,meat);
        User user2=new User("Nastya","321",basket2);
        System.out.println("Все продукты после покупки: ");
        Shop.showProducts(fruits,vegetables,meat);
    }
}
