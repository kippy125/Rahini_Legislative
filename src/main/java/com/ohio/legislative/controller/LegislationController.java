package com.ohio.legislative.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ohio.legislative.entity.Legislation;
import com.ohio.legislative.entity.Legislator;
import com.ohio.legislative.repo.LegislationRepository;
import com.ohio.legislative.repo.LegislatorRepository;

@Controller
public class LegislationController {

	@Autowired
	private LegislatorRepository repo;
	@Autowired
	private LegislationRepository repo1;

	@GetMapping("/")
	public String index() {
		return "front_page"; // Returns index.html from templates folder
	}

	@GetMapping("/showLegislator") // Page 1: Display form
	public String showLegislator(Model model) {
		model.addAttribute("legislator", new Legislator());
		return "addLegislator";
	}

	@GetMapping("/showLegislation") // Page 1: Display form
	public String showLegislation(Model model) {
		List<Legislator> allLegislators = repo.findAll();
		// allLegislators.forEach(e->System.out.println(e.getFirst_name()));

		List<String> names = new ArrayList();
		for (Iterator iterator = allLegislators.iterator(); iterator.hasNext();) {
			Legislator legislator = (Legislator) iterator.next();
			names.add(legislator.getFirst_name() + "," + legislator.getLast_name());

		}

		model.addAttribute("legislation", new Legislation());
		model.addAttribute("names", names);

		return "addLegislation";
	}

	@PostMapping("/saveLegislator") // Handle form submission
	public String saveAndRedirectLegislator(@ModelAttribute Legislator data) {
		repo.save(data);
		return "redirect:/listLegislator"; // Redirect to Page 2
	}

	@PostMapping("/saveLegislation") // Handle form submission
	public String saveAndRedirectLegislation(@ModelAttribute Legislation data) {

		repo1.save(data);
		return "redirect:/listLegislation"; // Redirect to Page 2
	}

	@GetMapping("/listLegislator") // Page 2: Display saved records
	public String showLegislatorList(Model model) {

		model.addAttribute("allData", repo.findAll());
		return "list";
	}

	@GetMapping("/listLegislation") // Page 2: Display saved records
	public String showLegislationList(Model model) {

		model.addAttribute("allData", repo1.findAll());
		return "listLegislation";
	}
}
