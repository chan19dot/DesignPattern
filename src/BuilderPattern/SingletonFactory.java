package BuilderPattern;
import java.util.HashMap;
        import java.util.Map;
        import java.util.function.Supplier;

public class SingletonFactory {
    // HashMap to keep track of instances created by the factory methods
    private static Map<String, Object> instances = new HashMap<>();

    public static boolean isSingleton(Supplier<Object> factoryMethod) {
        Object obj = factoryMethod.get();

        String className = obj.getClass().getName();

        if (instances.containsKey(className)) {
            Object existingInstance = instances.get(className);
            return existingInstance == obj;
        } else {
            instances.put(className, obj);
            return true;
        }
    }
    static class SingletonClass {
    }

    static SingletonClass createSingleton() {
        return new SingletonClass();
    }

    public static void main(String[] args) {
        boolean result1 = SingletonFactory.isSingleton(SingletonFactory::createSingleton);
        boolean result2 = SingletonFactory.isSingleton(SingletonFactory::createSingleton);

        System.out.println(result1);
        System.out.println(result2);
    }
}
