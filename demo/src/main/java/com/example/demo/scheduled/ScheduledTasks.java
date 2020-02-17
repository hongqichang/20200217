package com.example.demo.scheduled;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	
	Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
	
	@Scheduled(cron = "0/5 * * * * ?")
	public void testCron() {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		logger.info("线程："+Thread.currentThread().getName()+sdf.format(new Date())+"****testCron*****每5秒执行一次");
	}
	@Scheduled(cron = "0/5 * * * * ?")
	public void testCron2() {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		logger.info("线程："+Thread.currentThread().getName()+sdf.format(new Date())+"****testCron2*****每5秒执行一次");
	}
	@Scheduled(cron = "0/5 * * * * ?")
	public void testCro3n() {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		logger.info("线程："+Thread.currentThread().getName()+sdf.format(new Date())+"****testCron3*****每5秒执行一次");
	}
	@Scheduled(cron = "0/5 * * * * ?")
	public void testCron4() {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		logger.info("线程："+Thread.currentThread().getName()+sdf.format(new Date())+"****testCron4*****每5秒执行一次");
	}
}
