package com.maayanpolitzer.shop.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTasks {



    /**
     * get called every 10 seconds
     */
    @Scheduled(fixedRate = 10000)
    public void x(){
        System.out.println("every 10 seconds");
    }

    /**
     * https://www.freeformatter.com/cron-expression-generator-quartz.html#
     */
    @Scheduled(cron = "0/5 * * * * *")
    public void y(){
        System.out.println("cron");
    }

}
