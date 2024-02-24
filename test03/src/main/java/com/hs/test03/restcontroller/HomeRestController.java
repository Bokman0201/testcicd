package com.hs.test03.restcontroller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/home")

public class HomeRestController {
	@Autowired
	private SqlSession sqlSession;

	@GetMapping("/{name}")
	public void home(@PathVariable String name) {
		
		sqlSession.insert("test.testinsert",name);
		
		
	}
}
