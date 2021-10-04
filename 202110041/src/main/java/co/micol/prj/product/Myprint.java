package co.micol.prj.product;

import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;

public class Myprint implements Pencil, RemoteController {
	private Pencil pencil;
	
//	public Myprint(Pencil pencil) {
//		this.pencil = pencil;
//	}
	public Myprint(Pencil pencil)  {
		this.pencil = pencil;
	}
	
	@Override
	public void selectPencil() {
		System.out.println("4B");
		
	}
	
	@Override
	public void powerOn() {
		System.out.println("프린트 전원을 킵니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("프린트 전원을 끕니다.");
	}

	public void toPrint() {
		System.out.println("나는 ");
		pencil.selectPencil();
	}


	}
	
