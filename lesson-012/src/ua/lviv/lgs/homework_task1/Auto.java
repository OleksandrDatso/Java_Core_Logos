package ua.lviv.lgs.homework_task1;

public class Auto {
	private int quantityOfHorsePower;
	private int yearOfBuilt;

	public Auto(int quantityOfHorsePower, int yearOfBuilt) {
		super();
		this.quantityOfHorsePower = quantityOfHorsePower;
		this.yearOfBuilt = yearOfBuilt;
	}

	public int getQuantityOfHorsePower() {
		return quantityOfHorsePower;
	}

	public void setQuantityOfHorsePower(int quantityOfHorsePower) {
		this.quantityOfHorsePower = quantityOfHorsePower;
	}

	public int getYearOfBuilt() {
		return yearOfBuilt;
	}

	public void setYearOfBuilt(int yearOfBuilt) {
		this.yearOfBuilt = yearOfBuilt;
	}

	@Override
	public String toString() {
		return "Auto [quantityOfHorsePower=" + quantityOfHorsePower + ", yearOfBuilt=" + yearOfBuilt + "]";
	}
}
