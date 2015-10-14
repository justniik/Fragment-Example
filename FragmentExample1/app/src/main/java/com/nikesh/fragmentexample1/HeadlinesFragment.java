package com.nikesh.fragmentexample1;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

/**
 * Created by tagrem on 10/15/15.
 */
public class HeadlinesFragment extends ListFragment{

    OnHeadlineSelectedListener mCallback;

    // Container Activity must implement this interface
    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(int position);
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnHeadlineSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);
    }
}
