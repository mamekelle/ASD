package Lab3_1;

public class Adapter  implements TargetStack, TargetQueue {
    private Adaptee adaptee = new Adaptee();
    private int size;

    @Override
    public void push(String str) {
    adaptee.add(str);
    }

    @Override
    public String pop() throws QueueStackException {
        if(adaptee.empty()){
            throw new QueueStackException("Stack is empty");
        }
        int end =adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }

    @Override
    public void enqueue(String str) {
        adaptee.add(str);
    }

    @Override
    public String pick() {
        return adaptee.startString();
    }

    @Override
    public String dequeue() throws QueueStackException {
        if(adaptee.empty()){
            throw new QueueStackException("Queue is empty");
        }
        String str = adaptee.get(0);
        adaptee.remove(0);
        return str;
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "adaptee=" + adaptee +
                '}';
    }
}
