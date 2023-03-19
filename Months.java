package Seasons;

public enum Months {
	JANUARY(Seasons.WINTER, 31), 
	FABRUARY(Seasons.WINTER, 28), 
	MARCH(Seasons.SPRING, 31), 
	APRIL(Seasons.SPRING, 30),
	MAY(Seasons.SPRING, 31), 
	JUNE(Seasons.SUMMER, 30),
	JULY (Seasons.SUMMER, 31),
	AUGUST (Seasons.SUMMER,31),
	SEPTEMBER (Seasons.AUTUMN,30),
	OCTOBER (Seasons.AUTUMN,31),
	NOVEMBER (Seasons.AUTUMN,30),
	DECEMBER (Seasons.WINTER,31);
	
	
	int dayAmount;
	Seasons seasons;

	Months(Seasons seasons, int dayAmount) {
		this.seasons = seasons;
		this.dayAmount = dayAmount;
		// TODO Auto-generated constructor stub
	}

	public int getDayAmount() {
		return dayAmount;
	}

	public void setDayAmount(int dayAmount) {
		this.dayAmount = dayAmount;
	}

	public Seasons getSeasons() {
		return seasons;
	}

	public void setSeasons(Seasons seasons) {
		this.seasons = seasons;
	}
	
	

}
