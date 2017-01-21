package com.wyc.tools.code_trace.b_trace;/**
 * Created by wyc on 2017/01/21.
 */

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

/**
 * 追踪方法耗时
 * @author wangyongcan
 * @Date 2017/01/21 15:50
 */
@BTrace
public class TraceExcuteTime {
    @TLS static long beginTime;

    @OnMethod(clazz="CaseObject",method="execute")
    public static void traceExecuteBegin(){
        beginTime=timeMillis();
    }

    @OnMethod(clazz="CaseObject",method="execute",location=@Location(Kind.RETURN))
    public static void traceExecuteReturn(int sleepTime,@Return boolean result) {
        println(strcat(strcat("CaseObject.execute time is:",str(timeMillis()-beginTime)),"ms"));
    }

}
