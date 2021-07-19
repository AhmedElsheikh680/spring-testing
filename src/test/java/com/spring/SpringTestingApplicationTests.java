package com.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestingApplicationTests {

    @Test
    void namePlayerTest() {

        Player player = new Player();
        Assertions.assertEquals(player.getName("Trka"), null);
    }

}
