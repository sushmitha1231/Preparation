package com.trail;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(path = "/getString")
	public String getText() {
		return "Hello World";

	}

	@GetMapping(path = "/getName")
	public String getName() {
		return "Sushmitha veeramani";
	}

	@GetMapping(path = "/getGreet/{name}")
	public String getGreet(@PathVariable String name) {
		return "welcome   " + name;

	}

	@GetMapping(path = "/surName/{name}/{surName}")
	public String getGreet(@PathVariable String name, @PathVariable String surName) {
		return "welcome   " + name + " " + surName;

	}

	@GetMapping(path = "/stud/{name}/{age}/{degree}")
	public String getDetail(@PathVariable("name") String a, @PathVariable("age") int b,
			@PathVariable("degree") String c) {
		return "welcome   " + a + " " + b + " " + c;
	}

	@GetMapping(path = "/values/{a}/{b}/{c}/{d}/{e}")
	public int getGreet(@PathVariable int a, @PathVariable int b, @PathVariable int c, @PathVariable int d,
			@PathVariable int e) {
		int max = a;
		int[] values = { a, b, c, d, e };
		for (int v : values) {
			if (v >= max) {
				max = v;
			}
		}

		return max;

	}

	@GetMapping(path = "/check")
	public String checkPass(@RequestParam String name, @RequestParam int pass) {
		if (name.equals("sushmitha") && pass == 1234) {
			return "valid Person";
		} else {
			return "Invalid person";
		}
	}

	@GetMapping(path = "/getAc")
	public Ac acs(@RequestBody Ac ac) {
		return ac;
	}

	@GetMapping(path = "/getAll")
	public List<Ac> getAllAc(@RequestBody List<Ac> a) {

		return a;
	}

	@GetMapping(path = "/getPrice")

	public Ac getmax(@RequestBody List<Ac> a) {
		
    Ac max1= a.stream().max(Comparator.comparingInt(Ac::getPrice)).get();
	return max1;
	}
}
