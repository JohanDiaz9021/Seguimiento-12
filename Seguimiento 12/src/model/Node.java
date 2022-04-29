package model;

public class Node {

    private Node siguiente;
    private Node anterior;
    private int value;
	private int contador;
    
    public Node(int value) {
    	this.value = value;
    }
	/**
	 * @return the siguiente
	 */
	public Node getSiguiente() {
		return siguiente;
	}

	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(Node siguiente) {
		this.siguiente = siguiente;
	}
	
    
    /**
	 * @return the anterior
	 */
	public Node getAnterior() {
		return anterior;
	}

	/**
	 * @param anterior the anterior to set
	 */
	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}


	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the contador
	 */
	public int getContador() {
		return contador;
	}
	/**
	 * @param contador the contador to set
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	


}