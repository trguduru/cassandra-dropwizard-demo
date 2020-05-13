package io.tguduru.cassandra.dropwizard.db;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

import java.net.InetSocketAddress;

/**
 * @author Guduru, Thirupathi Reddy
 * created 4/27/20
 */
public class Main {
    public static void main(String[] args) {

        try {
            CqlSession session = CqlSession.builder().addContactPoint(new InetSocketAddress("127.0.0.1", 9042))
                    .withLocalDatacenter("Cassandra")
                    .build();
            ResultSet rs = session.execute("select release_version from system.local");              // (2)
            Row row = rs.one();
            session.getMetadata().getNodes().values().forEach(System.out::println);
            session.close();
            System.out.println("*******  Cassandra Version : *********  " + row.getString("release_version"));                                    // (3)
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
