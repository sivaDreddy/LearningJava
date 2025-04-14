package Collections;

public class IndianSecretUnit {
    public static void main(String[] args) {
        System.out.println("RAW Agent 1 Details:");
        RAWAgent rawAgent=new RAWAgent(101,"Chanikya","Jack");
        rawAgent.printDetails();
        System.out.println("RAW Agent 2 Details:");
        RAWAgent rawAgent1=new RAWAgent(102,"Agni","siva");
        rawAgent1.printDetails();
        System.out.println("RAW Agent 3 Details:");
        RAWAgent rawAgent2=new RAWAgent(103,"RAW","Rama");
        rawAgent2.printDetails();
        System.out.println("RAW Agent 4 Details:");
        RAWAgent rawAgent3=new RAWAgent(104,"Black","Prasad");
        rawAgent3.printDetails();
        System.out.println("RAW Agent 5 Details:");
        RAWAgent rawAgent4=new RAWAgent(105,"White","Hello");
        rawAgent4.printDetails();
    }

}
