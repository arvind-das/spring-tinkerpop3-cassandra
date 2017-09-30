package com.neuron.services;


import com.neuron.domains.User;
import com.thinkaurelius.titan.core.TitanFactory;
import com.thinkaurelius.titan.core.TitanGraph;
import org.apache.commons.configuration.BaseConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService implements AutoCloseable{


    Logger logger = LoggerFactory.getLogger(UserService.class);
    private TitanGraph titanGraph;

    public User saveUser(){

        User user = new User();
        user.setAge(28);
        user.setName("Neuron");
        BaseConfiguration baseConfiguration = new BaseConfiguration();
        baseConfiguration.setProperty("storage.backend", "cassandrathrift");
        baseConfiguration.setProperty("storage.hostname", "127.0.0.1");

        titanGraph = TitanFactory.open(baseConfiguration);
        titanGraph.addVertex(user);
        logger.debug("about to save user");
        titanGraph.newTransaction().commit();
//        GraphTraversalSource graphTraversalSource = titanGraph.traversal();
//        Vertex v1 = graphTraversalSource.V().has("name","Arvind").next();
//        System.out.println("savedd vertex now has id"+v1.property("age"));

        return null;
    }

    @Override
    public void close() throws Exception {
        titanGraph.close();
    }
}
