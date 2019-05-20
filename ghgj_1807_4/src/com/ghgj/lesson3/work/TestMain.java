package com.ghgj.lesson3.work;

abstract class Job{
	private String jobType;

	public Job(String jobType) {
		super();
		this.jobType = jobType;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public abstract void showJob();	
	
}

class Test extends Job{
	private int caseNum;
	private int findBugs;
	
	public Test(String jobType, int caseNum, int findBugs) {
		super(jobType);
		this.caseNum = caseNum;
		this.findBugs = findBugs;
	}

	@Override
	public void showJob() {
		// TODO Auto-generated method stub
		System.out.println("我是一名"+getJobType()+"Test [caseNum=" + caseNum + ", findBugs=" + findBugs + "]");
	}

}

class Code extends Job{
	private int codingLines;
	private int bugs;
	
	public Code(String jobType, int codingLines, int bugs) {
		super(jobType);
		this.codingLines = codingLines;
		this.bugs = bugs;
	}

	@Override
	public String toString() {
		return "Code [codingLines=" + codingLines + ", bugs=" + bugs + "]";
	}

	@Override
	public void showJob() {
		// TODO Auto-generated method stub
		System.out.println("我是一名"+getJobType()+"Code [codingLines=" + codingLines + ", bugs=" + bugs + "]");
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code code = new Code("程序员",20,52);
		code.showJob();
	}

}
