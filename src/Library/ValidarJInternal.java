/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


/**
 *
 * @author JEFREY
 */
public class ValidarJInternal {
    public static JDesktopPane jDesktopPane;
    
    public ValidarJInternal (JDesktopPane jDektopPane){
        ValidarJInternal.jDesktopPane =jDektopPane;
    }

 public void openJInternal(JInternalFrame JInternalFrame ){
     if(JInternalFrame.isVisible()){
         JInternalFrame.toFront();
         JInternalFrame.requestFocus();
         
     }else{
         jDesktopPane.add(JInternalFrame);
         JInternalFrame.setVisible(true);
     }
 }   
}
