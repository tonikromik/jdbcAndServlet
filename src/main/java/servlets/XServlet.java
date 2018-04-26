package servlets;

import asd.Bank;
import asd.DBConnection;
import asd.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@WebServlet(name = "XServlet")
public class XServlet extends HttpServlet {

    private DBConnection dbConnection = new DBConnection();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Bank> bankList = dbConnection.findAll();
        request.setAttribute("items", bankList);
//        System.out.println(bankList);
        request.getRequestDispatcher("WEB-INF/pages/index.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String userSurname = request.getParameter("userSurname");
        String selection = request.getParameter("selection");
        String sumOfCredit = request.getParameter("sumOfCredit");

        dbConnection.save(userName, userSurname , selection, sumOfCredit);

//        Map<String, String[]> parameterMap = request.getParameterMap();
//        for (String[] strings : parameterMap.values()) {
//            System.out.println(Arrays.toString(strings));
//        }

        request.getRequestDispatcher("WEB-INF/pages/thanks.jsp").forward(request, response);
    }


}
