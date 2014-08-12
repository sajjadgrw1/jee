package springTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	String hello ;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld() {
		System.out.println("constructor called");
		this.hello = "sajjad";
	}
	
	public void init(){
		System.out.println("init called");
	}
	public void destroy(){
		System.out.println("destory called");
	}
	
	public static void main (String args[])
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
		context.start();
		context.stop();
		System.out.println(hello.getHello());

	}
	
}
