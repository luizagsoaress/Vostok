# Vostok

## Sobre

**Vostok** é um projeto de software de código aberto, voltado a exibir de maneira acessível diversos dados da NASA, como imagens, erupções solares recentes, asteroides monitorados, etc.

Desenvolvido como projeto de estudos, o nome foi inspirado na série de 'spacecrafts' soviéticas, responsável por levar o primeiro ser humano (Yury A. Gagarin) para o espaço. Novas features serão adicionadas mensalmente, permitindo a visualização de novos conteúdos.

**Exemplo**: Imagem do dia (2026-08-12)

![Imagem do dia](./exemplos/exemplo_0.png)

## Como usar?

Para executar o programa, siga as seguintes instruções:

```bash
# Clone o repositório
git clone https://github.com/luizagsoaress/Vostok.git

# Entre na pasta do projeto e na subpasta que contém o pom.xml
cd Vostok
cd vostok

# Rode o código usando Maven:
mvn clean package && mvn compile && mvn javafx:run
```

## Exemplo

Veja os asteroides que se aproximaram da terra recentemente:

![exemplo 22](./exemplos/exemplo_22.png)

Clique na seta `>` para ver o próximo asteroide, ou na `<` para visualizar o anterior.

![exemplo 3](./exemplos/exemplo_3.png)

## Telas

<table>
  <tr>
    <td><img src="./exemplos/exemplo_1.png" width="400"/></td>
    <td><img src="./exemplos/exemplo_2.png" width="400"/></td>
  </tr>
  <tr>
    <td><img src="./exemplos/exemplo_0.png" width="400"/></td>
    <td><img src="./exemplos/exemplo_3.png" width="400"/></td>
  </tr>
  <tr>
    <td><img src="./exemplos/exemplo_4.png" width="400"/></td>
    <td><img src="./exemplos/exemplo_5.png" width="400"/></td>
  </tr>
  <tr>
    <td><img src="./exemplos/exemplo_6.png" width="400"/></td>
    <td><img src="./exemplos/exemplo_7.png" width="400"/></td>
  </tr>
</table>
