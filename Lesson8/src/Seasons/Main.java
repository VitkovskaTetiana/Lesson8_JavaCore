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
		Scanner scanner = new Scanner(System.in);

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
			
			
			case "2": {
				System.out.println("Enter the season");
				String month = scanner.next().toUpperCase();

				boolean flag = false;
				for (Months m : mas) {
					if (m.getSeasons().name().equalsIgnoreCase(seasons)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("The month exists");
				} else {
					System.out.println("The month doesn't exist");
				}

			}

				break;

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
