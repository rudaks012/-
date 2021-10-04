package co.micol.prj.tryexam;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TryCatchTest {

	public void method1()  throws Exception{ // throws해서 받는쪽에서 처리
		// 메인에도  thorw 넣어줘야함
		try {
//			Class clazz = Class.forName("co.micol.prj.TestInterface");
			Class clazz = Class.forName("co.micol.prj.TV");
			System.out.println("원하는 클래스가 존재합니다.");
			
//		} catch (ClassNotFoundException | FileNotFoundException e) { 
//			-> 둘중하나체크
		}catch (Exception e) { 
////			> 어떤 예외가 나오는지모른다
//			e.printStackTrace();
			// 사용자에게는 밑에꺼만 보여줌 위에꺼 주석풀면 err msg보여줌
//			System.out.println("예기치 않는 오류가 발생되었습니다.");
//			System.out.println("관리자에게 문의 하세요.");
//		}catch (FileNotFoundException f) {
//			f.printStackTrace(); -> 권장하지않음
//		} 
			
//		-> 첫 try 문장 끝

	}
	}
}
	
