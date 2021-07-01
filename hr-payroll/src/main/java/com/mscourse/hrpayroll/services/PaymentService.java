package com.mscourse.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mscourse.hrpayroll.entities.Payment;
import com.mscourse.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	public Payment getPayment(long workerId, int days) {
		//String uri = String.format("%s/workers/%d", this.workerHost, workerId);
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, pathVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
