
package com.guitar.dao;
import com.guitar.mysqlDao.MysqlGuitarDaoImpl;
import com.guitar.sqliteDao.SqliteGuitarDaoImpl;

public class dataAccess
{
	private static String db = "sqlite";
    // private static String db="mysql";
	public static IGuitarDao createGuitarDao()
	{
		IGuitarDao result = null;
		switch (db)
		{
		case "sqlite":
			result = new SqliteGuitarDaoImpl();
			break;
		case "mysql":
			result = new MysqlGuitarDaoImpl();
			break;
		}
		return result;

	}

}
