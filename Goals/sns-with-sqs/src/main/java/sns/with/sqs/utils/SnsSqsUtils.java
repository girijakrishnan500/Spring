package sns.with.sqs.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

@Component
public class SnsSqsUtils {

	@Value("${cloud.aws.region.static}")
	private String awsRegion;

	@Value("{cloud.aws.credentials.accessKey}")
	private String awsAccessKey;

	@Value("${cloud.aws.credentials.secretKey}")
	private String awsSecretKey;

	private AmazonSQS amazonSQS;

	@PostConstruct
	private void postConstructor() {

		AWSCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(
				new BasicAWSCredentials(awsAccessKey, awsSecretKey));

		this.amazonSQS = AmazonSQSClientBuilder.standard().withRegion(awsRegion).withCredentials(awsCredentialsProvider)
				.build();
	}

}
