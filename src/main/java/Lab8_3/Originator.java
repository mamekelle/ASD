package Lab8_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Originator {
	private StringBuilder content;

	public Originator() {
		content = new StringBuilder();
	}

	public void write(String str) {
		content = new StringBuilder();
		content.append(str);
	}

	public StringBuilder getString() {
		return content;
	}

	public Memento createMemento() {
		return new Memento(this.content);
	}

	public void setMemento(Memento memento) {
		this.content = memento.getContentInMemento();
	}

	// This is for saving to a file named 'SavedFile.txt'
	public void saveToFile() {
		try {
			PrintStream output = new PrintStream(new File("SavedFile.txt")); // Check Time of creation of the file
			output.println(content);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

	public String loadFromAFile() {
		StringBuilder str = new StringBuilder();
		try(BufferedReader file = new BufferedReader(
                new FileReader("SavedFile.txt"))) {
			System.out.println("Trying to Load what is saved in a file 'SavedFile.txt'");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				str.append(scanner.nextLine());
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return str.toString();
	}

	@Override
	public String toString() {
		return content.toString();
	}

	public void getStateFromMomento(Memento m) {
		content = m.getContentInMemento();

	}

}
