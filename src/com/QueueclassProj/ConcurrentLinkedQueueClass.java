package com.QueueclassProj;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.PriorityQueue;

 public class ConcurrentLinkedQueueClass
 {
	public static void start() 
	{
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();

		clq.add(1);
		clq.add(5);
		clq.add(3);

		PriorityQueue<Integer> tempQueue = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority
		tempQueue.addAll(clq);

		System.out.println("ConcurrentLinkedQueue - Highest priority element: " + tempQueue.peek()); // Peek does not
																										// remove the
																										// element
		System.out.println("ConcurrentLinkedQueue - Removing highest priority element: " + tempQueue.poll()); // Poll
																												// removes
																												// the
																												// element
	}
}
 