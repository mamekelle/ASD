package Lab3_3;

import java.util.ArrayList;

public class Row implements IRow {

	ArrayList<String> rows = new ArrayList<>();

	@Override
	public void addRow(String str) {
		rows.add(str);
	}

	@Override
	public String toString() {
		return rows.toString();
	}

}
