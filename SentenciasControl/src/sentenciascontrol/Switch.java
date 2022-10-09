/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import javax.swing.JOptionPane;
import modelos.MSwitch;

/**
 *
 * @author Armando J. López L.
 */
public class Switch extends javax.swing.JInternalFrame {
     MSwitch opcion = new MSwitch();
    /**
     * Creates new form Switch
     */
    public Switch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCalculos = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEjer1 = new javax.swing.JTextArea();
        tfMes1 = new javax.swing.JTextField();
        bMostrar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfMes2 = new javax.swing.JTextField();
        bMostrar2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        tfMes3 = new javax.swing.JTextField();
        bMostrar3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        pMenu = new javax.swing.JPanel();
        rbRaiz = new javax.swing.JRadioButton();
        rbResiduo = new javax.swing.JRadioButton();
        rbMenor = new javax.swing.JRadioButton();
        bCalcular4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        bDeterminar5 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Bifurcación switch de Java");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        taEjer1.setEditable(false);
        taEjer1.setBackground(new java.awt.Color(240, 240, 240));
        taEjer1.setColumns(20);
        taEjer1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taEjer1.setLineWrap(true);
        taEjer1.setRows(5);
        taEjer1.setText("1. De acuerdo con el nombre del mes digitado, muestre si pertenece al grupo de 28 días, 29 días, 30 días o 31 días");
        taEjer1.setToolTipText("");
        taEjer1.setAutoscrolls(false);
        taEjer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(taEjer1);

        bMostrar1.setText("Mostar");
        bMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Según el número del mes, determine la época del año");

        bMostrar2.setText("Mostar");
        bMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Según el número del mes, determine el número de días");

        bMostrar3.setText("Mostar");
        bMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Realice la tarea que indica la selección");

        pMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú"));

        bCalculos.add(rbRaiz);
        rbRaiz.setText("Calcular la raíz de un número");

        bCalculos.add(rbResiduo);
        rbResiduo.setText("Calcular el residuo de una división entera");

