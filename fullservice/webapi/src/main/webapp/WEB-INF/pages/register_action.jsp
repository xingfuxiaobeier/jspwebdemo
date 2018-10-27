<%--
  Created by IntelliJ IDEA.
  User: mtime
  Date: 2018/9/10
  Time: 下午11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
    String username = request.getParameter("username");
    String password1 = request.getParameter("password1");
    String password2 = request.getParameter("password2");
    String email = request.getParameter("email");
    if(username==null||"".equals(username.trim())||password1==null||"".equals(password1.trim())||password2==null||"".equals(password2.trim())||!password1.equals(password2)){
        //out.write("用户名或密码不能为空！");
        System.out.println("用户名或密码不能为空！");
        response.sendRedirect("register.jsp");
        return;
        //request.getRequestDispatcher("login.jsp").forward(request, response);
    }
    boolean isValid = false;
    Connection con = null;// 创建一个数据库连接
    PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
    ResultSet result = null;// 创建一个结果集对象
    try
    {
        /*
        Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
        //System.out.println("开始尝试连接数据库！");
        String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:orcl";// 127.0.0.1是本机地址，orcl是Oracle的默认数据库名
        String user = "scott";// 用户名,系统默认的账户名
        String pwd = "tiger";// 你安装时选设置的密码
        con = DriverManager.getConnection(url, user, pwd);// 获取连接
        //System.out.println("连接成功！");
        String sql = "select * from p_user where username=?";// 预编译语句，“？”代表参数
        pre = con.prepareStatement(sql);// 实例化预编译语句
        pre.setString(1, username);// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
        result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
        if (!result.next()){
            sql = "insert into p_user(id,username,password,email) values(?,?,?,?)";// 预编译语句，“？”代表参数
            pre = con.prepareStatement(sql);// 实例化预编译语句
            pre.setString(1, System.currentTimeMillis()+"");// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
            pre.setString(2, username);// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
            pre.setString(3, password1);// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
            pre.setString(4, email);// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
            pre.executeUpdate();// 执行
            isValid = true;
        }
        */
        isValid = true;

    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    finally
    {
        try
        {
            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
            // 注意关闭的顺序，最后使用的最先关闭
            if (result != null)
                result.close();
            if (pre != null)
                pre.close();
            if (con != null)
                con.close();
            //System.out.println("数据库连接已关闭！");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    if(isValid){
        System.out.println("注册成功，请登录！");
        response.sendRedirect("login.jsp");
        return;
    }else{
        System.out.println("用户名已存在！");
        response.sendRedirect("register.jsp");
        return;
    }
%>


