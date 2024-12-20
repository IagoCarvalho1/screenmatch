                                              JAVA: Aplicando a Orientação a Objetos
------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                                                                                                                               
Uma classe é uma estrutura que define um tipo de objeto. A classe é como um molde, que define quais são as características (atributos) e comportamentos (métodos) que os objetos desse tipo vão possuir. Por exemplo, podemos definir uma classe chamada Pessoa que tenha os atributos nome e idade, além do método fazAniversario()

A sintaxe para definir essa classe em Java é a seguinte:

    public class Pessoa {
    
        String nome;
        int idade;
        
        void fazAniversario() {
          idade++;
        }
    
    }

Já um objeto, é uma instância de uma classe, sendo por meio dele que conseguimos representar informações na aplicação, pois a classe serve apenas para padronizar os objetos, mas não para representar um objeto em si. Para criar um objeto em Java, precisamos utilizar a palavra reservada new seguida do nome da classe e de parênteses vazios. Por exemplo, para criar um objeto do tipo Pessoa, podemos escrever o seguinte código:

    Pessoa pessoa1 = new Pessoa();

Nesse exemplo, criamos um objeto a partir da classe Pessoa, e guardamos na variável pessoa1 uma referência a ele. Como esse objeto foi criado como sendo do tipo Pessoa, ele possui os atributos nome e idade, além do método fazAniversario(). É a partir do objeto que podemos de fato representar uma pessoa, ou seja, preencher os atributos e chamar os métodos. Por exemplo:

    Pessoa pessoa1 = new Pessoa();
    
    pessoa1.nome = "Ana";
    pessoa1.idade = 20;
    
    System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");
    
    pessoa1.fazAniversario();
    
    System.out.println("A idade agora é: " +pessoa1.idade);

Podemos criar vários objetos do tipo Pessoa, sendo que todos eles terão os mesmos atributos e métodos, já que são da mesma classe, mas cada um pode possuir informações distintas. Por exemplo:

    Pessoa pessoa1 = new Pessoa();
    
    pessoa1.nome = "Ana";
    pessoa1.idade = 20;
    
    System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");
    
    pessoa1.fazAniversario();
    
    System.out.println("A idade agora é: " +pessoa1.idade);
    
    Pessoa pessoa2 = new Pessoa();
    
    pessoa2.nome = "Carlos";
    pessoa2.idade = 20;
    
    System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");
    
    pessoa2.fazAniversario();
    
    System.out.println("A idade agora é: " +pessoa2.idade);


Iago, parabéns pela dedicação aos estudos! Você mencionou o uso do `void` e a ligação entre duas classes usando o `Scanner`. Isso demonstra que você está se aprofundando na prática da programação orientada a objetos, mas a sua resposta não abrange todos os pontos da aula. 
Você aprendeu sobre o conceito fundamental de **classes** na programação orientada a objetos. Uma classe serve como um blueprint, um modelo, para criar objetos. Ela define as características (atributos) e comportamentos (métodos) que os objetos dessa classe terão.
Além disso, vimos como a estrutura de uma classe é definida, incluindo a declaração de atributos e métodos. A criação de classes é crucial para organizar e modularizar o código, facilitando a manutenção e a reutilização. 
Também vimos como **instanciar objetos**, ou seja, criar objetos concretos a partir de uma classe. Cada objeto é uma instância única da classe, com seus próprios valores para os atributos. A aula também abordou os **atributos**, que representam as características de um objeto.
Aprendemos como definir atributos dentro de uma classe e como visualizar seus valores. Esses atributos armazenam dados específicos de cada objeto. Por fim, a aula explicou os **métodos**, que representam os comportamentos ou ações que um objeto pode realizar.
Métodos são funções que operam sobre os dados (atributos) do objeto. A combinação de atributos e métodos define completamente o comportamento de um objeto. Pensar em entidades do mundo real como objetos, com suas características e ações, é fundamental para aplicar a programação orientada a objetos de forma eficaz. 
O `Scanner` e o `void` são ferramentas que podem ser usadas *dentro* das classes e métodos, mas não definem o conceito central de classes e objetos em si. O `Scanner` é usado para receber entradas do usuário, e `void` indica que um método não retorna nenhum valor. 
Eles são importantes para a programação, mas são ferramentas complementares ao conceito principal da aula. 
Continue estudando e praticando!

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Em Java, os modificadores de acesso são palavras-chave que definem o nível de visibilidade de classes, atributos e métodos, sendo que eles ajudam a garantir a segurança e encapsulamento do código.

Existem quatro tipos de modificadores de acesso em Java: public, protected, private e default (também conhecido como package-private).

Public
O modificador de acesso public é o mais permissivo de todos. Uma classe, atributo ou método declarado como public pode ser acessado por qualquer classe em qualquer pacote. Ou seja, ele possui visibilidade pública e pode ser utilizado livremente. Por exemplo:

    public class Conta {
    
      public double saldo;
    
      public void sacar(double valor) {
        // lógica de saque...
      }
    }
----------------------------------------------------------------
    public class br.com.alura.principal.Principal {
        
        public static void main(String[] args) {
            Conta c1 = new Conta();
            c1.saldo = 300;
            c1.sacar(100);
        }
    
    }

