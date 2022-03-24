![](https://img.shields.io/github/stars/pedrogomes30/biblioteca) ![](https://img.shields.io/github/forks/pedrogomes30/biblioteca) ![](https://img.shields.io/github/tag/pedrogomes30/biblioteca) ![](https://img.shields.io/github/release/pedrogomes30/biblioteca) ![](https://img.shields.io/github/issues/pedrogomes30/biblioteca) ![](https://img.shields.io/bower/v/editor.md.svg)

<h1>Projeto final da school da MJV - Grupo 06</h1>


<h2>Tema escolhido:</h2>

sistema de locação em uma biblioteca

<h2>Jornada de implementação:</h2> 

sistema para gerenciamento de locações de livro em uma biblioteca,permitindo o cadastro de livro com categorizacão e autor, registro da quantidade de livros alugadas, pagamentos e total de locações realizadas, permite também o cadastro de loja, cliente e vendedor a partir de uma unica classe entidade com tipagem e multi endereços e multi contatos.

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

feito isso a aplicação irá disponibilizar a documentação de endpoint via swe

<h3>Integrantes do grupo:</h3>  <br>

[<img src="https://img.shields.io/badge/PedroGomes30-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Pedro Gomes">](https://github.com/pedrogomes30/)
[<img src="https://img.shields.io/badge/KarolineGoergen-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Karoline Goergen">](https://github.com/KarolineGoergen)
[<img src="https://img.shields.io/badge/LucasEmanuel-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Lucas Emanuel">](https://github.com/Luscaw)
[<img src="https://img.shields.io/badge/Bruno Manhães-%23121011.svg?style=for-the-badge&logo=github&logoColor=white" title = "Bruno Manhães">](https://github.com/NewarkX)


<h3>Schemas da aplicação</h3>


<details><summary>locacao-controller</summary>

  <details><summary>GET/locacao</summary>
<pre>
[
  {
    "dtLocacao": "2022-03-23T01:33:05.149Z",
    "dtDevolucao": "2022-03-23T01:33:05.149Z",
    "valorTotal": 0,
    "loja": {
      "id": 0,
      "nome": "string",
      "documento": "string",
      "email": "string",
      "entidadeTipo": {
        "id": 0,
        "descricao": "string"
      },
      "entidade": {
        "id": 0,
        "descricao": "string"
      }
    },
    "cliente": {
      "id": 0,
      "nome": "string",
      "documento": "string",
      "email": "string",
      "entidadeTipo": {
        "id": 0,
        "descricao": "string"
      },
      "entidade": {
        "id": 0,
        "descricao": "string"
      }
    },
    "vendedor": {
      "id": 0,
      "nome": "string",
      "documento": "string",
      "email": "string",
      "entidadeTipo": {
        "id": 0,
        "descricao": "string"
      },
      "entidade": {
        "id": 0,
        "descricao": "string"
      }
    }
  }
]
</pre>
</details>
<details><summary>PUT/locacao</summary>
  <pre>
    {
  "dtLocacao": "2022-03-23T01:50:43.052Z",
  "dtDevolucao": "2022-03-23T01:50:43.052Z",
  "valorTotal": 0,
  "loja": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  },
  "cliente": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  },
  "vendedor": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  }
}
  </pre>
</details>
<details><summary>POST/locacao</summary>
  <pre>
  {
  "dtLocacao": "2022-03-23T01:51:44.462Z",
  "dtDevolucao": "2022-03-23T01:51:44.462Z",
  "valorTotal": 0,
  "loja": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  },
  "cliente": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  },
  "vendedor": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  }
}
  </pre>
</details>
  <details><summary>GET/locacao/{id}</summary>
    <pre>
    {
  "dtLocacao": "2022-03-23T01:53:16.708Z",
  "dtDevolucao": "2022-03-23T01:53:16.708Z",
  "valorTotal": 0,
  "loja": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  },
  "cliente": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  },
  "vendedor": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
      "id": 0,
      "descricao": "string"
    },
    "entidade": {
      "id": 0,
      "descricao": "string"
    }
  }
}
    </pre>
  </details>
  <details><summary>DELETE/locacao/{id}</summary>
    <pre>
    {
      "id":"integer"
    }
    </pre>
    </details>
