package by.it.academy;

import by.it.academy.maven.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        Service service =
                ServiceLoader.load(Service.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No service"));

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(null);
        values.add(2);


        Double result = service.average(values);
        System.out.println("result = " + result);
    }
}
