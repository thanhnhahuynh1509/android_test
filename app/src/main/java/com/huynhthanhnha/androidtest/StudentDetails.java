package com.huynhthanhnha.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;

public class StudentDetails extends AppCompatActivity {

    private Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        RoundedImageView avatar = findViewById(R.id.avatar);
        TextView txtFullName = findViewById(R.id.txtFullName);
        TextView txtIdentity = findViewById(R.id.txtIdentity);
        TextView txtPhoneNumber = findViewById(R.id.txtPhoneNumber);
        TextView txtYearStart = findViewById(R.id.txtYearStart);
        TextView txtDob = findViewById(R.id.txtDob);
        student = (Student) getIntent().getSerializableExtra("student");

        avatar.setImageResource(student.getImage());
        txtFullName.setText(student.getFullName());
        txtIdentity.setText(student.getIdentity());
        txtPhoneNumber.setText(student.getPhoneNumber());
        txtYearStart.setText(student.getYearStart() + " - " + (student.getYearStart() + 4));
        txtDob.setText(student.getDob());
    }
}