</details>
<details><summary>livro-controller</summary>
    <details><summary>GET/livros</summary>
        <pre>
[
  {
    "id": 0,
    "quantidadeLivro": "string",
    "livro": {
      "id": 0,
      "nome": "string",
      "edicao": "string",
      "isbn": 0,
      "preco": 0,
      "autor": {
        "id": 0,
        "nome": "string"
      },
      "categoria": {
        "id": 0,
        "descricao": "string"
      }
    },
    "entidade": {
      "id": 0,
      "nome": "string",
      "documento": "string",
      "email": "string",
      "entidadeTipo": {
        "id": 0,
        "descricao": "string"
      },
      "entidade": {
        "id": 0,
        "descricao": "string"
      }
    }
  }
]
        </pre></details>
    <details><summary>PUT/livros</summary>
        <pre>
{
    "id": 0,
    "quantidadeLivro": "string",
    "livro": {
        "id": 0,
        "nome": "string",
        "edicao": "string",
        "isbn": 0,
        "preco": 0,
        "autor": {
        "id": 0,
        "nome": "string"
        },
        "categoria": {
        "id": 0,
        "descricao": "string"
        }
    },
    "entidade": {
        "id": 0,
        "nome": "string",
        "documento": "string",
        "email": "string",
        "entidadeTipo": {
        "id": 0,
        "descricao": "string"
        },
        "entidade": {
        "id": 0,
        "descricao": "string"
        }
    }
}
        </pre></details>
    <details><summary>POST/livros</summary>
        <pre>
{
    "id": 0,
    "quantidadeLivro": "string",
    "livro": {
        "id": 0,
        "nome": "string",
        "edicao": "string",
        "isbn": 0,
        "preco": 0,
        "autor": {
        "id": 0,
        "nome": "string"
        },
        "categoria": {
        "id": 0,
        "descricao": "string"
        }
    },
    "entidade": {
        "id": 0,
        "nome": "string",
        "documento": "string",
        "email": "string",
        "entidadeTipo": {
        "id": 0,
        "descricao": "string"
        },
        "entidade": {
        "id": 0,
        "descricao": "string"
        }
    }
    }
        </pre></details>
    <details><summary>GET/livros/{id}</summary>
        <pre>
{
"id": 0,
"quantidadeLivro": "string",
"livro": {
    "id": 0,
    "nome": "string",
    "edicao": "string",
    "isbn": 0,
    "preco": 0,
    "autor": {
    "id": 0,
    "nome": "string"
    },
    "categoria": {
    "id": 0,
    "descricao": "string"
    }
},
"entidade": {
    "id": 0,
    "nome": "string",
    "documento": "string",
    "email": "string",
    "entidadeTipo": {
    "id": 0,
    "descricao": "string"
    },
    "entidade": {
    "id": 0,
    "descricao": "string"
    }
}
}
        </pre></details>
    <details><summary>DELETE/livros/{id}</summary>
        <pre>
{
    "id":"integer"
}
        </pre></details>
</details>
<h4>estoque-controller</h4>
GET/estoque
PUT/estoque
POST/estoque
GET/estoque/{id}
DELETE/estoque/{id}
<h4>entidade-controller</h4>
GET/entidade/{id}
PUT/entidade/{id}
DELETE/entidade/{id}
GET/entidade
POST/entidade
<h4>categoria-controller</h4>
GET/categoria
PUT/categoria
POST/categoria
GET/categoria/{id}
DELETE/categoria/{id}
<h4>autor-controller</h4>
GET/autor
PUT/autor
POST/autor
GET/autor/{id}
DELETE/autor/{id}
<h4>entidade-tipo-controller</h4>
POST/entidade_tipo
