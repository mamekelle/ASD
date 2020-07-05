package Lab7_1;

public class Agent {
    private String id;
    private Address address;

    public Agent(String id, Address address) {
        this.id = id;
        this.address = address;
    }


    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
