package general_programs;

import java.util.PriorityQueue;

public class KthLargest {
	
	public static void main(String[] args) {
		int nums[] = {2, 45, 78,9,99};
		getNthLargestElement(nums, 2);
	}

	private static void getNthLargestElement(int[] nums, int k) {
		PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
		for(int i:nums){
			priorityQueue.offer(i);
			if(priorityQueue.size()>k){
				priorityQueue.poll();
			}
		}
	    System.out.println(priorityQueue.peek());
	}
}