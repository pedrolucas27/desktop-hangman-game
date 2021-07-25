package telas;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import classes.Enigma;
import java.awt.Color;


public class JogoFrame extends javax.swing.JFrame {
    
    public JogoFrame() {
        initComponents();
    }
    
    int index = 0, pnts = 0, cont = 0;
    int[] posicoes;
    ArrayList<Enigma> list;
    ImageIcon icon = null;
    
    public JogoFrame(ArrayList<Enigma> list) {
        initComponents();
        setTitle("ÁREA DE JOGADOR - ALUNO");
        pontuacao.setText("PONTUAÇÃO: " + pnts);
        this.list = list;
        
        formularEnigma();
        funFim.setBackground(new Color(255,0,0));
        chutarPalavra.setBackground(new Color(0,255,127));
        ver_dica.setBackground(new Color(255,255,0));
    }
    
    public void formularEnigma() {
        icon = new ImageIcon("imagens/img1.png");
        imagem.setIcon(icon);
        
        if (index < list.size()) {
            Enigma e = list.get(index);
            
            jtEnunciado.setText(e.getEnunciado());
            qtdLetras.setText(e.getQtdL_resposta() + " LETRAS");
            
            palavra.setText("");
            for (int i = 0; i < e.getQtdL_resposta(); i++) {
                palavra.setText(palavra.getText() + "_");
            }
            
            if (e.getNivel() == 1) {
                nivel.setText("NÍVEL: FÁCIL");
            } else if (e.getNivel() == 2) {
                nivel.setText("NÍVEL: MÉDIO");
            } else if (e.getNivel() == 3) {
                nivel.setText("NÍVEL: DIFICIL");
            } else {
                nivel.setText("NÍVEL: INDEFINIDO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "FIM DE JOGO!!\nSUA PONTUAÇÃO DURANTE A EXECUÇÃO FOI DE: " + pnts + " PONTOS");
            setVisible(false);
        }
        jtEnunciado.setEditable(false);
        index++;
        txt.setText("ENIGMA - " + index);
    }
    
    public void ativarBtns() {
        la.setEnabled(true);
        lb.setEnabled(true);
        lc.setEnabled(true);
        ld.setEnabled(true);
        le.setEnabled(true);
        lf.setEnabled(true);
        lg.setEnabled(true);
        lh.setEnabled(true);
        li.setEnabled(true);
        lj.setEnabled(true);
        lk.setEnabled(true);
        ll.setEnabled(true);
        lm.setEnabled(true);
        ln.setEnabled(true);
        lo.setEnabled(true);
        lp.setEnabled(true);
        lq.setEnabled(true);
        lr.setEnabled(true);
        ls.setEnabled(true);
        lt.setEnabled(true);
        lu.setEnabled(true);
        lv.setEnabled(true);
        lw.setEnabled(true);
        lx.setEnabled(true);
        ly.setEnabled(true);
        lz.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la = new javax.swing.JButton();
        lb = new javax.swing.JButton();
        lc = new javax.swing.JButton();
        ld = new javax.swing.JButton();
        lj = new javax.swing.JButton();
        le = new javax.swing.JButton();
        lh = new javax.swing.JButton();
        lf = new javax.swing.JButton();
        lg = new javax.swing.JButton();
        li = new javax.swing.JButton();
        lk = new javax.swing.JButton();
        ll = new javax.swing.JButton();
        lm = new javax.swing.JButton();
        ln = new javax.swing.JButton();
        lo = new javax.swing.JButton();
        ls = new javax.swing.JButton();
        lt = new javax.swing.JButton();
        lp = new javax.swing.JButton();
        lq = new javax.swing.JButton();
        lr = new javax.swing.JButton();
        lu = new javax.swing.JButton();
        lv = new javax.swing.JButton();
        ly = new javax.swing.JButton();
        lw = new javax.swing.JButton();
        lx = new javax.swing.JButton();
        lz = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtChute = new javax.swing.JTextField();
        chutarPalavra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEnunciado = new javax.swing.JTextPane();
        txt = new javax.swing.JLabel();
        ver_dica = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();
        pontuacao = new javax.swing.JLabel();
        funFim = new javax.swing.JButton();
        palavra = new javax.swing.JLabel();
        qtdLetras = new javax.swing.JLabel();
        nivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la.setText("A");
        la.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laActionPerformed(evt);
            }
        });

