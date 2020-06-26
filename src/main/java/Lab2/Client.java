package Lab2;

public class Client {
    public static void main(String[] args) throws QueueStackException {
        TargetStack adapterStack= new Adapter();
        adapterStack.push("A");
        adapterStack.push("B");
        adapterStack.push("C");
        adapterStack.push("D");
        adapterStack.push("F");
        adapterStack.pop();
        adapterStack.pop();
        adapterStack.pop();
        adapterStack.pop();
        adapterStack.pop();

       System.out.println("Stack: "+adapterStack.toString());
       System.out.println(adapterStack.pick());

        TargetQueue adapterQueue = new Adapter();
        adapterQueue.enqueue("AA");
        adapterQueue.enqueue("BB");
        adapterQueue.enqueue("CC");
        adapterQueue.dequeue();

        System.out.println("Queue: "+adapterQueue.toString());


    }

}
