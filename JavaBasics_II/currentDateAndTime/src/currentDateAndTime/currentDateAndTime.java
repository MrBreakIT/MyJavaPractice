package currentDateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class currentDateAndTime {

	public static void main(String[] args) {

		Date currentDate = new Date();
		System.out.println(currentDate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("d-MMM-YY");
		System.out.println(dateFormat.format(currentDate));

		SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
		System.out.println(dayOfWeekFormat.format(currentDate));

		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
		System.out.println(clockFormat.format(currentDate));

		SimpleDateFormat clockFormat2 = new SimpleDateFormat("Hm");
		System.out.println(clockFormat2.format(currentDate) + " hrs");

		@SuppressWarnings("unused")
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatted = DateTimeFormatter.ofPattern("d MMM YYY");
		System.out.println(formatted);

	}

}
