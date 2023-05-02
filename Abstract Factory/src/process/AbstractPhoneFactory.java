package process;

import enums.OsType;

public abstract class AbstractPhoneFactory {
    public static OsFactory getFactory(OsType type){
        switch (type){
            case ANDROID:
                return null;
            case IOS:
                return null;
            default:
                return null;
        }
    }
}
