/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jhona
 */
public class Funcionario {
    private String nome;
    private int nip;
    private int tempo;
    private String patente;
    //private String usuario = "admin";
   // private String senha = "admin";
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static Funcionario func;
    private static String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        Funcionario.tipo = tipo;
    }
    public Funcionario() {
    }

    public Funcionario(String nome, int nip, int tempo, String patente) {
        this.nome = nome;
        this.nip = nip;
        this.tempo = tempo;
        this.patente = patente;
    }

    
    public boolean cadFuncionario(Funcionario f){
        funcionarios.add(f);
        return true;
    }
    
    public boolean editaFuncionario(Funcionario f, int n){
        funcionarios.set(n, f);
        return true;
    }
    
    public boolean excluirFuncionario(int index){
        funcionarios.remove(index);
        return true;
    }
    
    public boolean excluirNome(String nome){
        int x = -1;
        for(Funcionario f: funcionarios){
            if(f.getNome().equals(nome)){
                f.excluirFuncionario(x);
                x++;
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Funcionario> buscaFuncionarios(){
        return funcionarios;
    }
    
    public static void logar(Funcionario f){
        func = f;
    }
    
    public static Funcionario logado(){
        return func;
    }
    
    public Funcionario buscaFuncionario(int nip){
        for(Funcionario f: this.funcionarios){
            if(f.getNip() == nip){
                return f;
            }
        }
        return null;
    }
    
    public int buscaFuncionario2(int nip){
        int x = -1;
        for(Funcionario f: this.funcionarios){
            x++;
            if(f.getNip() == nip){
                return x;
            }
        }
        return 0;
    }
    
    
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

   
   
}   
