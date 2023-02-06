package tracy.claimnetsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import tracy.claimnetsearch.entity.Text;

import java.util.List;

public interface TextRepository extends ElasticsearchRepository<Text,String> {
    List<Text> findTextsById(String id);
}
