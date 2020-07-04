package Lab7_1;

public interface RequestBuilder {
    void initialRequest(Agent agent);
     void buildAgent(Agent agent);
     void buildCustomer(Customer customer);
     void buildRequestContent(String requestContent);
     void buildResponseContent(String responseContent);
     Request getRequest();
}
