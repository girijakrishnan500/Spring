package sns.with.sqs.utils;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListeners {

	@SqsListener("AirtelDish-queue")
	public void receiveAirtelDishqueueMsg(String msg) {
		System.out.println("Message from AirtelDish-queue" + msg);
	}

	@SqsListener("AllDish-queue")
	public void receiveAllDishqueueMsg(String msg) {
		System.out.println("Message from AllDish-queue" + msg);
	}

	@SqsListener("TataSkyDish-queue")
	public void receiveTataSkyqueueMsg(String msg) {
		System.out.println("Message from  TataSkyDish-queue" + msg);
	}

}
