package test.br.usp.esi.entities;

import main.br.usp.esi.service.impl.SchedulerImpl;

public class SchedulerTest {
	public static void main(String[] args){
		testScheduler();
	}
	public static void testScheduler(){
		SchedulerImpl scheduler = new SchedulerImpl();
		scheduler.schedule();
	}
}
