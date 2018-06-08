package com.arman.framework.util;

/**
 * Created by Coen on 19-4-2017.
 */
public class Debug {

    private static boolean debug = true;

    public static final void log(String msg) {
        if (debug) {
            StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
            String className = ste.getClassName();
            String methodName = ste.getMethodName();
            int lineNumber = ste.getLineNumber();
            System.out.println(className + " | " + methodName + " | " + lineNumber + " | " + msg);
        }
    }

}
