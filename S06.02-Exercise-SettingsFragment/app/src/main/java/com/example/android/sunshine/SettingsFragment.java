package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by Home_PC on 25.12.2017.
 */

public class SettingsFragment extends PreferenceFragmentCompat {

    Preference preference = addPreferencesFromResource(R.xml.settings_preferences);
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

    }
}
