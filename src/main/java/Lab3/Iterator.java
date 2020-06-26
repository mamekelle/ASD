package Lab3;

public interface Iterator {
    boolean hasNext();
    Object next();
    String remove(int indX, int indY);
    String add (String str);
}
