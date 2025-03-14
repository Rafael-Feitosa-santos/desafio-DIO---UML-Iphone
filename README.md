# Desafio DIO: Criação de Interfaces e Classe `IPhone`

## Descrição

Neste desafio, o objetivo é criar uma classe `IPhone` que implementa três interfaces para simular funcionalidades de um dispositivo:

- **ReprodutorMusical**: Métodos para tocar, pausar e selecionar músicas.
- **AparelhoTelefonico**: Métodos para realizar e atender chamadas.
- **NavegadorInternet**: Métodos para navegar na internet, como exibir páginas e adicionar novas abas.

## Estrutura do Projeto

- **Interfaces**:
    - `ReprodutorMusical`: Contém métodos para o controle de música.
    - `AparelhoTelefonico`: Contém métodos para chamadas telefônicas.
    - `NavegadorInternet`: Contém métodos para navegação na web.

- **Classe `IPhone`**: Implementa as interfaces e define o comportamento de cada método.

## Código

### Interface `ReprodutorMusical`

```java
package com.exemplo.iphone.interfaces;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}
