package demo2.ch4.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import demo2.ch4.dao.TestDao;

@Service
public class TestService {
	@Autowired
//	@Qualifier("testDao")
//	@Resource
	TestDao testDao;
	
	public void printLn(){
		System.out.println(testDao);
	}
}
