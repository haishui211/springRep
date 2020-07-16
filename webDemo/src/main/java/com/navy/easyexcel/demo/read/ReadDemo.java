package com.navy.easyexcel.demo.read;


import com.alibaba.excel.EasyExcel;

public class ReadDemo {
	
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Administrator\\Desktop\\easyexcel\\test.xls";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, UserModel.class, new ReadListener()).sheet().doRead();
	}
}
