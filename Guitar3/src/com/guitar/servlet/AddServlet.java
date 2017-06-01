package com.guitar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guitar.dao.dataAccess;
import com.guitar.model.Guitar;
import com.guitar.model.GuitarSpec;
import com.guitar.dao.IGuitarDao;

/**
 * 添加吉他的请求
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		IGuitarDao guitardao = dataAccess.createGuitarDao();
		Guitar guitar = new Guitar();
		GuitarSpec guitarspec = new GuitarSpec();
		String serialNumber = request.getParameter("serialNumber");
		Double price = Double.parseDouble(request.getParameter("price"));
		String builder = request.getParameter("builder");
		String model = request.getParameter("model");
		String type = request.getParameter("type");
		String backWood = request.getParameter("backWood");
		String topWood = request.getParameter("topWood");
		
		guitar.setSerialNumber(serialNumber);
		guitar.setPrice(price);
		guitarspec.setBuilder(builder);
		guitarspec.setModel(model);
		guitarspec.setType(type);
		guitarspec.setBackWood(backWood);
		guitarspec.setTopWood(topWood);
		guitar.setSpec(guitarspec);

		guitardao.addGuitar(guitar);

	}

}
