package co.micol.prj;

import co.micol.prj.product.Myprint;
import co.micol.prj.product.Pencil4B;
import co.micol.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		RemoteController tv = new SansungTV();
//		// 인터페이스 사용을하면 객체가 손쉽게 이동이된다.
////    	SansungTV tv = new SansungTV();
//		tv.powerOn();
//		tv.powerOff();
//
//		tv = new LgTV();
//		tv.powerOn();
//		tv.powerOff();
//
//		Pencil pencil = null;
//		pencil = new Pencil4B();
//		pencil.selectPencil();
//		pencil.pencilInterface(); // pencil 인터페이스가 가지고 있는 기본 메소드
//
//		pencil = new Pencil6B();
//		pencil.selectPencil();
//
//		pencil = new
//		Pencil4B();
//		pencil.selectPencil();

//		Myprint myprint = new Myprint();
//		// 두개이상의 인터페이스를 받았으면 자기자신의 객체로 받아야함
//		
//		myprint.powerOn();
//		myprint.powerOff();
//		myprint.selectPencil();

//		RemoteController rc = new SansungTV();
//		TestInterface ts = new TestInterface(rc);
//		ts.toString();
//		RemoteController rc  ;
////		rc = new LgTV();
//		TestInterface ts = new TestInterface(new SansungTV());
//		
//		rc = ts.rcReturn();
//		rc.powerOn();
//		rc.powerOff();
//		Myprint myprint = new Myprint(new Pencil4B());
//		myprint.toPrint();
		
		TryCatchTest tryCatchTest = new TryCatchTest();
		try {
			tryCatchTest.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("항상 실행 하는 구문");
		}

	}
}
