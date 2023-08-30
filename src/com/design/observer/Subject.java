package com.design.observer;

public interface Subject {

	void subscribe(Observer ob);
	void unSubscribe(Observer ob);
	void newVideoUploaded(String title);
	
}
