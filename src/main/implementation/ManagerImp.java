package main.implementation;
import main.models.Cashier;
import java.util.List;
import java.util.ArrayList;

public class Manager {
    private List<Cashier> cashier;

    public Manager() {
        ArrayList Cashier = new ArrayList<>();
    }

    public void hireCashier(Cashier cashier) {
        Cashier.add(cashier);
    }

    public void fireCashier(Cashier cashier) {
        Cashier.remove(cashier);
    }
}