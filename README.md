                          JAVA: Aplicando a Orientação a Objetos
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
#######################################################################################################################################################################################

Para saber mais: Classes e Objetos

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

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
#######################################################################################################################################################################################

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
    Copiar código
    public class Principal {
        
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
    Copiar código
    package br.com.alura.testes;
    
    public class Principal {
        
        public static void main(String[] args) {
            Conta c1 = new Conta();
            c1.saldo = 300;
            c1.sacar(100);
        }
    
    }

No código anterior, a classe Conta está em um pacote e a classe Principal em outro pacote distinto. A classe Conta pode ser instanciada dentro da classe Principal, pois ela possui o modificador de acesso public, entretanto, o atributo saldo e o método sacar tem o modificador default e, portanto, não podem ser acessados de dentro da classe Principal, o que vai causar um erro de compilação no código anterior.

Private
O modificador de acesso private é o mais restritivo de todos. Uma classe, atributo ou método declarado como private só pode ser acessado dentro da própria classe. Ou seja, ele possui visibilidade restrita e não pode ser utilizado por outras classes. Por exemplo:

    public class Conta {
  
        private double saldo;
      
        private void sacar(double valor) {
          // lógica de saque...
        }
    }
   
    public class Principal {
    
        public static void main(String[] args) {
            Conta c1 = new Conta();
            c1.saldo = 300;
            c1.sacar(100);
        }
    
    }
No código anterior, vai ocorrer erro de compilação na classe Principal, pois o atributo saldo e o método sacar foram declarados como private, não podendo com isso serem acessados de fora da própria classe Conta.

Existe ainda um último modificador de acesso, que é o protected, mas falaremos dele mais adiante no curso, após ser apresentado o conceito de herança de classes.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
#######################################################################################################################################################################################

Para saber mais: a palavra chave "this"

A documentação do Java, conhecida como JavaDoc, é uma referência completa para todas as classes, interfaces e métodos disponíveis na plataforma Java. Ela está disponível online e pode ser acessada neste site da Oracle. (https://docs.oracle.com/en/java/javase/17/docs/api/index.html)

O JavaDoc é organizado em pacotes, que contêm diversas classes e interfaces relacionadas a alguma funcionalidade específica da linguagem. Cada classe e interface é documentada individualmente, com informações detalhadas sobre sua funcionalidade, uso e exemplos de código.

Essa documentação deve ser uma referência essencial para qualquer pessoa que queira programar na linguagem Java, pois fornece informações detalhadas sobre como usar as classes e interfaces fornecidas pela linguagem. Tendo acesso à documentação, podemos também descobrir novas classes e métodos que podem ser úteis em nossos projetos, para resolver problemas comuns e recorrentes do dia a dia.

Não deixe de entrar no site do JavaDoc e explorar os pacotes e classes que a linguagem nos disponibiliza, pois assim você já vai se familiarizar em como descobrir novos recursos da linguagem, além de entender melhor o funcionamento das principais classes do Java.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
#######################################################################################################################################################################################

Para saber mais: Padrão de nomes de pacotes

Em Java, pacotes são usados para agrupar classes que estão relacionadas a alguma funcionalidade. Eles ajudam a organizar o código, facilitando o seu gerenciamento e evitando que centenas de classes distintas fiquem todas misturadas num único diretório.

A organização de classes dentro de um pacote também pode ser feita usando subpacotes ou colocando as classes diretamente dentro do pacote, dependendo da complexidade do projeto. Além disso, é importante seguir a convenção de nomeação de pacotes para garantir que os pacotes sejam facilmente identificados.

Em relação à nomenclatura de pacotes, outro aspecto importante é o uso do nome de domínio reverso da empresa ou organização como parte do nome do pacote. Por exemplo, se o nome de domínio da empresa fosse "minhaempresa.com.br" e o projeto Java fosse chamado de "meuprojeto", o nome do pacote de domínio reverso seria br.com.minhaempresa.meuprojeto, sendo que dentro desse pacote principal podemos ter diversos subpacotes, para melhor organização do código do projeto.

Isso ajuda a garantir que o nome do pacote seja exclusivo e evita conflitos de nome com outros pacotes em outros projetos. Além disso, o uso do nome de domínio reverso como parte do nome do pacote também ajuda a identificar facilmente o proprietário do projeto Java.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
#######################################################################################################################################################################################

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

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
#######################################################################################################################################################################################


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

