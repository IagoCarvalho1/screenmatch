
                                          ##########################################
                                          ## JAVA: Criando sua primeira aplicação ##
                                          ##########################################

# PARA SABER MAIS: CONVERÇÃO DE CÓDIGO:

No Java temos diversos tipos de operadores para lidar com os dados que estamos trabalhando em nossa aplicação. Vou detalhar melhor alguns deles aqui, que já mencionei nos vídeos:

Operadores de atribuição:

Os operadores de atribuição são usados para atribuir um valor a uma variável. O operador de atribuição básico é o "=" (sinal de igual). Por exemplo: int valor = 5; //Atribui o valor 5 à variável valor

Existem também operadores de atribuição combinados, que são uma forma abreviada de atribuição. Por exemplo, o operador "+=" adiciona um valor à variável existente. Assim: int valor = 10; valor += 15; //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor

Operadores aritméticos:

Os operadores aritméticos são usados para realizar operações matemáticas básicas. São eles:

    "+" (adição)
    "-" (subtração)
    "*" (multiplicação)
    "/" (divisão)
    "%" (resto da divisão)
        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

Operadores relacionais:

Os operadores relacionais são usados para comparar valores. Eles retornam um valor booleano (verdadeiro ou falso). Trabalharemos melhor com eles quando estivermos na aula de condicionais, onde vamos modificar o fluxo da aplicação dada alguma condição. São eles:

    "==" (igual a)
    "!=" (diferente de)
    ">" (maior que)
    ">=" (maior ou igual a)
    "<" (menor que)
    "<=" (menor ou igual a)
        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c
    
        boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

Operadores lógicos:

Esses operadores são usados quando queremos verificar duas ou mais condições e/ou expressões na aplicação. Eles fazem a comparação de valores booleanos e retornam também um resultado booleano.

São três operadores: AND (&&), OR (||) e NOT (!).

O operador AND (&&), que traduzindo para o português seria o E, é usado para verificar se duas condições são verdadeiras. Se ambas as condições forem verdadeiras, o resultado será verdadeiro. Caso contrário, o resultado será falso. Aqui está um exemplo: boolean a = true; boolean b = false; if (a && b) { // Este código não será executado, já que a é verdadeiro e b é falso. }

O operador OR (||), que traduzindo para o português seria o OU, é usado para verificar se pelo menos uma das condições é verdadeira. Se pelo menos uma das condições for verdadeira, o resultado será verdadeiro. Caso contrário, o resultado será falso. Aqui está um exemplo:

    boolean a = true;
    boolean b = false;
        if (a || b) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
        }
        
O operador NOT (!) é usado para negar uma condição. Se a condição for verdadeira, o resultado será falso. Se a condição for falsa, o resultado será verdadeiro. Aqui está um exemplo:

    boolean a = true;
        if (!a) {
       // Este código não será executado, já que a é verdadeiro.
    }
    
Operadores de incremento:

Além dos operadores citados anteriormente, o operador de incremento é usado para aumentar o valor de uma variável em 1. Existem dois tipos de operadores de incremento: o operador de pré-incremento (++variavel) e o operador de pós-incremento (variavel++).

O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável em uma expressão. Aqui está um exemplo:

    int num = 5;
    int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
    System.out.println(num); // imprime 6
    System.out.println(resultado); // imprime 6
    
Já o operador de pós-incremento (variavel++) aumenta o valor da variável em 1 depois de usar a variável em uma expressão. Aqui está um exemplo:

    int num = 5;
    int resultado = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
    System.out.println(num); // imprime 6
    System.out.println(resultado); // imprime 5

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# RESUMO LURI

Claro! Nesta aula, aprendemos sobre os diferentes tipos de operadores em Java, que são fundamentais para manipular dados em nossas aplicações. Aqui está um resumo dos principais operadores abordados:

- Operadores de Atribuição: Usados para atribuir valores a variáveis. O operador básico é o "=", e existem operadores combinados como "+=" que facilitam a atribuição.

- Operadores Aritméticos: Realizam operações matemáticas básicas, como adição (+), subtração (-), multiplicação (*), divisão (/) e resto da divisão (%).

- Operadores Relacionais: Comparam valores e retornam um resultado booleano (verdadeiro ou falso). Exemplos incluem "==" (igual a), "!=" (diferente de), ">" (maior que), entre - outros.

