package servlets;

import entities.User;
import models.Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddVoteServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/ThirdPage.jsp").forward(request, response);

}
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String yesOrNo = request.getParameter("YesOrNo").toString();
        User user = new User(request.getParameter("name"),yesOrNo);
        Model model = Model.getInstance();
        model.add(user);

    }
    public void destroy() {

    }
}
