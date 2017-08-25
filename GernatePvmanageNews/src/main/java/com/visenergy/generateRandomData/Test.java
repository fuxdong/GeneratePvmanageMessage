package com.visenergy.generateRandomData;

import com.flying.logging.Log;
import com.flying.logging.LogFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Fuxudong on 2017/8/25.
 */
public class Test {
    public static void main(String[] args){

        Log log = LogFactory.getLog(Test.class);

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                log.info("报文1：" + GenerateMinuateData.getMinuatesData1());
                log.info("报文2：" + GenerateMinuateData.getMinuatesData2());
            }
        };

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(runnable, 0, 30, TimeUnit.SECONDS);
    }
}
