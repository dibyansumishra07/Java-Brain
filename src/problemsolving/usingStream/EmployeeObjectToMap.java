package problemsolving.usingStream;

import utils.Employee;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeObjectToMap {
    public static void main(String[] args) {
        handleDuplicateEmployee();
    }

    private static void handleDuplicateEmployee() {
        List<utils.Employee> employees = utils.Employee.getEmployees(10);
        utils.Employee emp = new utils.Employee(8, "NewName", 10, "", 1.1, LocalDateTime.now());
        employees.add(emp);
        Map<Long, Employee> map = employees.stream().collect(Collectors.toMap(i->i.getEmpId(), i -> i, (i, j)->j));
        map.forEach((i, j) -> System.out.println(i + "->" + j));
    }
}
