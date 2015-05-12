package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.UserBean;
import utils.DbUtil;

public class UserDao {

	private Connection connection;

	public UserDao() {
		connection = DbUtil.getConnection();
	}

	public void addUser(UserBean user) {
		String sql = "insert into users(email_address) values (?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getEmail_address());
			int added = preparedStatement.executeUpdate();
			System.out.println("User Added!" + added);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
