package demo.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderService {
	@Autowired
	RestTemplate restTemplate;
	@GetMapping
	public String placeOrder() {
		String msg= restTemplate.getForObject("http://PaymentService", String.class);
		return "Order Inititated..."+msg;
	}

}
