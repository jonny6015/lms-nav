package cn.lmsite.lmsnav;

import cn.stylefeng.roses.core.config.WebAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Lms导航应用程序
 *
 * @author jonny
 * @date 2020/04/03
 */
@SpringBootApplication(exclude = WebAutoConfiguration.class)
@MapperScan("cn.lmsite.lmsnav.modular.system.dao")
public class LmsNavApplication {
	private final static Logger logger = LoggerFactory.getLogger(LmsNavApplication.class);

	/**
	 * main
	 *
	 * @param args arg游戏
	 */
	public static void main(String[] args) {
		SpringApplication.run(LmsNavApplication.class, args);
		logger.info("Application is success!");
	}
}
