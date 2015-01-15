
public class Element {
	
	private String value;
	
	private Element next;
	
	
	public Element(String value) {
		super();
		this.value = value;
		this.next = null;
	}


	public Element getNext() {
		return next;
	}


	public void setNext(Element next) {
		this.next = next;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	

}
