package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerDialogo implements ActionListener{
	private DialogoInicial dialogo;
	private FrameGlobal frame;
	
	public ListenerDialogo(DialogoInicial dialogo) {
		this.dialogo = dialogo;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == dialogo.getBtnDialogoContinuar()) {
			dialogo.setVisible(false);
			frame.setVisible(true);
		}
	}

}
