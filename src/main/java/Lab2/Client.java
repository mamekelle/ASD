package Lab2;

public class Client {
    public static void main(String[] args) {
        Adapter adapter= new Adapter();
        adapter.push("A");
        adapter.push("B");
        adapter.push("C");
        adapter.push("D");
        adapter.toString();

    }

}