Default (Package-private)
O modificador de acesso default é aquele que não especifica nenhum modificador de acesso. Quando nenhum modificador de acesso é especificado, a classe, atributo ou método pode ser acessado apenas pelas classes que estão no mesmo pacote. Por exemplo:

    package br.com.alura.conta;
    
    public class Conta {
    
      default double saldo;
    
      default void sacar(double valor) {
        // lógica de saque...
      }
    }
--------------------------------------------------------
    package br.com.alura.testes;
    
    public class br.com.alura.principal.Principal {
        
        public static void main(String[] args) {
            Conta c1 = new Conta();
            c1.saldo = 300;
            c1.sacar(100);
        }
    
    }

No código anterior, a classe Conta está em um pacote e a classe br.com.alura.principal.Principal em outro pacote distinto. A classe Conta pode ser instanciada dentro da classe br.com.alura.principal.Principal, pois ela possui o modificador de acesso public, entretanto, o atributo saldo e o método sacar tem o modificador default e, portanto, não podem ser acessados de dentro da classe br.com.alura.principal.Principal, o que vai causar um erro de compilação no código anterior.

Private
O modificador de acesso private é o mais restritivo de todos. Uma classe, atributo ou método declarado como private só pode ser acessado dentro da própria classe. Ou seja, ele possui visibilidade restrita e não pode ser utilizado por outras classes. Por exemplo:

    public class Conta {
  
        private double saldo;
      
        private void sacar(double valor) {
          // lógica de saque...
        }
    }
   
    public class br.com.alura.principal.Principal {
    
        public static void main(String[] args) {
            Conta c1 = new Conta();
            c1.saldo = 300;
            c1.sacar(100);
        }
    
    }
No código anterior, vai ocorrer erro de compilação na classe br.com.alura.principal.Principal, pois o atributo saldo e o método sacar foram declarados como private, não podendo com isso serem acessados de fora da própria classe Conta.

Existe ainda um último modificador de acesso, que é o protected, mas falaremos dele mais adiante no curso, após ser apresentado o conceito de herança de classes.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: a palavra chave "this"

