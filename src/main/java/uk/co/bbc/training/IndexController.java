package uk.co.bbc.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		return "<h1>This is a deployment straight to INT</h1>\n";
	}

}
