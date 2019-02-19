package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrderUniqueAwareArrayList {
	public List<String> data;

	public OrderUniqueAwareArrayList() {
		data = new ArrayList<>();
		//add some stuff here
	}

	public List<String> add(List<String> input) {
		//this method only for sort and remove duplicated, sometime we dont need sort the permission here because it will waste the memory and increase complexity
		data.addAll(input);
		data = data.stream().distinct().collect(Collectors.toList());
		Collections.sort(data);
		return data;
	}

	public static void main(String[] args) {
		OrderUniqueAwareArrayList test = new OrderUniqueAwareArrayList();

		List<String> input = Arrays.asList("1", "4", "5", "1", "3", "0");
		List<String> input2 = Arrays.asList("2", "4", "6");

		test.add(input);
		test.add(input2);
		System.out.println(test.data);
	}
}
