package FactoryMethods;

public class Factory implements Company {

    private String name;
    private String gender;
    private Factory(){}

    static Company getWorker(){
        Factory human = new Factory();
        human.name = "Michael";
        human.gender = "Male";
        return human;
    }

    static String stringRep(){
        return getWorker().toString();
    }



    @Override
    public void manager() {

    }
}
