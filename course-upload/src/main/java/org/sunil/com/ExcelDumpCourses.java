package org.sunil.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;


public class ExcelDumpCourses {

	public static void main(String[] args) throws FileNotFoundException {
		ExcelDumpCourses excelDump = new ExcelDumpCourses();
		//excelDump.readExcelDate();
		excelDump.readExceldata();
	}
	
	public void readExceldata() throws FileNotFoundException {
		System.out.println("************ Loading COURSE DUMP *************");
        InputStream stream = new FileInputStream(new File("C:\\Users\\Sunil kumar\\Desktop\\Course_Content\\Course.xlsx"));
		List<Courses> coursesList = Poiji.fromExcel(stream, PoijiExcelType.XLSX, Courses.class);
		System.out.println("coursesList size : "+coursesList.size());
		// Insert into Database
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
		  Session session = sessionFactory.getCurrentSession(); 
		  org.hibernate.Transaction tr = session.beginTransaction(); 
		  for (Courses courses : coursesList) {
			  System.out.println(" ********** Data Dump in progress *************** ");
			  session.save(courses);
		  }		  
		  tr.commit(); System.out.println("Successfully inserted");
		  sessionFactory.close();
		 

	}
	
	

}
