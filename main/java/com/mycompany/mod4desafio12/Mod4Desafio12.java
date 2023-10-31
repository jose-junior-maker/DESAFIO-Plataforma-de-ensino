/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mod4desafio12;

import com.mycompany.mod4desafio12.entities.Lesson;
import com.mycompany.mod4desafio12.entities.Task;
import com.mycompany.mod4desafio12.entities.Video;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Mod4Desafio12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas aulas tem o curso? ");
        int qtdAulas = sc.nextInt();
        
        
        List<Lesson> lessons = new ArrayList<>();
        
        for (int i = 1; i<=qtdAulas; i++){
            System.out.println("Dados da " + i + "a aula:");
            sc.nextLine();
            
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            String conteudo = sc.nextLine();
            
            if(conteudo.equals("c")){
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int duracao = sc.nextInt();
                Video video = new Video(url,duracao,titulo);
                lessons.add(video);
            }else if(conteudo.equals("t")){
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Descrição: ");
                String descricao = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int qtd = sc.nextInt();
                Task task = new Task(descricao, qtd, titulo);
                lessons.add(task);
            }
        }
        
        System.out.println("");
        int duracaoTotal = 0;
        for (Lesson lesson : lessons){
            duracaoTotal = duracaoTotal + lesson.duration();
        }
        System.out.print("DURAÇÃO TOTAL DO CURSO = " + duracaoTotal + " segundos");
    }
}
