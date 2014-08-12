package springTest;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("context stopped");
	}

}
