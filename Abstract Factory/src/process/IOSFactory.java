package process;

import enums.BrandType;
import process.products.ApplePhone;

public class IOSFactory implements OsFactory {
    @Override
    public Phone build(BrandType brand) {
        switch (brand) {
            case APPLE:
                return new ApplePhone();
            default:
                return null;
        }
    }
}
