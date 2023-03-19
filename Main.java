package Seasons;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Enter 1 to check if month exist");
		System.out.println("Enter 2 to show months with the same season");
		System.out.println("Enter 3 to show months with the same days amount");
		System.out.println("Enter 4 to show month with less days amount");
		System.out.println("Enter 5 to show month with more days amount");
		System.out.println("Enter 6 to show next season");
		System.out.println("Enter 7 to show previous season");
		System.out.println("Enter 8 to show months with even days amount");
		System.out.println("Enter 9 to show months with odd days amount");
		System.out.println("Enter 10 to check if month have even days amount");

	}

	public static void main(String[] args) {
		Months[] mas = Months.values();
		Seasons[] seaso = Seasons.values();
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				menu();
				switch (scanner.next()) {

				case "1": {
					System.out.println("Enter the month");
					String month = scanner.next().toUpperCase();

					boolean flag = isMonthPresent(mas, month);

					if (flag) {
						System.out.println("The month exists");
					} else {
						System.out.println("The month doesn't exist");
					}

				}
					break;

				case "2": {

					System.out.println("Enter the season");
					String seasonInput = scanner.next().toUpperCase();

					boolean flag = false;
					System.out.println("Months in this season are:");
					for (Months m : mas) {
						if (m.getSeasons().name().equalsIgnoreCase(seasonInput)) {
							System.out.println(m);
							flag = true;
						}
					}
					if (!flag) {
						System.out.println("Season doesn`t exist");
					}
				}
					break;

				case "3": {
					System.out.println("Enter number of days from 28 to 31");
					int days = scanner.nextInt();

					boolean flag = false;
					System.out.println("Months with this day's amount are: ");
					for (Months m : mas) {
						if (m.getDayAmount() == days) {
							System.out.print(m + " ");
							flag = true;
						}

					}
					if (!flag) {
						System.out.println("No months with " + days + " days found");
					}
					System.out.println();
				}
					break;

				case "4": {
					System.out.println("Enter number of days from 28 to 31");
					int day = scanner.nextInt();

					boolean flag = false;

					System.out.println("These months have less days amount:");

					for (Months m : mas) {
						if (m.dayAmount < day) {
							System.out.println(m);
							flag = true;
						}
					}
					if (!flag) {
						System.out.println("No months have less days amount");
					}
				}
					break;

				case "5": {
					System.out.println("Enter number of days from 28 to 31");
					int day = scanner.nextInt();

					boolean flag = false;

					System.out.println("These months have more days amount:");

					for (Months m : mas) {
						if (m.dayAmount > day) {
							System.out.println(m);
							flag = true;
						}
					}
					if (!flag) {
						System.out.println("No months have more days amount");
					}

					break;

				}
				case "6": {
					System.out.println("Enter the season");
					String season6 = scanner.next().toUpperCase();

					boolean flag = true;
					if (flag) {
						Seasons seas = Seasons.valueOf(season6);
						int i = seas.ordinal();
						if (i == seaso.length - 1) {
							i = 0;
							System.out.println(seaso[i]);
						} else {
							System.out.println("Next season is " + seaso[i + 1]);
						}
					}

					break;
				}
				case "7": {
					System.out.println("Enter the season");
					String season6 = scanner.next().toUpperCase();

					boolean flag = true;
					if (flag) {
						Seasons seas = Seasons.valueOf(season6);
						int i = seas.ordinal();
						if (i == seaso.length - 1) {
							i = 0;
							System.out.println(seaso[i]);
						} else {
							System.out.println("Previous season is " + seaso[i - 1]);
						}
					}

					break;
				}
				case "8": {
					System.out.println("Months with even days amount are: ");
					for (Months month : Months.values()) {
						if (month.getDayAmount() % 2 == 0) {
							System.out.println(month);
						}
					}
					break;

				}

				case "9": {
					System.out.println("Months with odd days amount are: ");
					for (Months month : Months.values()) {
						if (month.getDayAmount() % 2 == 1) {
							System.out.println(month);
						}
					}
					break;
				}

				case "10": {
					System.out.println("Enter the month");
					String isMonthOdd = scanner.next().toUpperCase();
					Months month = Months.valueOf(isMonthOdd);
					int days = month.getDayAmount();
					String parity = days % 2 == 0 ? "even" : "odd";
					System.out.printf("Days amount in " + isMonthOdd + " is " + parity);
					System.out.println();

				}

				}
			}
		}

	}

	private static boolean isMonthPresent(Months[] mas, String month) {
		boolean flag = false;

		for (Months m : mas) {
			if (m.name().equals(month)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
