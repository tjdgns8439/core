package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//처음 스트링부트 스타터를 통해 프로젝트를 만들면 포함되어 있는 코드.
//기본적인 실행을 위한 코드이다.
@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}