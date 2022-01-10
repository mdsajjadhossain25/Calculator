package com.mycompany.calculator;

import java.awt.Container;

public class Calculator extends javax.swing.JFrame implements Calculations {

    public Calculator() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        percentageButton = new javax.swing.JButton();
        sqrtButton = new javax.swing.JButton();
        x2Button = new javax.swing.JButton();
        inverseButton = new javax.swing.JButton();
        ceButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        backSpaceButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlusSub = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        percentageButton.setBackground(new java.awt.Color(0, 255, 102));
        percentageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        percentageButton.setForeground(new java.awt.Color(0, 0, 0));
        percentageButton.setText("%");
        percentageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageButtonActionPerformed(evt);
            }
        });

        sqrtButton.setBackground(new java.awt.Color(0, 204, 102));
        sqrtButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sqrtButton.setForeground(new java.awt.Color(0, 0, 0));
        sqrtButton.setText("R");
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });

        x2Button.setBackground(new java.awt.Color(0, 204, 102));
        x2Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        x2Button.setForeground(new java.awt.Color(0, 0, 0));
        x2Button.setText("X2");
        x2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ButtonActionPerformed(evt);
            }
        });

        inverseButton.setBackground(new java.awt.Color(0, 204, 102));
        inverseButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inverseButton.setForeground(new java.awt.Color(0, 0, 0));
        inverseButton.setText("IN");
        inverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseButtonActionPerformed(evt);
            }
        });

        ceButton.setBackground(new java.awt.Color(0, 204, 102));
        ceButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ceButton.setForeground(new java.awt.Color(0, 0, 0));
        ceButton.setText("CE");
        ceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceButtonActionPerformed(evt);
            }
        });

        cButton.setBackground(new java.awt.Color(0, 204, 102));
        cButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cButton.setForeground(new java.awt.Color(0, 0, 0));
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        backSpaceButton.setBackground(new java.awt.Color(0, 204, 102));
        backSpaceButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backSpaceButton.setForeground(new java.awt.Color(0, 0, 0));
        backSpaceButton.setText("<-");
        backSpaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpaceButtonActionPerformed(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(0, 204, 102));
        divideButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        divideButton.setForeground(new java.awt.Color(0, 0, 0));
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 0, 0));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 0, 0));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 0, 0));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMul.setBackground(new java.awt.Color(0, 204, 102));
        btnMul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMul.setForeground(new java.awt.Color(0, 0, 0));
        btnMul.setText("*");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 0, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 0, 0));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btnSub.setBackground(new java.awt.Color(0, 204, 102));
        btnSub.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSub.setForeground(new java.awt.Color(0, 0, 0));
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 0, 0));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 0, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 0, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(0, 204, 102));
        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(0, 0, 0));
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 0, 0));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPlusSub.setBackground(new java.awt.Color(0, 204, 102));
        btnPlusSub.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPlusSub.setForeground(new java.awt.Color(0, 0, 0));
        btnPlusSub.setText("-+");
        btnPlusSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusSubActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(0, 0, 0));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnEqual.setBackground(new java.awt.Color(0, 204, 102));
        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(0, 0, 0));
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnDot.setBackground(new java.awt.Color(0, 204, 102));
        btnDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDot.setForeground(new java.awt.Color(0, 0, 0));
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnPlusSub, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextField1)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(ceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                        .addComponent(percentageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(sqrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(x2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(inverseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(backSpaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(x2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sqrtButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(percentageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inverseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ceButton)
                                        .addComponent(cButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(backSpaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(divideButton))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn7)
                                        .addComponent(btn8)
                                        .addComponent(btn9)
                                        .addComponent(btnMul))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn4)
                                        .addComponent(btn5)
                                        .addComponent(btn6)
                                        .addComponent(btnSub))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn1)
                                        .addComponent(btn2)
                                        .addComponent(btn3)
                                        .addComponent(btnPlus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPlusSub)
                                        .addComponent(btn0)
                                        .addComponent(btnDot)
                                        .addComponent(btnEqual))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void percentageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (jLabel1.getText().length() > 0 && jTextField1.getText().length() > 0) {
            toBeCalculatedValue = Double.parseDouble(jTextField1.getText());
            persentage(Double.parseDouble(jLabel1.getText().split(" ")[0]), toBeCalculatedValue);
        }
    }

    private void persentage(double a, double b) {
        switch (sign) {
            case "+":
                add(((a * b) / 100), a);
                break;
            case "-":
                subtract(((a * b) / 100), a);
                break;
            case "*":
                multiply(((a * b) / 100), a);
                break;
            case "/":
                divide(((a * b) / 100), a);
                break;
        }
    }
    private void sqrtButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        toBeCalculatedValue = Double.parseDouble(jTextField1.getText());
        sqrtRoot(toBeCalculatedValue);
    }

    private void sqrtRoot(double a) {
        jTextField1.setText(Double.toString(a));
        jTextField1.setText(Double.toString(Math.sqrt(a)));
    }
    private void x2ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (jTextField1.getText().length() > 0) {
            toBeCalculatedValue = Double.parseDouble(jTextField1.getText());
            square(toBeCalculatedValue);
        }
    }

    private void square(double a) {
        jTextField1.setText(Double.toString(a *= a));
    }

    private void inverseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (jTextField1.getText().length() > 0) {
            toBeCalculatedValue = Double.parseDouble(jTextField1.getText());
            oneByX(toBeCalculatedValue);
        }
    }

    private void oneByX(double a) {
        jTextField1.setText(Double.toString(1 / a));

    }


    private void ceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jTextField1.setText("");
    }

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jTextField1.setText("");
        jLabel1.setText("");
    }

    private void backSpaceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String value = jTextField1.getText();
        int length = value.length();
        if (length > 0) {
            StringBuilder builder = new StringBuilder(value);
            builder.deleteCharAt(length - 1);
            jTextField1.setText(builder.toString());
        }
    }

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        sign = "/";
        if (jTextField1.getText().length() > 0) {
            storeToBeCalculated(sign);
        }
    }

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        sign = "*";
        if (jTextField1.getText().length() > 0) {
            storeToBeCalculated(sign);
        }
    }

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        sign = "-";
        if (jTextField1.getText().length() > 0) {
            storeToBeCalculated(sign);
        }
    }

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "0");
    }

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "1");
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "2");
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "3");
    }

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "4");
    }

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "5");
    }

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "6");
    }


    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "7");
    }

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "8");
    }

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "9");
    }


    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        sign = "+";
        if (jTextField1.getText().length() > 0) {
            storeToBeCalculated(sign);
        }
    }

    private void btnPlusSubActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String value = jTextField1.getText();
        if (!value.contains("-")) {
            jTextField1.setText('-' + value);
        } else {
            try {
                jTextField1.setText(value.split("-")[1]);
            } catch (IndexOutOfBoundsException e) {
                jTextField1.setText("");
            }
        }
    }


    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (jTextField1.getText().length() > 0) {
            double b = Double.parseDouble(jTextField1.getText());
            switch (sign) {
                case "+":
                    add(toBeCalculatedValue, b);
                    break;
                case "-":
                    subtract(toBeCalculatedValue, b);
                    break;
                case "*":
                    multiply(toBeCalculatedValue, b);
                    break;
                case "/":
                    divide(toBeCalculatedValue, b);
                    break;

            }
        }
    }

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {
        if (!isDecimal) {
            jTextField1.setText(jTextField1.getText() + ".");
            isDecimal = true;
        }
    }

    @Override
    public void add(double a, double b) {
        setResult(a + b);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void subtract(double a, double b) {
        setResult(a - b);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void multiply(double a, double b) {
        setResult(a * b);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void divide(double a, double b) {
        setResult(a / b);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setResult(double result) {
        jTextField1.setText(Double.toString(result));
        jLabel1.setText("");
    }

    private void storeToBeCalculated(String sign) {
        String value = jTextField1.getText();
        toBeCalculatedValue = Double.parseDouble(value);
        jLabel1.setText(value + " " + sign);
        jTextField1.setText("");
    }

    /**
     * @param args the command line arguments
     */

    private String sign;
    private boolean isDecimal = false;
    double toBeCalculatedValue;

    // Variables declaration - do not modify
    private javax.swing.JButton backSpaceButton;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusSub;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton cButton;
    private javax.swing.JButton ceButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton inverseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton percentageButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton x2Button;
    // End of variables declaration
}
