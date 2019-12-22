package cn.nasity.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * vmall项目启动器
 * @author Kaisec_Cao
 * @version : 1.0
 * @date : 2019/7/28
 */
@SpringBootApplication
@ImportResource({"classpath:spring-customer-dubbo.xml"})
public class VmallCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmallCustomerApplication.class, args);
		System.out.println("消费端启动成功！！！");
	}

}
