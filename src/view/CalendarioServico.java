/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

/**
 *
 * @author jhona
 */ 
public class CalendarioServico extends javax.swing.JFrame {
        Funcionario f = new Funcionario();
        ArrayList<Funcionario> fun = new ArrayList<Funcionario>();
    /**
     * Creates new form CalendarioServico
     */
    public CalendarioServico() {
        initComponents();
        
        if(f.getTipo().equals("admin")){
            DefaultTableModel dtmTab = (DefaultTableModel) jTable1.getModel();
       fun = f.buscaFuncionarios();
       
        String [] dias = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        String n[] = new String[7];
        ArrayList<Funcionario> aux = new ArrayList<Funcionario>();    
        
     for(int x = 0; x < 7; x++){
         fun = f.buscaFuncionarios();
        for(int o = 0; o < 7; o++){
            f = fun.get(o);
            n[o] = f.getNome();
            System.out.println(n[o]);
            aux.add(f);
     }
    
        for(int o = 0; o < 7; o++){
           f.excluirFuncionario(0);
        }
    
        for(Funcionario s: aux){
            f.cadFuncionario(s);
        }
        
        aux.clear();
        
     
       // fun = f.buscaFuncionarios();
        
        //for(Funcionario s: fun){
       //  System.out.println(s.getNome());
       //  }
    
    dtmTab.addColumn(dias[x], n);
   
    
     }
        
        
    }
        
    if(f.getTipo().equals("funcionario")){
        DefaultTableModel dtmTab = (DefaultTableModel) jTable1.getModel();
       fun = f.buscaFuncionarios();
       
       jButton2.setVisible(false);
       
        String [] dias = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        String n[] = new String[7];
        ArrayList<Funcionario> aux = new ArrayList<Funcionario>();    
        
     for(int x = 0; x < 7; x++){
         fun = f.buscaFuncionarios();
        for(int o = 0; o < 7; o++){
            f = fun.get(o);
            n[o] = f.getNome();
            System.out.println(n[o]);
            aux.add(f);
     }
    
        for(int o = 0; o < 7; o++){
           f.excluirFuncionario(0);
        }
    
        for(Funcionario s: aux){
            f.cadFuncionario(s);
        }
        
        aux.clear();
        
     
       // fun = f.buscaFuncionarios();
        
        //for(Funcionario s: fun){
       //  System.out.println(s.getNome());
       //  }
    
    dtmTab.addColumn(dias[x], n);
   
    
     }
        
        
    }
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        
        
        fun = f.buscaFuncionarios();
        ArrayList<Funcionario> array = new ArrayList<Funcionario>();
        
        //array = f.buscaFuncionarios();
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int x = 0;
        for(Funcionario r: fun){
            Funcionario aux = r;
            if(x == 2){
                break;
            }
            else{
                Object[] dados = {r.getNome()};
                modelo.addRow(dados);
                x++;
                
                array.add(aux);
                System.out.println(aux.getNome());
                
            }
        }
        
            
          //  Funcionario f1 = new Funcionario();
            
            for(Funcionario f: array){
                int posicao = f.buscaFuncionario2(f.getNip());
                f.excluirFuncionario(posicao);
            }
        
       // array = f.buscaFuncionarios();
     //  for(Funcionario y: array){
           
        //   System.out.println(y.getNome());
      // }
       
        
       for(Funcionario y: array){
            f.cadFuncionario(y);
           // System.out.println(y.getNome());
       }
       
         array = f.buscaFuncionarios();
       for(Funcionario y: array){
           
           System.out.println(y.getNome());
      }
       
       
       array = new ArrayList<Funcionario>();
       fun = f.buscaFuncionarios();
       x = 0;
      for(Funcionario r: fun){
            Funcionario aux = r;
            if(x == 2){
                break;
            }
            else{
                Object[] dados = {r.getNome(), r.getNome(), r.getNome()};
                modelo.addRow(dados);
                x++;
                
                array.add(aux);
                System.out.println(aux.getNome());
                
            }
        }
       
       
       
       
       
       
       
       
       
       //for(int v = array.size(); v > 3; v--){
       //    f.excluirFuncionario(v);
      // }
      // f.excluirFuncionario(4);
       //f.excluirFuncionario(3);  PROBLEMA É QUE ELE TA APAGANDO O ERRADO!!!!!!!
      // array = f.buscaFuncionarios();
      // for(Funcionario y: array){
           
       //    System.out.println(y.getNome());
     //  }
       /*
       array = f.buscaFuncionarios();
       for(Funcionario y: array){
           
           System.out.println(y.getNome());
       }
       */
       
        
        /*
        x = 0;
        
        for(Funcionario r: array){
            
            if(x == 2){
                break;
            }
            else{
                r.cadFuncionario(r);
                x++;
                
            }
        }
        
       
        */
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calendário de Serviços");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(72, 72, 103));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quartos de Serviço Diário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(347, 347, 347))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(72, 72, 103));

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("ENVIAR EMAIL DE CONFIRMAÇÃO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Funcionario f = new Funcionario();
       
       String ti = f.getTipo();
       if(ti.equals("admin")){
           TelaInicial t = new TelaInicial();
         t.setVisible(true);
            dispose();
       } 
       if(ti.equals("funcionario")){
           TelaInicialF t1 = new TelaInicialF();
           t1.setVisible(true);
           dispose();
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JOptionPane.showMessageDialog(null, "EMAIL ENVIADO A TODOS DE SERVIÇO!");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalendarioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarioServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
