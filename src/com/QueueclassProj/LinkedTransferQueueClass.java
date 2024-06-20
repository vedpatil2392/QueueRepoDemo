package com.QueueclassProj;


import java.util.PriorityQueue;
import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueClass
{
	public static void start() 
	{
		LinkedTransferQueue<Integer> ltq = new LinkedTransferQueue<>();

		ltq.add(1);
		ltq.add(5);
		ltq.add(3);

		PriorityQueue<Integer> tempQueue = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority
		tempQueue.addAll(ltq);

		System.out.println("LinkedTransferQueue - Highest priority element: " + tempQueue.peek()); // Peek does not
																									// remove the
																									// element
		System.out.println("LinkedTransferQueue - Removing highest priority element: " + tempQueue.poll()); // Poll
																											// removes
																											// the
																											// element
	}
}