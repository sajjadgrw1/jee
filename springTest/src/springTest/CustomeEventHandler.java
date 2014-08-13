package springTest;

import org.springframework.context.ApplicationListener;

public class CustomeEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("custom event invoked");
	}

}
