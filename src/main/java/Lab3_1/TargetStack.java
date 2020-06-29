package Lab3_1;

public interface TargetStack {
     void push(String str);
     String pop() throws QueueStackException;
     String pick();
     boolean isEmpty();
}
