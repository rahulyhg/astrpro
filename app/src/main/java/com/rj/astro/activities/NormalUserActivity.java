package com.rj.astro.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.icons.MaterialDrawerFont;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.rj.astro.R;

public class NormalUserActivity extends AppCompatActivity {
  Drawer result;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_user);
           toolbar = (Toolbar) findViewById(R.id.toolbar);
//if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("User");
        SecondaryDrawerItem item2 = new SecondaryDrawerItem().withIdentifier(2).withName("Chat");

//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar).withHeader(R.layout.nav_header_main)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("My Requests").withIcon(MaterialDrawerFont.Icon.mdf_person),
                        new PrimaryDrawerItem().withName("Inbox").withIcon(MaterialDrawerFont.Icon.mdf_person),
                        new PrimaryDrawerItem().withName("FeedBack & Support").withIcon(MaterialDrawerFont.Icon.mdf_person),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName("Contant Us").withIcon(MaterialDrawerFont.Icon.mdf_person),
                        new PrimaryDrawerItem().withName("Rate Us").withIcon(MaterialDrawerFont.Icon.mdf_person))
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        return false;
                    }
                })
                .build();


    }
}
