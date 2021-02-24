/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jhona
 */
public class Registro {
    private Funcionario funcionario;
    private Date dataInicio;
    private Date dataFim;
    private String motivoAus;
    private static ArrayList<Registro> registros = new ArrayList<Registro>();
    
    
    
    
    public Registro (Funcionario f, Date dataI, Date dataF, String motivo){
        this.funcionario = f;
        this.dataInicio = dataI;
        this.dataFim = dataF;
        this.motivoAus = motivo;
    }

    public Registro() {
         //To change body of generated methods, choose Tools | Templates.
    }

    public String getMotivoAus() {
        return motivoAus;
    }

    public void setMotivoAus(String motivoAus) {
        this.motivoAus = motivoAus;
    }
    
    
    public boolean addRegistro(Registro g){
        registros.add(g);
        return true;
    }
    
    public ArrayList<Registro> buscaReg(){
        return registros;
    }
    
    
    
   
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    
    
    
    
}
