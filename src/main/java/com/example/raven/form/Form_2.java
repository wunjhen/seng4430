package com.example.raven.form;

import java.awt.Color;

import com.example.raven.chart.ModelChart;

public class Form_2 extends javax.swing.JPanel {
    

    public Form_2() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init() {
        chart.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        chart.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        chart.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        chart.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        chart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        chart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        chart.start();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    roundPanel2 = new com.example.raven.swing.RoundPanel();
    chart = new com.example.raven.chart.Chart();
    label = new javax.swing.JLabel();
    label.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    label.setForeground(new java.awt.Color(137, 137, 137));
    label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    label.setText("Software Quality Metrics Documentation\n"+
    "Fog Index of the Document\n"+
    "The Fog Index measures the readability of the document. It estimates the years of formal education needed to understand the text on the first reading.\n"
    +"Benchmarks\n"+
    "Below 5: Very easy to read\n"+
    "5 to 8: Easy to read\n"+
    "9 to 12: Average difficulty\n"+
    "13 to 16: Difficult to read]\n"+
    "Above 16: Very difficult to read\n"+
    "Average Length of Identifiers\n"+
    "Measures the average length of variable names, functions, and other identifiers in the code. Longer identifiers are usually more descriptive.\n"+
    "Benchmarks\n"+
    "Below 3: Too short, potentially non-descriptive\n"+
    "3 to 5: Adequate length, descriptive\n"+
    "Above 5: Possibly too long, could be verbose\n"+
    "Cyclomatic Complexity\n"+
    "A metric used to measure the complexity of a program. It counts the number of linearly independent paths through the source code.\n"+
    "Benchmarks\n"+
    "1 to 10: Simple and well-structured code\n"+
    "11 to 20: Moderately complex code\n"+
    "21 to 50: Complex code\n"+
    "Above 50: Very complex code, needs refactoring\n"+
    "Number of Nested If Statements\n"+
    "Indicates the level of nesting of if statements in the code. Higher nesting levels can make the code harder to read and maintain.\n"+
    "0 to 2: Low nesting, easy to understand\n"+
    "3 to 4: Moderate nesting, manageable\n"+
    "5 to 6: High nesting, potentially confusing\n"+
    "Above 6: Very high nesting, likely confusing\n"+
    "Weighted Method per Class (WMC)\n"+
    "Measures the complexity of a class by summing the complexities of its methods.\n"+
    "Benchmarks\n"+
    "1 to 10: Low complexity\n"+
    "11 to 20: Moderate complexity\n"+
    "21 to 50: High complexity\n"+
    "Above 50: Very high complexity, likely needs refactoring\n"+
    "Fan-In / Fan-Out Calculator\n"+
    "Measures the number of functions that call or are called by a particular function. It helps in understanding the dependencies and modularity of the code.\n"+
    "Benchmarks\n"+
    "Fan-In:\n"+
    "0: No dependencies\n"+
    "1 to 5: Low dependencies\n"+
    "6 to 10: Moderate dependencies\n"+
    "Above 10: High dependencies\n"+
    "Fan-Out:\n"+
    "0: No calls to other functions\n"+
    "1 to 5: Low number of calls\n"+
    "6 to 10: Moderate number of calls\n"+
    "Above 10: High number of calls\n");




    roundPanel2.setBackground(new java.awt.Color(10, 51, 51));

    javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
    roundPanel2.setLayout(roundPanel2Layout);
    roundPanel2Layout.setHorizontalGroup(
        roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(roundPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
            .addContainerGap())
    );
    roundPanel2Layout.setVerticalGroup(
        roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(roundPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
            .addContainerGap())
    );


        

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    ));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGap(10, 10, 10)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    ));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.example.raven.chart.Chart chart;
   // private com.example.raven.chart.

    private com.example.raven.swing.RoundPanel roundPanel2;
    private javax.swing.JLabel label;

    // End of variables declaration//GEN-END:variables
}
