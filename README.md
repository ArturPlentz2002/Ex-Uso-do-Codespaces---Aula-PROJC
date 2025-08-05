# Ex-Uso-do-Codespaces---Aula-PROJC
# Projeto e Arquitetura de Software
## Roteiro 01: Criação de Projeto no GitHub Codespaces

### 📋 Objetivo
Este exercício tem como objetivo familiarizar os estudantes com o ambiente de programação que será utilizado durante o semestre, através da criação de programas simples em Java utilizando GitHub Codespaces.

### 🎯 Exercícios
- **Exercício 1**: Criar um programa simples para apresentar propriedades do sistema
- **Exercício 2**: Desenvolver um programa com múltiplas classes e verificar como gerenciar projetos no mesmo container

---

## 🚀 Preparação

1. **Material de apoio**: Consulte o documento "Material de apoio: Codespaces - uso"
2. **Repositório**: Crie um repositório público Java no GitHub
   - **Nome sugerido**: `pas_roteiro01`
   - **Visibilidade**: Público

---

## 📂 Parte 1: Programa Simples

### Passos a seguir:

1. **Iniciar Codespace** no repositório criado
2. **Criar projeto** com nome sugerido: `projeto1a`
3. **Implementar a classe App**:

```java
public class App {
    public static void main(String[] args) {
        System.out.println("\nHello world!");
        String version = System.getProperty("java.version");
        System.out.println("Running Java Version: " + version + "\n");
        String name = System.getProperty("user.name");
        System.out.println("User account name: " + name + "\n");
    }
}
```

4. **Compilar e executar** o código
5. **Explorar propriedades do sistema** - Consulte: [System Properties (Oracle Java Tutorials)](https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html)
6. **Fazer commit e sync** com o repositório
7. **Parar o Codespace** e verificar no GitHub se o repositório foi atualizado

---

## 👥 Parte 2: Projeto com Múltiplas Classes

### Passos a seguir:

1. **Reiniciar o Codespace**
2. **Criar novo projeto** com nome sugerido: `projeto1b`
3. **Implementar duas classes**:

#### Classe Professor.java
```java
public class Professor {
    private String nome;
    private int anosExperiencia;

    public Professor(String nome, int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String classifica() {
        if(anosExperiencia >= 0 && anosExperiencia <= 5)
            return "Assistente";
        else if(anosExperiencia >= 6 && anosExperiencia <= 10)
            return "Adjunto";
        else if(anosExperiencia > 10)
            return "Titular";
        return "Invalido";
    }

    @Override
    public String toString() {
        return "Professor: " + nome + 
               ", anos de experiencia: " + anosExperiencia;
    }
}
```

#### Classe App.java
```java
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Indique o nome do professor: ");
        String nome = s.nextLine();
        System.out.print("Indique quantos anos de experiencia ele tem: ");
        int experiencia = s.nextInt();
        
        Professor p = new Professor(nome, experiencia);
        System.out.println(p.toString());
        System.out.println("Categoria: " + p.classifica());
    }
}
```

4. **Executar e testar** o programa
5. **Aprender a alternar** entre os dois projetos
6. **Fazer commit e sync** com o repositório
7. **Parar o Codespace** e verificar no GitHub se ambos os projetos foram atualizados

---

## 📁 Estrutura Final do Repositório

```
pas_roteiro01/
├── projeto1a/
│   └── App.java
├── projeto1b/
│   ├── Professor.java
│   └── App.java
└── README.md
```

---

## 📝 Entrega

Ao finalizar o exercício:
1. Acesse o **fórum da aula**
2. Crie um **tópico com seu nome**
3. **Inclua a URL** do repositório criado na mensagem

---

## 🔗 Recursos Úteis

- [System Properties - Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html)
- Material de apoio: Codespaces - uso
- Documentação oficial do GitHub Codespaces

---

## ❓ Dúvidas

Em caso de dúvidas durante a execução dos exercícios, consulte o professor.
