package Clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	private FrameGlobal frame;
	
	public KeyListener(FrameGlobal frame) {
		this.frame = frame;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//			do {
//				frame.getBtnDialogoContinuar().requestFocus();
//				frame.getDialogoPrincipal().setVisible(false);
//				frame.setVisible(true);
//			}while(frame.getBtnDialogoContinuar().setEnabled(frame.getTxtNombreEmpresa().getText().length() != 0));
			frame.getDialogoPrincipal().setVisible(false);
			frame.setVisible(true);
			frame.setNomEmpresa(frame.getTxtNombreEmpresa().getText());
			//AQUI FALTA VALIDAR QUE EL PRIMER TXTFIELD ESTE LLENO AL DARLE A LA TECLA ENTER
		}
	
	}
}
