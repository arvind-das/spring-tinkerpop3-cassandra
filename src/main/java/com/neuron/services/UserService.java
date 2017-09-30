package com.neuron.services;

import com.neuron.domains.User;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;
import com.tinkerpop.blueprints.impls.tg.TinkerGraphFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {



    public User saveUser(){
        TinkerGraph tinkerGraph = TinkerGraphFactory.createTinkerGraph();
        return null;
    }

}
