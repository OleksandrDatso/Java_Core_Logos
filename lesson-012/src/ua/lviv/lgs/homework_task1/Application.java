package ua.lviv.lgs.homework_task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import ua.lviv.lgs.homework_task1.Auto;

public class Application {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new Auto(getRandomValue(80, 550), getRandomValue(1990, 2019)));
		list.add(new Auto(getRandomValue(80, 550), getRandomValue(1990, 2019)));
		list.add(new Auto(getRandomValue(80, 550), getRandomValue(1990, 2019)));
			
				
		System.out.println(list);

	}

	public static int getRandomValue(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException();
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
