package com.infinite.solid.ocp;

public class MainBilling {

  public void showBill(int meterId, String personName, IElectricity iElectricity){
    System.out.println("Meter Id  " +meterId);
    System.out.println("Person Name  " +personName);
    System.out.println("Paymode is " +iElectricity.payment(2000));
  }

  public static void main(String[] args) {
    IElectricity billSource;
    MainBilling billing = new MainBilling();
    billSource = new CreditCard();
    billing.showBill(6624,"Rama",billSource);

    billSource = new DebitCard();
    billing.showBill(7719,"Balu",billSource);

    billSource = new PhonePe();
    billing.showBill(9912,"Atchaya",billSource);

  }
}
