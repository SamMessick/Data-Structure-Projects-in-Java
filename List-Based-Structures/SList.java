/**  Generic root class defining a linked list
  *  with basic editing and searching operations
  *
  *  Last Modified: 8-31-2017
  *  @author shmessic
  *  @version 1.0.0 */

public class SList<A> {
 /**  Contains value of type A and 
   *  pointer to next node in list. */
 private static class Node<A> {
   private A value;      // node value
   private Node<A> next; // pointer to next node in list
   // Node Constructors
   public Node(A val, Node<A> nxt) {
    value = val;
    next = nxt;
   }
   public Node(A val) {value = val;}
   // Node getters and setters
   public A    getValue() {return value;}
   public void setValue(A val) {value = val;}
   public Node getNext() {return next;}
   public void setNext(Node<A> nxt) {next = nxt;}
 }
 
 private Node<A> head = null;      // pointer to list head
 private Node<A> tail = null;      // pointer to list tail4
 private int size = 0;             // number of nodes in list

 // SList Constructors
 SList(A[] array) {
   for(A elmnt : array) {
     Node toAdd = new Node(elmnt);
     this.insTail(toAdd);
 }
 SList(A first) {
   head = new Node(first);
   size++;
 } 
   
 // SList getters and setters
 public void getSize() {return size;}
 public boolean isEmpty() {return getSize() == 0;}
 public Node getHead() {return head;}
 public Node getTail() {return tail;} 
 // SList methods                                 
 public void insHead(A val) {
   Node<A> toIns = new Node(val);
   if(isEmpty()) {
     head = toIns
     tail = head;
   else {
     newNode.setNext(head);
     head = newNode;
   }
   size++;
 }
 public void insTail(A val) {
   Node<A> toIns = new Node(val);
   if(isEmpty()) {
     head = toIns;
     tail = head;
   }
   else {
    tail.setNext(toIns);
    tail = newNode;
   }
   size++;
 }
 public void insert(Node<A> before, A val, Node<A> after) {
   Node<A> newNode = new Node(toIns)
   before.setNext(toIns);
   toIns.setNext(after);
   size++;
 }
 public void remHead() {
   if(isEmpty()) return;
   Node<A> current = head.getNext();
   head = current;
   size--;
 }
 public void remTail() {
   if(isEmpty()) return;
   Node<A> current = head;
   Node<A> previous = head;
   while(current.next != null) {
     previous = current;
     current = current.getNext();
   }
  previous.next = null;
 }
 /** linearSearch: searches list for an element
    * @param toFind:
    * @return current: node, if found
    **/
 public Node linearSearch(A toFind) {
   Node<A> current = head;
   while(current != null && !current.getValue().equals(toFind)) {
     current = current.getNext();
   }
   return current;
 }
 /** clear(): removes all values from list and
   * and initializes head to null
   **/
 public void clear() {
   Node<A> current = head;
   while(head.next != null) 
     this.remTail();
   head = null;
   size = 0;
 }
 public void toString() {
    System.out.println("Singly linked list: " + this + ". Head = " + head);
 }
}
