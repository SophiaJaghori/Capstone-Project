package com.cogent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Answer;
import com.cogent.entity.Question;
import com.cogent.repository.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepo;
	public void createQuestion() {
		
		
	}
	public List<Question> getAll(){
		return questionRepo.findAll();
	}
	public Question getById(int id) {
		return questionRepo.getById(id);
	}
	public Question update(Question question) {
		return questionRepo.save(question);
	}
	
	public Question deletById(Integer id) {
		questionRepo.deleteById(id);
		return null;
	}
	public List<Question> getAllQuestionFalse() {
		return questionRepo.findByStatus(false);
		
	}
	
	public List<Question> getAllQuestionByTopic(String topic) {
		List<Question>list = questionRepo.findAll();
		return list.stream().filter(s->s.getTopic()==topic).toList();
	}
	

}
