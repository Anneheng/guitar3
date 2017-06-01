package com.guitar.sqliteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.guitar.dao.IGuitarDao;
import com.guitar.model.Guitar;
import com.guitar.model.GuitarSpec;
import com.guitar.util.SqliteDBUtil;

public class SqliteGuitarDaoImpl implements IGuitarDao
{

	/**
	 * 
	 */
	@Override
	public void addGuitar(Guitar guitar)
	{
		SqliteDBUtil util = new SqliteDBUtil();
		Connection Conn = util.getConnection();
		String sql = "insert into Guitar2(serialNumber,price,builder,model,type,backWood,topWood) values(?,?,?,?,?,?,?)";
		try
		{
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, guitar.getSerialNumber());
			pstmt.setDouble(2, guitar.getPrice());
			pstmt.setString(3, guitar.getSpec().getBuilder());
			pstmt.setString(4, guitar.getSpec().getModel());
			pstmt.setString(5, guitar.getSpec().getType());
			pstmt.setString(6, guitar.getSpec().getBackWood());
			pstmt.setString(7, guitar.getSpec().getTopWood());

			pstmt.executeUpdate();
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			util.closeConnection(Conn);
			;
		}
	}

	/**
	 * 
	 */
	@Override
	public List<Guitar> searchGuitar()
	{
		SqliteDBUtil util = new SqliteDBUtil();
		Connection Conn = util.getConnection();
		String sql = "select * from Guitar2";
		List<Guitar> guitarList = new ArrayList<Guitar>();

		try
		{
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Guitar guitar = new Guitar(rs.getString("serialNumber"), rs.getDouble("price"),
						new GuitarSpec(rs.getString("builder"), rs.getString("model"), rs.getString("type"),
								rs.getString("backWood"), rs.getString("topWood")));
				guitarList.add(guitar);
			}
			return guitarList;
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			util.closeConnection(Conn);
		}
		return null;
	}

	/**
	 * 
	 */
	@Override
	public void delGuitar(String serialNumber)
	{
		SqliteDBUtil util = new SqliteDBUtil();
		Connection Conn = util.getConnection();
		String sql = "delete from Guitar2 where serialNumber = ?";
		try
		{
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, serialNumber);
			pstmt.executeUpdate();
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			util.closeConnection(Conn);
		}
	}
}
