package com.guitar.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guitar.util.SqliteDBUtil;

/**
 * Servlet implementation class ServiceTest
 */
public class ServiceTest
{
	public static void main(String[] args)
	{
		Connection conn1 = SqliteDBUtil.getConnection();
		//Connection conn2 = MySqlDBUtil.getConnection();
		PreparedStatement pstmt = null;
		String sql1 = "delete from Guitar2 where serialNumber = ?";
		try
		{
			pstmt = conn1.prepareStatement(sql1);
			pstmt.setString(1, "7");
			if (pstmt.executeUpdate() > 0)
			{
				System.out.print("我系统测试成功拉");
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}