package com.gomad.firstwebapp.firstController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello() {
		return "Hello from String";
	}
	
	@RequestMapping("hello-html-string")
	@ResponseBody
	public String sayHelloFromHtmlString() {
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html>");
		sb.append("<html lang=\"en\">");
		sb.append("<head>");
		sb.append("<meta charset=\"UTF-8\">");
		
		sb.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		sb.append("<title>Hello from String Html</title>");
		sb.append("</head>");
		sb.append("<body>");

		sb.append("<h2>Hello From String Html</h2>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@RequestMapping("hello-html-jsp")
	public String sayHelloFromJSP() {
		return "HelloFromJsp";
	}

}
