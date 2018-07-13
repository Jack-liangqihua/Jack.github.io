
package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.PointData;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.series.Series;

@RestController
@RequestMapping("/api")
public class Echart_Line {

	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/Echart_Line", method = RequestMethod.POST)
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public GsonOption DB_TEST(@RequestBody Map<String, Object> params) {
		System.out.println(params.get("SQL").toString());
		try {
			List<String> CategoryAxisdata = new ArrayList<>();
			List<Double> bardata = new ArrayList<>();

			int UNITS = 1;
			if (params.get("UNITS") != null) {
				UNITS = Integer.parseInt(params.get("UNITS").toString());
			}
			int decimal = Integer.parseInt(params.get("DECIMAL").toString());
			BigDecimal bg = null;
			double f1 = 0.00;
			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
			logs = jdbcTemplate1.queryForList(params.get("SQL").toString());
			String C_TIME = "";
			System.out.println(logs.size());
			for (int i = 0; i < logs.size(); i++) {
				C_TIME = logs.get(i).get(params.get("X").toString()).toString();
				CategoryAxisdata.add(C_TIME);
				bg = new BigDecimal(Double.parseDouble(logs.get(i).get(params.get("Y").toString()).toString()) / UNITS);
				f1 = bg.setScale(decimal, BigDecimal.ROUND_HALF_UP).doubleValue();
				bardata.add(f1);
			}

			GsonOption option = new GsonOption();
			option.title(params.get("NAME").toString());
			option.legend(params.get("NAME").toString());

			option.tooltip().trigger(Trigger.axis);// .formatter("{b}吨 : {c}");

			option.toolbox().show(true).feature(Tool.mark, Tool.dataView, new MagicType(Magic.line, Magic.bar),
					Tool.restore, Tool.saveAsImage);

			option.calculable(true);
			System.out.println(CategoryAxisdata.toArray());
			ValueAxis valueAxis = new ValueAxis();
			valueAxis.axisLabel().formatter("{value}");
			valueAxis.type(AxisType.category);
			valueAxis.data(CategoryAxisdata.toArray());
			option.xAxis(valueAxis);

			CategoryAxis categoryAxis = new CategoryAxis();
			categoryAxis.type(AxisType.value);
			categoryAxis.axisLabel().formatter("{value}" + params.get("UNITS_NAME").toString());
			option.yAxis(categoryAxis);

			Line line = new Line();
			line.smooth(true).name(params.get("NAME").toString()).data(bardata.toArray()).itemStyle().normal()
					.lineStyle().shadowColor("rgba(0,0,0,0.4)");

			line.markPoint().data(new PointData().type(MarkType.max).name("最大值"),
					new PointData().type(MarkType.min).name("最小值"));
			line.markLine().data(new PointData().type(MarkType.average).name("平均值"));

			@SuppressWarnings("rawtypes")
			List<Series> series = new ArrayList<Series>();
			series.add(line);
			series.get(0).itemStyle().normal().label().setShow(true);
			series.get(0).itemStyle().normal().label().setPosition(Position.top);
			option.series(line);

			return option;

		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(ds);

		return null;
	}

}
