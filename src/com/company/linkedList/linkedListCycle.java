package com.company.linkedList;

import java.util.HashSet;
import java.util.Set;

public class linkedListCycle {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(hasCycle(node1));
    }

    private static boolean hasCycle(ListNode head) {
        if (head == null)  return false;
        Set<ListNode> hashSet = new HashSet<>();

        while (head != null && head.next != null) {
            if(hashSet.contains(head)){
                return true;
            }else{
                hashSet.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
