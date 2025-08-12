package July2025.CollectionFramework.ex_26072025_CollectionPart2.Queue;

import java.util.PriorityQueue;

public class Lab191_Queue {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        //displaying the initial size
        System.out.println("Size at the beginning " + pq.size());

        // Adding elements using add()
        pq.add(99);
        pq.add(18);
        pq.add(27);
        pq.add(34);
        pq.offer(52);

        //displaying the PriorityQueue
        System.out.println("New PriorityQueue" + pq);

        //displaying the size
        System.out.println("Size after addition " + pq.size());

        // Printing the top element of the PriorityQueue
        System.out.println("Top-most element " + pq.peek());

        // Printing the top element and removing it
        System.out.println("Removing " + pq.poll());

        //displaying the PriorityQueue
        System.out.println("New PriorityQueue after removal" + pq);

        //display the new size
        System.out.println("Size after removal " + pq.size());
    }
}