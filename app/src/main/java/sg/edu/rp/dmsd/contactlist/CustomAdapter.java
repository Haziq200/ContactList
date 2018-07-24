package sg.edu.rp.dmsd.contactlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010603 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ContactList> contactLists;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactLists = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCount = rowView.findViewById(R.id.textViewCoun);
        TextView tvNum = rowView.findViewById(R.id.textViewNum);
        ContactList currentContact = contactLists.get(position);
        String name = currentContact.getName();
        String countrynum = currentContact.getCountrynum();
        String num = currentContact.getNum();
        tvName.setText(name);
        tvCount.setText(countrynum);
        tvNum.setText(num);
        return rowView;
    }
}