<h1>Atividade Colaborativa 05</h1>
<h2>1.  Descreva os quatro elementos básicos de repetição controlada por contador</h2>
<p>Os quatro elementos indispensáveis para a boa execução de um comando de repetição controlado são:
a. Variável de controle: É fundamental a criação de uma variável de controle que terá como finalidade principal servir como contador e servirá como ponto de partida para quantidade de repetições do loop. 

b. Condição: É preciso também definir um ponto de chegada, pois, enquanto a condição continuar sendo satisfeita, o loop continuará sendo executado. Quando a condição não for mais satisfeita, o loop se encerra. Esta parte do código é fundamental para evitar loops eternos. 

c. Incremento ou decremento da variável de controle: É preciso incrementar ou decrementar a variável de controle no sentido de encaminhar seu valor à se aproximar do valor final para atingir o ponto de chegada definido na condição. 

d. Corpo do loop: É o bloco de instruções que será executado repetidamente enquanto a condição continuar sendo satisfeita. O que delimita o bloco é o uso das chaves após o comando de repetição. </p>

<h2>2. Compare e contraste as instruções de repetição while e for.</h2>
<p>Existem diversos comandos de repetição. Dentre os mais utilizados certamente encontram-se no topo os comandos de repetição while e for. Contudo, por mais que ambos tenham similaridades, por exemplo, a característica de repetir o bloco de instruções, cada um dos comandos possui suas particularidades.

a. WHILE: O comando de repetição while deve ser utilizado em situações em que não temos a certeza de quantas vezes precisamos repetir o bloco de instruções. Sua sintaxe é bastante simples, recebendo como parâmetro apenas a condicional, lembrando que o incremento e o decremento, ou o calculo responsável por estipular a variável de controle à finalização do loop deve ser manipulada dentro do bloco de instruções. 

b. FOR: O comando de repetição for deve ser utilizado em situações em que temos a ciência de quantas vezes é preciso repetir o bloco de instruções. É um comando de repetição um pouco mais complexo mas que permite um maior controle sobe a quantidade de repetições a serem executadas. Como parâmetro recebe a variável de controle, a condicional e o incremento ou decremento da variável de controle. </p>

<h2>3. Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê.</h2>
<p>O comando do ... while é basicamente uma extesão do comando while. Contudo, utilizamos o comando do ... while, sempre que quisermos que o nosso bloco de instruções se repita pelo menos uma vez, já que, conforme a sua sintaxe, a checagem da condicional é feita após a aplicação do código. Uma situação que é bastante comum de utilizar-se o do ... while ao invés do comando while é na execução de menus dinâmicos, haja vista que, não faz sentido que o menu, quando executada a aplicação, não seja processado pelo menos uma vez, sendo possível com tal comando de repetição a execução quantas vezes mais o usuário necessitar. </p>

<h2>4. Compare e contraste as instruções break e continue.</h2>
<p>A instrução break serve como um comando de parada forçada, ou seja, sempre que o código, durante sua execução, fizer a leitura da instrução break, a execução do comando de repetição será encerrado imediatamente, ignorando quaisquer outras instruções que por ventura existirem posteriormente. 

Já em se tratando da instrução continue, ela atua de forma contrária a instrução break, haja vista que, durante sua execução, após a leitura da instrução continue, a execução atual é interrompida e o controle é transferido para a condição do loop, onde vai ser gerada a próxima iteração. </p>

<h2>5. Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código:</h2>
<p>a. O erro deste código está na parte de incrementação/decrementação, pois, da forma atual, o programa ficará em loop infinito já que, a condição sempre será satisfeita, pois a variável de controle sempre será incrementada. O código correto seria:

```java

for (i=100;i>=1;i--){
	System.out.println(i);
}

```

b. O erro deste código é que, quando estamos lidando com desvio condicional switch, para cada case, exceto o caso default, ao final dos blocos de instrução precisamos colocar a instrução break. Caso contrário, por mais que a condicional satisfação o primeiro caso, por exemplo, onde o número é par, os demais casos também serão executados, mesmo não cumprindo o valor condicional. Com o uso do break, interrompemos de forma forçada a execução do restante dos casos. O código correto seria: 

```java

switch (value % 2) {
	case 0:
		System.out.println("Inteiro par");
		break;
	case 1:
		System.out.println("Inteiro ímpar");
		break;
}

```

c. Este código está incorreto pois ele gerará um loop infinito, haja vista que, está incrementando ao invés de decrementar a variável de controle. Para atingir o seu objetivo, é preciso decrementar a variável de controle, evitando o loop infinito. O código correto seria:

```java

for(int i =19; i >=1; i -=2) {
	System.out.println(i);
}

```

d. Este código está incorreto pois ele irá imprimir apenas até o número 98. Para corrigir este erro basta colocar dentro da condicional que a variável de controle vá até <= 100. O código correto seria:

```java

int counter = 2;
do {
	System.out.println(counter);
	counter += 2;
} while (counter <= 100); 

```
</p>

<h2>6. O que o seguinte programa faz?</h2>

```java

public class Printing {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=5;j++){
                System.out.print('@');
            }
            System.out.println();
        }
    }
}

```

<p>O programa cria um bloco de 5x10 de caracteres @. A sua execução é bastante simples. Enquanto que o primeiro loop for é responsável por controlar a quantidade de linhas o segundo controla a quantidade de colunas. Essa estrutura é possível pois o println existente dentro do primeiro loop for pula a linha. </p>