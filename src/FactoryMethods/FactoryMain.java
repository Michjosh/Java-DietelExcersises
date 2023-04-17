package FactoryMethods;

public class FactoryMain {
    public static void main(String[] args) {
        Company company = Factory.getWorker();
        System.out.println(Factory.stringRep());

        System.out.println(company);
    }
}
