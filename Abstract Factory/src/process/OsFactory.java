package process;

import enums.BrandType;

public interface OsFactory {
    public Phone build(BrandType brand);
}
