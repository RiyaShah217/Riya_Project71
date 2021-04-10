import javax.servlet.http.*;
import java.io.*;
public class MyServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
     PrintWriter ps=res.getWriter();
    res.setContentType("text/html");
    try
    {
        int x=Integer.parseInt(req.getParameter("t1"));
         int y=Integer.parseInt(req.getParameter("t2"));
         ps.println("the addition is "+(x+y));
         
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
