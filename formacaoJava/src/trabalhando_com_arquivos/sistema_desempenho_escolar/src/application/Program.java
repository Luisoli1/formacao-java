package application;

import model.entities.Aluno;
import model.entities.Notas;
import model.entities.Turma;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public Program() {
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        System.out.print("Cole o caminho do arquivo: ");
        String arquivo = sc.nextLine();
        File file = new File(arquivo);
        // bloco try de leitura dos dados
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha = br.readLine();

            while (linha != null) {

                String[] linhas = linha.split(",");
                String nome = linhas[0];
                Double nota1 = Double.parseDouble(linhas[1]);
                Double nota2 = Double.parseDouble(linhas[2]);
                Double nota3 = Double.parseDouble(linhas[3]);
                Notas notas = new Notas(nota1, nota2, nota3);
                Aluno a = new Aluno(nome, notas);
                alunos.add(a);
                linha = br.readLine();

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Turma turma = new Turma("A1",alunos);

        //bloco try escrita dos dados
        String pastaOut = file.getParent() + "\\out";
        new File(pastaOut).mkdir();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pastaOut + "\\resultado.csv"))) {

            for(Aluno a: alunos){
                Double v = a.calcularMedia();
                String media = String.format(Locale.US, "%.2f", v);
                bw.write(a.getNome() + ", " + media + ", "+ a.resultadoFinal());
                bw.newLine();
            }
            bw.write(String.valueOf(turma.mediaTurma()));
            bw.newLine();
            bw.write(String.valueOf(turma.maiorNotaTurma()));

        } catch (IOException a) {
            System.out.println(a.getMessage());
        }

    }}
