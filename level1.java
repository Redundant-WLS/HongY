class Employee {

        private String name;
        private String age;
        private float salary;
        private String identity;

        public Employee(String id, String name, String age, float sal) {
            this.age = age;
            this.identity = identity;
            this.salary = salary;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public String getIdentity() {
            return identity;
        }

        public void setIdentity(String identity) {
            this.identity = identity;
        }
    }

    class EmployA {
        ArrayList aa = null;

        public EmployA() {
            aa = new ArrayList();

        }

        public void addEmployee(Employee employee) {

            aa.add(employee);

        }

        public void showEmployee(String identity) {
            for (int i = 0; i < aa.size(); i++) {
                Employee employee = (Emp) aa.get(i);
                if (employee.getIdentity().equals(identity)) {
                    System.out.println("��ѯ��Ա��������" + employee.getName());
                    System.out.println("����" + employee.getSalary());
                    System.out.println("����" + employee.getAge());
                    System.out.println("�Ա�" + employee.getIdentity());
                }
            }

        }

        public void deleteEmployee(String id) {
            for (int i = 0; i < aa.size(); i++) {
                Employee employee = (Employee) aa.get(i);
                if (employee.getIdentity().equals(identity)) {
                    aa.remove(i);
                    aa.remove(employee);
                }
            }

        }

        public void updateEmployee(String identity, float newsalary) {
            for (int i = 0; i < aa.size(); i++) {
                Employee employee = (Employee) aa.get(i);
                if (employee.getIdentity().equals(identity)) {
                    employee.setSalary(newsalary);
                }

            }
        }

    }



