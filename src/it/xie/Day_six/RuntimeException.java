package it.xie.Day_six;

import java.sql.SQLException;

/**
 * 自定义 RuntimeException
 * 添加错误代码属性
 * 将异常直接打印在客户端的例子屡见不鲜，以 JSP 为例，一旦代码运行出现异常，默认情况下容器将异常堆栈信息直接打印在页面上。
 * 在异常中引入错误代码，一旦出现异常，我们只要将异常的错误代码呈现给用户，或者将错误代码转换成更通俗易懂的提示。
 */
public class RuntimeException extends java.lang.RuntimeException {
    //默认错误代码
    public static final Integer GENERIC = 1000000;
    //错误代码
    private Integer errorCode;
    public RuntimeException(Integer errorCode, Throwable cause) {
        this(errorCode, null, cause);
    }
    public RuntimeException(String message, Throwable cause) {
        //利用通用错误代码
        this(GENERIC, message, cause);
    }
    public RuntimeException(Integer errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    public Integer getErrorCode() {
        return errorCode;
    }
}
class tomcat{
    public static void main(String[] args) {
        System.out.println("客户端的数据格式不对");
        tomcat t=new tomcat();
       try {
//           t.show();
           t.Service();
       }catch (RuntimeException e){
           System.out.println(e.getErrorCode()+"根据代码做合适的页面");
       }
    }
    public void show(){
        //.... 非检测异常是不需要进行在方法上检测的 但是却又是不是发生
        throw new RuntimeException(1000,"格式不对",new IllegalAccessException());
    }

    public void Service(){
//        try {
//            retrieveCustomerById(123);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }// 这是一般写法 不具有隔离原则
        System.out.println("使用retrieveCustomerByIdII");
        try {
            retrieveCustomerByIdII(1);
        }catch (RuntimeException e){
            System.out.println(e.getErrorCode());
        }
    }

    public String retrieveCustomerById(int id) throws SQLException {
        //根据 ID 查询数据库
        return null;
    }

    public String retrieveCustomerByIdII(int id){
        try{
            //根据 ID 查询数据库
            throw new SQLException();
        }
        catch(SQLException e){
            //利用非检测异常封装检测异常，降低层次耦合
            System.out.println("。。。。");
            throw new RuntimeException(1000, e);
        }
        finally {
            System.out.println("只是做清理工作");
        }
    }
}