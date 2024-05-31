public class Main {
    public static void main(String[] args) {
        Employee ramesh = new Employee("Ramesh","11/11/1985","01/01/2020");
        System.out.println(ramesh);
        System.out.println("Age = "+ ramesh.getAge());
        System.out.println("Pay = "+ramesh.collectPay());
        SalariedEmployee laxmi = new SalariedEmployee("laxmi","11/11/1990","03/03/2020",3500);
        System.out.println(laxmi);
        System.out.println("Age = "+ laxmi.getAge());
        System.out.println("Pay = "+laxmi.collectPay());
        laxmi.retire();
        System.out.println("laxmi pension ="+laxmi.collectPay());
        HourlyEmployee radhika = new HourlyEmployee("Radhika","01/01/2000","01/01/2018",15);
        System.out.println(radhika);
        System.out.println("Hourly pay= Rs."+radhika.collectPay());
        System.out.println("Double Payment=Rs."+radhika.getDoublePay());

    }
}