package com.mdid.hawk.interfaces;

import android.view.View;

/**
 * Created by Nikhil.Jadhav on 26/08/2016.
 */
public interface ClickListener {
    public void onClick(View view, int position);

    public void onLongClick(View view, int position);
}
