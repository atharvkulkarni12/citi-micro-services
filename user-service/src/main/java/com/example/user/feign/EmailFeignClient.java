package com.example.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
@Component
@FeignClient("email-service")
public interface EmailFeignClient {
	@PostMapping("/email")
	public String sendMail(String email);
}
