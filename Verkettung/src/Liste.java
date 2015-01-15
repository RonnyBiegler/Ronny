public class Liste {

	private Element first;

	public boolean isEmpty() {
		return true;
	}

	// Element löschen //
	public void delete(String value) {
		if (isEmpty()) {
			return;
		}
		if (first.getValue().equals(value)) {
			first = first.getNext();
			return;
		}

		Element ele = first.getNext();
		Element last = first;

		while (ele != null) {
			if (first.getValue().equals(value)) {
				last.setNext(ele.getNext());
				break;
			}

			last = ele;
			ele = ele.getNext();
		}

	}

	// Element hinzufügen //
	public void add(String value) {

		Element neu = new Element(value);

		if (first == null) {
			first = neu;
		} else {
			neu.setNext(first);
			first = neu;
		}
	}

	// Grösse Berechnen //
	public int getSize() {
		int size = 0;
		Element ele = first;
		while (ele != null) {
			size++;
			ele = ele.getNext();
		}

		return size;
	}

	// String zusammensetzen //
	public String toString() {
		String text = "";
		Element ele = first;

		while (ele != null) {

			text += ele.getValue();
			ele = ele.getNext();
		}

		return text;

	}

	public void push(Element first) {
		Element temp = first;
		

	}

	public String pop() {
		if (isEmpty()) {

			return null;
		}
		Element temp;
		temp = first;
		first = first.getNext();
		return temp.getValue();

	}

}
