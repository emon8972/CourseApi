package io.javabrain.springbootstarter.TopicController;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic>topics=Arrays.asList(
			new Topic("111","SpringBoot","Spring boot"),
			new Topic("122","SpringBoot v2","Spring boot v2"),
			new Topic("133","SpringBoot v3","Spring boot v3")			
			);
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