- Operadores Lógicos: Usados para verificar condições. Incluem AND (&&), OR (||) e NOT (!), que ajudam a combinar ou inverter condições booleanas.

- Operadores de Incremento: Aumentam o valor de uma variável em 1, podendo ser pré-incremento (++variavel) ou pós-incremento (variavel++).

- Esses operadores são essenciais para a construção de lógica em nossas aplicações Java. Se precisar de mais detalhes sobre algum operador específico, estou aqui para ajudar!
------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: CONVENÇÃO DE CÓDIGO:

A convenção de código do Java é um conjunto de regras recomendadas para escrever código Java que é fácil de ler, entender e manter. Essas regras foram definidas pela Oracle, a empresa que mantém a linguagem Java, e são amplamente seguidas pela comunidade de desenvolvedores Java.

Aqui estão algumas das principais convenções de código do Java:

Nomes de classes devem começar com letra maiúscula e usar a convenção PascalCase (também conhecida como Upper CamelCase).

Exemplo: MinhaClasse. Nomes de métodos devem começar com letra minúscula e usar a convenção camelCase.

Exemplo: meuMetodo(). Nomes de constantes devem ser totalmente em letras maiúsculas, separadas por underline.

Exemplo: MINHA_CONSTANTE. Nomes de variáveis devem começar com letra minúscula e usar a convenção camelCase.

Exemplo: minhaVariavel. Todas as linhas de código devem ter no máximo 80 caracteres de largura para facilitar a leitura.

Recomenda-se usar espaços em branco para separar operadores, palavras-chave e elementos de controle de fluxo.

Exemplo: if (condicao) {. Use comentários para documentar seu código, explicando o que ele faz e por que ele faz isso. Comentários devem ser claros e concisos.

Esse ponto anterior, referente aos comentários, é polêmico, pois muitas pessoas desenvolvedoras consideram que um bom código deve ser autoexplicativo. Se você utiliza nomes intuitivos e descritivos para suas variáveis e métodos, fica mais claro de entender o que está acontecendo no código, dispensando a necessidade de uso de comentários.

Essas são apenas algumas das convenções de código mais comuns no Java. Seguir essas regras pode tornar seu código mais fácil de ler e entender, o que pode economizar tempo e esforço no longo prazo.

É importante lembrar que as convenções de código são apenas recomendações, e não regras obrigatórias. No entanto, seguir essas convenções pode ajudar a criar um padrão consistente em todo o seu código Java e também torná-lo mais fácil de compartilhar e colaborar com outros desenvolvedores.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: TIPOS PRIMTIVOS:

Em Java, assim como na maioria das linguagens de programação, existem os tipos primitivos, que são os tipos de dados mais básicos e fundamentais da linguagem. Eles são utilizados para representar valores simples e são definidos pela própria linguagem.

Java possui oito tipos primitivos diferentes: boolean, byte, char, short, int, long, float e double. Cada um desses tipos possui suas próprias características e faixa de valores permitidos, conforme será descrito a seguir.

boolean O tipo boolean é utilizado para representar valores lógicos, podendo assumir apenas dois valores: true ou false. É utilizado em expressões condicionais, loops e outros casos onde se deseja avaliar se uma determinada condição é verdadeira ou falsa.

byte O tipo byte é utilizado para representar valores numéricos inteiros de 8 bits. Ele possui uma faixa de valores de -128 a 127.

char O tipo char é utilizado para representar caracteres individuais. Ele pode armazenar qualquer caractere Unicode e é representado por aspas simples ('').

short O tipo short é utilizado para representar valores numéricos inteiros de 16 bits. Ele possui uma faixa de valores de -32.768 a 32.767.

int O tipo int é utilizado para representar valores numéricos inteiros de 32 bits. É um dos tipos de dados mais utilizados para representar números inteiros em Java e possui uma faixa de valores de -2.147.483.648 a 2.147.483.647.

long O tipo long é utilizado para representar valores numéricos inteiros de 64 bits. Ele é utilizado para representar valores inteiros muito grandes e possui uma faixa de valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.

float O tipo float é utilizado para representar valores numéricos de ponto flutuante, ou seja, valores com casas decimais, sendo que ocupa 32 bits de memória. Ele pode representar números decimais com até sete dígitos e tem uma precisão limitada, o que significa que ele pode arredondar os números se eles forem muito grandes ou muito pequenos.

double O tipo double é similar o float, entretanto ele ocupa 64 bits de memória e pode representar números decimais com até 15 dígitos.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: COMENTÁRIOS NO CÓDIGO FONTE:

Ao escrever código em Java, é importante que o seu código seja legível e compreensível para outras pessoas, além de você mesmo no futuro. Uma das maneiras de fazer isso é por meio do uso de comentários de código, pois eles ajudam a explicar o que o seu código está fazendo e por que ele foi escrito daquela maneira.

Como funcionam os comentários em Java? O compilador Java ignora todos os trechos de comentários de código, então eles não afetam o funcionamento do seu programa. Existem duas principais formas de se escrever comentários em Java:

Comentários de linha única: São comentários que aparecem em uma única linha e começam com duas barras "//". O compilador Java ignora todo o texto que aparece após as duas barras até o final da linha.

Exemplo:

    // Esta é uma linha de comentário que será ignorada pelo compilador
Comentários de várias linhas: Esses comentários podem abranger várias linhas e são delimitados por "/" e "/". O compilador Java ignora todo o texto que aparece entre esses dois símbolos.

Exemplo:

    /* Este é um exemplo de comentário
    de várias linhas em Java
    que será ignorado pelo compilador */
Comentários são importantes? Os comentários são importantes porque ajudam a tornar o código mais legível e compreensível para outras pessoas que vão precisar ler e dar manutenção no código. Isso é especialmente importante quando várias pessoas trabalham no mesmo projeto. Comentários claros e concisos ajudam a explicar o que o código está fazendo, por que ele foi escrito daquela maneira e como ele funciona.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: STRING E TEXT BLOCK 

Em Java, a classe String é uma das mais importantes e utilizadas. Ela é responsável por representar uma sequência de caracteres, ou seja, um texto.

Criação de Strings Para criar uma String em Java, basta utilizar aspas duplas para delimitar o texto. Por exemplo:

    String nome = "Alura";
    
Nesse exemplo, a variável nome recebe uma String com o texto "Alura". É possível concatenar duas ou mais Strings utilizando o operador +, por exemplo:

    String saudacao = "Olá, ";
    String nome = "Alura";
    String mensagem = saudacao + nome + "!";
    
Nesse caso, a variável mensagem receberá a String "Olá, Alura!".

Comparação de Strings Em Java, é possível comparar duas Strings utilizando o operador ==. Porém, esse operador verifica apenas se as duas variáveis apontam para o mesmo objeto na memória, e não se o conteúdo das Strings é igual. Para comparar o conteúdo de duas Strings, é necessário utilizar o método equals(). Por exemplo:

    String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
        System.out.println("Senha incorreta.");
    }
    
