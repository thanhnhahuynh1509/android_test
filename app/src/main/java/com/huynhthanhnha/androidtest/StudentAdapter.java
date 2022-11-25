package com.huynhthanhnha.androidtest;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentAdapterViewHolder> {

    private List<Student> students;
    private MainActivity context;

    public StudentAdapter(List<Student> students, MainActivity context) {
        this.students = students;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StudentAdapterViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student_item_container, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapterViewHolder holder, int position) {
        holder.bidingData(students.get(position));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentAdapterViewHolder extends RecyclerView.ViewHolder {

        private RoundedImageView avatar;
        private TextView txtFullNameAndIdentity;
        private TextView txtPhoneNumber;
        private LinearLayout studentItemContainer;

        public StudentAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            txtFullNameAndIdentity = itemView.findViewById(R.id.txtFullNameAndIdentity);
            txtPhoneNumber = itemView.findViewById(R.id.txtPhoneNumber);
            studentItemContainer = itemView.findViewById(R.id.studentItemContainer);
        }

        public void bidingData(Student student) {
            avatar.setImageResource(student.getImage());
            txtFullNameAndIdentity.setText(student.getFullName() + " - " + student.getIdentity());
            txtPhoneNumber.setText(student.getPhoneNumber());
            studentItemContainer.setOnClickListener(v -> {
                Intent intent = new Intent(context, StudentDetails.class);
                intent.putExtra("student", student);
                context.startActivity(intent);
            });
        }
    }

}
