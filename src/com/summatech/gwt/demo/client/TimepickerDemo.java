package com.summatech.gwt.demo.client;

import com.google.gwt.core.client.EntryPoint;
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
		FlowPanel pnlMain = new FlowPanel();
		pnlMain.add(new HourMinutePicker(PickerFormat._12_HOUR));
		Label lblSeparator=new Label(" <--->");
		lblSeparator.getElement().getStyle().setFloat(Float.LEFT);
		pnlMain.add(lblSeparator);
		pnlMain.add(new HourMinutePicker(PickerFormat._24_HOUR));

		pnlMain.getElement().getStyle().setPosition(Position.ABSOLUTE);
		pnlMain.getElement().getStyle().setTop(50, Unit.PCT);
		pnlMain.getElement().getStyle().setLeft(45, Unit.PCT);
		RootPanel.get().add(pnlMain);
	}


}
