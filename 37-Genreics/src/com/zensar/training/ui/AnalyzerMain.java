package com.zensar.training.ui;

import com.zensar.training.bean.Analyzer;

public class AnalyzerMain {

	public static void main(String[] args) {
		Analyzer<Integer, String>analyzer=new Analyzer<>();
		analyzer.setData1(100);
		analyzer.setData2("Welcome");
		
		Analyzer<String, Double>analyzer2=new Analyzer<>();
		analyzer2.setData1("Hello");
		analyzer2.setData2(123.78);

	}

}
