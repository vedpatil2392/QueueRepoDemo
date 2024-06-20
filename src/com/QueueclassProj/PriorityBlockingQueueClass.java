package com.QueueclassProj;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.PriorityQueue;

public class PriorityBlockingQueueClass
{
	public static void start()
	{
		// Create a temporary PriorityQueue with the custom comparator
		PriorityQueue<Integer> tempQueue = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority

		// Create the PriorityBlockingQueue
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();

		// Add elements with the desired priority order
		tempQueue.add(1);
		tempQueue.add(5);
		tempQueue.add(3);
		pbq.addAll(tempQueue);

		System.out.println("PriorityBlockingQueue - Highest priority element: " + pbq.peek()); // Peek does not remove
																								// the element
		try
		{
			System.out.println("PriorityBlockingQueue - Removing highest priority element: " + pbq.take()); // Take
																											// removes
																											// the
																											// element
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

