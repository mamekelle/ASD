package Lab3;

public class Client {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository(new String[][]{{"A", "B", "C"}, {"D", "E", "F"}});
        nameRepository.getIterator().remove(0,0);
        nameRepository.getIterator().remove(1,0);
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
