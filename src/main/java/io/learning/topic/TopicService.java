package io.learning.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("33423432", "Java", "1997"),
			new Topic("334fdssd23sdfds432", "Pasindu", "43453"),
			new Topic("dfsdf", "C#", "1994"),
			new Topic("33423dsfsd432", "Spring", "2334")));

	public List<Topic> getTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

}
