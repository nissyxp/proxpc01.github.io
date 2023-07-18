package com.homework01_17;

/**
 * description:
 * author: 熊万里
 */
public class Homework08 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);//此时为1300
        savingAccount.withdraw(100);//存取款达到4次，此时取100,为1199
        savingAccount.deposit(100);//达到5次，此时存100，为1298
        System.out.println(savingAccount.getBalance());
        savingAccount.earnMonthlyInterest();//要记得加个定时器，每月月初给利息，重置每月3次免费存取款机会
        System.out.println(savingAccount.getBalance());//1298+1298*0.03=1336.94
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);//存完3次免费机会的100，为1636.94
        savingAccount.withdraw(100);//此时第4次，取100，相当于1636.94-100-1=1535.94
        System.out.println(savingAccount.getBalance());//此时余额为1535.94

    }
}

class BankAccount {//父类
    private double balance;//余额

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount) {
        balance += amount;
    }

    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//重写存款，每次存钱，扣1元手续费
        super.deposit(amount - 1);//存完后，再对1元进行别的方法处理，打入银行自己的账户
        //...
    }

    @Override
    public void withdraw(double amount) {//重写取款，每次存钱，扣1元手续费
        super.withdraw(amount + 1);//取完后，再对1元进行别的方法处理，打入银行自己的账户
        //...
    }
}

class SavingAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.03;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        //重写父类存款方法，修改新业务逻辑，每月3次存取款免手续费，超过后每次存取款扣1元
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        //重写父类取款方法，修改新业务逻辑，每月3次存取款免手续费，超过后每次存取款扣1元
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }
}