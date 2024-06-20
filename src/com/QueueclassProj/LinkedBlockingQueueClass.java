package com.QueueclassProj;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.PriorityQueue;

public class LinkedBlockingQueueClass 
{
	public static void start() 
	{
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<>();

		lbq.add(1);
		lbq.add(5);
		lbq.add(3);

		PriorityQueue<Integer> tempQueue = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority
		tempQueue.addAll(lbq);

		System.out.println("LinkedBlockingQueue - Highest priority element: " + tempQueue.peek()); // Peek does not
																									// remove the
																									// element
		System.out.println("LinkedBlockingQueue - Removing highest priority element: " + tempQueue.poll()); // Poll
																											// removes
																											// the
																											// element
	}
}

