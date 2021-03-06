package com.qdu.service;

import java.util.Date;
import java.util.List;

import com.qdu.pojo.QrTem;

public interface QrTemService {
	
	public void insertQrTem(QrTem qrTem);
	
	public List<QrTem> selectQrTemByCourseIdAndTime(int courseId, String qrTime);
	
	public QrTem selectTemQrById(int qrTemId);
	
	public void deleteTemQrById(int qrTemId);
	
	public QrTem selectQrTemByStuNoAndCourseId(String studentRoNo, int courseId);
	
	public int deleteQrTemByCourseId(int courseId);

}
