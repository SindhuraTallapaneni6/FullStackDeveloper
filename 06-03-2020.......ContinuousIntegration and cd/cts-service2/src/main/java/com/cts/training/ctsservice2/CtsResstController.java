package com.cts.training.ctsservice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtsResstController {
	@GetMapping(value="/name")
	public List<String> names(){
		return new ArrayList<String>(Arrays.asList("sindhu","tanu","sairam","divya"));
	}

}
