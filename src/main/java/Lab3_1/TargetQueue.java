package Lab3_1;

public interface TargetQueue {
    void enqueue(String str);
    String pick();
    boolean isEmpty();
    String dequeue() throws QueueStackException;
}
