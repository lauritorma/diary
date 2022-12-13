package com.example.Diary.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Diary.domain.Entry;
import com.example.Diary.domain.EntryRepository;

@Controller
public class EntryController {

	 @Autowired
	 private EntryRepository erepository;
	 
	 @GetMapping(value = {"/", "/getAllEntries" })
	 public @ResponseBody List<Entry> getAllEntries() {
		 return (List<Entry>) erepository.findAll();
	 }
}
