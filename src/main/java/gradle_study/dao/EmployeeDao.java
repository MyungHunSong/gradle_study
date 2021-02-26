package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Employee;

public interface EmployeeDao {
	List<Employee> selectEmployeeByAll();
	Employee selectEmployeeByNo(Employee emp);

	
	int insertEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(int employeeNo);
	
	List<Employee> selectEmployeeByAllSimple();

	

}
