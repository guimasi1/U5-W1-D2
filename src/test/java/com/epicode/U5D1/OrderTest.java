package com.epicode.U5D1;

import com.epicode.U5D1.entities.Order;
import com.epicode.U5D1.entities.Table;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest

public class OrderTest {
    private static AnnotationConfigApplicationContext ctx;
    private static Order order1;
    @BeforeAll
    static void createContext() {
        ctx = new AnnotationConfigApplicationContext(U5D1Application.class);
        Order order1 = ctx.getBean("order1", Order.class);
    }

    @AfterAll
    static void closeContext() {
        ctx.close();
    }



}
