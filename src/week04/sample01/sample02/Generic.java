package week04.sample01.sample02;


public class Generic<T> {
    private T t;

    public T get() {
        return this.t;
    }
    String s = "aaa";
    int a = s.length();
    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.set("Hello World");
        String tValueTurnOutWithString = stringGeneric.get();
        System.out.println(tValueTurnOutWithString);
    }
}
