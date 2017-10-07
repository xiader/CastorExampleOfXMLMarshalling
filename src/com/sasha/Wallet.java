package com.sasha;

public class Wallet {
    public long id;
    public long credit;
    public long debit;

    public Wallet() {
    }

    public Wallet(long id, long credit, long debit) {
        this.id = id;
        this.credit = credit;
        this.debit = debit;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", credit=" + credit +
                ", debit=" + debit +
                '}';
    }
}