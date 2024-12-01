package com.lyj.proj.oneteamsaproj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

@EnableScheduling // 회원 탈퇴 유예기간 지나면 스케줄러에서 관리하기 때문에 추가
@SpringBootApplication
@MapperScan("com.lyj.proj.oneteamsaproj.repository")
public class OneTeamSaProjApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneTeamSaProjApplication.class, args);
    }
}
