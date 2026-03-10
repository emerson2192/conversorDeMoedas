# 💱 Conversor de Moedas em Java

Este projeto foi desenvolvido como parte de um desafio de aprendizado em **Java**, com o objetivo de praticar conceitos importantes de desenvolvimento, como:

* Consumo de **APIs externas**
* Requisições HTTP com **HttpClient**
* Manipulação de **JSON com Gson**
* Estruturação de projetos Java
* Uso de **Git e GitHub** para versionamento

---

# 📌 Descrição do Projeto

O **Conversor de Moedas** é uma aplicação Java executada via **console**, que permite ao usuário converter valores entre diferentes moedas utilizando **taxas de câmbio atualizadas em tempo real**.

A interação é feita por meio de um **menu textual**, onde o usuário escolhe a conversão desejada, informa um valor e recebe o resultado convertido.

---

# ⚙️ Tecnologias Utilizadas

* **Java JDK 17+**
* **Gson 2.10.1** – para manipulação de JSON
* **HttpClient (java.net.http)** – para requisições HTTP
* **IntelliJ IDEA** – ambiente de desenvolvimento
* **Git & GitHub** – controle de versão
* **ExchangeRate API** – fornecimento das taxas de câmbio

---

# 🌐 API Utilizada

Este projeto utiliza a API pública de taxas de câmbio:

https://www.exchangerate-api.com/

Exemplo de endpoint utilizado no projeto:

https://v6.exchangerate-api.com/v6/SUA_CHAVE_API/pair/USD/BRL

A API retorna dados em **JSON**, incluindo a taxa de conversão entre duas moedas.

---

# 💰 Conversões Disponíveis

O sistema permite as seguintes conversões:

1. USD → ARS (Dólar → Peso Argentino)
2. ARS → USD (Peso Argentino → Dólar)
3. USD → BRL (Dólar → Real Brasileiro)
4. BRL → USD (Real Brasileiro → Dólar)
5. USD → COP (Dólar → Peso Colombiano)
6. COP → USD (Peso Colombiano → Dólar)

---

# 📂 Estrutura do Projeto

conversorDeMoedas
┣ Principal.java        → Classe principal com menu e interação do usuário
┣ ApiService.java       → Responsável por consumir a API externa
┣ Dadosmoedas.java      → Record para mapear a resposta JSON da API
┗ README.md             → Documentação do projeto

---

# ▶️ Exemplo de Uso

```
=========================
CONVERSOR DE MOEDAS
1 - Dollar ==> Peso argentino
2 - Peso argentino ==> Dollar
3 - Dollar ==> Real brasileiro
4 - Real brasileiro ==> Dollar
5 - Dollar ==> Peso colombiano
6 - Peso colombiano ==> Dollar
0 - Sair
=========================

Escolha uma opção: 3
Digite o valor: 100

Resultado: 100 USD = 495.00 BRL
```

---

# 📚 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

* Consumo de **APIs REST**
* Uso de **HttpClient no Java**
* Conversão e leitura de **JSON**
* Estruturação de aplicações Java
* Tratamento de erros e exceções
* Uso de **Git e GitHub**

---

# 👨‍💻 Autor

**Emerson Rodrigues dos Santos**

Projeto desenvolvido para fins de estudo e prática em Java.
