package cn.nasity.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * vmall项目启动器
 * @author Kaisec_Cao
 * @version : 1.0
 * @date : 2019/7/28
 */
@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
@MapperScan("mapper")
public class VmallProviderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(VmallProviderApplication.class, args);
		System.out.println("提供者启动成功！！！");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
