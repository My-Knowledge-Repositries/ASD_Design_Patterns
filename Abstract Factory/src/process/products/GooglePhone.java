package process.products;

import process.Phone;

public class GooglePhone implements Phone {
    @Override
    public void print() {
        System.out.println("Google");
    }
}
