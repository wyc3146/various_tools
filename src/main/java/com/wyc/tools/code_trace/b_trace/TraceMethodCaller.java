package com.wyc.tools.code_trace.b_trace;/**
 * Created by wyc on 2017/01/21.
 */

import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

/**
 * 追踪方法的调用者
 * @author wangyongcan
 * @Date 2017/01/21 16:20
 */
@BTrace
public class TraceMethodCaller {
    @OnMethod(clazz="CaseObject",method="execute")
    public static void traceExecute(){
        println("who call CaseObject.execute :");
        jstack();
    }
}
