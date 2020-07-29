package com.demo.fitnesskitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.demo.fitnesskitapp.POJO.FitnessLesson;
import com.demo.fitnesskitapp.adapter.FitnessLessonAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewFitnessLesson;
    private FitnessLessonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewFitnessLesson = findViewById(R.id.recycleViewFitness);
        adapter = new FitnessLessonAdapter();
                ArrayList<FitnessLesson> fitnessLessons = new ArrayList<>();
        adapter.setFitnessLessons(fitnessLessons);
        recyclerViewFitnessLesson.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFitnessLesson.setAdapter(adapter);

        FitnessLesson fitnessLesson1 = new FitnessLesson();
        FitnessLesson fitnessLesson2 = new FitnessLesson();
        FitnessLesson fitnessLesson3 = new FitnessLesson();
        fitnessLesson1.setName("Kolya");
        fitnessLesson2.setName("Kolya_kolya");
        fitnessLesson3.setName("Kolya_kolya111");
        fitnessLesson1.setDescription("decs");
        fitnessLesson2.setDescription("decs+dtcs");
        fitnessLesson3.setDescription("decs+dtcs555");
        fitnessLesson1.setTeacher("tech1");
        fitnessLesson2.setTeacher("tech1_tec");
        fitnessLesson3.setTeacher("tech1_tec555");


        fitnessLessons.add(fitnessLesson1);
        fitnessLessons.add(fitnessLesson2);
        fitnessLessons.add(fitnessLesson3);

    }
}