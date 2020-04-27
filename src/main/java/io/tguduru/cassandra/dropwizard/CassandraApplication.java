package io.tguduru.cassandra.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CassandraApplication extends Application<CassandraConfiguration> {

    public static void main(final String[] args) throws Exception {
        new CassandraApplication().run(args);
    }

    @Override
    public String getName() {
        return "Cassandra";
    }

    @Override
    public void initialize(final Bootstrap<CassandraConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final CassandraConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
