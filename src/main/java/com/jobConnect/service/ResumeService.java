package com.jobConnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobConnect.entity.Resume;
import com.jobConnect.repository.ResumeRepository;
@Service
public class ResumeService {
	
	@Autowired
	private ResumeRepository resumeRepository;
		
	public Resume getResumeByCandidateId(Long candidateId) {
		return resumeRepository.findByCandidateId(candidateId).orElse(null);
	}
	   
	 public Resume saveResume(Resume resume) {
		 return resumeRepository.save(resume);
	 }
}
