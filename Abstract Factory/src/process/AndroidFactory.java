package process;

import enums.BrandType;
import process.products.GooglePhone;
import process.products.HtcPhone;

public class AndroidFactory implements OsFactory{

    @Override
    public Phone build(BrandType brand) {
        switch (brand){
            case GOOGLE:
                return new GooglePhone();
            case HTC:
                return new HtcPhone();
            default:
                return null;
        }
    }
}