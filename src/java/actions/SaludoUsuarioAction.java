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
public class SaludoUsuarioAction extends ActionSupport
{
    private String nombre;
    private int numero;
    private String mensaje;
    
    @Override
    public String execute() throws Exception
    {
        mensaje = "Bienvenido " + nombre + " al mundo de Struts 2. Tu número de la suerte de hoy es " + numero;
        
        return SUCCESS;
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
}
