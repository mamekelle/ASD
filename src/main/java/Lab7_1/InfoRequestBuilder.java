package Lab7_1;


public class InfoRequestBuilder  implements RequestBuilder{
    Request request= null;

    @Override
    public void initialRequest(Agent agent) {
        Call call = new Call();
        call.callPop(agent);
        request = new Request(call.getRequestId(), agent);
        System.out.println("Init Request (request id, agent id): " + call.getRequestId() + ", " + agent.getId());
    }

    @Override
    public void buildAgent(Agent agent) {
    request.setAgent(agent);
    }

    @Override
    public void buildCustomer(Customer customer) {
        request.setCustomer(customer);
    }

    @Override
    public void buildRequestContent(String requestContent) {
        request.setReqContent(requestContent);
    }

    @Override
    public void buildResponseContent(String responseContent) {
request.setRespContent(responseContent);
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
