/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogodavelhagui;

import java.util.ArrayList;

/**
 *
 * @author kairos-04
 */
public class JogoDaVelha {
    
    public JogoDaVelha(){
        
    }
    
    public boolean verificaSeGanhou(ArrayList<javax.swing.JButton> botoes){
        String linha[] = new String[3];
        Gui gui = new Gui();
        
        //linha 0 horizontal
        linha = new String[3];
        for(int i = 0; i < 3; i++){
            linha[i] = botoes.get(i).getText();
            
            if(linha[0] == linha[1] && linha[1] == linha[2]){
                return true;
            }
        }
        
        //linha 1 horizontal
        linha = new String[3];
        for(int i = 0; i < 3; i++){
            linha[i] = botoes.get(i + 3).getText();
            
            if(linha[0] == linha[1] && linha[1] == linha[2]){
                return true;
            }
        }
        
        //linha 2 horizontal
        linha = new String[3];
        for(int i = 0; i < 3; i++){
            linha[i] = botoes.get(i + 6).getText();
            
            if(linha[0] == linha[1] && linha[1] == linha[2]){
                return true;
            }
        }
        
        //linha 0 vertical
        linha = new String[3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <= 6; j = j + 3){
                if(!botoes.get(j).getText().isEmpty()){
                    linha[i] = botoes.get(j).getText();
                }else{
                    break;
                }
                
                if(linha[0] == linha[1] && linha[1] == linha[2]){
                    System.out.println("linha = " + linha[0] + linha[1] + linha[2]);
                    System.out.println("ganhou");
                    return true;
                }
            }
        }
        
        //linha 1 vertical
        
        
        //linha 2 vertical
        
        
        
        return false;
    }
    
}
