package com.todo.api.config.jwt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
	public static void main(String[] arg) {
		List<Integer> list = Arrays.asList(5,3,4,1,3,7,2,9,9,4,9);
//		list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).limit(1).forEach(System.out::println);;
		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect.get(9));
		list.stream().sorted((b,a)->a.compareTo(b)).collect(Collectors.toList()).forEach(System.out::println);;
		
		/*
		 * BCryptPasswordEncoder encode = new BCryptPasswordEncoder(); for(int i = 0;
		 * i<10;i++) { String encoded = encode.encode("root");
		 * System.out.println(encoded); }
		 */
	}

}
