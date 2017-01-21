package com.wyc.tools.code_trace.b_trace;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

/**
 * 运行Case1
 * 然后通过btrace.bat运行此代码btrace -cp [btrace的jar包路径(默认build/)] [pid(要追踪的进程id)] TraceMethodArgsAndReturn.java
 * 如在btrace的home文件下运行btrace 68876 TraceMethodArgsAndReturn.java
 */
@BTrace 
public class TraceMethodArgsAndReturn{
	@OnMethod(
		clazz="CaseObject",
		method="execute",
		location=@Location(Kind.RETURN)
	)

	public static void traceExecute(int sleepTime,@Return boolean result,@ProbeMethodName String methodName){
			println("call CaseObject.execute");
			println(strcat("sleepTime is:",str(sleepTime)));
			println(strcat("return value is:",str(result)));
		}
	}