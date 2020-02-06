package com.r4hu1.fridaplayground;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ChallengeAdapter extends ArrayAdapter<ChallengeModel> {

    private Context mContext;
    int mResource;
//
//

//    public ChallengeAdapter(Context mContext, ArrayList<ChallengeModel> challengeModelist) {
//        super(mContext, challengeModelist);
//        this.mContext = mContext;
//    }

    public ChallengeAdapter(Context context, int resource,  ArrayList<ChallengeModel> objects) {
        super(context, resource, objects);
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        get the desc and butt name
        String desc = getItem(position).getChall_desc();
        String button_desc = getItem(position).getButton_desc();

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list, parent, false);

        }


//        Creating the Challenge model object
        ChallengeModel mChellengeModel = new ChallengeModel(desc,button_desc);



        TextView challDesc = (TextView) convertView.findViewById(R.id.descID);
        TextView buttonDesc = (TextView) convertView.findViewById(R.id.but_ID);

        challDesc.setText(desc);
        buttonDesc.setText(button_desc);


        return convertView;
    }
}



