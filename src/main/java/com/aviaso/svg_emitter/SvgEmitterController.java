package com.aviaso.svg_emitter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SvgEmitterController {
	
	@RequestMapping(value = "/rest/svg", method = RequestMethod.GET, produces="text/html")
	@ResponseBody
	public String svg() throws IOException {
		return getSvg();
	}
	
	@RequestMapping(value = "/rest/text", method = RequestMethod.GET, produces="text/html")
	@ResponseBody
	public String text() throws IOException {
		File file = new File("E:\\oxygen-workspace\\svg-emitter\\long.txt");
		String content = new String(Files.readAllBytes(file.toPath()));
		return content;
	}

	protected String getSvg() throws IOException {
//		File file = new File("C:\\Users\\H216313\\workspace-git\\gwt-test2\\scatter.svg");
//		String content = new String(Files.readAllBytes(file.toPath()));
		return "asd";
	}

}