Nesse caso, o método equals() é utilizado para comparar o conteúdo da variável senha com a String "12345". Se as duas Strings forem iguais, a mensagem "Acesso autorizado!" será impressa, caso contrário, a mensagem "Senha incorreta." será impressa.

Mais adiante trabalharemos também com o método equalsIgnoreCase(), que é usado para que a comparação de Strings desconsidere as letras maiúsculas e minúsculas. Utilizando apenas o equals, as String “alura” e “Alura” seriam consideradas diferentes.

Text Block Introduzido na versão 15 do Java, o Text Block é uma nova forma de representar Strings que facilitam a escrita de textos com múltiplas linhas. Em vez de utilizar aspas duplas para delimitar o texto e inserir quebras de linha manualmente, ou utilizar concatenações, é possível utilizar uma sintaxe mais simples que permite inserir o texto exatamente como ele é.

Sintaxe do Text Block Para criar um Text Block em Java, basta utilizar três aspas duplas para delimitar o texto, seguidas de uma quebra de linha. Por exemplo:

    String mensagem = """
                      Olá, mundo!
                      Este é um Text Block.
                      Ele permite escrever textos com múltiplas linhas
                      sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                      """;
Nesse exemplo, a variável mensagem recebe um Text Block com o texto "Olá, mundo! Este é um Text Block. Ele permite escrever textos com múltiplas linhas sem precisar usar caracteres de escape ou quebras de linha manualmente!".

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: FORMATAÇÃO DE TEXTO: 

Em Java, é possível formatar textos e números de diversas maneiras. Isso pode ser útil em diversas situações, como ao exibir valores para o usuário de uma maneira mais legível.

Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String. Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor de ponto flutuante. Vamos ver um exemplo:

    String nome = "Maria";
    int idade = 30;
    double valor = 55.9999;
    System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
    
