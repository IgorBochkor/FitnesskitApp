package com.demo.fitnesskitapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.fitnesskitapp.POJO.FitnessLesson;
import com.demo.fitnesskitapp.R;

import java.util.List;

public class FitnessLessonAdapter extends RecyclerView.Adapter<FitnessLessonAdapter.FitnessLessonViewHolder> {

    private List<FitnessLesson> fitnessLessons;

    public List<FitnessLesson> getFitnessLessons() {
        return fitnessLessons;
    }

    public void setFitnessLessons(List<FitnessLesson> fitnessLessons) {
        this.fitnessLessons = fitnessLessons;
    }

    @NonNull
    @Override
    public FitnessLessonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fitnesskit_item,parent,false);
        return new FitnessLessonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FitnessLessonViewHolder holder, int position) {
//        FitnessLesson fitnessLesson = new FitnessLesson();
       FitnessLesson fitnessLesson = fitnessLessons.get(position);

        holder.textViewName.setText(fitnessLesson.getName());
        holder.textViewDesc.setText(fitnessLesson.getDescription());
        holder.textViewTeacher.setText(fitnessLesson.getTeacher());
    }

    @Override
    public int getItemCount() {
        return fitnessLessons.size();
    }

    public class FitnessLessonViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewName;
        private TextView textViewDesc;
        private TextView textViewTeacher;


        public FitnessLessonViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDesc = itemView.findViewById(R.id.textViewDecs);
            textViewTeacher = itemView.findViewById(R.id.textViewTeacher);
        }
    }
}
