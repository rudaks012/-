package co.micol.prj.service;

public interface Pencil {
	void selectPencil();
	//정의되지 않은 함수만 override하면됨.
	default void pencilInterface() {	//추상클래스 까지의 역활가능
		//default 범위지시자를 통해서 함수원형을 만들어냄.
		System.out.println("나는 인터페이스 객체다.");
		
	}

}
