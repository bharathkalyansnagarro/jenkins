package com.nagarro.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JenkinsApplicationTests {

	@Test
	void contextLoads() {
		assertThat(true).isTrue();
	}

}
