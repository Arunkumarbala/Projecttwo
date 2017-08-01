package com.niit.quickchat. dao;

import java.util.List;

import com.niit.quickchat.model.Job;

public interface JobDao {

	Job getJobById(int id);

	List<Job> getAllJobDetails();

	void saveJobDetails(Job job);

}