        lb.setText("B");
        lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });

        lc.setText("C");
        lc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcActionPerformed(evt);
            }
        });

        ld.setText("D");
        ld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldActionPerformed(evt);
            }
        });

        lj.setText("J");
        lj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ljActionPerformed(evt);
            }
        });

        le.setText("E");
        le.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leActionPerformed(evt);
            }
        });

        lh.setText("H");
        lh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lhActionPerformed(evt);
            }
        });

        lf.setText("F");
        lf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lfActionPerformed(evt);
            }
        });

        lg.setText("G");
        lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgActionPerformed(evt);
            }
        });

        li.setText("I");
        li.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liActionPerformed(evt);
            }
        });

        lk.setText("K");
        lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lkActionPerformed(evt);
            }
        });

        ll.setText("L");
        ll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llActionPerformed(evt);
            }
        });

        lm.setText("M");
        lm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmActionPerformed(evt);
            }
        });

        ln.setText("N");
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });

        lo.setText("O");
        lo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loActionPerformed(evt);
            }
        });

        ls.setText("S");
        ls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsActionPerformed(evt);
            }
        });

        lt.setText("T");
        lt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltActionPerformed(evt);
            }
        });

        lp.setText("P");
        lp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpActionPerformed(evt);
            }
        });

        lq.setText("Q");
        lq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lqActionPerformed(evt);
            }
        });

        lr.setText("R");
        lr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lrActionPerformed(evt);
            }
        });

        lu.setText("U");
        lu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luActionPerformed(evt);
            }
        });

        lv.setText("V");
        lv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvActionPerformed(evt);
            }
        });

        ly.setText("Y");
        ly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lyActionPerformed(evt);
            }
        });

        lw.setText("W");
        lw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lwActionPerformed(evt);
            }
        });

        lx.setText("X");
        lx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lxActionPerformed(evt);
            }
        });

        lz.setText("Z");
        lz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lzActionPerformed(evt);
            }
        });

        jLabel2.setText("SABE O ENIGMA ?");

        chutarPalavra.setText("CHUTAR PALAVRA");
        chutarPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chutarPalavraActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jtEnunciado);

        txt.setText("ENIGMA - X");

        ver_dica.setText("VER DICA");
        ver_dica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_dicaActionPerformed(evt);
            }
        });

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/img1.png"))); // NOI18N

        pontuacao.setText("PONTUAÇÃO:");

        funFim.setText("DESISTIR");
        funFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funFimActionPerformed(evt);
            }
        });

        palavra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        qtdLetras.setText("jLabel1");

        nivel.setText("NÍVEL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funFim, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pontuacao)
                    .addComponent(nivel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(ls)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lt)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lu)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lv)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lw)
                                                    .addGap(4, 4, 4)
                                                    .addComponent(lx))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lj)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lk)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ll)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lm)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ln)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lo)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(la)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ld)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(le)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lf)))
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ly)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lz))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lp)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lq))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(lg)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lh)))
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(li, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lr)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtChute, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chutarPalavra))
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ver_dica)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(palavra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdLetras)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ver_dica)
                        .addGap(4, 4, 4)
                        .addComponent(palavra)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(la)
                                    .addComponent(lb)
                                    .addComponent(lc)
                                    .addComponent(ld)
                                    .addComponent(le)
                                    .addComponent(lf)
                                    .addComponent(lg)
                                    .addComponent(lh)
                                    .addComponent(li))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lj)
                                    .addComponent(lk)
                                    .addComponent(ll)
                                    .addComponent(lm)
                                    .addComponent(ln)
                                    .addComponent(lo)
                                    .addComponent(lp)
                                    .addComponent(lq)
                                    .addComponent(lr)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdLetras))))
                    .addComponent(imagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ls)
                    .addComponent(lt)
                    .addComponent(lu)
                    .addComponent(lv)
                    .addComponent(lw)
                    .addComponent(lx)
                    .addComponent(ly)
                    .addComponent(lz)
                    .addComponent(pontuacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtChute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chutarPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(funFim, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chutarPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chutarPalavraActionPerformed
        String chute = jtChute.getText();
        
        if (list.get(index - 1).getResposta().equalsIgnoreCase(chute)) {
            JOptionPane.showMessageDialog(null, "PARABÉNNSSS! VOCÊ ACERTOU.");
            atualizarPontuacao(true);
        } else {
            JOptionPane.showMessageDialog(null, "POXA! INFELIZMENTE VOCÊ ERROU.");
            atualizarPontuacao(false);
            construirForca(8);
        }
        formularEnigma();
    }//GEN-LAST:event_chutarPalavraActionPerformed

    private void ver_dicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_dicaActionPerformed
        JOptionPane.showMessageDialog(null, list.get(index - 1).getDica().getMensagem());

    }//GEN-LAST:event_ver_dicaActionPerformed

    private void lzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lzActionPerformed
        lz.setEnabled(false);
        if (verificarLetra("z")) {
            atualizarPalavra("z");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lzActionPerformed

    private void laActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laActionPerformed
        la.setEnabled(false);
        if (verificarLetra("a")) {
            atualizarPalavra("a");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_laActionPerformed

    private void funFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funFimActionPerformed
        JOptionPane.showMessageDialog(null, "FIM DE JOGO!!\nSUA PONTUAÇÃO DURANTE A EXECUÇÃO FOI DE: " + pnts + " PONTOS");
        setVisible(false);
    }//GEN-LAST:event_funFimActionPerformed

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        lb.setEnabled(false);
        if (verificarLetra("b")) {
            atualizarPalavra("b");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lbActionPerformed

    private void lcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcActionPerformed
        lc.setEnabled(false);
        if (verificarLetra("c")) {
            atualizarPalavra("c");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lcActionPerformed

    private void ldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldActionPerformed
        ld.setEnabled(false);
        if (verificarLetra("d")) {
            atualizarPalavra("d");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_ldActionPerformed

    private void leActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leActionPerformed
        le.setEnabled(false);
        if (verificarLetra("e")) {
            atualizarPalavra("e");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_leActionPerformed

    private void lfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lfActionPerformed
        lf.setEnabled(false);
        if (verificarLetra("f")) {
            atualizarPalavra("f");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lfActionPerformed

    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
        lg.setEnabled(false);
        if (verificarLetra("g")) {
            atualizarPalavra("g");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lgActionPerformed

    private void lhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lhActionPerformed
        lh.setEnabled(false);
        if (verificarLetra("h")) {
            atualizarPalavra("h");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lhActionPerformed

    private void liActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liActionPerformed
        li.setEnabled(false);
        if (verificarLetra("i")) {
            atualizarPalavra("i");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_liActionPerformed

    private void ljActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ljActionPerformed
        lj.setEnabled(false);
        if (verificarLetra("j")) {
            atualizarPalavra("j");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_ljActionPerformed

    private void lkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lkActionPerformed
        lk.setEnabled(false);
        if (verificarLetra("k")) {
            atualizarPalavra("k");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lkActionPerformed

    private void llActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llActionPerformed
        ll.setEnabled(false);
        if (verificarLetra("l")) {
            atualizarPalavra("l");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_llActionPerformed

    private void lmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmActionPerformed
        lm.setEnabled(false);
        if (verificarLetra("m")) {
            atualizarPalavra("m");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lmActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        ln.setEnabled(false);
        if (verificarLetra("n")) {
            atualizarPalavra("n");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lnActionPerformed

    private void loActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loActionPerformed
        lo.setEnabled(false);
        if (verificarLetra("o")) {
            atualizarPalavra("o");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_loActionPerformed

    private void lpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpActionPerformed
        lp.setEnabled(false);
        if (verificarLetra("p")) {
            atualizarPalavra("p");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lpActionPerformed

    private void lqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lqActionPerformed
        lq.setEnabled(false);
        if (verificarLetra("q")) {
            atualizarPalavra("q");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lqActionPerformed

    private void lrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lrActionPerformed
        lr.setEnabled(false);
        if (verificarLetra("r")) {
            atualizarPalavra("r");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lrActionPerformed

    private void lsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsActionPerformed
        ls.setEnabled(false);
        if (verificarLetra("s")) {
            atualizarPalavra("s");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lsActionPerformed

    private void ltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltActionPerformed
        lt.setEnabled(false);
        if (verificarLetra("t")) {
            atualizarPalavra("t");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_ltActionPerformed

    private void luActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luActionPerformed
        lu.setEnabled(false);
        if (verificarLetra("u")) {
            atualizarPalavra("u");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_luActionPerformed

    private void lvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvActionPerformed
        lv.setEnabled(false);
        if (verificarLetra("v")) {
            atualizarPalavra("v");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lvActionPerformed

    private void lwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lwActionPerformed
        lw.setEnabled(false);
        if (verificarLetra("w")) {
            atualizarPalavra("w");
        } else {
            cont++;
            
            construirForca(cont);
        }
    }//GEN-LAST:event_lwActionPerformed

    private void lxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lxActionPerformed
        lx.setEnabled(false);
        if (verificarLetra("x")) {
            atualizarPalavra("x");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lxActionPerformed

    private void lyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lyActionPerformed
        ly.setEnabled(false);
        if (verificarLetra("y")) {
            atualizarPalavra("y");
        } else {
            cont++;
            construirForca(cont);
        }
    }//GEN-LAST:event_lyActionPerformed
    
    public void construirForca(int op) {
        switch (op) {
            case 1:
                icon = new ImageIcon("imagens/img2.png");
                break;
            case 2:
                icon = new ImageIcon("imagens/img3.png");
                break;
            case 3:
                icon = new ImageIcon("imagens/img4.png");
                break;
            case 4:
                icon = new ImageIcon("imagens/img5.png");
                break;
            case 5:
                icon = new ImageIcon("imagens/img6.png");
                break;
            default:
                icon = new ImageIcon("imagens/img7.png");
                imagem.setIcon(icon);
                pnts = pnts - 1;
                sleep();
        }
        pnts = pnts - 1;
        pontuacao.setText("PONTUAÇÃO: " + pnts);
        imagem.setIcon(icon);
    }
    
    public void sleep() {
        try {
            Thread.sleep(1000);
            ativarBtns();
            formularEnigma();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public boolean verificarLetra(String letra) {
        boolean flag = false;
        String p = list.get(index - 1).getResposta();
        
        int r = 0;
        for (int i = 0; i < p.length(); i++) {
            if (String.valueOf(p.charAt(i)).equalsIgnoreCase(letra)) {
                flag = true;
                r++;
            }
        }
        
        posicoes = new int[r];
        r = 0;
        for (int j = 0; j < p.length(); j++) {
            if (String.valueOf(p.charAt(j)).equals(letra)) {
                posicoes[r] = j;
                r++;
            }
        }
        
        return flag;
    }
    
    public void atualizarPalavra(String l) {
        StringBuilder palavraAtualizada = new StringBuilder(palavra.getText());
        
        for (int i = 0; i < posicoes.length; i++) {
            palavraAtualizada.setCharAt(posicoes[i], l.charAt(0));
        }
        palavra.setText(String.valueOf(palavraAtualizada).toUpperCase());
        System.out.println(palavraAtualizada);
        if (String.valueOf(palavraAtualizada).equalsIgnoreCase(list.get(index - 1).getResposta())) {
            pnts = pnts + 1;
            JOptionPane.showMessageDialog(null, "PARABÉNNSSS! VOCÊ ACERTOU.");
            sleep();
        } else {
            pnts = pnts + 1;
        }
        
        pontuacao.setText("PONTUAÇÃO: " + pnts);
        
        posicoes = null;
    }
    
    public void atualizarPontuacao(boolean flag) {
        jtChute.setText("");
        if (flag) {
            pnts += 1;
            pontuacao.setText("PONTUAÇÃO: " + pnts);
        } else {
            pnts -= 1;
            pontuacao.setText("PONTUAÇÃO: " + pnts);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chutarPalavra;
    private javax.swing.JButton funFim;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtChute;
    private javax.swing.JTextPane jtEnunciado;
    private javax.swing.JButton la;
    private javax.swing.JButton lb;
    private javax.swing.JButton lc;
    private javax.swing.JButton ld;
    private javax.swing.JButton le;
    private javax.swing.JButton lf;
    private javax.swing.JButton lg;
    private javax.swing.JButton lh;
    private javax.swing.JButton li;
    private javax.swing.JButton lj;
    private javax.swing.JButton lk;
    private javax.swing.JButton ll;
    private javax.swing.JButton lm;
    private javax.swing.JButton ln;
    private javax.swing.JButton lo;
    private javax.swing.JButton lp;
    private javax.swing.JButton lq;
    private javax.swing.JButton lr;
    private javax.swing.JButton ls;
    private javax.swing.JButton lt;
    private javax.swing.JButton lu;
    private javax.swing.JButton lv;
    private javax.swing.JButton lw;
    private javax.swing.JButton lx;
    private javax.swing.JButton ly;
    private javax.swing.JButton lz;
    private javax.swing.JLabel nivel;
    private javax.swing.JLabel palavra;
    private javax.swing.JLabel pontuacao;
    private javax.swing.JLabel qtdLetras;
    private javax.swing.JLabel txt;
    private javax.swing.JButton ver_dica;
    // End of variables declaration//GEN-END:variables
}
