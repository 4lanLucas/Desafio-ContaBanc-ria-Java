package model;

public class Client {
    private int Number;
    private String Agency;
    private String clientName;
    private double balance;

    public Client(){

    }

    public Client(int number, String agency, String clientName, double balance) {
        Number = number;
        Agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String agency) {
        Agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Number=" + Number +
                ", Agency='" + Agency + '\'' +
                ", clientName='" + clientName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