A documentação do Java, conhecida como JavaDoc, é uma referência completa para todas as classes, interfaces e métodos disponíveis na plataforma Java. Ela está disponível online e pode ser acessada neste site da Oracle. (https://docs.oracle.com/en/java/javase/17/docs/api/index.html)

O JavaDoc é organizado em pacotes, que contêm diversas classes e interfaces relacionadas a alguma funcionalidade específica da linguagem. Cada classe e interface é documentada individualmente, com informações detalhadas sobre sua funcionalidade, uso e exemplos de código.

Essa documentação deve ser uma referência essencial para qualquer pessoa que queira programar na linguagem Java, pois fornece informações detalhadas sobre como usar as classes e interfaces fornecidas pela linguagem. Tendo acesso à documentação, podemos também descobrir novas classes e métodos que podem ser úteis em nossos projetos, para resolver problemas comuns e recorrentes do dia a dia.

Não deixe de entrar no site do JavaDoc e explorar os pacotes e classes que a linguagem nos disponibiliza, pois assim você já vai se familiarizar em como descobrir novos recursos da linguagem, além de entender melhor o funcionamento das principais classes do Java.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Padrão de nomes de pacotes

Em Java, pacotes são usados para agrupar classes que estão relacionadas a alguma funcionalidade. Eles ajudam a organizar o código, facilitando o seu gerenciamento e evitando que centenas de classes distintas fiquem todas misturadas num único diretório.

A organização de classes dentro de um pacote também pode ser feita usando subpacotes ou colocando as classes diretamente dentro do pacote, dependendo da complexidade do projeto. Além disso, é importante seguir a convenção de nomeação de pacotes para garantir que os pacotes sejam facilmente identificados.

Em relação à nomenclatura de pacotes, outro aspecto importante é o uso do nome de domínio reverso da empresa ou organização como parte do nome do pacote. Por exemplo, se o nome de domínio da empresa fosse "minhaempresa.com.br" e o projeto Java fosse chamado de "meuprojeto", o nome do pacote de domínio reverso seria br.com.minhaempresa.meuprojeto, sendo que dentro desse pacote principal podemos ter diversos subpacotes, para melhor organização do código do projeto.

Isso ajuda a garantir que o nome do pacote seja exclusivo e evita conflitos de nome com outros pacotes em outros projetos. Além disso, o uso do nome de domínio reverso como parte do nome do pacote também ajuda a identificar facilmente o proprietário do projeto Java.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


“This”, traduzindo para o português (Isto/este/esta), é usado para fazer referência aos atributos da classe, especialmente em métodos que têm parâmetros com o mesmo nome do atributo da classe em que estamos trabalhando.

Para compreendermos essa ideia na prática, vamos ver um exemplo:

    public class Conta { 
        private double saldo;
        private int numero;
    
        public void deposita(double valor) {
            saldo = saldo + valor;
        }
    }

Repare que nesse primeiro exemplo, dentro da classe conta, nós temos os atributos saldo e numero, e em seguida o método deposita, que recebe como parâmetro um double valor. Nesse caso, não temos nenhum atributo com o mesmo nome do parâmetro e estamos dentro da classe, o que nos permite utilizar o atributo saldo a vontade, sem a necessidade do “this”.

Algo diferente ocorre quando temos um atributo da classe com o mesmo nome de um parâmetro de algum método dessa mesma classe:

    public class Lampada {
        private boolean ligada;
        private String modelo;
    
        public void acendeLampada(boolean ligada) {
           ligada = ligada;
        }
    }

Perceba que nesse exemplo, temos um atributo da classe chamado ligada, e o método acendeLampada que define um novo valor para esse atributo.

O método recebe como parâmetro um boolean que tem o mesmo nome do atributo da classe. É aí que está o problema! O que faríamos para saber quem é o atributo da classe e quem é o parâmetro do método?

Nessa situação vamos fazer o uso da palavra chave “this”:

    public class Lampada {
        private boolean ligada;
        private String modelo;
    
        public void acendeLampada(boolean ligada) {
           this.ligada = ligada;
        }
    }

Podemos concluir então que “this” se refere ao objeto atual e não ao parâmetro do método. É comum usarmos o this para eliminar essa confusão entre os atributos e parâmetros, sendo que ele não é uma exclusividade do Java, pois outras linguagens de programação orientadas a objetos também possuem esse recurso.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



Imagine que você esteja analisando o código de uma aplicação Java e encontra a seguinte classe:

    public class Conta {
        private int numero;
        private int agencia;
        private double saldo;
    
        public void deposita(double valor) {
            saldo += valor;
        }
    
        public void saca(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    
        public void setNumero(int numero) {
            this.numero = numero;
        }
    
        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }
    
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    
        public int getNumero() {
            return numero;
        }
    
        public int getAgencia() {
            return agencia;
        }
    
        public double getSaldo() {
            return saldo;
        }
    }

Levando em consideração o conceito de encapsulamento, qual seria o problema do código anterior?
R:O erro está nos setters que se tornaram público

Explicação:

O código da atividade está errado porque os métodos setSaldo, setNumero, e setAgencia são públicos, permitindo a alteração direta dos atributos privados da classe Conta. Isso viola o princípio do encapsulamento, que visa proteger os dados internos de uma classe de acesso e modificação não controlados. A alteração direta dos atributos pode levar a inconsistências e erros na aplicação, pois não há nenhuma validação ou lógica de negócio para garantir a integridade dos dados.

Para corrigir o código, você precisa:

Manter os atributos privados: Os atributos numero, agencia, e saldo devem permanecer como private.

Criar métodos setters com validação: Os métodos setSaldo, setNumero, e setAgencia devem ser mantidos, mas com a adição de lógica de validação para garantir que apenas valores válidos sejam atribuídos aos atributos. Por exemplo, o setSaldo deve verificar se o novo saldo, somado ao saldo atual, não resultará em um saldo negativo. O setNumero e setAgencia podem ter validações específicas para esses atributos (por exemplo, o número da conta não pode ser negativo ou zero). Se um valor inválido for passado, o método deve impedir a alteração ou lançar uma exceção.

Manter os métodos getters: Os métodos getSaldo, getNumero, e getAgencia devem permanecer como estão, pois eles permitem o acesso aos dados de forma controlada e segura.

Em resumo, o problema é o acesso direto e não controlado aos atributos. A solução é controlar esse acesso através de métodos setter que validam os novos valores antes de atualizá-los. Você precisa adicionar lógica de validação dentro dos métodos setter para garantir a integridade dos dados e respeitar o princípio do encapsulamento.

Criando lógica de validação:
Vamos criar a lógica de validação para cada setter.



setSaldo(double novoSaldo):
Este método deve verificar se adicionar novoSaldo ao saldo atual (this.saldo) resultará em um saldo não negativo.


        public void setSaldo(double novoSaldo) {
            if (this.saldo + novoSaldo >= 0) {
                this.saldo += novoSaldo;
            } else {
                // Aqui você pode escolher como lidar com um saldo negativo:
                // 1. Lançar uma exceção:
                throw new IllegalArgumentException("Saldo insuficiente para adicionar " + novoSaldo);
                // 2. Imprimir uma mensagem de erro:
                // System.out.println("Saldo insuficiente.");
                // 3. Ignorar a operação:  (Geralmente não recomendado)
                // Não fazer nada.
            }
        }


setNumero(int novoNumero):
Este método pode ter validações específicas para o número da conta. Por exemplo, pode-se verificar se o número é positivo e não está em uso. Como não temos informações sobre restrições para o número da conta, uma validação simples seria:

    public void setNumero(int novoNumero) {
        if (novoNumero > 0) {
            this.numero = novoNumero;
        } else {
            throw new IllegalArgumentException("Número da conta deve ser positivo.");
        }
    }


setAgencia(int novaAgencia):
Similar ao setNumero, pode-se adicionar validações para a agência. Novamente, sem informações adicionais, uma validação simples seria:


    public void setAgencia(int novaAgencia) {
        if (novaAgencia > 0) {
            this.agencia = novaAgencia;
        } else {
            throw new IllegalArgumentException("Número da agência deve ser positivo.");
        }
    }
Lembre-se que a melhor forma de lidar com um valor inválido (no caso, um saldo negativo) depende do contexto da sua aplicação. Lançar uma exceção (IllegalArgumentException) é geralmente a melhor prática, pois permite que o código que chama o setter trate o erro adequadamente. Imprimir uma mensagem de erro pode ser suficiente em alguns casos, mas pode dificultar o tratamento de erros em aplicações maiores. Ignorar a operação é geralmente a pior opção, pois pode levar a erros silenciosos e difíceis de depurar.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


Em Java, getters e setters são métodos usados para acessar e modificar os valores das variáveis privadas de uma classe. Isso segue o princípio de encapsulamento, que protege os dados da classe de acessos ou alterações indevidos.

Por que usar getters e setters?
Controle de acesso: Você pode decidir quem pode ler ou modificar os valores.
Validação: Pode incluir regras para aceitar ou rejeitar valores no setter.
Manutenção: Facilita a atualização do código no futuro sem mudar como ele é usado.
Estrutura básica:

    public class Pessoa {
    // Variável privada (não acessada diretamente)
    private String nome;
    
        // Getter (pega o valor da variável)
        public String getNome() {
            return nome;
        }
    
        // Setter (altera o valor da variável)
        public void setNome(String nome) {
            this.nome = nome; // `this` se refere ao atributo da classe
        }
    }
Exemplo prático:

    public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

            // Usando o setter para definir o valor
            pessoa.setNome("João");
    
            // Usando o getter para obter o valor
            System.out.println(pessoa.getNome()); // Saída: João
        }
    }
