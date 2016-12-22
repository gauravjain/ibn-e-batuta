package com.panally.ui;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by gaurav on 22/12/16.
 */
public class PanallyApplication extends Application<PanallyConfiguration> {
    public static void main(String[] args) throws Exception {
        new PanallyApplication().run(args);
    }
    @Override
    public void initialize(Bootstrap<PanallyConfiguration> bootstrap) {
    }

    @Override
    public void run(PanallyConfiguration configuration,
                    Environment environment) {
        final PanallyResource resource = new PanallyResource();
        environment.jersey().register(resource);
    }
}
