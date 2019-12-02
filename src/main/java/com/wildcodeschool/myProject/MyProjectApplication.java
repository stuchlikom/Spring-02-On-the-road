package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/doctor/{incarnation_number}")
	@ResponseBody
	public String incarnationnumber(@PathVariable String incarnation_number) {
		switch (incarnation_number) {
			case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8":
				return "HTTP/1.1 303 See other.";
			case "9":
				return "{\"number\": " + incarnation_number + ", \"name\": \"Christopher Eccleston\"}";
			case "10":
				return "{\"number\": " + incarnation_number + ", \"name\": \"David Tennant\"}";
			case "11":
				return "{\"number\": " + incarnation_number + ", \"name\": \"Matt Smith\"}";
			case "12":
				return "{\"number\": " + incarnation_number + ", \"name\": \"Peter Capaldi\"}";
			case "13":
				return "{\"number\": " + incarnation_number + ", \"name\": \"Jodie Whittaker\"}";
			default:
				return "HTTP/1.1 404 Not found. Impossible to retrieve the incarnation " + incarnation_number + ".";
		}
	}

}


