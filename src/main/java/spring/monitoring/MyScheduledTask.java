package spring.monitoring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class MyScheduledTask {

    @Scheduled(fixedRate = 5000, timeUnit = TimeUnit.SECONDS)
    public void scheduledTask() {
        log.info("Hello World");
    }
}
