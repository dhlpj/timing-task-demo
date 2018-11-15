package com.pj.quartz.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstScheduledJob extends QuartzJobBean{
     private AnotherBean anotherBean;
     
     public void setAnotherBean(AnotherBean anotherBean){
    	 this.anotherBean = anotherBean;
     }

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("FirstScheduledJob Executes!" + sf.format(date));
		this.anotherBean.printAnotherMessage();		
	}
}
