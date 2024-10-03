/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class LinkedList<T> {

    private Node<T> first;
    private int size;

    public int getSize() {
        return size;
    }

    public LinkedList() {
        first = null;
        size = 0;
    }

    /*Basic add method to add new Nodes*/
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (size == 0) {  // Empty List
            first = node;
            size = 1;

        } else { // Not empty List
            Node<T> aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }

            aux.setNext(node);
            size++;
        }
    }

    /*Algorithms for sum, getIndex, cantNodes*/

 /*Method to sum node values*/
    public int sum() {
        int result = 0;
        Node<T> node = first;

        while (node != null) {
            if (node.getValue() instanceof Integer) {
                result += (Integer) node.getValue();
            } else {
                throw new UnsupportedOperationException("sum() only supports Integer values");
            }

            node = node.getNext();

        }

        return result;
    }

    /*Method to return a specific index if the index is in the list*/
    public T getIndex(int index) {
        Node<T> node = first;
        int current = 0;

        while (node != null) {
            if (index == current) {
                return node.getValue();
            }

            node = node.getNext();
            current++;
        }

        return null;
    }

    /* Method to get the size of a LinkedList */
    public int getSize2() {
        Node node = first;
        int result = 0;

        while (node != null) {
            node = node.getNext();
            result++;
        }

        return result;
    }

    /*getIndex, max, frequency and swap method. */

 /*Method to return the index of the value of the user input*/
    public Integer getIndexByValue(T value) {
        Node<T> node = first;
        int current = 0;

        while (node != null) {
            if (node.getValue() == value) {
                return current;
            }
            node = node.getNext();
            current++;
        }

        return null;
    }

    /* Method getMax to return the max element in the list */
    public int getMax() {
        if (first == null) {
            throw new IllegalStateException("Empty list");
        }

        int maxValue = 0;
        Node<T> node = first;

        while (node != null) {
            if (node.getValue() instanceof Integer) {
                if ((Integer) node.getValue() > maxValue) {
                    maxValue = (Integer) node.getValue();
                }
            } else {
                throw new UnsupportedOperationException("getMax() only supports Integer values");
            }

            node = node.getNext();
        }

        return maxValue;
    }

    /* Method frequency to count the repeated values on the list
    accord to the user input*/
    public int getFrequency(T value) {
        Node node = first;
        int count = 0;

        while (node != null) {
            if (node.getValue() == value) {
                count++;
            }

            node = node.getNext();
        }

        return count;
    }

    /* Method swap that swaps the position of 2 elements */
    public void swap(int i, int j) {
        Node<T> nodeI = first;
        Node<T> nodeJ = first;
        int current = 0;
        Integer auxI = null;
        Integer auxJ = null;

       
        while (nodeI != null && nodeJ != null) {
            if (i == current) {
                if (!(nodeI.getValue() instanceof Integer)) {
                    throw new UnsupportedOperationException("swap() only supports Integer values " + i);
                }
                auxI = (Integer) nodeI.getValue(); 
            }
            if (j == current) {
                if (!(nodeJ.getValue() instanceof Integer)) {
                    throw new UnsupportedOperationException("swap() only supports Integer values " + j);
                }
                auxJ = (Integer) nodeJ.getValue();  
            }

            nodeI = nodeI.getNext();
            nodeJ = nodeJ.getNext();
            current++;
        }

        if (auxI == null || auxJ == null) {
            throw new IllegalArgumentException("Index out of range");
        }

        current = 0;
        nodeI = first;
        nodeJ = first;

        while (nodeI != null && nodeJ != null) {
            if (i == current) {
                nodeI.setValue((T) auxJ);  
            }
            if (j == current) {
                nodeJ.setValue((T) auxI);  
            }

            nodeI = nodeI.getNext();
            nodeJ = nodeJ.getNext();
            current++;
        }
    }


    /*Print Method to print the value of the nodes inside the list*/
    public void print() {
        Node<T> node = first;
        String s = "";

        while (node != null) {
            s += node.getValue() + "->";
            System.out.println(s + "\b\b");
            node = node.getNext();
        }
    }

}
