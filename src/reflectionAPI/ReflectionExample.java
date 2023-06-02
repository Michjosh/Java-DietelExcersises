package reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
        public static void main(String[] args) throws Exception {
            // Obtaining the Class object
            Class<?> myClass = MyClass.class;

            // Accessing and modifying private field
            Field privateField = myClass.getDeclaredField("privateField");
            privateField.setAccessible(true);
            MyClass instance = new MyClass();
            System.out.println("Private field value: " + privateField.get(instance));
            privateField.set(instance, "Modified value");
            System.out.println("Private field value after modification: " + privateField.get(instance));

            // Invoking private method
            Method privateMethod = myClass.getDeclaredMethod("privateMethod");
            privateMethod.setAccessible(true);
            privateMethod.invoke(instance);
        }
    }
