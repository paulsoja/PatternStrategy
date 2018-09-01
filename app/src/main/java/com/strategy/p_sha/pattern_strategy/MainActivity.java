package com.strategy.p_sha.pattern_strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewAdd;
    private TextView textViewSubstract;
    private TextView textViewMultiply;
    private ExecuteOperation operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewAdd = findViewById(R.id.result_add_display_text);
        textViewSubstract = findViewById(R.id.result_substract_display_text);
        textViewMultiply = findViewById(R.id.result_multiply_display_text);
        add();
        substract();
        multiply();
    }

    private void add() {
        operation = new ExecuteOperation(new OperationAdd());
        String result = "10 + 5 = " + operation.executeStrategy(10, 5);
        textViewAdd.setText(result);
    }

    private void substract() {
        operation = new ExecuteOperation(new OperationSubstract());
        String result = "10 - 5 = " + operation.executeStrategy(10, 5);
        textViewSubstract.setText(result);
    }

    private void multiply() {
        operation = new ExecuteOperation(new OperationMultiply());
        String result = "10 * 5 = " + operation.executeStrategy(10, 5);
        textViewMultiply.setText(result);
    }

}
