package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
 * DATA-HORA FORMATOS	
 * Referencia:
 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html*/

public class Program3 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2022-09-10");
		LocalDateTime d5 = LocalDateTime.parse("2022-09-10T01:30:26");
		Instant d6 = Instant.parse("2022-09-10T01:30:30Z");
		//Instant d7 = Instant.parse("2022-09-10T01:30:30-03:00");
		
		LocalDate d8 = LocalDate.parse("10/09/2022", fmt1);
		LocalDateTime d9 = LocalDateTime.parse("13/05/2010 14:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(2022, 01, 07);
		
		System.out.println("Data atual: " + d1.toString());
		System.out.println("Data-hora : " + d2.toString());
		System.out.println("Data-hora global(GNT-Londres): " + d3.toString());
		System.out.println("Data atual: " + d4.toString());
		System.out.println("Data-hora: "  + d5.toString());
		System.out.println("Data-hora: "  + d6.toString());
		//System.out.println("Data-hora: "  + d7.toString());
		System.out.println("Data: "  + d8.toString());
		System.out.println("Data-hora: "  + d9.toString());
		System.out.println("Data: "  + d10.toString());
		

		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		System.out.println("data: " + d4.format(fmt1));
		System.out.println("data: " + fmt1.format(d1));
		System.out.println("data-hora: " + d5.format(fmt2));
		System.out.println("data-hora: " + fmt3.format(d6));
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));
		
		System.out.println("r1 = "+ r1);
		System.out.println("r2 = "+ r2);

		
		System.out.println("D4 dia = "+ d5.getDayOfMonth());
		System.out.println("D4 mes = "+ d5.getMonthValue());
		System.out.println("D4 ano = "+ d5.getYear());
		System.out.println("D4 hora = "+ d5.getHour());
		System.out.println("D4 minuto = "+ d5.getMinute());
		
		
		/*
		 * Zonas de horários
		 * for(String s :ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/

	}

}
