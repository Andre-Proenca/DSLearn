# 🎓 DSLearn — Plataforma de Ensino Online

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Status](https://img.shields.io/badge/Status-Finalizado-success)

> Projeto **finalizado** com foco em back-end, desenvolvido para simular uma plataforma de ensino real, aplicando conceitos de **arquitetura**, **modelagem de domínio**, **regras de negócio** e **boas práticas de desenvolvimento**.

🔗 Repositório: [https://github.com/Andre-Proenca/DSLearn](https://github.com/Andre-Proenca/DSLearn)

---

## 📌 Visão Geral

O **DSLearn** é uma plataforma de ensino online responsável por gerenciar **cursos**, **turmas**, **alunos** e um **fórum de perguntas e respostas** integrado ao conteúdo dos cursos.

O sistema foi projetado para refletir cenários reais do mercado, com múltiplos perfis de usuários, controle de acesso e fluxos completos de aprendizado.

---

## 👥 Perfis de Usuário

* **Aluno**

  * Acessa conteúdos e aulas
  * Envia tarefas
  * Participa do fórum

* **Professor**

  * Avalia tarefas dos alunos
  * Interage no fórum
  * Marca respostas como corretas

* **Administrador**

  * Cadastra cursos
  * Cria turmas (ofertas)

> 🔐 Apenas administradores possuem permissão para cadastrar cursos e turmas.

---

## 📚 Estrutura Acadêmica

### Cursos e Recursos

Um **curso** é composto por vários **recursos**, que representam grupos de conteúdo, como:

* Trilhas de aprendizado
* Conteúdos bônus
* Links externos
* Fórum de perguntas e respostas

Cada recurso pode conter **seções**, e cada seção contém **aulas**, que podem ser:

* 🎥 Vídeo
* 📝 Texto
* 🧩 Tarefas avaliativas

---

## 🧩 Tarefas e Avaliações

As tarefas possuem regras bem definidas:

* Peso
* Data de entrega
* Número de questões
* Quantidade mínima de acertos

📤 Quando um aluno envia uma tarefa:

* Ela fica **aguardando feedback do professor**
* Pode ser **aceita** ou **rejeitada**

---

## 🗓️ Turmas (Ofertas)

Cada turma representa uma **oferta** do curso, contendo:

* Data de início
* Data de fim

Diferentes ofertas de um mesmo curso podem ter **pequenas variações de conteúdo**, permitindo customização para cada turma.

---

## 🔔 Notificações

O sistema envia **notificações** para alunos e professores, garantindo maior engajamento e acompanhamento das atividades.

---

## 💬 Fórum de Perguntas e Respostas

O fórum é integrado aos cursos e possui as seguintes funcionalidades:

### 📋 Listagem de Tópicos com Filtros

* Por recurso / seção / aula
* Por texto (título e/ou corpo)
* Apenas tópicos do usuário logado

### ✍️ Interações

* Criar tópico (título e corpo)
* Responder tópico
* Marcar / desmarcar **upvote** em perguntas (exceto o autor)
* Marcar / desmarcar **upvote** em respostas (exceto o autor)
* Marcar / desmarcar **melhor resposta**

  * Permitido apenas para o autor do tópico e instrutor

---

## 🛠️ Tecnologias Utilizadas

* **Java 21**
* **Spring Boot**
* Spring Data JPA / Hibernate
* Banco de dados relacional
* Maven
* JUnit (testes)
* H2 / PostgreSQL (dependendo do ambiente)

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de:

* Consolidar conhecimentos em **desenvolvimento back-end**
* Aplicar **boas práticas de arquitetura**
* Trabalhar com **regras de negócio complexas**
* Servir como **projeto de portfólio** para processos seletivos

---

## 👨‍💻 Autor

**André Proença**
Desenvolvedor Back-end Júnior

🔗 GitHub: [https://github.com/Andre-Proenca](https://github.com/Andre-Proenca)
🔗 LinkedIn: [https://www.linkedin.com/in/andreleivaproenca/](https://www.linkedin.com/in/andreleivaproenca/)

---

✨ Projeto concluído e pronto para demonstrar habilidades técnicas em ambientes reais de desenvolvimento.
