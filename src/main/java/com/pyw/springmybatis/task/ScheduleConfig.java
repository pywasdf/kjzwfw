package com.pyw.springmybatis.task;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//@Configuration
//public class ScheduleConfig implements SchedulingConfigurer {
////    @Override
////    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
////        scheduledTaskRegistrar.setScheduler(taskExecutor());
////    }
////    @Bean(destroyMethod = "destroy")
////    public Executor taskExecutor() {
////        return Executors.newScheduledThreadPool(20);
////    }
//}