Vantagem de usar:
Se você precisar adicionar uma validação, pode alterar o setter sem modificar o resto do código:

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
            this.nome = nome;
    }
Com isso, getters e setters tornam seu código mais seguro, flexível e organizado.

A função de cada um é bem direta:

Getter
Função: Recuperar o valor de um atributo privado da classe.
Por que usar? Permite acesso controlado à leitura do valor, evitando acessos diretos às variáveis da classe.
Exemplo de função do getter:

        public String getNome() {
        return nome; 
        // Retorna o valor da variável `nome`
        }
Setter
Função: Alterar o valor de um atributo privado da classe.
Por que usar? Permite controlar ou validar o valor antes de atribuí-lo ao atributo.
Exemplo de função do setter:


    public void setNome(String nome) {
        this.nome = nome; // Define o valor da variável `nome`
    }
Resumo
Getter: Serve para ler o valor.
Setter: Serve para modificar o valor.
Ao usar ambos, você garante o encapsulamento e mantém o controle sobre como os atributos da classe são acessados e alterados.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Entendendo melhor a herança:

A herança é um conceito fundamental da orientação a objetos, sendo implementada em Java através da relação é um entre classes. Isso significa que uma classe pode herdar atributos e métodos de outra classe, tornando com isso o código mais reutilizável.

No Java, a herança é realizada através da palavra-chave extends. A classe que herda é chamada de subclasse, e a classe que é herdada é chamada de superclasse. A subclasse pode acessar todos os atributos e métodos públicos e protegidos da superclasse, além de poder sobrescrever os métodos da superclasse para criar comportamentos específicos.

Por exemplo:

    public class Conta {
    
    private String titular;
    private double saldo;
    
    public void sacar(double valor) {
    if (valor <= 0) {
    System.out.println("Valor deve ser maior do que zero!");
    } else if (saldo >= valor) {
    saldo -= valor;
    System.out.println("Saque realizado com sucesso. Saldo atual: " +saldo);
    } else {
    System.out.println("Saldo insuficiente.");
    }
    }
    
    public void depositar(double valor) {
    if (valor > 0) {
    saldo += valor;
    System.out.println("Depósito realizado com sucesso. Saldo atual: " +saldo);
    } else {
    System.out.println("Valor deve ser maior do que zero!");
    }
    }
    
    //getters e setters
    }
--------------------------------------------------------
    public class ContaPoupanca extends Conta {
    
    private double taxaDeJuros;
    
    public void calcularJuros() {
    double juros = this.getSaldo() * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
    }
    
    public void sacar(double valor) {
    double taxaSaque = 0.01;
    super.sacar(valor + taxaSaque);
    }
    
    //getters e setters
    }

No código anterior, a classe Conta é a superclasse e a classe ContaPoupanca é a subclasse. A classe ContaPoupanca herda os atributos e métodos da classe Conta, e adiciona um novo atributo taxaDeJuros e um novo método calcularJuros. Embora os atributos sejam herdados, como eles foram declarados como private na superclasse, não poderão ser acessados diretamente na subclasse, devendo então serem utlizados os métodos getters/setter, que são públicos.

Repare também no código anterior que a subclasse sobrescreveu o método sacar, para que seja descontada a taxa de saque, além de utilizar a palavra chave super para chamar o método da superclasse, evitando com isso duplicar um código já existente. Essa é a grande vantagem da herança: reaproveitamento de código com flexibilidade para sobrescrever comportamentos.

Herança múltipla
Em Java, é importante notar que a herança múltipla não é permitida. A herança múltipla ocorre quando uma subclasse herda de duas ou mais superclasses. Por exemplo:

    public class ContaPoupanca extends Conta, Pagamento {
    //codigo da classe omitido
    }
O código anterior não compila, pois o extends aceita apenas uma única classe, ou seja, uma classe pode ter apenas uma superclasse.

Entretanto, é possível criar uma hierarquia de classes utilizando herança, simulando com isso uma herança múltipla. Por exemplo:

    public class Conta {
    //codigo da classe omitido
    }
-------------------------------------------------------------------
    public class ContaCorrente extends Conta {
    //codigo da classe omitido
    }
--------------------------------------------------------------------
    public class ContaCorrentePessoaFisica extends ContaCorrente {
    //codigo da classe omitido
    }
    
