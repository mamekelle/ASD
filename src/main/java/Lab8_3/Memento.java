package Lab8_3;

public class Memento {
	private StringBuilder contentInMemento;

	public Memento(StringBuilder contentInMemento) {
		this.contentInMemento = new StringBuilder(contentInMemento);
	}

	StringBuilder getContentInMemento() {
		return contentInMemento;
	}

	public void setContentInMemento(StringBuilder contentInMemento) {
		this.contentInMemento = contentInMemento;
	}

	@Override
	public String toString() {
		return "Memento [contentInMemento=" + contentInMemento + "]";
	}

}
