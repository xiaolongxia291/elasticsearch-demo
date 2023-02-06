package tracy.claimnetsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@Document(indexName = "claimnet",createIndex = false)
public class Text implements Serializable {
    @Id
    @Field(name = "id",type = FieldType.Text)
    String id;
    @Field(name = "application_no",type = FieldType.Text)
    String applicationNo;
    @Field(name = "content",type = FieldType.Text)
    String content;
    @Field(name = "date",type = FieldType.Text)
    String date;
    @Field(name = "entity",type = FieldType.Text)
    String entity;
}
