package study;

public class Node {
private float coeff;
private int expo;
private Node next;

public Node(float coeff, int expo) {
	super();
	this.coeff = coeff;
	this.expo = expo;
	
}
public Node() {
	super();
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
public float getCoeff() {
	return coeff;
}
public void setCoeff(float coeff) {
	this.coeff = coeff;
}
public int getExpo() {
	return expo;
}
public void setExpo(int expo) {
	this.expo = expo;
}
@Override
public String toString() {
	return "Node [coeff=" + coeff + ", expo=" + expo + ", next=" + next + "]";
}


}
