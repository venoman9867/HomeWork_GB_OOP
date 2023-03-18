package homework_4;

import java.util.List;

public class Calculator implements Methods<Number> {
    @Override
    public Number add(List<Number> items) {
        double sum = 0;
        for (Number value : items) {
            sum += value.doubleValue();
        }
        return sum;
    }

    @Override
    public Number divide(List<Number> items) {
        double result = items.get(0).doubleValue();
        for (int i = 1; i < items.size(); i++) {
            result = result / items.get(i).doubleValue();
        }
        return result;
    }

    @Override
    public Number multiply(List<Number> items) {
        double result = items.get(0).doubleValue();
        for (int i = 1; i < items.size(); i++) {
            result = result * items.get(i).doubleValue();
        }
        return result;
    }

    @Override
    public Number toBinary(List<Number> items) {
        return null;
    }

}
