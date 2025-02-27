package general_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class FindingDuplicates {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 30, 30, 40, 40, 10, 30, 40};
		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {
		Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(e->e,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e->e.getValue() >1)
				.forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
	}
}
