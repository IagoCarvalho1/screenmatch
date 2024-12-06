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
