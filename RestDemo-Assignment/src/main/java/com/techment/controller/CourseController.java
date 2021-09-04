package com.techment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Course;
import com.techment.service.CourseService;

	@RestController
	public class CourseController {

		@Autowired
		private CourseService service;

		@GetMapping("/courses")
		public List<Course> list() {
			return service.listAll();
		}

		@GetMapping("/courses/{id}")
		public ResponseEntity<Course> get(@PathVariable int id) {
			try {
				Course c = service.get(id);
				return new ResponseEntity<Course>(c, HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new
						ResponseEntity<Course>(HttpStatus.NOT_FOUND);
			}
		}
		
		
		
}
