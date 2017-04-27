package com.nchu.tech.course.test;

import com.nchu.tech.course.service.demo.DefaultDemoServiceImpl;
import com.nchu.tech.course.service.demo.DemoService;
import com.nchu.tech.course.service.demo.DemoServiceFactory;
import com.nchu.tech.course.service.demo.ChinaDemoServiceImpl;
import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.time.*;

/**
 * 小样服务测试类
 * Created by fujianjian on 2017/4/3.
 */
public class DemoServiceTest {


    @Test
    public void testGeet() {
        DemoService demoService = DemoServiceFactory.create(ChinaDemoServiceImpl::new);
        System.out.println(demoService.geet());
        demoService = DemoServiceFactory.create(DefaultDemoServiceImpl::new);
        System.out.println(demoService.geet());
    }

    @Test
    public void testClock() {
        final Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        LocalDate date = LocalDate.now();
        LocalDate dateFromClock = LocalDate.now(clock);
        System.out.println(date);
        System.out.println(dateFromClock);
    }

    @Test
    public void testDuraction() {
        final LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 3, 14, 30, 13, 10);
        final LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 4, 10, 20, 23, 89);
        Duration duration = Duration.between(from, to);
        System.out.println(duration.toDays());
        System.out.println(duration.compareTo(Duration.ZERO));
    }

    @Test
    public void testScriptEnginer() throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        System.out.println(String.format("result: %s", engine.eval("function f () { return 1; } ; f() + 10;")));
    }
}
