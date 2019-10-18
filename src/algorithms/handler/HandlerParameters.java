package algorithms.handler;

import java.util.ArrayList;
import java.util.List;

public class HandlerParameters {

    public void handleParameters(Object[] parameters) {
        String concatString = "";
        Double sumOfAllNumbers = 0.0;
        List<Person> personList = new ArrayList<>();

        for (Object val : parameters) {
            if (val instanceof String || val instanceof Character) {
                concatString += val;
            }
            if (val instanceof Number) {
                sumOfAllNumbers += ((Number) val).doubleValue();
            }

            if (val instanceof Person) {
                personList.add((Person) val);
            }

        }

        Person[] arrOfPeople = new Person[personList.size()];

        System.out.println("Sum of all numbers:" + sumOfAllNumbers);
        System.out.println("All strings and char :" + concatString);
        for (int i = 0; i < arrOfPeople.length; i++) {
            arrOfPeople[i] = personList.get(i);
            System.out.println("\n" + arrOfPeople[i]);
        }


    }
}
