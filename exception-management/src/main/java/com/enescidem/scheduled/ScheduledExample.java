package com.enescidem.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//ilk olarak starterda aktif hale getirmek gerekir @EnableScheduling

@Component //spring conteynırda bean oluşturmaya yarayan anatasyon
public class ScheduledExample {
	
	// * * * * * *
//	@Scheduled(cron = "1 3 2 * * *")
	public void write1To10() {
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
	}
}
