package sg.edu.rp.c346.id19032110.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;

    ArrayList<employeeInfo> alEmployeeInfo;
    ArrayAdapter<employeeInfo> aaEmployeeInfo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeInfo = findViewById(R.id.listViewEmployee);
        alEmployeeInfo = new ArrayList<>();
        adapter = new CustomAdapter(this, R.layout.row, alEmployeeInfo);

        employeeInfo employee1 = new employeeInfo("John", "SoftwareTechnical Leader", 3400.0);
        employeeInfo employee2 = new employeeInfo("May", "Programmer", 2200.0);

        alEmployeeInfo.add(employee1);
        alEmployeeInfo.add(employee2);

        aaEmployeeInfo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alEmployeeInfo);
        lvEmployeeInfo.setAdapter(adapter);
    }
}
