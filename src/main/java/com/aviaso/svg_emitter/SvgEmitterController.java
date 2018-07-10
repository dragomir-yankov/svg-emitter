package com.aviaso.svg_emitter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class SvgEmitterController {
	
	@RequestMapping(value = "/svg", method = RequestMethod.GET)
	@ResponseBody
	public String svg() throws IOException {
		File file = new File("scatter.svg");
		String content = new String(Files.readAllBytes(file.toPath()));
		return content;
	}
	
	@RequestMapping(value = "/text", method = RequestMethod.GET, produces="text/html")
	@ResponseBody
	public String text() throws IOException {
		File file = new File("long.txt");
		String content = new String(Files.readAllBytes(file.toPath()));
		return content;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces="text/html")
	@ResponseBody
	public String test() throws IOException {
		return "test";
	}

}
