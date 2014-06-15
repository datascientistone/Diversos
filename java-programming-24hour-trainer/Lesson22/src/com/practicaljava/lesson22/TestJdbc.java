package com.practicaljava.lesson22;

import java.sql.*;

public class TestJdbc {
	public static void doJdbc() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection conexao = null;
		Statement cmd = null;
		ResultSet dados = null;
		
		try {
			// Class.forName(“oracle.jdbc.driver.OracleDriver”);
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			
			conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/Lesson22");
			if (conexao == null) {
				System.out.println("conexao nula");
				return;
			}
			
			cmd = conexao.createStatement();
			if (cmd == null) {
				System.out.println("cmd is null");
				return;
			}
			dados = cmd.executeQuery("SELECT * FROM EMPLOYEE");
			
			while(dados.next()){
				System.out.println(String.format("Id: %d - Name: %s - Title: %s", dados.getInt(1), dados.getString(2), dados.getString("JOB_TITLE")));
			}
			
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				if (conexao != null)
					conexao.close();
				if (cmd != null)
					cmd.close();
				if (dados != null)
					dados.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		doJdbc();
	}
}
