package Lab3;

public class NameRepository implements Aggeregate{
    private String names[][]=new String[][]{{"A", "B", "C"}, {"D", "E", "F"}};
    private int row;
    private int column;
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return row < names.length && column < names[0].length;
        }

        private void reseIndexes() {
            if (column == names[row].length) {
                column = 0;
                row++;
            }
        }

        @Override
        public String next() {
            //Check
            if (!hasNext()) return null;

            //Loop through the array: rows
            while (row < names.length) {
                //Loop through the array: columns
                while (column < names[row].length) {
                    //Nulls are not allowed
                    if (names[row][column] != null) {
                        //Save value because we need to modify indexes
                        String str = names[row][column];

                        //Increment now because the return will
                        //exit the loop
                        column++;

                        //Reset column then increment i because the
                        //return will exit the loop
                        reseIndexes();

                        return str;
                    }
                    //If null move on
                    else {
                        column++;
                        reseIndexes();
                    }
                }
                row++;
            }
            return null;
        }

        @Override
        public String remove(int indX, int indY) {
            if(this.hasNext()){

            }
            return null;
        }

        @Override
        public String add(String str) {
            return null;
        }
    }
}
