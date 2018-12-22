package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: MR.z
 * @Date: 2018/11/26 14:56
 * @Version 1.0
 */
@WebServlet("/ServletSession")
public class ServletSession extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session);
//        获取sessionid
        String id = session.getId();
        System.out.println(id);
//        作为域对象使用
        session.setAttribute("洗衣机",3000);

//        session 重定向
        response.sendRedirect("");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
