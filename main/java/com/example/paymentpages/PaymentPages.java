package com.example.paymentpages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PaymentPages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_pages);

        RecyclerView view = findViewById(R.id.paymentRecycler);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Model> models = new ArrayList<>();
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        models.add(new Model(R.drawable.student, "AKshay Bhasme", "1000", "500", "10/12/2014", "500", "Edit"));
        PaymentAdapter adapter = new PaymentAdapter(models);
        view.setAdapter(adapter);

    }
}