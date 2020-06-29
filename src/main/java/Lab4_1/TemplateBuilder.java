package Lab4_1;

public abstract class TemplateBuilder {

	public final void processTemplate(char[][] alphabet) {
		String symmetry = getSymmetry();
		Integer column = getColumn();
		Integer row = getRow();
		printLetter(symmetry, column, row, alphabet);

	}

	public abstract Integer getRow();

	public abstract Integer getColumn();

	public abstract String getSymmetry();

	public void printLetter(String symmetry, Integer column, Integer row, char[][] alphabet1) {
		if (symmetry.equals("None")) {

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.print(alphabet1[i][j]);
				}
				System.out.println("");
			}
		}
		if (symmetry.equals("Vertical")) {

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.print(alphabet1[i][j]);
				}
				for (int j = column - 1; j >= 0; j--) {
					System.out.print(alphabet1[i][j]);
				}
				System.out.println(" ");
			}
		}
		if (symmetry.equals("Horizontal")) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					System.out.print(alphabet1[i][j]);
				}
				System.out.println(" ");
			}
			for (int i = row - 1; i >= 0; i--) {
				for (int j = 0; j < column; j++) {
					System.out.print(alphabet1[i][j]);
				}
				System.out.println(" ");
			}
		}
	}
}
