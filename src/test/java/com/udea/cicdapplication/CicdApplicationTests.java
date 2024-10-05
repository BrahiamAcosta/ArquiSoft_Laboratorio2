package com.udea.cicdapplication;


import com.fasterxml.jackson.databind.JsonNode;
import com.udea.cicdapplication.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CicdApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    void health(){
        assertEquals("HEALTH CHECK OK",dataController.healthCheck());
    }

    @Test
    void version(){
        assertEquals("THE ACTUAL VERSION IS 1.0.0", dataController.version());
    }

    @Test
    void nationsLength(){
        Integer nationsLength = dataController.getRandomNations().size();
        assertEquals(10,nationsLength);
    }

    @Test
    void currenciesLength(){
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20,currenciesLength);
    }

    @Test
    void aviationLength(){
        Integer aviationLength = dataController.getRandomAviation().size();
        assertEquals(20,aviationLength);
    }

    @Test
    void testRandomCurrenciesCodeFormat(){
        JsonNode response = dataController.getRandomCurrencies();
        for(int i=0;i<response.size();i++){
            JsonNode currency = response.get(i);
            String code = currency.get("code").asText();
            assertTrue(code.matches("[A-Z]{3}"));
        }
    }

    @Test
    void testRandomNationsPerformance(){
        long startTime = System.currentTimeMillis();
        dataController.getRandomNations();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime-startTime;
        System.out.println(executionTime);
        assertTrue(executionTime<4000);
    }

}