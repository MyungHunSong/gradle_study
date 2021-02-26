package gradle_study.dao;

import java.util.List;

import gradle_study.dto.Department;

public interface DepartmentDao {
	List<Department> selectByAll();
	Department selectDepartmentByNo(Department department);
	
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	int deleteDepartment(int departmentNo);
	
	
}
