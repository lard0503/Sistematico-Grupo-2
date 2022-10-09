/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

/**
 *
 * @author Armando J. López L.
 */
public class IfElse extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfElse
     */
    public IfElse() {
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

        bgEjer1 = new javax.swing.ButtonGroup();
        lEjer1 = new javax.swing.JLabel();
        pLugaresVisitados = new javax.swing.JPanel();
        chbOmetepe = new javax.swing.JCheckBox();
        chbLaguna = new javax.swing.JCheckBox();
        chbIsland = new javax.swing.JCheckBox();
        chbSanJuan = new javax.swing.JCheckBox();
        bMostrar2 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        pEstadoCivil = new javax.swing.JPanel();
        rbSoltero = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbOtro = new javax.swing.JRadioButton();
        bMostrar1 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        tbOpcion = new javax.swing.JToggleButton();
        lEjer4 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        bValidar4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        tfNum2 = new javax.swing.JTextField();
        bValidar5 = new javax.swing.JButton();
        bMostrar3 = new javax.swing.JButton();
        lEjer6 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        bValidar6 = new javax.swing.JButton();
        lEjer7 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        bValidar7 = new javax.swing.JButton();
        lEjer8 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        bCalcular8 = new javax.swing.JButton();
        tfNum6 = new javax.swing.JTextField();
        tfNum7 = new javax.swing.JTextField();
        tfNum8 = new javax.swing.JTextField();
        lEjer9 = new javax.swing.JLabel();
        tfNum9 = new javax.swing.JTextField();
        bCalcular9 = new javax.swing.JButton();
        lEjer10 = new javax.swing.JLabel();
        tfNum10 = new javax.swing.JTextField();
        bMostrar10 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Bifurcación if...else de Java");

        lEjer1.setText("1. Muestre un mensaje con la selección realizada");

        pLugaresVisitados.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugares Visitados"));

        chbOmetepe.setText("Ometepe");

        chbLaguna.setText("Laguna de Apoyo");

        chbIsland.setText("Corn Island");

        chbSanJuan.setText("San Juan del Sur");

        bMostrar2.setText("Mostrar");

        javax.swing.GroupLayout pLugaresVisitadosLayout = new javax.swing.GroupLayout(pLugaresVisitados);
        pLugaresVisitados.setLayout(pLugaresVisitadosLayout);
        pLugaresVisitadosLayout.setHorizontalGroup(
            pLugaresVisitadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLugaresVisitadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLugaresVisitadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLugaresVisitadosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bMostrar2))
                    .addComponent(chbOmetepe)
                    .addComponent(chbLaguna)
                    .addComponent(chbIsland)
                    .addComponent(chbSanJuan))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pLugaresVisitadosLayout.setVerticalGroup(
            pLugaresVisitadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLugaresVisitadosLayout.createSequentialGroup()
                .addComponent(chbOmetepe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbLaguna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbIsland)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbSanJuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(bMostrar2))
        );

        lEjer2.setText("2. Muestre un mensaje con las selecciones realizadas");

        pEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));

        bgEjer1.add(rbSoltero);
        rbSoltero.setText("Soltero(a)");

        bgEjer1.add(rbCasado);
        rbCasado.setText("Casado(a)");

        bgEjer1.add(rbOtro);
        rbOtro.setText("Otro");

        bMostrar1.setText("Mostrar");

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCasado)
                    .addComponent(rbOtro)
                    .addComponent(rbSoltero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoCivilLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(bMostrar1)
                .addContainerGap())
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addComponent(rbSoltero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(bMostrar1))
        );

        lEjer3.setText("3. Muestre un mensaje con el estado del botón");

        tbOpcion.setText("Opción A");

        lEjer4.setText("4. Valide la mayoría de edad (>=21 años)");

        bValidar4.setText("Validar");

        lEjer5.setText("5. Valide si el número es una calificación válida (0 - 100)");

        bValidar5.setText("Validar");

        bMostrar3.setText("Mostrar");

        lEjer6.setText("6. Valide si la calificación es aprobada o reprobada");

        bValidar6.setText("Validar");

        lEjer7.setText("7. Valide si el año es bisiesto");

        bValidar7.setText("Validar");

        lEjer8.setText("8. Calcule el mayor de los números");

        bCalcular8.setText("Calcular");

        lEjer9.setText("9. Calcule la cantidad de días del mes");

        bCalcular9.setText("Calcular");

        lEjer10.setText("10. Muestre el reconocimiento según la calificación (E, MB, B, D)");

        bMostrar10.setText("Mostrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEjer1)
                    .addComponent(lEjer2)
                    .addComponent(pLugaresVisitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbOpcion)
                                .addGap(18, 18, 18)
                                .addComponent(bMostrar3)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lEjer8)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular8))
                    .addComponent(lEjer4)
                    .addComponent(lEjer5)
                    .addComponent(lEjer6)
                    .addComponent(lEjer7)
                    .addComponent(lEjer9)
                    .addComponent(lEjer10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bMostrar10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bCalcular9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer1)
                    .addComponent(lEjer4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lEjer6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar6)))
                    .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular8)
                            .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lEjer10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMostrar10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pLugaresVisitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbOpcion)
                            .addComponent(bMostrar3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular8;
    private javax.swing.JButton bCalcular9;
    private javax.swing.JButton bMostrar1;
    private javax.swing.JButton bMostrar10;
    private javax.swing.JButton bMostrar2;
    private javax.swing.JButton bMostrar3;
    private javax.swing.JButton bValidar4;
    private javax.swing.JButton bValidar5;
    private javax.swing.JButton bValidar6;
    private javax.swing.JButton bValidar7;
    private javax.swing.ButtonGroup bgEjer1;
    private javax.swing.JCheckBox chbIsland;
    private javax.swing.JCheckBox chbLaguna;
    private javax.swing.JCheckBox chbOmetepe;
    private javax.swing.JCheckBox chbSanJuan;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer10;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel lEjer7;
    private javax.swing.JLabel lEjer8;
    private javax.swing.JLabel lEjer9;
    private javax.swing.JPanel pEstadoCivil;
    private javax.swing.JPanel pLugaresVisitados;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbOtro;
    private javax.swing.JRadioButton rbSoltero;
    private javax.swing.JToggleButton tbOpcion;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum10;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    private javax.swing.JTextField tfNum5;
    private javax.swing.JTextField tfNum6;
    private javax.swing.JTextField tfNum7;
    private javax.swing.JTextField tfNum8;
    private javax.swing.JTextField tfNum9;
    // End of variables declaration//GEN-END:variables
}
