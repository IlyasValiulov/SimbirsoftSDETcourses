package lesson_3_generics.functional_interfaces;

@FunctionalInterface
public interface Predicate<T extends Number> {
    boolean test(T t);
}