Nesse exemplo, os valores das variáveis nome, idade e valor são passados como parâmetros para o método String.format, substituindo os placeholders %s, %d e %.2f, respectivamente. O resultado impresso será "Meu nome é Maria, eu tenho 30 anos e hoje gastei 55,99 reais". Perceba também que o placeholder %.2f indica que o valor deve ser formatado com duas casas decimais.

Esse exemplo do que foi feito para o String.format também pode ser usado com Text Block, onde usa-se o método que citei em aula, o formatted, para informar as variáveis que deverão ser utilizadas no lugar dos placeholders. Veja esse exemplo:

String nome = "João";
int aulas = 4;

    String mensagem = """
                      Olá, %s!
                      Boas vindas ao curso de Java.
                      Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                      """.formatted(nome, aulas);

    System.out.println(mensagem);

O resultado impresso será:

Olá, João!

Boas vindas ao curso de Java.

Teremos 4 aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: CASTING Casting é um recurso utilizado em Java para converter um tipo de dado em outro. Essa conversão pode ser feita de forma automática pelo compilador (conversão implícita), quando o tipo de dado de destino é compatível com o tipo de dado de origem, ou de forma manual (conversão explícita), utilizando o operador de casting.

O casting é utilizado para permitir que tipos de dados incompatíveis possam ser utilizados em uma mesma operação ou expressão. Por exemplo, se um método espera um parâmetro do tipo int e o valor que se deseja passar é do tipo double, é necessário fazer um casting para converter o valor em int.

Casting implícito O casting implícito é realizado automaticamente pelo compilador quando o tipo de dado de origem é compatível com o tipo de dado de destino. Por exemplo, é possível atribuir um valor de tipo int a uma variável do tipo double, pois o tipo double é maior e suporta todos os valores que o tipo int pode armazenar:

    int x = 10;
    double y = x; // casting implícito
    
Casting explícito

O casting explícito é realizado quando o tipo de dado de origem é incompatível com o tipo de dado de destino. Nesse caso, devemos utilizar o operador de casting para realizar a conversão:

    double x = 10.5;
    int y = (int) x; // casting explícitoCopiar código
    
No exemplo anterior, o valor da variável x é convertido em um valor inteiro utilizando o casting explícito. É importante notar que, neste caso, a parte decimal será descartada e o valor atribuído à variável y será 10.

Abaixo tem uma tabela, onde você pode visualizar mais facilmente as conversões que são implícitas e as que necessitam ser feitas de forma explícita.


![image](https://github.com/user-attachments/assets/c9fa1550-190b-43d0-b9cd-340ee6a9f6ae)

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Nessa aula você aprendeu: A trabalhar com variáveis: recurso utilizado para armazenar valores em memória;

Sobre tipos primitivos:

inteiros (byte, short, int, long);
ponto flutuante (double e float);
char: contém um único caractere;
boolean: recebe 2 valores, true ou false;
Como representar textos em Java, utilizando a classe String;
A realizar casting de valores, para resolver situações de tipos incompatíveis no momento de realizar um cálculo ou atribuição de uma variável.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: SWITCH CASE

Uma alternativa ao if/else é o switch case, que é uma estrutura de controle de fluxo que permite executar diferentes ações com base no valor de uma expressão. É uma forma mais simplificada e legível de escrever vários blocos if/else encadeados.

A sintaxe do switch case em Java é a seguinte:

    switch (expressão) {
       case valor1:
          // código a ser executado se a expressão for igual a valor1
          break;
       case valor2:
          // código a ser executado se a expressão for igual a valor2
          break;
       case valor3:
          // código a ser executado se a expressão for igual a valor3
          break;
       ...
       default:
          // código a ser executado se a expressão não for igual a nenhum valor
          break;
    }
    
A expressão é uma variável ou uma expressão de código que será avaliada. Cada case é uma possível condição que pode ser atendida pela expressão. Quando a expressão é igual ao valor especificado em um determinado case, o código correspondente a esse case será executado. A palavra-chave break é usada para sair do switch case após a execução do código correspondente.

O case default é opcional e é executado quando nenhum dos cases especificados é atendido.

Veja um exemplo simples de uso do switch case em Java para verificar o dia da semana com base em um número inteiro:

    int dia = 3;
    String nomeDia;

    switch (dia) {
       case 1:
          nomeDia = "domingo";
          break;
       case 2:
          nomeDia = "segunda-feira";
          break;
       case 3:
          nomeDia = "terça-feira";
          break;
       case 4:
          nomeDia = "quarta-feira";
          break;
       case 5:
          nomeDia = "quinta-feira";
          break;
       case 6:
          nomeDia = "sexta-feira";
          break;
       case 7:
          nomeDia = "sábado";
          break;
       default:
          nomeDia = "Dia inválido";
          break;
    }

    System.out.println("O dia " + dia + " é " + nomeDia);
    
Nesse exemplo, a expressão é a variável dia, que contém o valor 3. O switch case verifica o valor da variável dia e executa o código correspondente ao caso em que dia é igual a 3. O resultado será a impressão no console: "O dia 3 é terça-feira".

Vantagens do switch case:

Em resumo, o switch case torna o código mais fácil de entender e mais legível, em comparação ao if/else, especialmente quando há várias condições possíveis.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# PARA SABER MAIS: A CLASSE SCANNER

A classe Scanner do Java é utilizada para ler dados de entrada em um programa Java. Esses dados podem ser lidos a partir de várias fontes de entrada, como arquivos, fluxos de entrada, Strings e até mesmo a entrada do usuário através do teclado, como vimos em aula.

Ela oferece uma série de métodos para ler dados de diferentes tipos, como inteiros, números de ponto flutuante, strings e caracteres.

Para utilizar a classe Scanner, primeiro é necessário importá-la no início do seu programa. Provavelmente ao incluir a mesma no código, a IDE já vai sugerir o import. Esse import ficará como descrito abaixo:

    import java.util.Scanner;
    
Veja um exemplo básico de como utilizar a classe Scanner para ler dados distintos:

    public class ExemploScanner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o valor que pretende investir esse mês: ");
            double valor = scanner.nextDouble();

            System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

            scanner.close();
        }
    }
    
