package com.strategy.p_sha.pattern_strategy;

public class ExecuteOperation {

    private Strategy strategy;

    public ExecuteOperation(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int one, int two) {
        return strategy.doOperation(one, two);
    }

}
