package head_first_java;

/**
 * @ClassName TestClass
 * @Description TODO
 * @Author cutepig
 * @Date 2021/1/12 15:37
 * @Version 1.0
 */
public class TestClass {
    public static void main(String[] args) {
        TestClass.show("a", "b", "c");
    }

    public static void show(String...args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
