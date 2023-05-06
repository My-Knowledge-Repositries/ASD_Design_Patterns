package process.products;

import process.Phone;

public class ApplePhone implements Phone {
    @Override
    public void print() {
        System.out.println("Apple");
    }
}
