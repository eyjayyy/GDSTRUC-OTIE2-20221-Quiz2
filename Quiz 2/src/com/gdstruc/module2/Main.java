package com.gdstruc.module2;

public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player goku = new Player(1, "Goku", 9001);
        Player vegeta = new Player(2, "Vegeta", 9000);
        Player broly = new Player(3, "Broly", 20000);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);

        // add one more player
        linkedList.addToFront(new Player(10, "Yamcha", 500));

        // print the elements of the linked list starting from the head
        linkedList.printList();

        // remove first element then print the new linked list
        linkedList.removeHead();
        linkedList.printList();

        // check if linked list contains element and print its index
        linkedList.checkIfExistingAndGetIndex(new Player(10, "Yamcha", 500));
    }
}