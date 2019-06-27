package by.it.academy.maven.impl;

import by.it.academy.maven.Service;

import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;

public class MathService implements Service {

    public Double average(List<Integer> integerList) {

        OptionalDouble optionalDouble =
                integerList.stream()
                .filter(Objects::nonNull)
                .mapToInt(value -> value)
                .average();

        return optionalDouble.orElse(0.0);

//        double sum = 0;
//        for (Integer integer : integerList) {
//            sum += integer;
//        }
//        return sum / integerList.size();
    }
}
