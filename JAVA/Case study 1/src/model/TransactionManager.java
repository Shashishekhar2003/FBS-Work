package model;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> list;

    public TransactionManager() {
        list = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        if (t != null) list.add(t);
    }

    public void printAll() {
        if (list.isEmpty()) {
            System.out.println("No transactions.");
            return;
        }
        for (Transaction t : list) t.print();
    }

    public void writeAll(PrintWriter out) {
        if (list.isEmpty()) {
            out.println("No transactions.");
            return;
        }
        for (Transaction t : list) out.println(t.toLine());
    }
}
