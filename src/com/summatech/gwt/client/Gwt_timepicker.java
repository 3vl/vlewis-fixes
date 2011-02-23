package com.summatech.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.summatech.gwt.client.HourMinutePicker.PickerFormat;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_timepicker implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		HourMinutePicker hourMinutePicker = new HourMinutePicker(PickerFormat._12_HOUR);
		RootPanel.get().add(hourMinutePicker);
	}


}
