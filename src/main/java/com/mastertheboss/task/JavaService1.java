package com.mastertheboss.task;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class JavaService1 implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) {
		if (isComplexTask()) {
			System.out.println("This is a complex task!");
			execution.setVariable("result", "1");
		} else {
			System.out.println("This is a simple task!");
			execution.setVariable("result", "0");
		}
	}

	private boolean isComplexTask() {
		return Math.random() < 0.5;
	}

}
