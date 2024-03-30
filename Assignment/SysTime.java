package mar30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SysTime {
	public static void main(String[] args) {
		DateTimeFormatter cur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("This Program is executed on "+cur.format(now));
	}
}
