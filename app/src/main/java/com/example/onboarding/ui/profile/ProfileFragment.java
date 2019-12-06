package com.example.onboarding.ui.profile;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.onboarding.MainActivity;
import com.example.onboarding.Pojo.Profile;
import com.example.onboarding.R;


public class ProfileFragment extends Fragment {

    View root;
    //String profileURL = "http://192.168.48.2:3000/profileStudent/";
    Profile profile;
    String notify;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_profile, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        profile = ((MainActivity)getActivity()).profile;
        ImageView profileImage = root.findViewById(R.id.profileImage);
        TextView profileName = root.findViewById(R.id.profileName);
        TextView profileID = root.findViewById(R.id.profileId);
        ImageView editProfile = root.findViewById(R.id.editProfile);
        TextView rewards = root.findViewById(R.id.rewardText);
        Switch notification = root.findViewById(R.id.notificationSwitch);

        profile.setId("sheetalpatil217@gmail.com");

        //new ProfileAPI(profileURL,profile).execute();
        profileName.setText(profile.getName());
        profileID.setText(profile.getStudentID());
        rewards.setText(profile.getRewards());
        notify = profile.getNotification();
        if(notify == "ON"){
            notification.setChecked(true);
        }
        else {
            notification.setChecked(false);
        }


    }

}