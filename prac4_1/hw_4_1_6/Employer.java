package polyankina_kvbo0821.prac4_1.hw_4_1_6;

class Employer {

    private String firstName;
    private String lastName;
    private double income;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setIncome(double income) {
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getIncome() {
        return income;
    }
}

class Manager extends Employer {

    private double extraSum; // дополнительные выплаты от продаж
    private double averageSum;

    public double getExtraSum() {
        return extraSum;
    }
    public double getAverageSum() {
        return averageSum;
    }
    @Override
    public double getIncome() {
        return super.getIncome() + extraSum;
    }

}

class Tester {
    public static void main(String[] args) {

        Employer e1 = new Manager();
        Employer[] objects = new Manager[3];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Manager();
            System.out.println(objects[i].getIncome());
        }

    }
}