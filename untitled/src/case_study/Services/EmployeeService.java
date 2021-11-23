package case_study.Services;

public interface EmployeeService extends Service{
    @Override
    void add();

    @Override
    void edit();

    @Override
    void remove();

    @Override
    void display();
}
