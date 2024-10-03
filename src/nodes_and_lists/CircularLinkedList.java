/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class CircularLinkedList<T> {

    private Node<T> first;
    private int size;

    public CircularLinkedList() {
        first = null;
        size = 0;
    }

    /* Add at the end */
    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (first == null) {  
            first = newNode;
            newNode.setNext(first); 
        } else {  
            Node<T> current = first;
            while (current.getNext() != first) { 
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(first);  
        }
        size++;
    }

    /* Remove a node by value*/
    public void remove(T value) {
        if (first == null) {
            return; 
        }
        if (first.getValue().equals(value)) { 
            if (first.getNext() == first) { 
                first = null;
            } else {
                Node<T> last = first;
                while (last.getNext() != first) {
                    last = last.getNext();
                }
                first = first.getNext();  
                last.setNext(first);  
            }
            size--;
            return;
        }

        Node<T> current = first;
        while (current.getNext() != first) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext()); 
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    /* Find value in list */
    public boolean contains(T value) {
        if (first == null) {
            return false;
        }

        Node<T> current = first;
        do {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getNext();
        } while (current != first);

        return false;
    }

    /* Turns into a simple list */
    public void toSimpleList() {
        if (first == null) {
            return;
        }

        Node<T> current = first;
        while (current.getNext() != first) {
            current = current.getNext();
        }
        current.setNext(null); 
    }

    /* Print elements */
    public void print() {
        if (first == null) {
            System.out.println("Empty List.");
            return;
        }

        Node<T> current = first;
        do {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        } while (current != first);

        System.out.println("(returns to first)");
    }

    public int getSize() {
        return size;
    }

}
