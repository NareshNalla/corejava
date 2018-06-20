package com.test;

import java.util.*;

class B {

}

class C extends B {

}

public class Test7 {

	public static <E extends B> Queue<E> ring(List<E> list) {

		return null;

	}

	public static void main(String[] args) {

		List<C> list1 = new ArrayList<C>();

		ArrayList<C> list2 = new ArrayList<C>();

		Queue<C> q1;

		PriorityQueue<C> q2;

		q1 = ring(list1); // line1

		q1 = ring(list2); // line2

		q2 = ring(list1); // line3

		q2 = ring(list2); // line4

	}

}