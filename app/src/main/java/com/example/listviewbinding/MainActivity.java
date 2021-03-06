package com.example.listviewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.listviewbinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  //  public RecyclerView mRecyclerView;
    private AdapterList mAdapterList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);
        mRecyclerView =  findViewById(R.id.recyclerviewId);*/
        ActivityMainBinding activityMainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        mAdapterList = new AdapterList(getUserList(), this);
        activityMainBinding.recyclerviewId.setAdapter(mAdapterList);
        activityMainBinding.recyclerviewId.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        activityMainBinding.recyclerviewId.setLayoutManager(new LinearLayoutManager(this));
    }
    private List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Prashanr kumar", 25, true, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Sunflower_from_Silesia2.jpg/1200px-Sunflower_from_Silesia2.jpg"));
        userList.add(new User("Amit kumar", 23, false, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Sunflower_from_Silesia2.jpg/1200px-Sunflower_from_Silesia2.jpg"));
        userList.add(new User("shusant kumar", 24, true, "https://upload.wikimedia.org/wikipedia/commons/b/b4/JPEG_example_JPG_RIP_100.jpg"));
        userList.add(new User("Bittu kumar", 26, true, "https://upload.wikimedia.org/wikipedia/commons/b/b4/JPEG_example_JPG_RIP_100.jpg"));
        userList.add(new User("Shashi kumar", 22, true, "https://upload.wikimedia.org/wikipedia/commons/b/b4/JPEG_example_JPG_RIP_100.jpg"));
        userList.add(new User("Alok kumar", 26, false, "https://upload.wikimedia.org/wikipedia/commons/b/b4/JPEG_example_JPG_RIP_100.jpg"));
        userList.add(new User("Ajeet kumar", 27, true, "https://upload.wikimedia.org/wikipedia/commons/b/b4/JPEG_example_JPG_RIP_100.jpg"));
        return userList;
    }
}