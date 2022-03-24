![](https://img.shields.io/github/stars/pedrogomes30/biblioteca) ![](https://img.shields.io/github/forks/pedrogomes30/biblioteca) ![](https://img.shields.io/github/tag/pedrogomes30/biblioteca) ![](https://img.shields.io/github/release/pedrogomes30/biblioteca) ![](https://img.shields.io/github/issues/pedrogomes30/biblioteca) ![](https://img.shields.io/bower/v/editor.md.svg)

<h1>Projeto final da school da MJV - Grupo 06</h1>


<h2>Tema escolhido:</h2>

sistema de locação em uma biblioteca

<h2>Jornada de implementação:</h2> 

sistema para gerenciamento de locações de livro em uma biblioteca,permitindo o cadastro de livro com categorizacão e autor, registro da quantidade de livros alugadas, pagamentos e total de locações realizadas, permite também o cadastro de loja, cliente e vendedor a partir de uma unica classe entidade com tipagem e multi endereços e multi contatos.

jornada de persistência:
 - inicia salvando a tabela 'autor' e 'categoria';
 - salva a tabela 'livro' com referencia em 'autor e 'categoria';
 - salva a o 'entidade_tipo';
 - salva 'entidade' com o 'contato' e 'endereco' do tipo cliente;
 - salva 'entidade' com o 'contato' e 'endereco' do tipo vendedor;
 - salva 'entidade' com o 'contato' e 'endereco' do tipo loja;
 - salva uma 'locacao' com 'livro_alugado' e 'pagamentos':
    - onde 'Luvro_alugado' se relaciona com 'livro' ou '<livro>' verificando a quantidade disponivel;
    - onde pagamentos deve ter seu total igual o valor total de 'locacao';
    - 'locacao' se telaciona com 'entidade' do tipo 'CLiente';
    - 'locacao' se telaciona com 'entidade' do tipo 'Vendedor';
    - 'locacao' se telaciona com 'entidade' do tipo 'Loja';
 
 


<h3>Diagrama de entidade e relacionamento:</h3>

<img src='https://github.com/pedrogomes30/biblioteca/blob/master/Docs/img/Biblioteca.png'/>

<h3>Tecnologias utilizadas:</h3>

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white/"><img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" /><img src="https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white" /><img src="https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white" />

<h3>Instalação</h3>

1º - realize o clone deste repósitório:

2º - utlize o comando abaixo para a instalação dos pacotes do maven:
  
<pre>
mvn package
</pre>
  
3º - vá para /src/main/resources/application.properties e altere as variáveis para as do seu banco de dados;

4º - utilize o comando abaixo para iniciar o servidor;

<pre>
mvn spring-boot:start
</pre>

feito isso a aplicação irá disponibilizar a documentação de endpoint via swagger:
  <pre>
  http://localhost:8080/swagger-ui/index.html#/
  </pre>
  
banco H2 ficará disponivel em:
  <pre>
  http://localhost:8080/h2-console/login.jsp
  </pre>
<h3>Integrantes do grupo:</h3>  <br>

[<img src="https://img.shields.io/badge/PedroGomes30-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Pedro Gomes">](https://github.com/pedrogomes30/)
[<img src="https://img.shields.io/badge/KarolineGoergen-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Karoline Goergen">](https://github.com/KarolineGoergen)
[<img src="https://img.shields.io/badge/LucasEmanuel-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Lucas Emanuel">](https://github.com/Luscaw)
[<img src="https://img.shields.io/badge/Bruno Manhães-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Bruno Manhães">](https://github.com/NewarkX)


<h3>Schemas da aplicação</h3>

  <details><summary>/autor</summary>
  <pre>
  {
    "nome": "Arthur Conan Doile"
  }
  </pre>
</details> 
  
   <details><summary>/categoria</summary>
  <pre>
  {
    "descricao": "Investigação"
  }
  </pre>
</details> 
  
  <details><summary>/livro</summary>
  <pre>
  {
    "nome": "umestudoemvermelho",
    "edicao": "1",
    "isbn": 123,
    "preco": 30,
    "estoque": 10,
    "autor": {
      "id": 1
    },
    "categoria": {
      "id": 1
    }
  }
  </pre>
</details>  
  
<details><summary>/entidadeTipo</summary>
  <pre>
  {
    "descricao": "cliente";
  },
  {
    "descricao": "vendedor";
  },
  {
    "descricao": "loja";
  }
  </pre>
</details>  
  
<details><summary>/entidade</summary>
  <pre>
  {
    "id": 1,
    "nome": "Aluno MJV",
    "documento": "222",
    "email": "aluno@teste.com",
    "entidadeTipo": {
      "id": 1,
      "descricao": "cliente"
    },
    "enderecos": [
      {
        "id": 0,
        "logradouro": "rua01",
        "bairro": "vila01",
        "cep": "123001",
        "cidade": 0
      }
    ],
    "contatos": [
      {
        "id": 1,
        "telefone": "99998888",
        "telefoneTipo": "celular"
      }
    ]
  }
</pre>
</details>

<details><summary>/livro</summary>
  <pre>
  {
  "nome": "umestudoemvermelho",
  "edicao": "1",
  "isbn": 123,
   "preco": 30,
   "estoque": 10,
  "autor": {
    "id": 1
  },
  "categoria": {
    "id": 1
  }
}
</pre>
</details>
  
<details><summary>/locacao</summary>
  <pre>
  {
  "id": 0,
  "clientId": 1,
  "livros": [
    {
      "id": 1,
      "quantidade": 1,
      "valor": 30,
      "livro": 1
    }
  ],
  "pagamento_id": 1,
  "valorTotal": 30,
  "dtLocacao": "2022-03-24T19:45:05.186Z",
  "dtDevolucao": "2022-03-24T19:45:05.186Z"
}
  </pre>
</details>  
  
