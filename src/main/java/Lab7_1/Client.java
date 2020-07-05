package Lab7_1;

public class Client {
    public static void main(String[] args) {
        RequestDirector requestDirector = new RequestDirector(new InfoRequestBuilder());
        Request request;
        Address address = new Address("44 High way", "Fairfield", "Iowa", "77723");
        Customer customer1=new Customer("Mam", "Qao", "345", "mo@gmail.com");
        Customer customer2=new Customer("Mika", "Aman", "543", "qa@gmail.com");

        Agent agent = new Agent("1", address);

        requestDirector.constructRequest(agent,customer1,"Request Info one", "response data one");
        request = requestDirector.getRequest();
        System.out.println(request);

        requestDirector.constructRequest(agent,customer2,"Request Info two", "response data two");
        request = requestDirector.getRequest();
        System.out.println(request);
    }

}
