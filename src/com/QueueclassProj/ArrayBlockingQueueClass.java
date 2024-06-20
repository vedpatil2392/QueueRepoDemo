package com.QueueclassProj;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.PriorityQueue;

public class ArrayBlockingQueueClass
{
	public static void start()
	{
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(10);

		abq.add(1);
		abq.add(5);
		abq.add(3);

		PriorityQueue<Integer> tempQueue = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority
		tempQueue.addAll(abq);

		System.out.println("ArrayBlockingQueue - Highest priority element: " + tempQueue.peek()); // Peek does not
																									// remove the
																									// element
		System.out.println("ArrayBlockingQueue - Removing highest priority element: " + tempQueue.poll()); // Poll
																											// removes
																											// the
																											// element
	}
}
 