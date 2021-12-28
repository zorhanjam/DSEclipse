/**
 * 
 */
package nodeAsSeparate;

class Node<T> {
	private T data;
	private Node<T> next;

	Node(T dataPortion) {
		this(dataPortion, null);
	} // end constructor

	Node(T dataPortion, Node<T> nextNode) {
		data = dataPortion;
		setNext(nextNode);
	} // end constructor

	T getData() {
		return data;
	} // end getData

	void setData(T newData) {
		data = newData;
	} // end setData

	Node<T> getNextNode() {
		return getNext();
	} // end getNextNode

	void setNextNode(Node<T> nextNode) {
		setNext(nextNode);
	} // end setNextNode

	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
} // end Node
