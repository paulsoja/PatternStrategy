package com.strategy.p_sha.pattern_strategy;

public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int one, int two) {
        return one - two;
    }

}
