package com.mt.java8.ml.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooManager {
	/*
	 * public static void main(String[] args) { Map<String, Object> foodData =
	 * new HashMap<String, Object>(); foodData.put("penguin", 1);
	 * foodData.put("flamingo", 2); for(String key: foodData.keySet())
	 * foodData.remove(key); }
	 */
	/*
	 * public static void main(String[] args) { Map<String, Object> foodData =
	 * new ConcurrentHashMap<String, Object>(); foodData.put("penguin", 1);
	 * foodData.put("flamingo", 2); for(String key: foodData.keySet())
	 * foodData.remove(key); //.........// Map<String,Integer> map = new
	 * ConcurrentHashMap<>(); map.put("zebra", 52); map.put("elephant", 10);
	 * System.out.println(map.get("elephant")); //... Queue<Integer> queue = new
	 * ConcurrentLinkedQueue<>(); queue.offer(31);
	 * System.out.println(queue.peek()); System.out.println(queue.poll()); //...
	 * Deque<Integer> deque = new ConcurrentLinkedDeque<>(); deque.offer(10);
	 * deque.push(4); System.out.println(deque.peek());
	 * System.out.println(deque.pop()); }
	 */
	/*
	 * public static void main(String[] args) { try { BlockingQueue<Integer>
	 * blockingQueue = new LinkedBlockingQueue<>(); blockingQueue.offer(39);
	 * blockingQueue.offer(3, 4, TimeUnit.SECONDS);
	 * System.out.println(blockingQueue.poll());
	 * System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS)); }
	 * catch (InterruptedException e) { // Handle interruption } }
	 */

	/*
	 * public static void main(String[] args) { try { BlockingDeque<Integer>
	 * blockingDeque = new LinkedBlockingDeque<>(); blockingDeque.offer(91);
	 * blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
	 * blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
	 * blockingDeque.offer(3, 4, TimeUnit.SECONDS);
	 * System.out.println(blockingDeque.poll());
	 * System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
	 * System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
	 * System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS)); } catch
	 * (InterruptedException e) { // Handle interruption } }
	 */
	/*
	 * public static void main(String[] args) { List<Integer> list = new
	 * CopyOnWriteArrayList<>(Arrays.asList(4,3,52)); for(Integer item: list) {
	 * System.out.print(item+" "); list.add(9); } System.out.println();
	 * System.out.println("Size: "+list.size()); }
	 */
	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
		synchronized (list) {
			for (int data : list)
				System.out.print(data + " ");
		}
		// --
		Map<String, Object> foodData = new HashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
		for (String key : synchronizedFoodData.keySet())
			synchronizedFoodData.remove(key);
	}
}