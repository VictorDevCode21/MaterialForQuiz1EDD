/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodes_and_lists;

/**
 *
 * @author PC
 */
public class LinkedList {
    private Node first;
    private int size;

    public int getSize() {
        return size;
    }

    public LinkedList() {
        first = null;
        size = 0;
    }

    /*Basic add method to add new Nodes*/
    public void add(int value) {
        Node node = new Node(value);
        if (size == 0) {  // Empty List
            first = node;
            size = 1;

        } else { // Not empty List
            Node aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }

            aux.setNext(node);
            size ++;
        }
    }

    /*Algorithms for sum, getIndex, cantNodes*/

    /*Method to sum node values*/
    public int sum () {
        int result = 0;
        Node node = first;

        while (node != null) {
            result += node.getValue();
            node = node.getNext();

        }

        return result;
    }

    /*Method to return a specific index if the index is in the list*/
    public Integer getIndex(int index) {
        Node node = first;
        int current = 0;

        while (node != null) {
            if (index == current) {
                return node.getValue();
            }

            node = node.getNext();
            current ++;
        }

        return null;
    }

    /* Method to get the size of a LinkedList */
    public int getSize2() {
        Node node = first;
        int result = 0;

        while (node != null) {
            node = node.getNext();
            result ++;
        }

        return result;
    }

    /*getIndex, max, frequency and swap method. */

    /*Method to return the index of the value of the user input*/
    public Integer getIndexByValue(int value) {
        Node node = first;
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
        int maxValue = 0;
        Node node = first;

        while (node != null) {
            if (node.getValue() > maxValue) {
                maxValue = node.getValue();
            }

            node = node.getNext();
        }

        return maxValue;
    }

    /* Method frequency to count the repeated values on the list
    accord to the user input*/

    public Integer getFrequency (int value) {
        Node node = first;
        int count = 0;

        while (node != null) {
            if (node.getValue() == value) {
                count ++;
            }


            node = node.getNext();
        }

        return count;
    }

    /* Method swap that swaps the position of 2 elements */
    public void swap(int i, int j) {
        Node nodeI = first;
        Node nodeJ = first;
        int current = 0;
        int auxI = 0;
        int auxJ = 0;

        while (nodeI != null) {
            if (i == current) {
                auxI = nodeI.getValue();
            } else if (j == current) {
                auxJ = nodeJ.getValue();
            }

            nodeI = nodeI.getNext();
            nodeJ = nodeJ.getNext();
            current++;

        }

        current = 0;
        nodeI = first;
        nodeJ = first;

        while (nodeJ != null) {
            if ( i == current) {
                nodeI.setValue(auxJ);
            } else if (j == current) {
                nodeJ.setValue(auxI);
            }


            nodeI = nodeI.getNext();
            nodeJ = nodeJ.getNext();
            current++;
        }


    }


    /*Print Method to print the value of the nodes inside the list*/
    public void print() {
        Node node = first;
        String s = "";

        while (node != null) {
            s += node.getValue() + "->";
            System.out.println(s + "\b\b");
            node = node.getNext();
        }
    }

}
