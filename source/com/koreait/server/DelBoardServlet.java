package com.koreait.server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class DelBoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String pIboard = req.getParameter("iboard");
        System.out.println("pIboard : " + pIboard);

        int iboard = Integer.parseInt(pIboard);

        BoardVO param = new BoardVO();
        param.setIboard(iboard);
        BoardDAO.delBoard(param);
    }
}