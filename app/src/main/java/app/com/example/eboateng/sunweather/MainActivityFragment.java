package app.com.example.eboateng.sunweather;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//creation of array list and fake data boy.
        ArrayList<String> weather = new ArrayList<String>();
        weather.add("Today - Sunny - 88 / 63");
        weather.add("Tomorrow - Foggy - 70 / 46");
        weather.add("Weds - Cloudy - 72 / 63");
        weather.add("Thurs - Raint - 64 / 51");
        weather.add("Fri - Foggy - 70 / 46");
        weather.add("Sat - Sunny - 76 / 68");
// creation of an arrayadapter. First receives context points to a layout with selected object data
  //      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        android.R.layout.activity_list_item, weather);

      //  ListView listView = (ListView) MainActivityFragment.this.findViewById(R.id.listview);
      //  listView.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
