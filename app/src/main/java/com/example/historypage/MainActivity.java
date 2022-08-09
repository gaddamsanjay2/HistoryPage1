package com.example.historypage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    UserAdapter userAdapter;
    ModelClass modelClass;
    List<ModelClass> modelClassList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userAdapter=new UserAdapter(getApplicationContext(),modelClassList);
        recyclerView.setAdapter(userAdapter);
        
        LoadData();
    }

    private void LoadData() {
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img,"2 mins ago","Paid To","Raju","RS:500","Debited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_call_received_24,R.drawable.img_1,"1 days ago","Received from","karuna","RS:2500","Credited to");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img,"2 days ago","Paid To","Tamanna","RS:5500","Debited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_call_received_24,R.drawable.img_1,"4 days ago","Received from","sai","RS:500","Credited to");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img," 4 days ago","Paid To","ram","RS:200","Debited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img_1,"5 days ago","Paid To","sanjay","RS:220","Debited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img,"7 days ago","Paid To","ruksana","RS:500","Debited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_call_received_24,R.drawable.img_1,"7 days ago","Received from","Anand","RS:1000","Credited to");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img,"8 days ago","Paid To","Naziya","RS:5000","Debited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_call_received_24,R.drawable.img_1,"8 days ago","Received from","Harish","RS:300","Credited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img_1,"9 days ago","Paid To","Lakshmi","RS:100","Debited from");
        modelClassList.add(modelClass);
        modelClass = new ModelClass(R.drawable.ic_baseline_arrow_outward_24,R.drawable.img_1,"9 days ago","Paid To","Aishwarya","RS:10000","Credited from");
        modelClassList.add(modelClass);
    }
}