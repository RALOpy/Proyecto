package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerDialogo implements ActionListener{
	private FrameGlobal frame;
	
	public ListenerDialogo(FrameGlobal frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == frame.getBtnDialogoContinuar()) {
			frame.getDialogoPrincipal().setVisible(false);
			frame.setVisible(true);
		}
	}

}
