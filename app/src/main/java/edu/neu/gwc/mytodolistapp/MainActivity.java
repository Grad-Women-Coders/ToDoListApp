package edu.neu.gwc.mytodolistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> taskListAdapter;
    private EditText taskEditText;
    private ListView taskListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Initializing the List Adapter */
        taskListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        taskEditText = (EditText) findViewById(R.id.editText);
        taskListView = (ListView) findViewById(R.id.listView);
    }

    public void addTask(View view){
        String task = taskEditText.getText().toString();
        if (!task.isEmpty()) {
            taskListAdapter.add(task);
            taskListView.setAdapter(taskListAdapter);
        }
    }
}
