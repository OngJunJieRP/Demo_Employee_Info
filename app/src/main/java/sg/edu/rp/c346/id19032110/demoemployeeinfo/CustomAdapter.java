package sg.edu.rp.c346.id19032110.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<employeeInfo> employeeList;

    public CustomAdapter(Context context, int resource, ArrayList<employeeInfo> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        employeeList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        // Obtain the LayoutInflator object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        // Obtain the Current employee information
        employeeInfo currentEmployee = employeeList.get(position);

        // Set values to the textView to display
        tvName.setText(currentEmployee.getName());
        tvTitle.setText(currentEmployee.getTitle());
        tvSalary.setText(""  + currentEmployee.getSalary());

        return rowView;
    }

}
