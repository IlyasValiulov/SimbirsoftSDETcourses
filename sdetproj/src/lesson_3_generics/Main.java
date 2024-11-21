package lesson_3_generics;

import lesson_3_generics.functional_interfaces.Discriminant;
import lesson_3_generics.functional_interfaces.Predicate;

public class Main {
    public static void main(String[] args)
    {
        Predicate<Integer> predicate = x -> x % 13 == 0;

        Discriminant discriminant = (a, b, c) -> b * b - 4 * a * c;
    }
}