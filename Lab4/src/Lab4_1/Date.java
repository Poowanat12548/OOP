package Lab4_1;



public class Date {
	public int day , month , year;
	
	public Date(int day , int month , int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day=day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		}
	}
	
	public int getYear() {
		return year + 543;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
    public static void main(String[] args) {
		
		Date d = new Date(25 , 7 , 2025);
		
		System.out.println(d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
		
		
			
		
	}
	
}
