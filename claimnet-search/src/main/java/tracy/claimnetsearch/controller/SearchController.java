package tracy.claimnetsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tracy.claimnetsearch.entity.Text;
import tracy.claimnetsearch.repository.TextRepository;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private TextRepository textRepository;

    @GetMapping("/text/{id}")
    public List<Text> search(@PathVariable("id")String id) {
        return textRepository.findTextsById(id);
    }
}
