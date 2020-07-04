package Lab7_1;

public class RequestDirector {
    RequestBuilder requestBuilder = null;

    public RequestDirector(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }
    public void constructRequest(Agent agent, Customer customer, String req,String resp){
        requestBuilder.initialRequest(agent);
        requestBuilder.buildAgent(agent);
        requestBuilder.buildCustomer(customer);
        requestBuilder.buildRequestContent(req);
        requestBuilder.buildResponseContent(resp);
    }
    public Request getRequest(){
      return   requestBuilder.getRequest();
    }
}
