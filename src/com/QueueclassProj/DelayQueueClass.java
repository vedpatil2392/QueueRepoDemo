package com.QueueclassProj;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueClass
{
	static class DelayedElement implements Delayed 
	{
		private final long delayTime;
		private final long creationTime;
		private final int value;

		public DelayedElement(int value, long delay, TimeUnit unit)
		{
			this.value = value;
			this.delayTime = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(delay, unit);
			this.creationTime = System.currentTimeMillis();
		}

		@Override
		public long getDelay(TimeUnit unit)
		{
			long diff = delayTime - System.currentTimeMillis();
			return unit.convert(diff, TimeUnit.MILLISECONDS);
		}

		@Override
		public int compareTo(Delayed o) 
		{
			if (this.delayTime < ((DelayedElement) o).delayTime) {
				return -1;
			}
			if (this.delayTime > ((DelayedElement) o).delayTime) {
				return 1;
			}
			return 0;
		}

		public int getValue()
		{
			return value;
		}
	}

	public static void start() throws InterruptedException
	{
		DelayQueue<DelayedElement> dq = new DelayQueue<>();

		dq.put(new DelayedElement(1, 5, TimeUnit.SECONDS));
		dq.put(new DelayedElement(5, 2, TimeUnit.SECONDS));
		dq.put(new DelayedElement(3, 3, TimeUnit.SECONDS));

		System.out.println("Waiting for elements to become available...");
		System.out.println("DelayQueue - Highest priority element: " + dq.take().getValue()); // Take removes the
																								// element
	}
}