No código anterior, a classe ContaCorrentePessoaFisica está herdando de ContaCorrente, que por sua vez herda da classe Conta, ou seja, indiretamente a classe ContaCorrentePessoaFisica vai herdar de Conta, pois sua superclasse herda dela.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Para saber mais: Anotações no Java:

As anotações, também conhecidas como annotations, são uma forma de adicionar configurações ao código Java de uma maneira bem simples. Elas são usadas para fornecer informações adicionais sobre o código, como o significado de uma classe, um método ou um atributo.

No Java, as anotações são definidas com o uso do símbolo "@" seguido do nome da anotação. Por exemplo, a anotação @Deprecated é usada para indicar que um método ou classe está obsoleto e não deve ser mais utilizado. Outra anotação muito útil é a @Override, conforme foi demonstrado no último vídeo, que indica que um método está sobrescrevendo o mesmo método definido na sua classe mãe.

Diversas especificações e frameworks Java, como Hibernate, Bean Validation e Spring, utilizam anotações. Por exemplo, no Bean Validation a anotação @NotNull é usada para validar que um atributo não seja nulo.

As anotações são muito úteis e comuns em aplicações Java, sendo importante que você esteja familiarizado com esse recurso, pois certamente o utilizará bastante em seus projetos.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: O modificador Protected

Ao usar herança no Java, temos a possibilidade de utilizar o modificador de acesso protected, que permite que os atributos de uma classe sejam acessados por outras classes do mesmo pacote e também por suas subclasses, independentemente do pacote em que se encontram.

O modificador protected é útil em situações em que uma classe precisa permitir que suas subclasses acessem diretamente seus atributos, sem a necessidade de restringir o acesso apenas pelos métodos getters e setters. Por exemplo, suponha que temos as seguintes classes em um projeto:

    public class Conta {
    
    private String titular;
    private double saldo;
    
    public void sacar(double valor) {
    //implementacao do metodo omitida
    }
    
    public void depositar(double valor) {
    //implementacao do metodo omitida
    }
    
    //getters e setters
    }
-----------------------------------------------------
    public class ContaPoupanca extends Conta {
    
    private double taxaDeJuros;
    
    public void calcularJuros() {
    double juros = this.getSaldo() * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
    }
    
    //getters e setters
    }

No código anterior, repare que no método calcularJuros, da classe ContaPoupanca, o atributo saldo não é acessado diretamente, pois ele foi declarado como private na classe Conta, devendo então seu acesso ser feito pelo método getSaldo().

Podemos declarar o atributo saldo como protected, para evitar essa situação e liberar o acesso direto a ele pelas classes que herdam da classe Conta:

public class Conta {

private String titular;
protected double saldo;

    public void sacar(double valor) {
    //implementacao do metodo omitida
    }
    
    public void depositar(double valor) {
    //implementacao do metodo omitida
    }
    
    //getters e setters
    }
----------------------------------------------------

    public class ContaPoupanca extends Conta {
    
    private double taxaDeJuros;
    
    public void calcularJuros() {
    double juros = this.saldo * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
    }
    
    //getters e setters
    }

Repare que agora o atributo saldo foi acessado diretamente pela classe ContaPoupanca.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Entendendo melhor interfaces

Em Java, interfaces são uma forma de definir um contrato que as classes devem seguir, sendo que ele define quais métodos devem ser implementados pelas classes que o implementarem. Interfaces permitem que diferentes classes possam ser tratadas de maneira padronizada, via polimorfismo, tornando assim o código fácil de estender com novos comportamentos.

No Java, uma interface é definida usando a palavra-chave interface. Por exemplo:

    public interface Tributavel {
    
        double getValorImposto();
    
    }
No exemplo de código anterior, estamos definindo uma interface chamada Tributavel, sendo que ela possui apenas um método chamado getValorImposto() que retorna um valor do tipo double. Essa interface pode ser implementada por qualquer classe que queira ser tributável no projeto.

Para implementar uma interface, usamos a palavra-chave implements após a definição da classe. A classe que implementa a interface deve implementar todos os métodos definidos na interface. Por exemplo:

    public class Produto implements Tributavel {
    
        private String nome;
        private double valor;
    
        @Override
        public double getValorImposto() {
            return this.valor * 0.1;
        }
    
        //getters e setters
    }
No exemplo anterior, estamos criando uma classe chamada Produto que implementa a interface Tributavel. Essa classe implementa o método getValorImposto(), que está definido na interface Tributavel, com uma lógica de que o imposto do produto é igual a 10% do seu valor.

Também poderíamos ter uma classe de serviços, conforme abaixo:

    public class Servico implements Tributavel {
    
        private String descricao;
        private double valor;
        private double aliquotaISS;
    
        @Override
        public double getValorImposto() {
            return this.valor * this.aliquotaISS / 100;
        }
    
        //getters e setters
    }
No exemplo acima, estamos criando uma classe chamada Servico que implementa a interface Tributavel. Essa classe implementa o método getValorImposto(), que está definido na interface Tributavel, com uma lógica de que o imposto do serviço é igual ao seu valor vezes a alíquota de ISS definida e dividido por 100. Então para um serviço de R$ 1.200,00 e alíquota de 5%, o método retornará: 1200 * 5 / 100, cujo valor do imposto fica R$ 60,00.

