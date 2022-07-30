/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 * @author JEFREY
 */
public class ValidarClass {

    StringBuffer parteEntera = new StringBuffer();
    StringBuffer parteDecimal = new StringBuffer();

    //VALIDAR CAMPO DE TEXTO
    public void textKeyPress(KeyEvent evt) {
        char crter = evt.getKeyChar();
        if ((crter < 'a' || crter > 'z') && (crter < 'A' || crter > 'Z')
                && (crter != (char) KeyEvent.VK_BACK_SPACE)
                && (crter != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    //VALIDAR CAMPO DE NUMERO
    public void numberKeyPress(KeyEvent evt) {
        char crter = evt.getKeyChar();
        if ((crter < '0' || crter > '9') && (crter != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }
    //VALIDAR CAMPO DE GMAIL

    public boolean isEmail(String correo) {
        Pattern pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        Matcher mat = pat.matcher(correo);
        return mat.find();
    }

    public void validarRuc(KeyEvent evt, String ruc) {
        if (ruc.length() >= 11) {
            evt.consume();
        }
    }

    public void validarCelular(KeyEvent evt, String celular) {
        if (celular.length() >= 9) {
            evt.consume();
        }
    }
}
