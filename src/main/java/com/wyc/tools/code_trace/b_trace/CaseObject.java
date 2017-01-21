package com.wyc.tools.code_trace.b_trace;

public class CaseObject {

	private static int sleepTotalTime = 0;

	public boolean execute(int sleepTime) throws Exception {
		System.out.println("sleep: " + sleepTime);
		sleepTotalTime += sleepTime;
		Thread.sleep(sleepTime);
		return true;
	}

}