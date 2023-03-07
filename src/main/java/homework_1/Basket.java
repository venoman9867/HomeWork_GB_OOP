package homework_1;

import java.util.LinkedList;
import java.util.List;

public class Basket {
    private List<Product> list=new LinkedList<>();
    public void addItem(Product product,Category category){
        list.add(product);
        category.remove(product);
    }
}
