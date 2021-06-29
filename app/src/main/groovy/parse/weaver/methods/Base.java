package parse.weaver.methods;

public class Base {
    public Class klass;
    public Base() {
        klass = this.getClass();
    }

    public static void main(String[] args) {
        Child b = new Child();
        System.out.println(b.klass);
    }

    private static class Child extends Base {}
}
