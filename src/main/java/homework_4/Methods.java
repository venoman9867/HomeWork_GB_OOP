package homework_4;

import java.util.List;

public interface Methods<T extends Number> {
    T add(List<T> items);

    T divide(List<T> items);

    T multiply(List<T> items);

    List<T> toBinary(List<T> items);
}
