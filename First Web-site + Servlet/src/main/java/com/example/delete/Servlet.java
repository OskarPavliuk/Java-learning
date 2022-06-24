package com.example.delete;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.xml.crypto.Data;
import java.util.Date;

@WebServlet(name = "Servlet", value = "/plus")
public class Servlet extends HttpServlet {
    Calculator calculator;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        calculator = new CalculatorService();
    }

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int result = calculator.plus(a, b);
        request.setAttribute("a", a);
        request.setAttribute("b", b);
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp")
                .forward(request, response);


    }
}