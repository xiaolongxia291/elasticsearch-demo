package tracy.claimnetsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "tracy.claimnetsearch.repository")
public class ClaimnetSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClaimnetSearchApplication.class, args);
    }

}
