package sns.with.sqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration;

@SpringBootApplication(exclude = ContextInstanceDataAutoConfiguration.class)
public class SNSwithSQSApplication {

	public static void main(String[] args) {
		SpringApplication.run(SNSwithSQSApplication.class, args);
		System.out.println("Entered into SNSwithSQSApplication Main class");

	}

}
