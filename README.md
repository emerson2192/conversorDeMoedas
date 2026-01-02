#  Conversor de Moedas em Java

Este projeto foi desenvolvido como um desafio de aprendizado em Java, com o objetivo de praticar:

* Consumo de APIs externas
* Uso de HTTP Client no Java
* Manipulação de JSON com Gson
* Estruturação de um projeto Java

---

## Descrição do Projeto

O Conversor de Moedas é uma aplicação Java executada via console, que permite ao usuário converter valores de moedas estrangeiras para Real (BRL) utilizando dados atualizados de uma API de taxas de câmbio.

A interação é feita por meio de um menu textual, onde o usuário escolhe a moeda desejada, informa o valor e recebe o resultado da conversão.

---

##Tecnologias Utilizadas

* Java JDK 17+
* Gson 2.10.1 – para manipulação de JSON
* HttpClient (java.net.http) – para requisições HTTP
* IDE IntelliJ IDEA
* Git & GitHub – versionamento do projeto
* ExchangeRate API – fornecimento das taxas de câmbio

---

## API Utilizada

A aplicação consome dados da ExchangeRate API:

🔗 [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)

Exemplo de endpoint utilizado:

```
https://v6.exchangerate-api.com/v6/SUA_CHAVE_API/latest/USD
```

---

##  Moedas Disponíveis

O conversor trabalha com pelo menos 6 moedas, conforme exigido no desafio:

* USD – Dólar Americano
* EUR – Euro
* GBP – Libra Esterlina
* ARS – Peso Argentino
* CLP – Peso Chileno
* COP – Peso Colombiano

Todas as conversões são feitas para BRL(Real).

---

## Estrutura do Projeto

```
📁 conversor-moedas-java
 ┣ 📄 Principal.java        # Classe principal (menu e interação)
 ┣ 📄 ApiService.java       # Consumo da API e requisição HTTP
 ┣ 📄 DadosMoedas.java      # Mapeamento do JSON da API
 ┣ 📄 ConversionRates.java  # Record com as taxas de câmbio
 ┗ 📄 README.md
```

## 🧪 Exemplo de Uso

```
CONVERSOR DE MOEDAS
1 - USD (Dólar)
2 - EUR (Euro)
3 - GBP (Libra)
4 - ARS (Peso Argentino)
5 - CLP (Peso Chileno)
6 - COP (Peso Colombiano)
0 - Sair

Escolha uma opção: 1
Digite o valor: 100
Valor convertido: R$ 495.00
```

---

## Aprendizados

Com este projeto foi possível aprender e praticar:

* Requisições HTTP em Java
* Consumo de APIs REST
* Manipulação de JSON com Gson
* Estruturação de menus no console
* Boas práticas de organização de código
* Tratamento de erros e exceções

---

## Autor

Emerson Rodrigues dos Santos
