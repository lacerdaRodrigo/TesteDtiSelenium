# language: pt

Funcionalidade: Login na loja
  Como usuário do site , eu quero ver todos os modelos de roupas da nova coleção de verão.

  @Login
  Cenário: Acessar o site com credenciais válidas
    Dado que acesso a página de login da pagina 'automation practice'
    Quando o usuário preencher os campos de email com "lacerdaa.rodrigo@gmail.com" e senha com "Teste123"
    E clicar em "Sign in"
    Então o usuário deve ser redirecionado para a pagina inicial

  @Login
  Cenário: Login com Email Inválido
    Dado que acesso a página de login da pagina 'automation practice'
    Quando o usuário preencher os campos de email com "lacerdaa.teste@gmail.com" e senha com "Teste123"
    E clicar em "Sign in"
    Então a mensagem "Authentication failed." deve ser exibida

  @Login
  Cenário: Login com Senha Inválida
    Dado que acesso a página de login da pagina 'automation practice'
    Quando o usuário preencher os campos de email com "lacerdaa.rodrigo@gmail.com" e senha com "1234"
    E clicar em "Sign in"
    Então a mensagem senha invalida "Invalid password." deve ser exibida

  @Login
    Cenário: Clicar botão 'Sign in' sem preencher email e senha
    Dado que acesso a página de login da pagina 'automation practice'
    E clicar em "Sign in" 
    Então deve mostrar a mensagem "An email address required."

  @Login
    Cenário: Esqueceu a Senha
    Dado que acesso a página de login da pagina 'automation practice'
    Quando clico no texto "Forgot your password?"
    Então devo ser redirecionado para a pagina de recuperar a senha