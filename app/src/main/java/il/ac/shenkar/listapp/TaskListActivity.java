package il.ac.shenkar.listapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.content.Intent;

public class TaskListActivity extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        button = (Button) findViewById(R.id.button);
        String activities[] = {"Tahini", "meat", "humus", "rice", "pasta", "sprite", "chease", "tomatos"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, activities);
        ListView myList = (ListView) findViewById(R.id.listView);
        myList.setAdapter(myAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskListActivity.this,CreateTaskActivity.class);
                startActivity(intent);
            }
        });
    }


}
