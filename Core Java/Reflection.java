import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflection {

    public static void main(String[] args) {

        try {

            // Load class dynamically
            Class<?> cls = Class.forName("Student");

            System.out.println("Class Name: "
                    + cls.getName());

            // Get all declared methods
            Method[] methods =
                    cls.getDeclaredMethods();

            System.out.println("\nMethods:");

            for (Method method : methods) {

                System.out.println(
                        "Method: "
                        + method.getName());

                Parameter[] params =
                        method.getParameters();

                System.out.println(
                        "Number of Parameters: "
                        + params.length);

                for (Parameter p : params) {
                    System.out.println(
                            "Parameter Type: "
                            + p.getType().getSimpleName());
                }

                System.out.println();
            }

            // Create object dynamically
            Object obj =
                    cls.getDeclaredConstructor()
                       .newInstance();

            // Invoke display() method
            Method m =
                    cls.getMethod("display");

            m.invoke(obj);

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}