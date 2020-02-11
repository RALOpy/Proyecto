
package Clases;
import Clases.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

public class MyListenerFrame implements ActionListener {

    private Frame miFrame;
    
    public MyListenerFrame(Frame miFrame){
        this.miFrame = miFrame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()  == miFrame.getBtnAgregar()){
        	
            new Dialog(miFrame,1).setVisible(true);
           
            return;
           
        }
        if(e.getSource() == miFrame.getBtnCerrar() ) {
        	
        	try {
				miFrame.setClosed(true);
			} catch (PropertyVetoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
 
        	return;
        }
        if(e.getSource() == miFrame.getBtnModificar()) {
        	new Dialog(miFrame,2).setVisible(true);
        }
        
        
        
        
        
    }
    
}
