import javax.servlet.*;
import java.io.*;
public class Newclass extends GenericServlet{
public void service(ServletRequest req, ServletResponse res){
try{

ServletContext sc=getServletContext();
String s=sc.getInitParameter("message");
PrintWriter pw=res.getWriter();
pw.println(s);

}catch(Exception e)
{
System.err.println(e);
}
}
}
