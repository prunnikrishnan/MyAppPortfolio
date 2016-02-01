package com.myudacity.app.myappportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView  = inflater.inflate(R.layout.fragment_main, container, false);

        /*//Click listener for 'Spotify Streamer' button
        Button spotifyStreamerButton = (Button)rootView.findViewById(R.id.spotify_streamer_button);
        spotifyStreamerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"This button will open Spotify Streamer!!",Toast.LENGTH_SHORT).show();
            }
        });*/

        return rootView;
    }


}
