/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author W10
 */
public class SaludoAction extends ActionSupport
{
    private String mensaje;
    
    @Override
    public String execute()
    {
        mensaje = "Bienvenido al mundo de Struts 2 (Clase Action)";
        
        return SUCCESS;
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
}
