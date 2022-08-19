package com.codestates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 자동 구성 활성화, 패키지 내에서 component, configuration 클래스 스캔 -> spring bean으로 등록,
public class Section3Week1Application {

	public static void main(String[] args) { // 엔트리 포인트 클래스

		SpringApplication.run(Section3Week1Application.class, args); // 부트 스트랩(설정작업수행(실행 가능한 애플리케이션으로 만듦) 실행
	}

}
