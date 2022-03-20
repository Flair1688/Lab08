package mic.maev.recyclerviewpractic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recView;
    private ArrayList<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeData();
        recView = findViewById(R.id.recView);
        StudentAdapter studentAdapter = new StudentAdapter(this, students);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(studentAdapter);
    }

    private void initializeData(){
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Chyngyz", "Ryskeldiev"));
        students.add(new Student("IT-120", "Esentur", "Omorov"));
        students.add(new Student("IT-120", "Azamat", "Rysbekov"));
        students.add(new Student("IT-120", "Ioann", "Isakov"));
        students.add(new Student("IT-120", "Alexander", "Lobanov"));
        students.add(new Student("IT-120", "Azat", "Asanov"));
        students.add(new Student("IT-120", "Eraaly", "Kasymbekov"));
        students.add(new Student("IT-120", "Asel", "Anarbekova"));
        students.add(new Student("IT-120", "Dzhenaliev", "Asylbek"));
        students.add(new Student("IT-120", "Tokoev", "Rysbek"));
        students.add(new Student("IT-120", "Radchenko", "Arseniy"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));
        students.add(new Student("IT-120", "Islamiddin", "Islamov"));


    }
}