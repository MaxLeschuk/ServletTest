package servlets;
import entities.User;
import models.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    private String message;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Model model = Model.getInstance();
        request.setAttribute("YES", model.getYes());
        request.setAttribute("NO", model.getNo());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/FirstPage.jsp");
        requestDispatcher.forward(request, response);
    }

    public void destroy() {

    }

}
