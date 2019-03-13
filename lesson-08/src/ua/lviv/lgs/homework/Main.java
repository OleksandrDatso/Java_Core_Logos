package ua.lviv.lgs.homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		read();
	}

	public static void read() {
		Months[] mon = Months.values();
		Scanner scanner = new Scanner(System.in);
		Seasons[] seas = Seasons.values();

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

					if (ordinal == seas.length - 1) {
						ordinal = 0;
						System.out.println(seas[ordinal]);
					} else {
						System.out.println("Next season is : " + seas[ordinal + 1]);
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

					if (ordinal == seas.length + 1) {
						ordinal = 0;
						System.out.println(seas[ordinal]);
					} else {
						System.out.println("Previous season is : " + seas[ordinal - 1]);
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

	private static boolean isMonthPresent(Months[] mon, String month) {
		boolean flag = false;
		for (Months m : mon) {
			if (m.name().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(Seasons[] seas, String season) {
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