Utilização de interfaces
Interfaces podem ser utilizadas para definir comportamentos que podem ser aplicados a várias classes diferentes, tornando assim o código mais modular e fácil de manter.

Por exemplo, suponha que temos um sistema de vendas que precisa calcular o imposto de diferentes tipos de produtos. Podemos criar a interface Tributavel, para definir o comportamento de calcular imposto, e criar várias classes diferentes que implementam essa interface para calcular o imposto de diferentes produtos. Por exemplo:

    public class CalculadoraImposto {

        private double totalImposto = 0;
    
        public void calcularImposto(Tributavel item) {
            this.totalImposto += item.getValorImposto();
        }
    
        public double getTotalImposto() {
          return this.totalImposto;
        }

    }
Nesse exemplo, estamos criando uma classe chamada CalculadoraImposto, que tem um atributo privado chamado totalImposto, que armazena o valor total dos impostos.

Repare que o método calcularImposto recebe um parâmetro do tipo Tributavel. Ao declarar uma variável com o tipo de uma interface, como é feito nesse método, podemos atribuir a essa variável qualquer objeto que implemente essa interface, ou seja, tanto um objeto do tipo Servico quanto Produto. Para ambos os casos, a CalculadoraImposto irá chamar o método implementado na classe específica. Ou seja, para um produto, irá chamar o método getTotalImposto implementado na classe Produto. E para um serviço, irá chamar o método getTotalImposto implementado na classe Servico.

Isso é muito útil quando queremos tratar vários objetos de classes diferentes de forma semelhante, permitindo que diferentes classes possam ser tratadas de maneira padronizada, facilitando a manutenção e extensão do código. Esse é mais um exemplo de aplicação do polimorfismo em Java, mas agora com a utilização de interfaces.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Declarando variáveis com var:

A partir da versão 10 do Java, foi adicionada uma nova funcionalidade para a declaração de variáveis chamada var. Essa nova palavra-chave permite que o compilador infira automaticamente o tipo da variável com base no valor atribuído a ela. Isso pode tornar o código mais limpo e legível, além de reduzir a digitação de código redundante.

Sintaxe básica
A sintaxe básica para declarar uma variável com var é a seguinte:

    var nomeDaVariavel = valorInicial;

Onde nomeDaVariavel é o nome que você quer dar à variável e valorInicial é o valor que você quer atribuir a ela. O tipo da variável será inferido automaticamente pelo compilador com base no valor atribuído.

Exemplo:

    var numero = 10;

Nesse exemplo, a variável numero será inferida como sendo do tipo int, já que o valor atribuído é um número inteiro.

Limitações
A declaração de variáveis com var possui algumas limitações:

O tipo da variável deve ser inferido automaticamente pelo compilador. Isso significa que não é possível utilizar var em variáveis cujo tipo não possa ser inferido automaticamente.

Não é possível usar var em variáveis sem valor inicial. É necessário atribuir um valor à variável na mesma linha em que ela é declarada.

A declaração de variáveis com var é uma funcionalidade relativamente nova no Java, mas que pode trazer diversos benefícios para o código, como a redução de digitação e melhor legibilidade do código. No entanto, é importante lembrar que existem limitações e que nem sempre é possível utilizar esse recurso.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Arrays no Java

Em Java, arrays são estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo. Eles são muito utilizados para manipulação de dados em projetos de programação.

Para declarar um array em Java, é preciso definir seu tipo e tamanho. Por exemplo, para criar um array de inteiros com tamanho 5, podemos escrever o seguinte código:

    int[] numeros = new int[5];

Aqui, estamos declarando um array chamado "numeros" do tipo "int" e com tamanho 5. É importante lembrar que o índice dos elementos de um array começa em 0 e vai até o tamanho do array menos 1.

Após declarar um array, podemos inicializá-lo com valores. Por exemplo, podemos preencher o array "numeros" com os números de 1 a 5 da seguinte forma:

    for (int i = 0; i < numeros.length; i++) {
    numeros[i] = i + 1;
    }

Aqui, estamos percorrendo o array "numeros" utilizando um loop for e preenchendo cada posição com seu respectivo índice mais 1.

Também é possível criar arrays de objetos e não apenas de tipos primitivos. Por exemplo:

    Filme[] filmes = new Filme[2];
    
    Filme filme1 = new Filme("Avatar", 2009);
    Filme filme2 = new Filme("Dogville", 2003);

    filmes[0] = filme1;
    filmes[1] = filme2;

Embora os arrays sejam úteis, eles possuem algumas limitações que podem causar problemas em projetos. Alguns desses problemas incluem:

Tamanho fixo: o tamanho de um array é fixo e não pode ser alterado após a sua criação. Isso pode ser problemático em situações em que o tamanho dos dados a serem armazenados é desconhecido ou variável.

Ausência de métodos: arrays não possuem métodos que permitam a inserção, remoção ou pesquisa de elementos de forma eficiente. Isso pode levar a soluções de código complicadas e ineficientes para tarefas simples.

Justamente por conta desses problemas e dificuldades é que não devemos utilizar arrays para representar uma coleção de elementos, mas sim alguma classe do Java, como a ArrayList, que encapsula e abstrai um array, facilitando a sua utilização via métodos e deixando o código do projeto mais simples de entender e evoluir.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Construtor padrão

