/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJogo;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author jhssi
 */
public class DadosJogo {
    
    public int dia;
    public int dice;
    public List<Cards> cartas;

    public DadosJogo(){
        dia = 1;
    }
    
    public void baralhaCartas(){
        Collections.shuffle(cartas);
    }
    
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }
    
    
    
}
