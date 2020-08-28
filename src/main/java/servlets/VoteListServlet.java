package servlets;

import entities.User;
import models.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

public class VoteListServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<User> names = model.getUserList();
        request.setAttribute("userNames", names);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SecondPage.jsp");
        requestDispatcher.forward(request, response);

    }

    public void destroy() {

    }
}
