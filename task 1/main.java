import java.lang.reflect.Modifier;
import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("Enter Class Name :");
        String className = sc.nextLine();
        Class c = Class.forName(className);
        int modifier = c.getModifiers();
        if (Modifier.isPublic(modifier)) {
            System.out.print("Public ");
        } else System.out.print("Private ");
        System.out.println(c.getTypeName() + ' ' + c.getName());
    }
}
