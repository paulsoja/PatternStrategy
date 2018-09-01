package com.strategy.p_sha.pattern_strategy;

public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int one, int two) {
        return one * two;
    }

}
