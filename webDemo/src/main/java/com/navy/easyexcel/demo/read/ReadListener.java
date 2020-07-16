package com.navy.easyexcel.demo.read;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

public class ReadListener extends AnalysisEventListener<UserModel> {

	@Override
	public void invoke(UserModel data, AnalysisContext context) {
		System.out.println("name: " + data.getName() + " ,age: " + data.getAge());
	}

	@Override
	public void doAfterAllAnalysed(AnalysisContext context) {
		
	}

}
