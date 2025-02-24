import java.time.LocalDateTime;
class DateTimeExample
{
	public static void main(String args[])
	{
		LocalDateTime dt = LocalDateTime.now();
		int y = dt.getYear();
		int m = dt.getMonthValue();
		int d = dt.getDayOfMonth();
		int h = dt.getHour();
		int min = dt.getMinute();
		int s = dt.getSecond();
		System.out.println("year: "+ y +"\nMonth: "+ m +"\nDay:"+ d +"\nHour:"+ h +"\nMinute:"+ min +"\nSecond:"+ s);
	}
}