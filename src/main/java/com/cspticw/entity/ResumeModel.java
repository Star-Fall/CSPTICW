package com.cspticw.entity;

import java.util.List;

public class ResumeModel extends StuResumeInfo {

	private static final long serialVersionUID = -3352001123388840741L;

	private List<ResumeJob> resumeJobs;

	private List<WorkExperience> workExperiences;

	public List<ResumeJob> getResumeJobs() {
		return resumeJobs;
	}

	public void setResumeJobs(List<ResumeJob> resumeJobs) {
		this.resumeJobs = resumeJobs;
	}

	public List<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}

	public void setWorkExperiences(List<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

}
