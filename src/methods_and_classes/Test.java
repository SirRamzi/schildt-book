package methods_and_classes;

public class Test {
    int a;

    public Test(int i) {
        a = i;
    }

    public void swap(Test test) {
        int temp;
        temp = a;
        a = test.a;
        test.a = temp;
    }

    public int getA() {
        return a;
    }
}
