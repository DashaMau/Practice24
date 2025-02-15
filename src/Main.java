public class Main {
    public static void main(String[] args) {

        ChairFactory victorianFactory = new VictorianChairFactory();
        Client client1 = new Client(victorianFactory);
        client1.sit();


        ChairFactory multifunctionalFactory = new MultifunctionalChairFactory();
        Client client2 = new Client(multifunctionalFactory);
        client2.sit();


        ChairFactory magicalFactory = new MagicalChairFactory();
        Client client3 = new Client(magicalFactory);
        client3.sit();
    }
}
