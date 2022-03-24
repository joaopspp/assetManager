package com.assets.manager;

import com.assets.manager.models.Broker;
import com.assets.manager.repositories.BrokerRepository;
import com.assets.manager.services.BrokerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class BrokerTest {

    @Autowired
    private BrokerService brokerService;

    @Test
    public void insertTest(){

        Broker broker = new Broker();
        broker.setName("CLEAR");

        Broker brokerReturned = brokerService.insert(broker);
        assertNotNull(brokerReturned);

        Long id = brokerReturned.getId();
        assertNotNull(id);
    }

}