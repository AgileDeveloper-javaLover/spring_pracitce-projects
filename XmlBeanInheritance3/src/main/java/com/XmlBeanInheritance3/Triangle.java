package com.XmlBeanInheritance3;

import java.util.List;

public class Triangle {
	List<String>points;

	public List<String> getPoints() {
		return points;
	}

	public void setPoints(List<String> points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Triangle [points=" + points + "]";
	}
	
	
}
