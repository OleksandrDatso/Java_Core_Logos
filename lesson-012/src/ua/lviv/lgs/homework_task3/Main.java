package ua.lviv.lgs.homework_task3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("White");
		list.add("Green");
		list.add(18);
		list.add("Car");
		list.add(2.5);
		list.add("Colorful");
		list.add("Day");
		list.add(12345);
		list.add("Fantasy");
		
		System.out.println(list);
		
		list.remove(2);
		list.remove(5);
		
		System.out.println(list);
	}
}
