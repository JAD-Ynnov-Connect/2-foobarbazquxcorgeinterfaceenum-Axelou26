package com.jad;

import java.util.List;
import java.util.ArrayList;

public class Foo implements IFoo {
    private final IBaz baz;
    private List<IBar> bars;
    private IQux qux;
    private ICorge corge;


    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
        this.qux = new Qux();
        this.corge = null;
    }


    @Override
    public IBaz getBaz() {
        return this.baz;
    }


    @Override
    public List<IBar> getBars() {
        return this.bars;
    }


    @Override
    public IQux getQux() {
        return this.qux;
    }


    @Override
    public ICorge getCorge() {
        return this.corge;
    }


    @Override
    public void setCorge(ICorge corge) {
        this.corge = corge;
    }


    @Override
    public void addBar(IBar bar) {
        if (this.bars == null) {
            this.bars = new ArrayList<>();
        }
        this.bars.add(bar);
    }


}


