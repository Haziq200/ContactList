package sg.edu.rp.dmsd.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<ContactList> alContact;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContact);

        alContact = new ArrayList<>();

        ContactList name1= new ContactList("Mary","+65","65442334");
        ContactList name2= new ContactList("Ken","+65","97442437");
        alContact.add(name1);
        alContact.add(name2);

        caContact = new CustomAdapter(this,R.layout.contact_list,alContact);

        lvContact.setAdapter(caContact);

    }
}
