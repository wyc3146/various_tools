package com.wyc.tools.java_byte_code.javassist;/**
 * Created by wyc on 2017/01/20.
 */

import javassist.*;

import java.io.File;
import java.io.IOException;
import java.io.StreamCorruptedException;

/**
 * @author wangyongcan
 * @Date 2017/01/20 16:37
 */
public class InsertCode {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {
        ClassPool pool = ClassPool.getDefault();
        //设置目标类的路径，确保能够找到需要修改的类，这里我指向firestorm.jar
        //解包后的路径
        pool.insertClassPath("target/classes/") ;

        //获得要修改的类
        CtClass cc = pool.get("com.wyc.tools.java_byte_code.javassist.SimpleClass");
        //设置方法需要的参数
        CtClass[] param = new CtClass[]{pool.makeClass("java.lang.String")} ;

        //得到方法
        CtMethod m = cc.getDeclaredMethod("printTest", param);
        //插入新的代码
        m.insertBefore("message = \"hack \" + message;") ;

        //保存到文件里(默认在当前目录下创建，如此例中会在项目根路径创建com\wyc\tools\java_byte_code\javassist\SimpleClass.class文件来保存修改后的字节码)
        cc.writeFile() ;
    }
}