Em Java, um construtor é um método especial usado para criar e inicializar um objeto recém-criado. Quando uma classe é definida, ela pode ter um ou mais construtores, sendo que se nenhum construtor for definido explicitamente, o Java criará um construtor default (padrão) automaticamente.

Um construtor default é um construtor que não possui parâmetros e não executa nenhuma instrução. Ele é chamado sempre que um objeto da classe é criado sem argumentos. Por exemplo:

    public class Pessoa {
    
        private String nome;
        private String email;
    
        public Pessoa() {
        }
    
        //metodos getters/setters
    }

No exemplo de código anterior, a classe Pessoa possui um construtor default, que será exatamente o mesmo construtor que o Java criará automaticamente, caso nenhum construtor tivesse sido definido na classe.

Se uma classe define explicitamente um ou mais construtores, mas não define um construtor sem parâmetros, então não há construtor default. Nesse caso, se um objeto é criado sem argumentos, um erro de compilação será gerado.

É importante ressaltar que mesmo que um construtor default possa ser útil em alguns casos, é sempre recomendável definir explicitamente os construtores da classe, especialmente se a classe tiver atributos que precisam ser inicializados com valores específicos ou obrigatórios. Isso também torna o código mais claro e fácil de entender.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Outras formas de percorrer a lista:

A forma mais comum de percorrer uma lista no Java é utilizando o laço foreach tradicional, também conhecido como for-each. Esse laço permite que se percorra todos os elementos de uma lista, sem a necessidade de se preocupar com índices ou o tamanho dela, tornando o código mais simples e legível. Por exemplo, suponha que tenhamos uma lista de nomes de pessoas e que desejamos imprimi-los na tela:

      ArrayList<String> nomes = new ArrayList<>();
      nomes.add("Jacqueline");
      nomes.add("Paulo");
      nomes.add("Suellen");
      nomes.add("Emily");
      
      for (String nome : nomes) {
      System.out.println(nome);
    }

Esse loop for percorre todos os elementos da lista, atribuindo cada um deles à variável nome, que é usada para imprimir o valor na tela. Esse tipo de loop é muito útil em situações onde não precisamos realizar nenhuma operação complexa sobre os elementos da lista.

No entanto, a partir do Java 8, foi adicionado na interface List, a qual a classe ArrayList implementa, um novo método chamado forEach, que possibilita a iteração sobre os elementos da lista de forma mais concisa e elegante. Por exemplo, o exemplo anterior pode ser reescrito utilizando o método forEach da seguinte forma:

    nomes.forEach(nome -> System.out.println(nome));

Nesse caso, o método forEach é chamado sobre a lista nomes e recebe como parâmetro uma expressão lambda que realiza a impressão do valor na tela. A expressão lambda nome -> System.out.println(nome) é uma forma compacta de definir uma função que recebe um parâmetro nome e realiza a operação de impressão.

É possível simplificar ainda mais o exemplo de código anterior, utilizando o recurso conhecido como Method Reference, que nada mais é do que uma forma reduzida de uma expressão lambda:

    nomes.forEach(System.out::println);

No código anterior, o símbolo :: é a sintaxe do Method Reference, que no exemplo mostrado faz uma referência para o método println.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Referências são ponteiros para objetos em memória, ou seja, elas apontam para um objeto e permitem que você trabalhe com ele. No Java, toda variável de objeto é na verdade uma referência a esse objeto que foi alocado na memória.

Quando você instancia um objeto, está, na realidade, criando um novo bloco de memória que armazena as informações desse objeto. A maneira de chegar a esse bloco de memória, para armazenar e ler informações dele, ocorre por meio de uma referência, que é representada por uma variável. Por exemplo:

Filme filme1 = new Filme("Avatar", 2009);Copiar código
No exemplo de código anterior, criamos um novo objeto da classe Filme e armazenamos uma referência a ele na variável filme1.

É importante lembrar que as referências a objetos em Java não são o próprio objeto em si, pois elas apenas apontam para o objeto. Quando você passa uma referência a um método ou atribui uma referência a outra variável, está apenas copiando o valor da referência e não do objeto em si. Por exemplo:

    Filme filme1 = new Filme("Avatar", 2009);
    Filme filme2 = new Filme("The Matrix", 1999);
    Filme filme3 = filme1;

No exemplo de código anterior, foram criados apenas dois objetos em memória. A variável filme3 é apenas uma referência que aponta para o mesmo objeto sendo referenciado pela variável filme1.

Uma questão importante relacionada com referências a objetos em Java é a questão da igualdade e identidade de objetos. Quando você compara duas referências de objeto usando o operador de igualdade ==, está comparando as referências em si, não os objetos que elas apontam. Por exemplo:

    Filme filme1 = new Filme("Avatar", 2009);
    Filme filme2 = new Filme("Avatar", 2009);
    
    if (filme1 == filme2) {
    System.out.println("Iguais");
    } else {
    System.out.println("Diferentes");
    }

No exemplo de código anterior, a saída no console será: "Diferentes". Embora os dois objetos tenham as mesmas informações na memória, a comparação com == verifica se as referências são iguais, ou seja, se apontam para o mesmo objeto na memória.

---------------------------------------------------------------
Checar atividade "Trabalhando com listas e coleções de dados"
---------------------------------------------------------------

Além da interface Comparable, o Java possui uma outra interface chamada Comparator, que nos fornece outra alternativa para ordenação de coleções.

