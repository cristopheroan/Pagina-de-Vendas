# Pagina-de-Vendas
Devera conter área de cadastro utilizando banco de dados MySQL
```mermaid
---
config:
  theme: neo-dark
---


flowchart LR
  A[Início] -- Cadastro --> B(Cadastrar Usuário)
  B --> C{Dados Válidos?}
  C -- Sim --> D[Salvar no Banco de Dados]
  C -- Não --> E[Mostrar Erro]
  D --> F[Usuário Cadastrado]
  E --> B

  G[Início] -- Login --> H(Login de Usuário)
  H --> I{Credenciais Válidas?}
  I -- Sim --> J[Autenticar Usuário]
  I -- Não --> K[Mostrar Erro]
  J --> L[Login Realizado]
  K --> H
```
### [DIAGRAMA](https://www.mermaidchart.com/raw/e2f85f5d-d5be-4453-a3c4-1f2a943c2272?theme=dark&version=v0.1&format=svg)
