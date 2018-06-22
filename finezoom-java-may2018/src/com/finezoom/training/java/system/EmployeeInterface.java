package com.finezoom.training.java.system;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashSet;

public interface EmployeeInterface {
	public void add(HashSet<AdditionalEmployeeDetails> empHash) throws SQLException, ClassNotFoundException;
	public Boolean find(HashSet<AdditionalEmployeeDetails> empHash);
	public Boolean update (HashSet<AdditionalEmployeeDetails> empHash);
	public Boolean delete(String empName);
	public void report(HashSet<AdditionalEmployeeDetails> empHash) throws IOException;
	public void fileRead(HashSet<AdditionalEmployeeDetails> empHash) throws FileNotFoundException, IOException;
}
