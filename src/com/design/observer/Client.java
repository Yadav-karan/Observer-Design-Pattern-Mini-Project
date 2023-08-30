package com.design.observer;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		System.out.println("Welcome to my Yutube Channel");
		Scanner sc = new Scanner(System.in);
		boolean flag= true;
		while(flag) {
			System.out.println("1.upload a new video");
			System.out.println("2.create a subscriber");
			System.out.println("3.unsubscribe a user");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			int key =sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter title for new video");
				String title = sc.next();
				channel.newVideoUploaded(title);
				System.out.println("----------------------------------------------");
				break;
			case 2:
				System.out.println("Enter name for subscriber");
				String subName = sc.next();
				Subscriber subscriber = new Subscriber(subName);
				channel.subscribe(subscriber);
				System.out.println("----------------------------------------------");
				break;
			case 3:
				System.out.println("List of subscribers");
				for(int i=0;i<channel.subscribers.size();i++) {
					Subscriber sb = (Subscriber) channel.subscribers.get(i);
					System.out.println((i+1)+" "+sb.name);
				}
				System.out.println("Choose name to unsubscribe");
				int unSubChoice = sc.nextInt();
				Observer ob = channel.subscribers.get(unSubChoice-1);
				Subscriber sb = (Subscriber) ob;
				channel.unSubscribe(ob);

				System.out.println(sb.name+" Unsubscribed successfully");
				System.out.println("----------------------------------------------");
				break;
			case 4:
				System.out.println("Thank you for using me!!!!!!!");
				flag=false;
				break;
			default:
				System.out.println("Wrong choice!!!!!");
				break;
			}
		}
		
	}

}
