/* 
Возвращаем StackTrace
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
         StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
         return Thread.currentThread().getStackTrace(); 
    }


    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return Thread.currentThread().getStackTrace(); 
    }

    public static StackTraceElement[] method3() {
        method4();
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
         return Thread.currentThread().getStackTrace(); 
    }

    public static StackTraceElement[] method4() {
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
         return Thread.currentThread().getStackTrace(); 
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
         return Thread.currentThread().getStackTrace(); 
    }     
}
