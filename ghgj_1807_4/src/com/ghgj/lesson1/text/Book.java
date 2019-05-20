package com.ghgj.lesson1.text;

public class Book {
	String title;
	int pageNum;
	
	public Book(String title,int pageNum) {
		if(pageNum>=200) {
			this.title = title ;
			this.pageNum= pageNum;
		}else{
			this.title = title;
			this.pageNum = 200;
		}
		
	}
	
	
	public String show() {
		return "Book [title=" + title + ", pageNum=" + pageNum + "]";
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}
}












