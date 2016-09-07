package com.programming.pupper.pupper;

import android.app.Fragment;
import android.view.View;
import android.widget.AdapterView;

import com.programming.pupper.pupper.Fragments.ProfileFragment;

/**
 * Created by naveenkashyap on 9/6/16.
 */
public class DrawerItemClickListener implements android.widget.AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        selectItem(position);
    }

    /** Swaps fragments in the main content view */
    private void selectItem(int position){
        // Create a new fragment and specify the planet to show based on position
        switch (position) {
            case 1:
                //fragment = new MapFragment
                break;
            case 2:
                ProfileFragment fragment = new ProfileFragment();
                break;
            case 3:
                //fragment = new MyParksFragment();
        }

        
    }

}