package com.moses.spring.gpDesignPatterns.delegate;

public class ExecutorA implements IExecutor{

	@Override
	public void doing() {
		System.out.println("员工A开始执行任务");
	}

}
