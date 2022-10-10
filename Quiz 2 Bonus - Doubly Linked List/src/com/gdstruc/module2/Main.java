package com.gdstruc.module2;

public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player HPDeskjet = new Player(1, "HPDeskjet", 101010);
        Player LethalBacon = new Player(2, "LethalBacon", 777);
        Player Asuna = new Player(3, "Asuna", 420);
        Player Heathcliff = new Player(4, "Heathcliff", 9999);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(HPDeskjet);
        linkedList.addToFront(LethalBacon);
        linkedList.addToFront(Asuna);
        linkedList.addToFront(Heathcliff);

        // print the elements of the linked list starting from the head
        linkedList.printList();

        // remove first element then print the new linked list
        linkedList.removeHead();
        linkedList.printList();

        // check if linked list contains element and print its index
        linkedList.checkIfExistingAndGetIndex(new Player(1, "HPDeskjet", 101010));
    }
}