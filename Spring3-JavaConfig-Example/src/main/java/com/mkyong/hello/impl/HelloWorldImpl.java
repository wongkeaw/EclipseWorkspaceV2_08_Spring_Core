package com.mkyong.hello.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkyong.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	public void printHelloWorld(String msg) {
		System.out.println("Hello : " + msg);
		return ;
	}

}