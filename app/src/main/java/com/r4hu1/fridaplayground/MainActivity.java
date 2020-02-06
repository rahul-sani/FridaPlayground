package com.r4hu1.fridaplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    String[] chall_desc ={"Hook me", "hookme func","desc 3", "desc 4","desc 5", "desc 6","desc 7", "desc 8","desc 9", "desc 10"};
    String[] button_text={"Chall 1","Chall 2","Chall 3","Chall 4","Chall 5","Chall 6","Chall 7","Chall 8","Chall 9","Chall 10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView) findViewById(R.id.list);

//      Make ChallengeModel objects

        ChallengeModel chall1 = new ChallengeModel(chall_desc[0], button_text[0]);
        ChallengeModel chall2 = new ChallengeModel(chall_desc[1], button_text[1]);
        ChallengeModel chall3 = new ChallengeModel(chall_desc[2], button_text[2]);
        ChallengeModel chall4 = new ChallengeModel(chall_desc[3], button_text[3]);
        ChallengeModel chall5 = new ChallengeModel(chall_desc[4], button_text[4]);
        ChallengeModel chall6 = new ChallengeModel(chall_desc[5], button_text[5]);
        ChallengeModel chall7 = new ChallengeModel(chall_desc[6], button_text[6]);
        ChallengeModel chall8 = new ChallengeModel(chall_desc[7], button_text[7]);
        ChallengeModel chall9 = new ChallengeModel(chall_desc[8], button_text[8]);
        ChallengeModel chall10 = new ChallengeModel(chall_desc[9], button_text[9]);


//        Add chall model objects to array list

        ArrayList<ChallengeModel> challengeModelist = new ArrayList<>();
        challengeModelist.add(chall1);
        challengeModelist.add(chall2);
        challengeModelist.add(chall3);
        challengeModelist.add(chall4);
        challengeModelist.add(chall5);
        challengeModelist.add(chall6);
        challengeModelist.add(chall7);
        challengeModelist.add(chall8);
        challengeModelist.add(chall9);
        challengeModelist.add(chall10);

        ChallengeAdapter adapter = new ChallengeAdapter(this, R.layout.support_simple_spinner_dropdown_item, challengeModelist);
        mListView.setAdapter(adapter);

    }


    public void button(View view) {

            Button bt=(Button) findViewById(R.id.but_ID);
//            String a = bt.getText().toString();
//            Toast.makeText(this, "Button "+bt.getText().toString(),Toast.LENGTH_LONG).show();
//            int position = (Integer) view.getTag();
        Toast.makeText(this, "Button "+bt.getText().toString(),Toast.LENGTH_LONG).show();


    }
    }

