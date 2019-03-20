package ua.lviv.lgs.homework_task2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		read();
	}

	public static void read() {

		ArrayList<Months> mon = new ArrayList();
		mon.add(Months.JANUARY);
		mon.add(Months.FEBRUARY);
		mon.add(Months.MARCH);
		mon.add(Months.APRIL);
		mon.add(Months.MAY);
		mon.add(Months.JUNE);
		mon.add(Months.JULY);
		mon.add(Months.AUGUST);
		mon.add(Months.SEPTEMBER);
		mon.add(Months.OCTOBER);
		mon.add(Months.NOVEMBER);
		mon.add(Months.DECEMBER);

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Seasons> seas = new ArrayList();
		seas.add(Seasons.WINTER);
		seas.add(Seasons.SPRING);
		seas.add(Seasons.SUMMER);
		seas.add(Seasons.AUTUMN);

		while (true) {
			menu();

			switch (scanner.next()) {
			case "1": {
				System.out.println("Enter month");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = isMonthPresent(mon, month);
				if (!flag) {
					System.out.println("Month doesn`t exist");
				}
				System.out.println("Choose next step");
				break;
			}
			case "2": {
				System.out.println("Enter season");
				scanner = new Scanner(System.in);
				String x = scanner.next().toUpperCase();

				boolean flag = false;
				for (Months m : mon) {
					if (m.getSeason().name().equals(x)) {
						flag = true;
					}
				}
				if (flag) {
					for (Months s1 : mon) {
						if (s1.getSeason().toString().equalsIgnoreCase(x)) {
							System.out.println(s1);
						}
					}
				}
				if (!flag) {
					System.out.println("No season");
				}
				System.out.println("Choose next step");
				break;
			}
			case "3": {
				System.out.println("Enter quantity of days");
				scanner = new Scanner(System.in);
				int i = scanner.nextInt();

				for (Months m : Months.values()) {
					if (m.inDays == i) {
						System.out.println(m.toString());
					}
				}
				System.out.println("Choose next step");
				break;
			}
			case "4": {
				System.out.println("Enter quantity of days");
				scanner = new Scanner(System.in);
				int i = scanner.nextInt();

				for (Months m : Months.values()) {
					if (m.inDays < i) {
						System.out.println(m.toString());
					}
				}
				System.out.println("Choose next step");
				break;
			}
			case "5": {
				System.out.println("Enter quantity of days");
				scanner = new Scanner(System.in);
				int i = scanner.nextInt();

				for (Months m : Months.values()) {
					if (m.inDays > i) {
						System.out.println(m.toString());
					}
				}
				System.out.println("Choose next step");
				break;
			}
			case "6": {
				System.out.println("Enter season");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flagSeason = isSeasonPresent(seas, season);
				if (flagSeason) {
					Seasons s = Seasons.valueOf(season);
					int ordinal = s.ordinal();

					if (ordinal == seas.size() - 1) {
						ordinal = 0;
						System.out.println(ordinal);
					} else {
						System.out.println("Next season is : " + ordinal + 1);
					}
				}
				if (!flagSeason) {
					System.out.println("No season, try again");
				}
				System.out.println("Choose next step");
				break;
			}
			case "7": {
				System.out.println("Enter season");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flagSeason = isSeasonPresent(seas, season);
				if (flagSeason) {
					Seasons s = Seasons.valueOf(season);
					int ordinal = s.ordinal();

					if (ordinal == seas.size() + 1) {
						ordinal = 0;
						System.out.println(ordinal);
					} else {
						System.out.println("Previous season is : " + ordinal);
					}
				}
				if (!flagSeason) {
					System.out.println("No season, try again");
				}
				System.out.println("Choose next step");
				break;
			}
			case "8": {
				for (Months m : Months.values()) {
					if (m.inDays % 2 == 0) {
						System.out.println(m.name() + " day = " + m.inDays);
					}
				}
				System.out.println("Choose next step");
				break;
			}
			case "9": {
				for (Months m : Months.values()) {
					if (m.inDays % 2 != 0) {
						System.out.println(m.name() + " day = " + m.inDays);
					}
				}
				System.out.println("Choose next step");
				break;
			}
			case "10": {
				System.out.println("Enter month");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = isMonthPresent(mon, month);
				if (flag) {
					for (Months m : Months.values()) {
						if (m.inDays % 2 == 0) {
							System.out.println(m.name() + " has an even number of days.");
						} else {
							System.out.println(m.name() + " has an odd number of days.");
						}
					}
				}
				System.out.println("Choose next step");
				break;
			}
			}
		}
	}

	private static boolean isMonthPresent(ArrayList<Months> mon, String month) {
		boolean flag = false;
		for (Months m : mon) {
			if (m.name().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(ArrayList<Seasons> seas, String season) {
		boolean flagSeason = false;
		for (Seasons s : seas) {
			if (s.name().equals(season)) {
				System.out.println("Season exist");
				flagSeason = true;
			}
		}
		return flagSeason;
	}

	static void menu() {
		System.out.println("Нажми 1, чтобы проверить существует ли такой месяц");
		System.out.println("Нажми 2, чтобы вывести все месяцы этого времени года");
		System.out.println("Нажми 3, чтобы вывести месяцы с этим количеством дней");
		System.out.println("Нажми 4, чтобы вывести на экран все месяцы, которые имеют меньшое количество дней");
		System.out.println("Нажми 5, чтобы вывести на экран все месяцы, которые имеют большее количество дней");
		System.out.println("Нажми 6, чтобы вывести на экран следующее время года");
		System.out.println("Нажми 7, чтобы вывести на экран предыдущее время года");
		System.out.println("Нажми 8, чтобы вывести на экран все месяцы с четным количеством дней");
		System.out.println("Нажми 9, чтобы вывести на экран все месяцы с нечетным количеством дней");
		System.out.println("Нажми 10, чтобы проверить введенный с клавиатуры месяц на четность дней");
	}
}
