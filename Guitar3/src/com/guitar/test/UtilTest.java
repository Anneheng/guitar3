package com.guitar.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.guitar.dao.dataAccess;
import com.guitar.dao.IGuitarDao;
import com.guitar.util.MySqlDBUtil;
import com.guitar.util.SqliteDBUtil;
/**
 *
 */
public class UtilTest
{
	public static void main(String[] args)
	{
		Connection conn1 = SqliteDBUtil.getConnection();
		System.out.println("这是与数据库的连接："+conn1);
		//Connection conn2 = MySqlDBUtil.getConnection();
		//System.out.println(conn2);

	}
}
