package com.thanakrit.tigerfoodnative;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    FirebaseFirestore db;
    RecyclerView recyclerView;
    MyAdapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    DatabaseReference reference;
    ArrayList<Restaurent> restaurent;

//    private String[] myDataset = {"item1","item2"}; //login ไม่ได้
//    ArrayList<Restaurent> myDataset;
//    private String[] myDataset ={};//ขึ้น

//    public ListActivity(){
//        myDataset = new ArrayList<Restaurent>();
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        reference = FirebaseDatabase.getInstance().getReference().child("restaurent");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                restaurent = new ArrayList<Restaurent>();

                for (DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){
                    Restaurent rest = dataSnapshot1.getValue(Restaurent.class);
                    restaurent.add(rest);
                }

                mAdapter = new MyAdapter(ListActivity.this,restaurent);
                recyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(ListActivity.this, "Error",Toast.LENGTH_SHORT).show();
            }
        });



//        testList();

    }

//    private void testList() {
//        final String TAG = "testList";
//
//        db.collection("restaurent")
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()){
//                            for (QueryDocumentSnapshot document : task.getResult()){
//                                StringBuilder data = new StringBuilder("");
//                                Log.d(TAG, document.getId() + " => " + document.getData());
//                            }
//                        }
//                    }
//                });
//    }


}
