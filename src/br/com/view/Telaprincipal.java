package br.com.view;

import br.com.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.Utilitarios;

public class Telaprincipal extends javax.swing.JFrame {

    //cria um objeto de coleção
    List<Cliente> lista = new ArrayList<>();

    //método de consulta
    public void listarTodos() {
        //faz com que consiga usar a tabela
        DefaultTableModel dados = (DefaultTableModel) tabelaa.getModel();
        dados.setNumRows(0);//limpar as linhas

        //puxar dados do banco de dados
        for (Cliente cliente : lista) {
            //classe pai de todas as classes, cntem Tostring   
            dados.addRow(new Object[]{
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEndereco(),
                cliente.getRg(),
                cliente.getCpf(),
                cliente.getProduto(),
                cliente.getQuantidade(),
                cliente.getPreco(),
                cliente.getData()

            });
        }
    }

    public Telaprincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        painel1 = new javax.swing.JInternalFrame();
        cabeçalho = new javax.swing.JLabel();
        tPanel = new javax.swing.JTabbedPane();
        panelConsulta = new javax.swing.JPanel();
        beditar = new javax.swing.JButton();
        sPpaine = new javax.swing.JScrollPane();
        tabelaa = new javax.swing.JTable();
        bapagar = new javax.swing.JButton();
        panelCadastro = new javax.swing.JPanel();
        cadnome = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        cadtelefone = new javax.swing.JLabel();
        ftftelefone = new javax.swing.JFormattedTextField();
        cadRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        cadCPF = new javax.swing.JLabel();
        ftfcpf = new javax.swing.JFormattedTextField();
        lendereco = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        llegenda = new javax.swing.JLabel();
        lproduto = new javax.swing.JLabel();
        txtproduto = new javax.swing.JTextField();
        caddata = new javax.swing.JLabel();
        ftfdata = new javax.swing.JFormattedTextField();
        cadquantidade = new javax.swing.JLabel();
        txtquantidade = new javax.swing.JTextField();
        cadpreco = new javax.swing.JLabel();
        txtpreco = new javax.swing.JTextField();
        bnovo = new javax.swing.JButton();
        legenda1 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 102));

        painel1.setBackground(new java.awt.Color(0, 153, 153));
        painel1.setVisible(true);

        cabeçalho.setBackground(new java.awt.Color(204, 204, 255));
        cabeçalho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cabeçalho.setForeground(new java.awt.Color(255, 255, 255));
        cabeçalho.setText("                             Cadatro de Clientes");

        panelConsulta.setBackground(new java.awt.Color(20, 178, 154));

        beditar.setText("Editar");
        beditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beditarMouseClicked(evt);
            }
        });
        beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditarActionPerformed(evt);
            }
        });

        tabelaa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereco", "RG", "CPF", "Produto", "QTD", "Preco", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sPpaine.setViewportView(tabelaa);

        bapagar.setText("Apagar");
        bapagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bapagarMouseClicked(evt);
            }
        });
        bapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bapagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConsultaLayout = new javax.swing.GroupLayout(panelConsulta);
        panelConsulta.setLayout(panelConsultaLayout);
        panelConsultaLayout.setHorizontalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sPpaine, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(beditar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(bapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        panelConsultaLayout.setVerticalGroup(
            panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sPpaine, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        tPanel.addTab("Consulta", panelConsulta);

        panelCadastro.setBackground(new java.awt.Color(21, 181, 158));

        cadnome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadnome.setForeground(new java.awt.Color(255, 255, 255));
        cadnome.setText("NOME:");

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        cadtelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadtelefone.setForeground(new java.awt.Color(255, 255, 255));
        cadtelefone.setText("TELEFONE:");

        try {
            ftftelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftftelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftftelefoneActionPerformed(evt);
            }
        });

        cadRG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadRG.setForeground(new java.awt.Color(255, 255, 255));
        cadRG.setText("RG:");

        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });

        cadCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadCPF.setForeground(new java.awt.Color(255, 255, 255));
        cadCPF.setText("CPF:");

        try {
            ftfcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfcpfActionPerformed(evt);
            }
        });

        lendereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lendereco.setForeground(new java.awt.Color(255, 255, 255));
        lendereco.setText("ENDERECO:");

        llegenda.setBackground(new java.awt.Color(255, 255, 255));
        llegenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        llegenda.setForeground(new java.awt.Color(255, 255, 255));
        llegenda.setText("Compra");

        lproduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lproduto.setForeground(new java.awt.Color(255, 255, 255));
        lproduto.setText("PRODUTO:");

        txtproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodutoActionPerformed(evt);
            }
        });

        caddata.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        caddata.setForeground(new java.awt.Color(255, 255, 255));
        caddata.setText("DATA DA COMPRA:");

        try {
            ftfdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cadquantidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadquantidade.setForeground(new java.awt.Color(255, 255, 255));
        cadquantidade.setText("QUANTIDADE:");

        txtquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantidadeActionPerformed(evt);
            }
        });

        cadpreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cadpreco.setForeground(new java.awt.Color(255, 255, 255));
        cadpreco.setText("PRECO:");

        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });

        bnovo.setBackground(new java.awt.Color(255, 255, 255));
        bnovo.setText("NOVO");
        bnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnovoMouseClicked(evt);
            }
        });
        bnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnovoActionPerformed(evt);
            }
        });

        legenda1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        legenda1.setForeground(new java.awt.Color(255, 255, 255));
        legenda1.setText("Cliente");

        salvar.setText("SALVAR");
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(cadnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(cadCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ftfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(cadtelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cadRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(lendereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(legenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llegenda)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(cadquantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(cadpreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(lproduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(caddata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfdata, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(bnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(legenda1)
                .addGap(10, 10, 10)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadnome)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadtelefone)
                    .addComponent(ftftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadCPF)
                    .addComponent(lendereco)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(llegenda)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lproduto)
                    .addComponent(txtproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caddata)
                    .addComponent(ftfdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadquantidade)
                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadpreco)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnovo)
                    .addComponent(salvar))
                .addGap(41, 41, 41))
        );

        tPanel.addTab("Cadastro", panelCadastro);

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1.getContentPane());
        painel1.getContentPane().setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditarActionPerformed


    }//GEN-LAST:event_beditarActionPerformed

    private void beditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditarMouseClicked

        Cliente cliente = new Cliente();

        cliente.setNome(tabelaa.getValueAt(tabelaa.getSelectedRow(), 0).toString());
        cliente.setTelefone(tabelaa.getValueAt(tabelaa.getSelectedRow(), 1).toString());
        cliente.setEndereco(tabelaa.getValueAt(tabelaa.getSelectedRow(), 2).toString());
        cliente.setRg(tabelaa.getValueAt(tabelaa.getSelectedRow(), 3).toString());
        cliente.setCpf(tabelaa.getValueAt(tabelaa.getSelectedRow(), 4).toString());
        cliente.setProduto(tabelaa.getValueAt(tabelaa.getSelectedRow(), 5).toString());
        cliente.setQuantidade(Integer.parseInt(tabelaa.getValueAt(tabelaa.getSelectedRow(), 6).toString()));
        cliente.setPreco(Double.parseDouble(tabelaa.getValueAt(tabelaa.getSelectedRow(), 7).toString()));

        
        try{
        for (Cliente cliente : lista) {

            if (cliente.getNome() == cliente.getNome()) {
                int posicao = lista.indexOf(cliente);
                Cliente clienteA = new Cliente();

                clienteA.setNome(txtnome.getText());
                clienteA.setTelefone(ftftelefone.getText());
                clienteA.setEndereco(txtendereco.getText());
                clienteA.setRg(txtRG.getText());
                clienteA.setCpf(ftfcpf.getText());
                clienteA.setProduto(txtproduto.getText());
                clienteA.setQuantidade(Integer.parseInt(tabelaa.getValueAt(tabelaa.getSelectedRow(), 6).toString()));
                clienteA.setPreco(Double.parseDouble(tabelaa.getValueAt(tabelaa.getSelectedRow(), 7).toString()));

                lista.set(posicao, clienteA);
                JOptionPane.showMessageDialog(null, "Atualizado");
            }
            listarTodos();
        }

        }catch (Exception e ) {
            e.getMessage();
        }
    }//GEN-LAST:event_beditarMouseClicked

    private void bapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bapagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bapagarActionPerformed

    private void bapagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bapagarMouseClicked
        Cliente clienteS = new Cliente();
        //tabela.pegaOValor(linha, 0)

        clienteS.setNome(tabelaa.getValueAt(tabelaa.getSelectedRow(), 0).toString());
        clienteS.setTelefone(tabelaa.getValueAt(tabelaa.getSelectedRow(), 1).toString());
        clienteS.setEndereco(tabelaa.getValueAt(tabelaa.getSelectedRow(), 2).toString());
        clienteS.setRg(tabelaa.getValueAt(tabelaa.getSelectedRow(), 3).toString());
        clienteS.setCpf(tabelaa.getValueAt(tabelaa.getSelectedRow(), 4).toString());
        clienteS.setProduto(tabelaa.getValueAt(tabelaa.getSelectedRow(), 5).toString());
        clienteS.setQuantidade(Integer.parseInt(tabelaa.getValueAt(tabelaa.getSelectedRow(), 6).toString()));
        clienteS.setPreco(Double.parseDouble(tabelaa.getValueAt(tabelaa.getSelectedRow(), 7).toString()));
        //
        for (Cliente cliente : lista) {

            if (cliente.getNome() == clienteS.getNome()) {
                Cliente clienteCad = new Cliente();
                clienteCad.setNome(txtnome.getText());
                clienteCad.setTelefone(ftftelefone.getText());
                clienteCad.setEndereco(txtendereco.getText());
                clienteCad.setRg(txtRG.getText());
                clienteCad.setCpf(ftfcpf.getText());
                clienteCad.setProduto(txtproduto.getText());
                clienteCad.setQuantidade(Integer.parseInt(tabelaa.getValueAt(tabelaa.getSelectedRow(), 6).toString()));
                clienteCad.setPreco(Double.parseDouble(tabelaa.getValueAt(tabelaa.getSelectedRow(), 7).toString()));

                lista.remove(cliente);
                JOptionPane.showMessageDialog(null, "Excluido");
                listarTodos();
            }
        }

    }//GEN-LAST:event_bapagarMouseClicked

    private void salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseClicked

        Cliente cliente = new Cliente();

        cliente.setNome(txtnome.getText());
        cliente.setTelefone(ftftelefone.getText());
        cliente.setEndereco(txtendereco.getText());
        cliente.setRg(txtRG.getText());
        cliente.setCpf(ftfcpf.getText());
        cliente.setProduto(txtproduto.getText());
        cliente.setQuantidade(Integer.parseInt(txtquantidade.getText()));
        cliente.setPreco(Double.parseDouble(txtpreco.getText()));

        lista.add(cliente);
        listarTodos();
    }//GEN-LAST:event_salvarMouseClicked

    private void bnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnovoActionPerformed
        new Utilitarios().limpaTela(panelConsulta);
    }//GEN-LAST:event_bnovoActionPerformed

    private void bnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnovoMouseClicked
        new Utilitarios().limpaTela(panelCadastro);
    }//GEN-LAST:event_bnovoMouseClicked

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void txtquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantidadeActionPerformed

    private void txtprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodutoActionPerformed

    private void ftfcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfcpfActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    private void ftftelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftftelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftftelefoneActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bapagar;
    private javax.swing.JButton beditar;
    private javax.swing.JButton bnovo;
    private javax.swing.JLabel cabeçalho;
    private javax.swing.JLabel cadCPF;
    private javax.swing.JLabel cadRG;
    private javax.swing.JLabel caddata;
    private javax.swing.JLabel cadnome;
    private javax.swing.JLabel cadpreco;
    private javax.swing.JLabel cadquantidade;
    private javax.swing.JLabel cadtelefone;
    private javax.swing.JFormattedTextField ftfcpf;
    private javax.swing.JFormattedTextField ftfdata;
    private javax.swing.JFormattedTextField ftftelefone;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel legenda1;
    private javax.swing.JLabel lendereco;
    private javax.swing.JLabel llegenda;
    private javax.swing.JLabel lproduto;
    private javax.swing.JInternalFrame painel1;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelConsulta;
    private javax.swing.JScrollPane sPpaine;
    private javax.swing.JButton salvar;
    private javax.swing.JTabbedPane tPanel;
    private javax.swing.JTable tabelaa;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txtproduto;
    private javax.swing.JTextField txtquantidade;
    // End of variables declaration//GEN-END:variables
}
