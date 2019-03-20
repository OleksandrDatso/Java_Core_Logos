package ua.lviv.lgs.homework_task2;

public enum Months {
	JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
	MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
	SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
	DECEMBER(Seasons.WINTER, 31);

	Seasons season;
	int inDays;

	private Months(Seasons season, int inDays) {
		this.season = season;
		this.inDays = inDays;
	}

	public Seasons getSeason() {
		return season;
	}

	public int getInDays() {
		return inDays;
	}
}