Nesse exemplo, primeiro importamos a classe Scanner e, em seguida, criamos uma instância dela passando o objeto System.in' como parâmetro para indicar que queremos ler a entrada do usuário pelo teclado.

Depois, usamos o método nextLine() para ler uma linha de texto. Além desse, utilizamos também o nextInt() para ler um número inteiro e o nextDouble() para ler um número decimal.

Você pode encontrar a lista completa de métodos na documentação oficial do Java. (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# O que aprendemos 03. Controlando o fluxo da aplicação.

Iago, parabéns pela dedicação aos estudos! Você mencionou o uso de variáveis, a tag SCAN (que presumo ser uma referência à classe Scanner), e o uso de estruturas de repetição for e while. Isso é ótimo! Você captou os pontos principais da aula relacionados às estruturas de repetição e à leitura de dados do teclado. Além disso, a aula também abordou a lógica condicional, que permite que uma aplicação escolha entre diferentes ações com base em determinadas condições. Vimos como comparar valores usando operadores como igual (==), diferente (!=), maior que (>), menor que (<), maior ou igual (>=) e menor ou igual (<=). Aprender a usar esses operadores é fundamental para construir programas que tomem decisões. Também vimos diferentes tipos de estruturas condicionais e como escolher a mais adequada para cada situação. A escolha entre if, if-else, if-else if-else depende da complexidade da lógica que você precisa implementar. Aprender a analisar o problema e escolher a estrutura condicional mais eficiente é uma habilidade importante para se desenvolver. Continue estudando e praticando!                                              

















                                              
                                            ############################################
                                            ## JAVA: Aplicando a Orientação a Objetos ##
                                            ############################################
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

# Para saber mais: Modificadores de acesso 

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

#  saber mais: a palavra chave "this"

A documentação do Java, conhecida como JavaDoc, é uma referência completa para todas as classes, interfaces e métodos disponíveis na plataforma Java. Ela está disponível online e pode ser acessada neste site da Oracle. (https://docs.oracle.com/en/java/javase/17/docs/api/index.html)

O JavaDoc é organizado em pacotes, que contêm diversas classes e interfaces relacionadas a alguma funcionalidade específica da linguagem. Cada classe e interface é documentada individualmente, com informações detalhadas sobre sua funcionalidade, uso e exemplos de código.

Essa documentação deve ser uma referência essencial para qualquer pessoa que queira programar na linguagem Java, pois fornece informações detalhadas sobre como usar as classes e interfaces fornecidas pela linguagem. Tendo acesso à documentação, podemos também descobrir novas classes e métodos que podem ser úteis em nossos projetos, para resolver problemas comuns e recorrentes do dia a dia.

Não deixe de entrar no site do JavaDoc e explorar os pacotes e classes que a linguagem nos disponibiliza, pois assim você já vai se familiarizar em como descobrir novos recursos da linguagem, além de entender melhor o funcionamento das principais classes do Java.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: Padrão de nomes de pacotes

Em Java, pacotes são usados para agrupar classes que estão relacionadas a alguma funcionalidade. Eles ajudam a organizar o código, facilitando o seu gerenciamento e evitando que centenas de classes distintas fiquem todas misturadas num único diretório.

A organização de classes dentro de um pacote também pode ser feita usando subpacotes ou colocando as classes diretamente dentro do pacote, dependendo da complexidade do projeto. Além disso, é importante seguir a convenção de nomeação de pacotes para garantir que os pacotes sejam facilmente identificados.

Em relação à nomenclatura de pacotes, outro aspecto importante é o uso do nome de domínio reverso da empresa ou organização como parte do nome do pacote. Por exemplo, se o nome de domínio da empresa fosse "minhaempresa.com.br" e o projeto Java fosse chamado de "meuprojeto", o nome do pacote de domínio reverso seria br.com.minhaempresa.meuprojeto, sendo que dentro desse pacote principal podemos ter diversos subpacotes, para melhor organização do código do projeto.

Isso ajuda a garantir que o nome do pacote seja exclusivo e evita conflitos de nome com outros pacotes em outros projetos. Além disso, o uso do nome de domínio reverso como parte do nome do pacote também ajuda a identificar facilmente o proprietário do projeto Java.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: This

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

# Atividade

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

# Para saber mais: Getters e Setters

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

# Para saber mais: Entendendo melhor a herança:

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
# Para saber mais: Anotações no Java:

As anotações, também conhecidas como annotations, são uma forma de adicionar configurações ao código Java de uma maneira bem simples. Elas são usadas para fornecer informações adicionais sobre o código, como o significado de uma classe, um método ou um atributo.

No Java, as anotações são definidas com o uso do símbolo "@" seguido do nome da anotação. Por exemplo, a anotação @Deprecated é usada para indicar que um método ou classe está obsoleto e não deve ser mais utilizado. Outra anotação muito útil é a @Override, conforme foi demonstrado no último vídeo, que indica que um método está sobrescrevendo o mesmo método definido na sua classe mãe.

Diversas especificações e frameworks Java, como Hibernate, Bean Validation e Spring, utilizam anotações. Por exemplo, no Bean Validation a anotação @NotNull é usada para validar que um atributo não seja nulo.

As anotações são muito úteis e comuns em aplicações Java, sendo importante que você esteja familiarizado com esse recurso, pois certamente o utilizará bastante em seus projetos.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: O modificador Protected

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

# Para saber mais: Entendendo melhor interfaces

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

# Para saber mais: Declarando variáveis com var:

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

# Para saber mais: Arrays no Java

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

# Para saber mais: Construtor padrão

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

# Para saber mais: Outras formas de percorrer a lista:

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

# Para saber mais: Referências

Referências são ponteiros para objetos em memória, ou seja, elas apontam para um objeto e permitem que você trabalhe com ele. No Java, toda variável de objeto é na verdade uma referência a esse objeto que foi alocado na memória.

Quando você instancia um objeto, está, na realidade, criando um novo bloco de memória que armazena as informações desse objeto. A maneira de chegar a esse bloco de memória, para armazenar e ler informações dele, ocorre por meio de uma referência, que é representada por uma variável. Por exemplo:

    Filme filme1 = new Filme("Avatar", 2009);

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

# Para saber mais: Interfaces Comparable e Comparator:

Além da interface Comparable, o Java possui uma outra interface chamada Comparator, que nos fornece outra alternativa para ordenação de coleções.

Você pode entender melhor a diferença entre elas, com exemplos em códigos, lendo o artigo Ordenando coleções com Comparable e Comparator. - https://www.alura.com.br/artigos/ordenando-colecoes-com-comparable-e-comparator

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: Outras classes de listas no Java:

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

# Para saber mais: Map e HashMap:

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

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: Padrões de projeto

Os padrões de projeto, também conhecidos como design patterns, são soluções reutilizáveis para problemas comuns de desenvolvimento de software. Eles surgiram na década de 1990, quando um grupo de desenvolvedores identificou que muitos projetos de software apresentavam problemas semelhantes, que podiam ser resolvidos por soluções também semelhantes.

Os padrões de projeto podem ser divididos em três categorias:

    1- Padrões de criação: são padrões que lidam com a criação de objetos, visando garantir a flexibilidade e reutilização do código. Alguns exemplos de padrões de criação são: Factory Method, Builder e Singleton.

    2- Padrões de estrutura: são padrões que lidam com a organização de objetos em estruturas maiores, buscando simplificar a comunicação entre objetos e reduzir o acoplamento entre eles. Alguns exemplos de padrões de estrutura são: Adapter, Facade e Composite.

    3- Padrões de comportamento: são padrões que lidam com a comunicação entre objetos, buscando definir o comportamento esperado em situações específicas. Alguns exemplos de padrões de comportamento são: Observer, Command e Strategy.

Ao utilizar padrões de projeto, é possível aumentar a qualidade do código, tornando-o mais legível, flexível e de fácil manutenção.

Caso você queira aprofundar os conhecimentos em padrões de projetos em Java, recomendamos os nossos seguintes cursos:

1- Design Patterns em Java I: boas práticas de programação (https://cursos.alura.com.br/course/introducao-design-patterns-java)
2- Design Patterns em Java II: avançando nas boas práticas de programação (https://cursos.alura.com.br/course/avancando-design-patterns-java)

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: Bibliotecas e framworks:

Bibliotecas e frameworks em Java, e também em outras linguagens de programação, são ferramentas essenciais para quem trabalha com programação, pois ajudam a reduzir a quantidade de trabalho necessária para construir aplicações, uma vez que fornecem funcionalidades prontas para uso, permitindo que as pessoas desenvolvedoras foquem na lógica de negócios dos projetos, ao invés de se preocuparem com problemas técnicos que são comuns e já possuem soluções prontas para uso.

Em Java, bibliotecas são coleções de classes e interfaces que oferecem uma série de recursos e funcionalidades prontas para uso. Geralmente elas são distribuídas como arquivos JAR (Java Archive), que são pacotes de arquivos Java que contém classes e outros recursos, como imagens e arquivos de configuração. As bibliotecas podem ser importadas em projetos Java e usadas diretamente em código para implementar funcionalidades específicas, como manipulação de arquivos, conexão com bancos de dados, criptografia, etc.

Frameworks, por outro lado, são estruturas de software que fornecem uma arquitetura básica para o desenvolvimento de aplicações. Eles incluem bibliotecas, padrões e práticas recomendadas para orientar o processo de desenvolvimento de aplicações. Um framework pode ser considerado como uma "fábrica padronizada de aplicações", que fornece os componentes necessários para criar uma aplicação, bem como um conjunto de regras e diretrizes para guiá-lo no processo.

Existem muitos frameworks populares em Java, cada um com suas próprias características e objetivos. Alguns exemplos incluem o Spring Framework, que é um framework que facilita a criação de aplicações Web e APIs Rest complexas em Java; o Hibernate, que é um framework de mapeamento objeto-relacional e simplifica muito o processo de integração de uma aplicação Java com um banco de dados relacional.

Aqui na Alura temos diversas formações com cursos que ensinam a utilizar as principais bibliotecas e frameworks Java, para que você tenha um aprendizado mais completo. Entretanto, esses são assuntos um pouco mais avançados e vão exigir que, primeiramente, você já tenha uma boa base de conhecimentos do Java e da orientação a objetos.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: Java Record

Lançado oficialmente no Java 16, mas disponível desde o Java 14 de maneira experimental, o Record é um recurso que permite representar uma classe imutável, contendo apenas atributos, construtor e métodos de leitura, de uma maneira muito simples e enxuta.

Esse recurso se encaixa perfeitamente quando precisamos criar um objeto apenas para representar dados, sem nenhum tipo de comportamento.

Para se criar uma classe imutável, sem a utilização do Record, era necessário escrever muito código. Vejamos um exemplo de uma classe que representa um telefone:

    public final class Telefone {
    
        private final String ddd;
        private final String numero;
    
        public Telefone(String ddd, String numero) {
            this.ddd = ddd;
            this.numero = numero;
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(ddd, numero);
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (!(obj instanceof Telefone)) {
                return false;
            } else {
                Telefone other = (Telefone) obj;
                return Objects.equals(ddd, other.ddd)
                  && Objects.equals(numero, other.numero);
            }
        }
    
        public String getDdd() {
            return this.ddd;
        }
    
        public String getNumero() {
            return this.numero;
        }
    }

Agora com o Record, todo esse código pode ser resumido com uma única linha:

    public record Telefone(String ddd, String numero){}

Muito mais simples, não?!

Por baixo dos panos, o Java vai transformar esse Record em uma classe imutável, muito similar ao código exibido anteriormente.

Mais detalhes sobre esse recurso podem ser encontrados na documentação oficial do Java.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: imutabilidade:

A imutabilidade, citada anteriormente ao falarmos sobre record, é um conceito importante em Java, que se refere à capacidade de um objeto não poder ser alterado depois de criado. Existem algumas classes que são imutáveis por padrão, como por exemplo, as classes String, Integer, Boolean, entre outras. Isso significa que, uma vez criado um objeto dessas classes, não é possível modificar o seu estado.

Vamos exemplificar. Dado o record abaixo:

    public record Estudante(String nome, int idade) {}

Uma vez criado um objeto Estudante, seus valores não podem ser modificados:

    Estudante estudante1 = new Estudante(“Alice”, 19);

Observe que após essa criação, eu não consigo setar outro nome ou idade para o objeto estudante1.

    estudante1.setNome(“Maria”); //Essa possibilidade não existe
    estudante1.nome = “Maria”; //Essa possibilidade não existe

Qualquer uma das tentativas acima, vai apresentar erro de compilação, pois não é possível atribuir nenhum outro nome a variável estudante1.

Com relação ao record, fica bem claro, certo? Mas e a String, por exemplo? Eu consigo fazer os passos abaixo no código:

    String nome = “Maria”;
    nome = “Alice”;

Se a String é imutável, o certo era eu não conseguir atribuir o conteúdo “Alice” à variável nome, correto?

No caso da String e de outras classes imutáveis que citei acima, a variável nome contém uma referência ao objeto da classe String que contém o valor "Maria".

No entanto, quando você tenta alterar o valor da string, o que realmente acontece é que um novo objeto da classe String é criado com o novo valor e a variável é atualizada para armazenar uma referência ao novo objeto.

Por isso, podemos dizer que a classe String é imutável, porque uma vez que um objeto da classe String é criado, ele não pode ser alterado. No entanto, as variáveis que armazenam referências a objetos da classe String podem ser atualizadas para referenciar novos objetos, que são criados a partir do conteúdo do objeto original.

A imutabilidade é importante por várias razões, entre elas:

Concorrência: objetos imutáveis são seguros para uso em ambientes concorrentes, já que não há necessidade de sincronização.
Segurança: objetos imutáveis são seguros contra alterações acidentais ou mal-intencionadas.
Desempenho: objetos imutáveis podem ser armazenados em cache e reutilizados, o que pode melhorar o desempenho.

------------------------------------------------------------------------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

# Para saber mais: o bloco finally

Aprendemos que quando ocorre uma exceção, o Java permite tratar o erro usando a declaração try-catch. Entretanto, existe ainda o bloco finally, que é opcional, mas pode ser útil em certas situações.

O finally é usado para executar um bloco de código independentemente de ocorrer uma exceção ou não, ou seja, ele sempre é executado. Isso pode ser útil quando precisamos executar um código tanto no try, caso não ocorra uma exceção, quanto no catch, caso uma exceção seja lançada. Por exemplo, suponha que você tenha o seguinte código:

    try {
    metodoQuePodeLancarExcecao();
    System.out.println("Executou");
    
    System.out.println("Finalizou!");
    } catch (Exception e) {
    System.out.println("Deu erro!");
    
    System.out.println("Finalizou!");
    }

Perceba no código anterior que a instrução System.out.println("Finalizou!"); deve ser sempre executada, independente de ter acontecido ou exception ou não. Mas o problema é que ela acabou tendo de ser duplicada tanto no try quanto no catch. O bloco finally nos ajuda justamente a evitar essa duplicação de código:

    try {
    metodoQuePodeLancarExcecao();
    System.out.println("Executou");
    } catch (Exception e) {
    System.out.println("Deu erro!");
    } finally {
    System.out.println("Finalizou!");
    }

Repare que agora a instrução aparece apenas uma vez, dentro do bloco finally, evitando com isso uma duplicação de código desnecessária.

O finally é muito utilizado em situações onde é necessário limpar recursos, fechar conexões de banco de dados ou fechar arquivos que foram abertos no bloco try.
