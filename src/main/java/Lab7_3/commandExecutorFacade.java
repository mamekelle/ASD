package Lab7_3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class commandExecutorFacade implements IcommandExecutorFacade {

	@Override
	public void process() {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		CallableStatement callableStatement = null;
		ResultSet rset = null;

		try {
			Class.forName("<driver>").newInstance();
			connection = DriverManager.getConnection("<database>");
			String sql = "SELECT * FROM <table> WHERE <column name> =";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "<column value>");
			rset = preparedStatement.executeQuery();

			if (rset.next()) {
				System.out.println(rset.getString("<column name"));
			}
			sql = "{call <stored procedure>( ?, ? )}";
			callableStatement = connection.prepareCall(sql);
			callableStatement.setInt(1, 1972);
			callableStatement.registerOutParameter(2, java.sql.Types.INTEGER);
			callableStatement.execute();

			System.out.println(callableStatement.getInt(2));

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (callableStatement != null) {
				try {
					callableStatement.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
				}
			}
		}
	}

}
