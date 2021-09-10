package SingleResponsibility;

public class EmployeeStore implements IEmployeeStore
{
    private IEmailSender emailSender;

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {
    }
}
