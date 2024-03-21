const nome = "Gabriel";
const idade = 2023 - 1997;
const cidadeDeNascimento = "Santo André"

//sem template literal
const apresentacao = "Apresentação 1 = Meu Nome é " + nome + ", minha idade é " + idade + " e nasci na cidade de " + cidadeDeNascimento + "!";
console.log(apresentacao)

//utilizando template literal
const apresentacao2 = `Apresentação 2 = Meu nome é ${nome}, minha idade é ${idade} e nasci na cidade de ${cidadeDeNascimento}!`;
console.log(apresentacao2)



