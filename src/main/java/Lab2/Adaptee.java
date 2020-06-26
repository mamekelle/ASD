package Lab2;

import java.util.Arrays;

public class Adaptee {
    private String[] data= new String[2];
    private int start;
    private int end;

    public String startString(){
        return data[start];
    }
    public String endString(){
        return data[end];
    }

    public void add(String str) {
        if(end==data.length){
            resize();
        }
        data[end]=str;
        end++;
    }

    public int getEnd() {
    return end =end-1;
    }

    public String get(int pos) {
        return data[pos];
    }

    public void remove(int pos) {
        boolean stack=false;
//In case of Queue
        if (pos==0){
            System.arraycopy(data, 1, data, 0, end );
            end--;
        }
        //In case of Stack
        if (end - pos >= 0 && pos!=0) System.arraycopy(data, pos+1, data, pos, end-1);
        if(pos==1||end==-1)
            data[pos]=null;
    }

    public boolean empty() {
        return (end ==-1);
    }

    private void resize() {
        System.out.println("resizing");
        int len = data.length;
        int newlen = 2 * len;
        String[] temp = new String[newlen];
        System.arraycopy(data, 0, temp, 0, len);
        data = temp;
    }
    @Override
    public String toString() {
        return "data=" + Arrays.toString(data);
    }
}
