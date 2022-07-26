package com.db.betriebsstellen.BetriebsstellenAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class BetriebsstellenApiApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

//		Connection conn = null;
//		Statement stmt = null;
//
//		Class.forName("org.h2.Driver");
//		conn = DriverManager.getConnection("jdbc:h2:~/betriebsstellen", "", "");
//		stmt = conn.createStatement();
//
//		stmt.execute("drop table if exists betriebsstellen");
//		stmt.execute("CREATE TABLE BETRIEBSSTELLEN AS SELECT * FROM CSVREAD('classpath:/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv', null, 'fieldSeparator=;',  'charset=UTF-8' );");
//

		// h2 part from //from http://makble.com/how-to-read-csv-file-into-h2-database

		SpringApplication.run(BetriebsstellenApiApplication.class, args);

		//stmt.close();
	}

}
