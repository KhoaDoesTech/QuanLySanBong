package com.example.quanlysanbong.custom_barchart.custom_barchart;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;

public class DayAxisValueFormatter extends ValueFormatter
{

    @Override
    public String getFormattedValue(float value) {
        return "T"+(int)value;
    }
}
