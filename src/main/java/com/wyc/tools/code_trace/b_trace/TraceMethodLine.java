package com.wyc.tools.code_trace.b_trace;/**
 * Created by wyc on 2017/01/21.
 */

import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

/**
 * 是否有人调用某一行代码
 * @author wangyongcan
 * @Date 2017/01/21 16:28
 */
@BTrace
public class TraceMethodLine {
    @OnMethod(clazz="CaseObject",location=@Location(value= Kind.LINE,line=8))
    public static void traceExecute(@ProbeClassName String pcn,@ProbeMethodName String pmn,int line){
        println(strcat(strcat(strcat("call ",pcn),"."),pmn));
    }
}
