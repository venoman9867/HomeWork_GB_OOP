package homework_1;

import java.util.LinkedList;
import java.util.List;

public class Category extends Shop implements Actions{
    List<Product> list=new LinkedList<>();
    @Override
    public void addItem(Product product) {
        list.add(product);
    }

    @Override
    public void showList() {
        list.forEach(x->System.out.println(x+" "));
    }

    @Override
    public void remove(Product product) {
        list.remove(product);
    }

    public List<Product> getList() {
        return list;
    }
}
