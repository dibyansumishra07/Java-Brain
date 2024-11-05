package PROBLEM_SOLVING.DESIGN_PATTERNS.STRUCTURAL.PROXY;

// ! DTO Class
class EmployeeDto {

}

interface EmployeeDao {
    public void create(String client, EmployeeDto employeeDto) throws Exception;

    public void delete(String client, EmployeeDto employeeDto) throws Exception;

    public EmployeeDto get(String client, int employeeId) throws Exception;
}

class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, EmployeeDto employeeDto) {
        System.out.println("Actual logic for create.");
    }

    @Override
    public void delete(String client, EmployeeDto employeeDto) {
        System.out.println("Actual logic for delete.");
    }

    @Override
    public EmployeeDto get(String client, int employeeId) {
        System.out.println("Actual logic for Get.");
        return null;
    }
}

class EmployeeDaoImplProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    EmployeeDaoImplProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDto employeeDto) throws Exception {
        if ("ADMIN".equals(client)) {
            employeeDao.create(client, employeeDto);
            return;
        }
        throw new Exception("Kon he bhai tu");
    }

    @Override
    public void delete(String client, EmployeeDto employeeDto) throws Exception {
        if ("ADMIN".equals(client)) {
            employeeDao.delete(client, employeeDto);
            return;
        }
        throw new Exception("Kon he bhai tu");
    }

    @Override
    public EmployeeDto get(String client, int employeeId) throws Exception {
        if ("ADMIN".equals(client)) {
            employeeDao.get(client, employeeId);
            return null;
        }
        throw new Exception("Kon he bhai tu");
    }
}

public class ProxyDesignPattern {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImplProxy();
        try {
            employeeDao.create("ADMINN", new EmployeeDto());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}