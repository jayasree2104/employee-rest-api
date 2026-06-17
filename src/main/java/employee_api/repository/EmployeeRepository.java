package employee_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee_api.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}