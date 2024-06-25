# 🧩 Design Patterns

Ao longo do desenvolvimento de um projeto é comum surgirem problemas. Dessa forma, os design patterns são como templates para resoluções de problemas comuns em um projeto.

##  📖 Bio

Este é um projeto para estudos de design patterns, nele há exemplos de aplicações de design pattern.

Este é um projeto que desenvolvi no curso da plataforma ADA.

## 🗝️ Singleton

Às vezes, precisamos utilizar uma classe apenas por conta de seus métodos, como por exemplo um método matemático que resolve alguma conta ou uma classe que utilizamos para acessar o banco de dados. Essas classes têm algo em comum: a necessidade de terem apenas um objeto da classe criado, seja por necessidade ou para melhor desempenho.

Exemplo de estrutura:

``````java
public class GameServer {
    private static final GameServer INSTANCE = new GameServer();
    private int currentClients;
    
    private GameServer() {}
    
    public static GameServer getInstance() {
        return INSTANCE;
    }
    
    public int getCurrentClients() {
        return currentClients;
    }
}
``````

- **INSTANCE**: armazena uma instância de `GameServer`.

  **currentClients**: armazena a quantidade atual de jogadores online.

Observe que o construtor da classe é privado. Isso evita que alguém crie uma nova instância dessa classe. Dessa forma, é possível apenas obter a `INSTANCE` dessa classe. Em um contexto como esse, é útil já que a única ideia é saber quantos jogadores simultâneos há, não havendo necessidade de ter mais de um objeto para isso.

### ✔️ Conclusão

A depender do seu projeto, pode surgir a necessidade dessa prática, como o uso de métodos utilitários ou valores que devem ser obtidos apenas de uma origem..

## 🧱 Builder

O padrão de projeto Builder é usado para construir objetos complexos passo a passo. Ele permite a criação de diferentes representações de um objeto usando o mesmo código de construção. Isso é particularmente útil quando a criação de um objeto envolve muitos parâmetros opcionais ou configurações complexas.

Exemplo de estrutura:

``````java
public class House {
    private String foundation;
    private String structure;
    private String roof;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
    }

    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;

        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
``````

- **House**: a classe de produto final que será construída.
- **HouseBuilder**: a classe builder que contém todos os passos necessários para construir a `House`.

Usando o `HouseBuilder`, podemos criar uma `House` com diferentes configurações, conforme necessário:

``````java
House house = new House.HouseBuilder()
    .setFoundation("Concrete")
    .setStructure("Wood")
    .setRoof("Tiles")
    .build();
``````

### ✔️ Conclusão

O padrão Builder é especialmente útil para criar objetos com muitos parâmetros opcionais ou para garantir que um objeto só possa ser construído se todos os requisitos forem atendidos. Ele promove a imutabilidade e a legibilidade do código, tornando a construção de objetos complexos mais fácil e menos propensa a erros.

## ⚖️ Conclusão

Estes são apenas alguns patterns, há vários outros com ideias e funcionalidades diferentes, alguns deles estão no código deste projeto, fique a vontade para estuda-los.
