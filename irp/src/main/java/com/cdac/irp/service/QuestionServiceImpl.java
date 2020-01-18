package com.cdac.irp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cdac.irp.dao.IQuestionDao;
import com.cdac.irp.pojos.Question;

public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private IQuestionDao qnDao;
	
	@Override
	public List<Question> getTenQuestionList(/*add course id parameter later on*/) {
		return qnDao.getQuestionList();
	}

}