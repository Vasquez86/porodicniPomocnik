package rs.grifonsoft.porodicni_pomocnik;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import rs.grifonsoft.porodicni_pomocnik.config.AsyncSyncConfiguration;
import rs.grifonsoft.porodicni_pomocnik.config.EmbeddedElasticsearch;
import rs.grifonsoft.porodicni_pomocnik.config.EmbeddedKafka;
import rs.grifonsoft.porodicni_pomocnik.config.EmbeddedSQL;
import rs.grifonsoft.porodicni_pomocnik.config.JacksonConfiguration;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { PorodicniPomocnikApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
