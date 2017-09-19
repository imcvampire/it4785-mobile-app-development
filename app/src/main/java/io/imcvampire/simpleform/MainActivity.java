package io.imcvampire.simpleform;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.graphics.*;
import java.util.*;

public class MainActivity extends Activity {
  List<Restaurant> model = new ArrayList<Restaurant>();
  ArrayAdapter<Restaurant> adapter = null;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button save=(Button)findViewById(R.id.save);

    save.setOnClickListener(onSave);

    ListView list=(ListView)findViewById(R.id.restaurants);

    adapter = new ArrayAdapter<Restaurant>(
        this,
        android.R.layout.simple_list_item_1,
        model
    );
    list.setAdapter(adapter);
  }

  private View.OnClickListener onSave = new View.OnClickListener() {
    public void onClick(View v) {
      Restaurant r=new Restaurant();

      EditText name = (EditText) findViewById(R.id.name);
      EditText address = (EditText) findViewById(R.id.addr);

      r.setName(name.getText().toString());
      r.setAddress(address.getText().toString());

      RadioGroup types = (RadioGroup) findViewById(R.id.types);
      RadioGroup sale = findViewById(R.id.sale);

      CharSequence csType = "";
      CharSequence csSale = "";

      switch (types.getCheckedRadioButtonId()) {
        case R.id.sit_down:
          r.setType("sit_down");
          csType = "Sit down";
          break;

        case R.id.take_out:
          r.setType("take_out");
          csType = "Take out";
          break;

        case R.id.delivery:
          r.setType("delivery");
          csType = "Delivery";
          break;
      }

      switch (sale.getCheckedRadioButtonId()) {
        case R.id.sale_0:
          csSale = "0%";
          r.setSale("0%");
          break;

        case R.id.sale_25:
          csSale = "25%";
          r.setSale("25%");
          break;

        case R.id.sale_50:
          csSale = "50%";
          r.setSale("50%");
          break;
      }

      adapter.add(r);

      CharSequence csName = name.getText().toString() + " - " + address.getText().toString() +
          "\n" +
          "Types: " + csType + ". Sale: " + csSale;

      Toast.makeText(MainActivity.this, csName, Toast.LENGTH_LONG).show();
      Log.d("myLog", csName.toString());
    }
  };

  public void setColorType(View v) {
    RadioGroup types = (RadioGroup) findViewById(R.id.types);
    RadioButton r1 = (RadioButton) findViewById(R.id.take_out);
    RadioButton r2 = (RadioButton) findViewById(R.id.sit_down);
    RadioButton r3 = (RadioButton) findViewById(R.id.delivery);
    r1.setTextColor(Color.rgb(0, 0, 0));
    r2.setTextColor(Color.rgb(0, 0, 0));
    r3.setTextColor(Color.rgb(0, 0, 0));
    switch (types.getCheckedRadioButtonId()) {
      case R.id.take_out:
        r1.setTextColor(Color.rgb(223, 0, 41));
        break;
      case R.id.sit_down:
        r2.setTextColor(Color.rgb(223, 0, 41));
        break;
      case R.id.delivery:
        r3.setTextColor(Color.rgb(223, 0, 41));
        break;
    }
  }

  public void setColorSale(View v) {
    RadioGroup sales = (RadioGroup) findViewById(R.id.sale);
    RadioButton r1 = (RadioButton) findViewById(R.id.sale_0);
    RadioButton r2 = (RadioButton) findViewById(R.id.sale_25);
    RadioButton r3 = (RadioButton) findViewById(R.id.sale_50);
    r1.setTextColor(Color.rgb(0, 0, 0));
    r2.setTextColor(Color.rgb(0, 0, 0));
    r3.setTextColor(Color.rgb(0, 0, 0));
    switch (sales.getCheckedRadioButtonId()) {
      case R.id.sale_0:
        r1.setTextColor(Color.rgb(249, 244, 0));
        break;
      case R.id.sale_25:
        r2.setTextColor(Color.rgb(249, 244, 0));
        break;
      case R.id.sale_50:
        r3.setTextColor(Color.rgb(249, 244, 0));
        break;
    }
  }
}
