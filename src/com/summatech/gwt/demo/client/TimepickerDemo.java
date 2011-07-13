package com.summatech.gwt.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.BorderStyle;
import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.summatech.gwt.client.HourMinutePicker;
import com.summatech.gwt.client.HourMinutePicker.PickerFormat;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TimepickerDemo implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		FlowPanel pnlTwelve = new FlowPanel();
		pnlTwelve.add(new Label("12 Hour format..."));
		pnlTwelve.add(new HourMinutePicker(PickerFormat._12_HOUR));
		pnlTwelve.setWidth("60px");
		pnlTwelve.getElement().getStyle().setMargin(35, Unit.PX);
		pnlTwelve.getElement().getStyle().setPadding(10, Unit.PX);
		pnlTwelve.getElement().getStyle().setFloat(Float.LEFT);
		pnlTwelve.getElement().getStyle().setBorderWidth(1, Unit.PX);
		pnlTwelve.getElement().getStyle().setBorderStyle(BorderStyle.SOLID);
		
		
		FlowPanel pnlTwentyfour = new FlowPanel();
		pnlTwentyfour.add(new Label("24 Hour format..."));
		HourMinutePicker picker = new HourMinutePicker(PickerFormat._24_HOUR);
		picker.setTime("", 8, 34);
		pnlTwentyfour.add(picker);
		pnlTwentyfour.setWidth("60px");
		pnlTwentyfour.getElement().getStyle().setMargin(35, Unit.PX);
		pnlTwentyfour.getElement().getStyle().setPadding(10, Unit.PX);
		pnlTwentyfour.getElement().getStyle().setFloat(Float.LEFT);
		pnlTwentyfour.getElement().getStyle().setBorderWidth(1, Unit.PX);
		pnlTwentyfour.getElement().getStyle().setBorderStyle(BorderStyle.SOLID);

		FlowPanel pnlHourRange = new FlowPanel();
		pnlHourRange.add(new Label("Hour range from 8am to 3pm and 6 time slices per hour..."));
		pnlHourRange.add(new HourMinutePicker(PickerFormat._12_HOUR,8,15,6));
		pnlHourRange.setWidth("120px");
		pnlHourRange.getElement().getStyle().setMargin(35, Unit.PX);
		pnlHourRange.getElement().getStyle().setPadding(10, Unit.PX);
		pnlHourRange.getElement().getStyle().setFloat(Float.LEFT);
		pnlHourRange.getElement().getStyle().setBorderWidth(1, Unit.PX);
		pnlHourRange.getElement().getStyle().setBorderStyle(BorderStyle.SOLID);
		
		FlowPanel pnlMain = new FlowPanel();
		pnlMain.add(pnlTwelve);
		pnlMain.add(pnlTwentyfour);
		pnlMain.add(pnlHourRange);
		pnlMain.getElement().getStyle().setPosition(Position.ABSOLUTE);
		pnlMain.getElement().getStyle().setTop(50, Unit.PX);
		pnlMain.getElement().getStyle().setLeft(205, Unit.PX);
		RootPanel.get().add(pnlMain);
	}


}
