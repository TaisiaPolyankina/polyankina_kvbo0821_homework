package polyankina_kvbo0821.prac2.hw2_ex1;

import polyankina_kvbo0821.prac2.hw2_ex1.Author;

import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author writer = new Author("James Clawell", "JamesClawell68@yahoo.com", 'm');
        System.out.println("Имя автора: " + writer.getName());
        System.out.println("Основная электронная почта: " + writer.getEmail());
        Scanner source = new Scanner(System.in);
        System.out.print("Напишите новый адрес электронной почты: ");
        String eml = source.nextLine();
        writer.setEmail(eml);
        System.out.println("Пол автора: " + writer.getGender());
        System.out.println("Свод актуальной информации: " + writer.toString());
    }
}
