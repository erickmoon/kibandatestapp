package com.shuklo.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        findViewById(R.id.btnCustomer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectorActivity.this.startActivity(new Intent(SelectorActivity.this, CustomerRegisterActivity.class));
                SelectorActivity.this.finish();
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
        findViewById(R.id.btnSalesAgent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SelectorActivity.this.startActivity(new Intent(SelectorActivity.this, AgentHome.class));
                SelectorActivity.this.finish();
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                finish();
            }
        });
    }
}