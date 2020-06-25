package Lab2;

public class Adaptee {
    private String[] data;
    private int start;
    private int end;

    public String startString(){
        return data[start];
    }
    public String endString(){
        return data[end];
    }

    public void add(String str) {
        data[end]=str;
        end++;
    }

    public int getEnd() {
return end;
    }

    public String get(int pos) {
        return data[pos];
    }

    public void remove(int pos) {
        //need revision
        if (end - pos >= 0) System.arraycopy(data, pos + 1, data, pos, end - pos);
    }

    public boolean empty() {
        return (end ==-1);
    }
}
