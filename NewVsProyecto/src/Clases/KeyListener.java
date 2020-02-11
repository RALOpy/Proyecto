package Clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	private DialogoInicial dialogo;
	private FrameGlobal frame;
	
	public KeyListener(DialogoInicial dialogo) {
		this.dialogo = dialogo;
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			dialogo.setVisible(false);
			frame = new FrameGlobal();
			frame.setVisible(true);
			//dialogo.setNomEmpresa(dialogo.getTxtNombreEmpresa().getText());
			//AQUI FALTA VALIDAR QUE EL PRIMER TXTFIELD ESTE LLENO AL DARLE A LA TECLA ENTER
		}
	
	}
}