Você pode entender melhor a diferença entre elas, com exemplos em códigos, lendo o artigo Ordenando coleções com Comparable e Comparator.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Interfaces Comparable e Comparator:

Além da interface Comparable, o Java possui uma outra interface chamada Comparator, que nos fornece outra alternativa para ordenação de coleções.

Você pode entender melhor a diferença entre elas, com exemplos em códigos, lendo o artigo Ordenando coleções com Comparable e Comparator. - https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Outras classes de listas no Java:

O Java oferece diferentes classes para representar uma lista de objetos. Essas classes são úteis em diferentes cenários, dependendo das necessidades de cada aplicação.

As classes mais comuns para representar uma lista no Java são:

ArrayList
A principal característica do ArrayList é que ele é baseado em um array dinâmico. Ele armazena os elementos em uma matriz interna e, conforme novos elementos são adicionados, o tamanho da matriz é automaticamente ajustado para acomodar o novo elemento. Da mesma forma, quando um elemento é removido, o tamanho do array é ajustado para evitar o desperdício de espaço. O ArrayList é amplamente utilizado devido à sua facilidade de uso e eficiência em termos de desempenho.

LinkedList
A classe LinkedList fornece uma lista encadeada de elementos. Diferentemente do ArrayList, que é baseado em um array, o LinkedList é baseado em uma lista encadeada, o que significa que cada elemento da lista é um objeto que contém uma referência para o próximo elemento. Isso permite que os elementos sejam adicionados e removidos de maneira eficiente em qualquer posição da lista, mas pode tornar a pesquisa de um elemento específico menos eficiente.

O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição da lista é frequente e quando não é necessário acessar os elementos de forma aleatória.

Vector
A classe Vector é semelhante ao ArrayList, mas é sincronizada, o que significa que é segura para uso em threads concorrentes. No entanto, a sincronização adiciona uma sobrecarga de desempenho, então o Vector pode ser mais lento que o ArrayList em algumas situações.

Stack
A classe Stack implementa uma pilha, que é uma coleção ordenada de elementos onde a inserção e remoção de elementos ocorrem sempre no mesmo extremo da lista. Os elementos são adicionados e removidos em uma ordem conhecida como "last-in, first-out" (LIFO), ou seja, o último elemento adicionado é o primeiro a ser removido. A classe Stack é usada com frequência em algoritmos de processamento de texto, bem como em outras situações em que a LIFO é a maneira natural de organizar os dados.

Cada uma dessas classes tem seus próprios pontos fortes e fracos, e a escolha de qual usar dependerá das necessidades específicas da aplicação. Para um melhor entendimento sobre estruturas de dados, recomendamos a leitura dos seguintes artigos:

Estruturas de dados: uma introdução - https://www.alura.com.br/artigos/estruturas-de-dados-introducao
Estrutura de Dados: computação na prática com Java - https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Para saber mais: Map e HashMap:

Uma das características mais importantes do Java é sua vasta biblioteca padrão, que oferece muitas classes e interfaces úteis para os desenvolvedores. Entre elas, estão o Map e o HashMap, que são ferramentas essenciais para associação de chaves e valores em muitas aplicações Java.

Map
O Map é uma interface que permite que os desenvolvedores associem chaves a valores. É uma estrutura de dados útil para muitas aplicações Java, especialmente aquelas que envolvem a manipulação de grandes quantidades de dados, portanto, é comum usá-lo para realizar buscas, atualização e recuperação de elementos por chaves

Ele é implementado por diversas classes, sendo a mais comum delas o HashMap.

HashMap
O HashMap é uma classe que implementa a interface Map usando uma tabela hash para armazenar os pares chave-valor. Ele é conhecido por sua eficiência em termos de tempo de execução. Essa classe tem uma complexidade de tempo O(1) - constante - para inserção, recuperação e remoção de elementos. Isso significa que o desempenho do HashMap não depende do tamanho da coleção de dados!

No entanto, é importante lembrar que o HashMap não mantém a ordem de inserção dos elementos e não garante a ordem dos elementos na saída. Isso ocorre porque a ordem dos elementos depende da função de hash usada para mapear as chaves para índices na tabela hash. Além disso, o desempenho do HashMap pode ser afetado se houver muitas colisões de hash entre as chaves.

Por exemplo:

    import java.util.HashMap;
    import java.util.Map;
    
    public class ExemploHashMap {
    
        public static void main(String[] args) {
            //Criando um objeto da classe HashMap que implementa a interface Map
            Map<String, Integer> usandoHashMap = new HashMap<>();
    
            // Adicionando pares chave-valor
            usandoHashMap.put("Gatos", 1);
            usandoHashMap.put("Cachorros", 2);
            usandoHashMap.put("Roedores", 3);
    
            // Acessando um valor através de uma chave
            int valor = usandoHashMap.get("Cachorros");
            System.out.println("Valor da chave Cachorros: " + valor);
    
            // Removendo um par chave-valor
            usandoHashMap.remove("Gatos");
    
            // Iterando sobre as chaves
            for (String chave : usandoHashMap.keySet()) {
                System.out.println("Chave: " + chave);
                System.out.println("Valor: " + usandoHashMap.get(chave));
            }
        }
    }

O resultado será:

    Valor da chave Cachorros: 2
    Chave: Cachorros
    Valor: 2
    Chave: Roedores
    Valor: 3