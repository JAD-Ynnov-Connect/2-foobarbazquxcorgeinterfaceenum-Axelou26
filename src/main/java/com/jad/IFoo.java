package com.jad;

import java.util.List;

public interface IFoo {
    IBaz getBaz();
    List<IBar> getBars();
    IQux getQux();
    ICorge getCorge();
    void setCorge(ICorge corge);
    void addBar(IBar bar);

}

