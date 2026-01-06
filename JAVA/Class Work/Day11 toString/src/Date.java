class Date {

	int day, month, year;

	void setDay(int x) {
		this.day = x;
	}

	void setMonth(int m) {
		this.month = m;
	}

	void setYear(int y) {
		this.year = y;
	}

//Parameter const
	Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return "Date is :" + this.day + "/" + this.month + "/" + this.year;
	}

} // date end here

class TestDate {
	public static void main(String[] a) {
		Date d1;
		d1 = new Date(14, 11, 2025);

		System.out.printf(d1.toString());
	}
}