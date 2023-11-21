// Generated by view binder compiler. Do not edit!
package com.aniketjain.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aniketjain.weatherapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText cityEt;

  @NonNull
  public final TextView conditionDescTv;

  @NonNull
  public final ImageView conditionIv;

  @NonNull
  public final RelativeLayout editTextLayout;

  @NonNull
  public final TextView humidityTv;

  @NonNull
  public final LinearLayout linearCenter;

  @NonNull
  public final LinearLayout mainLayout;

  @NonNull
  public final TextView maxTempTv;

  @NonNull
  public final ImageView micSearchId;

  @NonNull
  public final TextView minTempTv;

  @NonNull
  public final TextView nameTv;

  @NonNull
  public final RelativeLayout placeTimeLayout;

  @NonNull
  public final TextView pressureTv;

  @NonNull
  public final ImageView searchBarIv;

  @NonNull
  public final RelativeLayout searchParent;

  @NonNull
  public final TextView tempTv;

  @NonNull
  public final TextView updatedAtTv;

  @NonNull
  public final TextView windTv;

  private MainLayoutBinding(@NonNull LinearLayout rootView, @NonNull EditText cityEt,
      @NonNull TextView conditionDescTv, @NonNull ImageView conditionIv,
      @NonNull RelativeLayout editTextLayout, @NonNull TextView humidityTv,
      @NonNull LinearLayout linearCenter, @NonNull LinearLayout mainLayout,
      @NonNull TextView maxTempTv, @NonNull ImageView micSearchId, @NonNull TextView minTempTv,
      @NonNull TextView nameTv, @NonNull RelativeLayout placeTimeLayout,
      @NonNull TextView pressureTv, @NonNull ImageView searchBarIv,
      @NonNull RelativeLayout searchParent, @NonNull TextView tempTv, @NonNull TextView updatedAtTv,
      @NonNull TextView windTv) {
    this.rootView = rootView;
    this.cityEt = cityEt;
    this.conditionDescTv = conditionDescTv;
    this.conditionIv = conditionIv;
    this.editTextLayout = editTextLayout;
    this.humidityTv = humidityTv;
    this.linearCenter = linearCenter;
    this.mainLayout = mainLayout;
    this.maxTempTv = maxTempTv;
    this.micSearchId = micSearchId;
    this.minTempTv = minTempTv;
    this.nameTv = nameTv;
    this.placeTimeLayout = placeTimeLayout;
    this.pressureTv = pressureTv;
    this.searchBarIv = searchBarIv;
    this.searchParent = searchParent;
    this.tempTv = tempTv;
    this.updatedAtTv = updatedAtTv;
    this.windTv = windTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.city_et;
      EditText cityEt = ViewBindings.findChildViewById(rootView, id);
      if (cityEt == null) {
        break missingId;
      }

      id = R.id.conditionDesc_tv;
      TextView conditionDescTv = ViewBindings.findChildViewById(rootView, id);
      if (conditionDescTv == null) {
        break missingId;
      }

      id = R.id.condition_iv;
      ImageView conditionIv = ViewBindings.findChildViewById(rootView, id);
      if (conditionIv == null) {
        break missingId;
      }

      id = R.id.editText_layout;
      RelativeLayout editTextLayout = ViewBindings.findChildViewById(rootView, id);
      if (editTextLayout == null) {
        break missingId;
      }

      id = R.id.humidity_tv;
      TextView humidityTv = ViewBindings.findChildViewById(rootView, id);
      if (humidityTv == null) {
        break missingId;
      }

      id = R.id.linear_center;
      LinearLayout linearCenter = ViewBindings.findChildViewById(rootView, id);
      if (linearCenter == null) {
        break missingId;
      }

      LinearLayout mainLayout = (LinearLayout) rootView;

      id = R.id.max_temp_tv;
      TextView maxTempTv = ViewBindings.findChildViewById(rootView, id);
      if (maxTempTv == null) {
        break missingId;
      }

      id = R.id.mic_search_id;
      ImageView micSearchId = ViewBindings.findChildViewById(rootView, id);
      if (micSearchId == null) {
        break missingId;
      }

      id = R.id.min_temp_tv;
      TextView minTempTv = ViewBindings.findChildViewById(rootView, id);
      if (minTempTv == null) {
        break missingId;
      }

      id = R.id.name_tv;
      TextView nameTv = ViewBindings.findChildViewById(rootView, id);
      if (nameTv == null) {
        break missingId;
      }

      id = R.id.place_time_layout;
      RelativeLayout placeTimeLayout = ViewBindings.findChildViewById(rootView, id);
      if (placeTimeLayout == null) {
        break missingId;
      }

      id = R.id.pressure_tv;
      TextView pressureTv = ViewBindings.findChildViewById(rootView, id);
      if (pressureTv == null) {
        break missingId;
      }

      id = R.id.search_bar_iv;
      ImageView searchBarIv = ViewBindings.findChildViewById(rootView, id);
      if (searchBarIv == null) {
        break missingId;
      }

      id = R.id.search_parent;
      RelativeLayout searchParent = ViewBindings.findChildViewById(rootView, id);
      if (searchParent == null) {
        break missingId;
      }

      id = R.id.temp_tv;
      TextView tempTv = ViewBindings.findChildViewById(rootView, id);
      if (tempTv == null) {
        break missingId;
      }

      id = R.id.updated_at_tv;
      TextView updatedAtTv = ViewBindings.findChildViewById(rootView, id);
      if (updatedAtTv == null) {
        break missingId;
      }

      id = R.id.wind_tv;
      TextView windTv = ViewBindings.findChildViewById(rootView, id);
      if (windTv == null) {
        break missingId;
      }

      return new MainLayoutBinding((LinearLayout) rootView, cityEt, conditionDescTv, conditionIv,
          editTextLayout, humidityTv, linearCenter, mainLayout, maxTempTv, micSearchId, minTempTv,
          nameTv, placeTimeLayout, pressureTv, searchBarIv, searchParent, tempTv, updatedAtTv,
          windTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
