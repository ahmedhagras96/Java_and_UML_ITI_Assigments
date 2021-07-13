package XChartGraphing;
import org.knowm.xchart.*;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;
import org.knowm.xchart.style.Styler;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Graph1 {

        public static void main(String[] args) throws Exception {
            Table titanicData=Table.read().csv("src/main/resources/titanic.csv");

            List age = titanicData.doubleColumn("age").asList();
            List pclass = titanicData.intColumn("Pclass").asList();

            XYChart chart = new XYChartBuilder().width(1000).height(600).build();

            // Customize Chart
            chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
            chart.getStyler().setChartTitleVisible(false);
            chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
            chart.getStyler().setMarkerSize(8);
            chart.getStyler().setYAxisMax(3.2);

            chart.addSeries("Age ranges for every Pclass", age, pclass);

            // Show it
            new SwingWrapper(chart).displayChart();

        }
}
