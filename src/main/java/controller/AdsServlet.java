package controller;

import model.Ad;
import model.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ad> ads = new ArrayList<>();
        ads = DaoFactory.getAdsDao().all();

        req.setAttribute("allAds",ads);
        req.getRequestDispatcher("ads/index.jsp").forward(req,resp);
    }
}
