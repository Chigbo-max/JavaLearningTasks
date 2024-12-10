package Wallet;

import java.util.ArrayList;
import java.util.List;

public class Cbn {
    List<Bank> banks = new ArrayList<Bank>();
    private String name;
    private int bankNumber;

    public Bank registerBank(String name){
        bankNumber++;
        Bank newBank = new Bank(name, bankNumber);
        banks.add(newBank);

        return newBank;
    }

    public int getBankNumber(){
        return bankNumber;
    }

    public void transfer(int senderBankId, int receiverBankId, long senderAccountNumber, long receiverAccountNumber, Double amount, String pin){
        Bank sendingBank = findBank(senderBankId);
        Bank receivingBank = findBank(receiverBankId);

        sendingBank.findAccount(senderAccountNumber);
        receivingBank.findAccount(receiverAccountNumber);

        receivingBank.deposit(receiverAccountNumber, amount);
        sendingBank.withdraw(senderAccountNumber, amount, pin);
    }


    public Bank findBank(int bankId) {
        for (Bank foundBank : banks) {
            if (foundBank.getBankId() == bankId) {
                return foundBank;
            }
        }
        throw new IllegalArgumentException("Bank does not exist");
    }


}
