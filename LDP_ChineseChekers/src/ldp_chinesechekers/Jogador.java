/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldp_chinesechekers;

/**
 *
 * @author ritap
 */
class Jogador {
    
    String cor, nome;
    boolean turno; //Permite ver se é a vez do jogador jogar
    boolean jogadaPreparada;
    int jogadaI, jogadaJ;       //Ultimo circulo onde clicou
    int sorteio;
    boolean salto;
}
