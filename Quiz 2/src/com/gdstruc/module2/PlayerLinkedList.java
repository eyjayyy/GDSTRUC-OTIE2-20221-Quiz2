package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    // function to add a new player to the front of the linked list
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++;
    }

    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer();
        }

        System.out.println("NULL\nList Size: " + size);
    }

    //function to remove the first element or the head of the linked list
    public void removeHead() {
        PlayerNode temp = head;
        head = temp.getNextPlayer();
        size--;
    }

    // function to check if the element exists in the linked list and print the index; based on contains() and indexOf() from previous ArrayList
    public void checkIfExistingAndGetIndex (Player player) {
        PlayerNode current = head;
        int index = 0;
        boolean elementExists = false;

        while (current != null) {
            if (current.getPlayer().equals(player))
            {
                elementExists = true;
                break;
            }

            index++;
            current = current.getNextPlayer();
        }

        if (elementExists) System.out.println("Element exists at index " + index);
        else System.out.println("Element does not exist. Index is -1");
    }
}
