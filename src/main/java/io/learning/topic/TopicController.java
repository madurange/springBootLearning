package io.learning.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("33423432", "Java", "1997"),
				new Topic("33423432", "Java", "1997"),
				new Topic("33423432", "Java", "1997"),
				new Topic("33423432", "Java", "1997"));
	}
}
