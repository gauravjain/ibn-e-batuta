package com.panally.api;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.migrations.MigrationsBundle;

/**
 * @author gaurav.jain
 * @author nirlendu.saha
 */
public class PanallyApplication extends Application<PanallyConfiguration> {
    public static void main(String[] args) throws Exception {
        new PanallyApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<PanallyConfiguration> bootstrap) {
        bootstrap.addBundle(new MigrationsBundle<PanallyConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(PanallyConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });
    }

    @Override
    public void run(PanallyConfiguration configuration,
                    Environment environment) {
        final PanallyResource resource = new PanallyResource();
        environment.jersey().register(resource);
    }
}