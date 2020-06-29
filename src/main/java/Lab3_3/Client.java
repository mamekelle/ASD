package Lab3_3;

public class Client {

	public static void main(String[] args) {

		// Create a table proxy
		ITable tableProxy = new TableProxy();

		// create the rows to be added
		IRow row1 = new Row();

		// Adding row1
		row1.addRow("Mohammed");
		row1.addRow("Behredin");
		row1.addRow("Aman");

		tableProxy.addRow(row1, 0);

		IRow row2 = new Row();

		// Adding row2
		row2.addRow("Bike");
		row2.addRow("Mike");
		row2.addRow("Dikwe");

		tableProxy.addRow(row2, 1);

		tableProxy.print();

		IRow row3 = new Row();

		// Adding row3
		row3.addRow("Colad");
		row3.addRow("Wend");
		row3.addRow("Sass");

		tableProxy.modifyRow(1, row3);
		 tableProxy.deleteRow(1);

		System.out.println("\n Print after Modifying row 1");

		tableProxy.print();

	}

}
