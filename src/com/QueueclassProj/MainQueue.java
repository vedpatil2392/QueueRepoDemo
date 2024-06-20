package com.QueueclassProj;

public class MainQueue {


	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Priority Queue Manager Application");
	BlockingQueueClass.start();
		AbstractQueueClass.start();
		PriorityQueueClass.start();
		PriorityBlockingQueueClass.start();
		ConcurrentLinkedQueueClass.start();
		ArrayBlockingQueueClass.start();
		DelayQueueClass.start();
		LinkedBlockingQueueClass.start();
		LinkedTransferQueueClass.start();
	}

}
