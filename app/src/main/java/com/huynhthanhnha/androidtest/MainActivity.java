package com.huynhthanhnha.androidtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Huỳnh Thanh Nhã", "1911066244", "12345678", "15/09/2001",2019,R.drawable.avatar1));
        students.add(new Student("Phạm Vũ Phi Long", "1911022345", "12234678", "20/03/2000",2020,R.drawable.avatar2));
        students.add(new Student("Lương Văn Xưởng", "1911033255", "1039902112", "26/02/2000",2018,R.drawable.avatar3));

        StudentAdapter studentAdapter = new StudentAdapter(students, this);
        RecyclerView studentRecyclerView = findViewById(R.id.studentRecyclerView);
        studentRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        studentRecyclerView.setAdapter(studentAdapter);
    }
}