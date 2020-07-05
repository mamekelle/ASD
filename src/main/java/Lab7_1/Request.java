package Lab7_1;


public class Request {
    private String reqId;

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public void setRespContent(String respContent) {
        this.respContent = respContent;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public void setSaleLead(boolean saleLead) {
        isSaleLead = saleLead;
    }

    private Customer requester;
    private Agent agent;
    private String reqContent;
    private String respContent;
    private boolean isAnswered;
    private boolean isSaleLead;
    private boolean needCallBack;

    public Request(String requestId, Agent agent) {
        this.reqId=requestId;
        this.agent=agent;
    }

    public void setAgent(Agent agent) {
        this.agent=agent;
    }

    public void setCustomer(Customer customer) {
        this.requester=customer;
    }

    @Override
    public String toString() {
        return "Request{" +
                "reqId='" + reqId + '\'' +
                ", requester=" + requester +
                ", agent=" + agent.getId() +
                ", reqContent='" + reqContent + '\'' +
                ", respContent='" + respContent + '\'' +
                ", isAnswered=" + isAnswered +
                ", isSaleLead=" + isSaleLead +
                ", needCallBack=" + needCallBack +
                '}';
    }
}
