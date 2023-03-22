import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Игнатьева Алёна Андреевна", 1, 44000);
        employee[1] = new Employee("Левченко Антон Павлович", 2, 38000);
        employee[2] = new Employee("Суркова Антонина Вячеславовна", 3, 32000);
        employee[3] = new Employee("Раков Дмитрий Маркович", 4, 28000);
        employee[4] = new Employee("Добрынин Елизар Сидорович", 5, 50000);
        employee[5] = new Employee("Ведешина Лаурита Стефановна", 1, 34000);
        employee[6] = new Employee("Попова Снежана Юрьевна", 2, 80000);
        employee[7] = new Employee("Ахметзянова Мария Юрьевна", 3, 58000);
        employee[8] = new Employee("Бронзова Ирина Владимировна", 4, 63000);
        employee[9] = new Employee("Ушкина Елена Викторовна", 5, 40000);

        printEmployeeInfo(employee[1]);
        System.out.println(Arrays.toString(employee));


    }
    public void printAllEmployees(Employee employee) {
        for (int i = 0; i < Employee.counter; i++) {
            Employee employee = employee[i];
            printEmployeeInfo(employee[i]);
        }
    }
        public static void printEmployeeInfo(Employee employee) {
        System.out.println(employee.getFullName() + ": " + employee.getSalaryEmployee()
                + ", отдел: " + employee.getDepartment() + ", id: " + employee.getId());
    }

}

    //public int[] sumArr(Employee[] employee) {
      //  int[] arr = new int[10];
        //for (int i = 0; i < arr.length; i++) {
          //  arr = employee[i]
        //}


  //  }
    // public static void sumExpenses() {
      //  double sumSalary = 0;
        //int[] arr = sumArr();
        //for (int i = 0; i < arr.length; i++) {
          //      sumSalary = sumSalary + arr[i].getSalaryEmployee();
        //}
        //System.out.println("Сумма расходов на выплату зарплаты за месяц составила " + sumSalary + " рублей.");
        //}