        bCalculos.add(rbMenor);
        rbMenor.setText("Mostrar el menor de N números");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbResiduo)
                            .addComponent(rbMenor)
                            .addComponent(rbRaiz)))
                    .addGroup(pMenuLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bCalcular4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addComponent(rbRaiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbResiduo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lEjer5.setText("5. Determinar si el número entero es par o impar");

        bDeterminar5.setText("Determinar");
        bDeterminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeterminar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar2))
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar3))
                    .addComponent(lEjer4)
                    .addComponent(lEjer2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEjer5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeterminar5)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeterminar5)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar1ActionPerformed
        // TODO add your handling code here:
       try{
            String mes = tfMes1.getText();
            int resp = opcion.grupoMes(mes);
            switch(resp){
                case 1:
                JOptionPane.showMessageDialog(this, "Ingrese un mes valido",
                "Error",JOptionPane.WARNING_MESSAGE);   
                break;
                case 28:
                JOptionPane.showMessageDialog(this, "Pertenece al grupo de "+resp+" dias y en años bisiestos al grupo de 29 dias",
                "Grupo según el mes",JOptionPane.INFORMATION_MESSAGE); 
                break;
                default:
                JOptionPane.showMessageDialog(this, "Pertenece al grupo de "+resp+" dias",
               "Grupo según el mes",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } 
    }//GEN-LAST:event_bMostrar1ActionPerformed

    private void bMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar2ActionPerformed
        // TODO add your handling code here:
       try{
            int mes1 = Integer.parseInt(tfMes2.getText());
            String resp = opcion.epocaMes(mes1);
           JOptionPane.showMessageDialog(this, resp,
            "Época del año",JOptionPane.INFORMATION_MESSAGE);   
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } 
    }//GEN-LAST:event_bMostrar2ActionPerformed

    private void bMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar3ActionPerformed
        // TODO add your handling code here:
        try{
            int mes2 = Integer.parseInt(tfMes3.getText());
            int resp = opcion.cantDias(mes2);
            switch(resp){
                case 0:
                    JOptionPane.showMessageDialog(this, "Ingrese un mes valido",
                    "Error",JOptionPane.WARNING_MESSAGE);   
                break;
                case 28:
                    JOptionPane.showMessageDialog(this, "Este mes tiene "+resp+" dias y en años bisiestos tiene 29 dias",
                    "Cantidad de dias del mes",JOptionPane.INFORMATION_MESSAGE); 
                break;
                default:
                 JOptionPane.showMessageDialog(this,"Este mes tiene "+resp+" dias",
                "Cantidad de dias del mes",JOptionPane.INFORMATION_MESSAGE);   
                
            }
              
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } 
    }//GEN-LAST:event_bMostrar3ActionPerformed

    private void bDeterminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeterminar5ActionPerformed
        // TODO add your handling code here:
        try{
            int numero = Integer.parseInt(tfNum5.getText());
            int resp = opcion.parImpar(numero);
            switch(resp){
                case 0: 
                    JOptionPane.showMessageDialog(this, "El numero "+numero+" es impar",
                    "Número par o impar",JOptionPane.INFORMATION_MESSAGE);
                break;
                case 1: 
                    JOptionPane.showMessageDialog(this, "El numero "+numero+" es par",
                    "Número par o impar",JOptionPane.INFORMATION_MESSAGE);
                break;
                default:
                    JOptionPane.showMessageDialog(this, "Ingrese un entero",
                    "Error",JOptionPane.WARNING_MESSAGE); 
            }   
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bDeterminar5ActionPerformed

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        // TODO add your handling code here:
        int calculo = 0;
        if(rbRaiz.isSelected()){
         calculo=1;
        }else if(rbResiduo.isSelected()){
         calculo=2;   
        }else if(rbMenor.isSelected()){
         calculo =3;
        }
        
        switch(calculo){
            case 1: 
            double rnum= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero a sacar su raiz"));
            int exp= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente para la raiz"));
            double resp=opcion.numRaiz(rnum, exp);
            JOptionPane.showMessageDialog(this, "La raiz es "+resp,
                    "Raiz de "+rnum+" a la potencia "+exp,JOptionPane.INFORMATION_MESSAGE);
            break;
            case 2:
            int ent1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a dividir"));
            int ent2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero con el que va a dividir"));
            int resp1=opcion.divisionEntera(ent1, ent2);
            JOptionPane.showMessageDialog(this, "El residuo de la division es "+resp1,
                    "Division "+ent1+"/"+ent2,JOptionPane.INFORMATION_MESSAGE);
            break;
            case 3:
            int cant= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a evaluar"));
            /*double arreglo[]=new double[cant];
           
            for(int i=0;i<cant;i++){
                arreglo[i]=Double.parseDouble(JOptionPane.showInputDialog("Numero en la posicion no."+i));
            }
*/
            //double resp2[]= new double[1];
            double resp2=opcion.numsMenor(cant);
            JOptionPane.showMessageDialog(this, "El numero menor es "+resp2,
                    "Numero Menor ",JOptionPane.INFORMATION_MESSAGE);
            break;
            default:
        }
    }//GEN-LAST:event_bCalcular4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular4;
    private javax.swing.ButtonGroup bCalculos;
    private javax.swing.JButton bDeterminar5;
    private javax.swing.JButton bMostrar1;
    private javax.swing.JButton bMostrar2;
    private javax.swing.JButton bMostrar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JPanel pMenu;
    private javax.swing.JRadioButton rbMenor;
    private javax.swing.JRadioButton rbRaiz;
    private javax.swing.JRadioButton rbResiduo;
    private javax.swing.JTextArea taEjer1;
    private javax.swing.JTextField tfMes1;
    private javax.swing.JTextField tfMes2;
    private javax.swing.JTextField tfMes3;
    private javax.swing.JTextField tfNum5;
    // End of variables declaration//GEN-END:variables
}
