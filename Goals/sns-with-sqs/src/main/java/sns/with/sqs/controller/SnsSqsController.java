package sns.with.sqs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;

import sns.with.sqs.utils.SnsSqsUtils;


@RestController
public class SnsSqsController {
	
	
	@Autowired
	public AmazonSNSClient snsClient;
	
	@Autowired
	public SnsSqsUtils util;
	
	@Value("${sns.topicArn}")
	String topicArn;
	
	 @RequestMapping("/sendtoSNS")
	    public String publishMessageToTopic(){
	    	final Map<String, MessageAttributeValue> messageAttributes = new HashMap<>();
	        messageAttributes.put("dish_type", new MessageAttributeValue()
	                .withDataType("String")
	                .withStringValue("TataSky"));
	        
	        PublishRequest publishRequest= new PublishRequest();
	        publishRequest.withMessage("Message for sns to sqs testing");
	        publishRequest.withTopicArn(topicArn);
	        publishRequest.withMessageAttributes(messageAttributes);
	        snsClient.publish(publishRequest);
	        return "Notification sent successfully !!";
	    }
	

}
