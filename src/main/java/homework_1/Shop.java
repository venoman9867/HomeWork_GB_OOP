package homework_1;

import java.util.Arrays;

public class Shop {
    public static void showProducts(Category...categories){
        Arrays.stream(categories).forEach(x->x.showList());
    }
}
