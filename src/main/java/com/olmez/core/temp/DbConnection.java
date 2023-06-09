package com.olmez.core.temp;

import java.sql.Connection;
import java.sql.DriverManager;

import lombok.extern.slf4j.Slf4j;

/**
 * Database connection: Example of a singleton connection class
 */
@Slf4j
public class DbConnection {
  private static final String URL = "jdbc:mysql://localhost:3306/core";
  private static final String USER = "root";
  private static final String PW = "1234";

  private static Connection con;

  static {
    try {
      con = DriverManager.getConnection(URL, USER, PW);
    } catch (Exception e) {
      log.error("Failed to connect to database. {}", e.getMessage());
    }
  }

  private DbConnection() {
  }

  public static Connection getConnection() {
    return con;
  }

}